package org.example;

import java.util.*;

public class SecretSanta {
    public static void main(String[] args) {
        // List of participants
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Eve");

        // Define exclusions as a map where the key is a person and the value is a set of people they cannot draw
        Map<String, Set<String>> exclusions = new HashMap<>();
        exclusions.put("Alice", new HashSet<>(Arrays.asList("Bob"))); // Alice can't draw Bob
        exclusions.put("Bob", new HashSet<>(Arrays.asList("Alice", "Charlie"))); // Bob can't draw Alice or Charlie
        exclusions.put("Charlie", new HashSet<>(Arrays.asList("Eve"))); // Charlie can't draw Eve

        // Generate the Secret Santa assignments
        Map<String, String> assignments = drawSecretSanta(names, exclusions);

        // Print the results
        assignments.forEach((giver, receiver) ->
                System.out.println(giver + " -> " + receiver));
    }

    public static Map<String, String> drawSecretSanta(List<String> names, Map<String, Set<String>> exclusions) {
        List<String> receivers = new ArrayList<>(names);
        Map<String, String> assignments = new HashMap<>();
        Random random = new Random();

        for (String giver : names) {
            List<String> validReceivers = new ArrayList<>(receivers);
            // Remove giver and exclusions
            validReceivers.remove(giver);
            validReceivers.removeAll(exclusions.getOrDefault(giver, Collections.emptySet()));

            if (validReceivers.isEmpty()) {
                return Collections.emptyMap(); // Invalid state, restart or fail
            }

            String receiver = validReceivers.get(random.nextInt(validReceivers.size()));
            assignments.put(giver, receiver);
            receivers.remove(receiver);
        }
        return assignments;
    }
}
