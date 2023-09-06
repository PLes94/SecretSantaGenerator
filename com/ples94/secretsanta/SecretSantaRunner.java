package com.ples94.secretsanta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecretSantaRunner {
    public static void main(String[] args) {
        System.out.println("Enter the list of people participating in the draw separated by a space:");
        Scanner input = new Scanner(System.in);
        List<String> initialList = List.of(input.nextLine().split(" "));
        List<String> shuffledList = new ArrayList<>(initialList);
        Collections.shuffle(shuffledList);

        int i = 0;
        while (i < initialList.size()) {
            if (initialList.get(i).equals(shuffledList.get(i))) {
                Collections.shuffle(shuffledList);
                i = 0;
            } else {
                i++;
            }
        }

        // return list of respective donors and recipients
        for (i = 0; i < initialList.size(); i++) {
            System.out.println(initialList.get(i) + " drew: " + shuffledList.get(i));
        }
    }
}
