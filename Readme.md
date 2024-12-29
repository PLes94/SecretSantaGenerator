# Secret Santa Generator

This project is a simple Java program to facilitate a **Secret Santa** drawing. It ensures randomized assignments while
respecting exclusions, such as preventing a person from drawing their spouse or someone they gifted last year.

## Features

- Randomly assigns each participant a gift recipient.
- Supports exclusions to prevent certain pairings.
- Handles invalid configurations (e.g., overly restrictive exclusions).
- Simple and easy-to-use code.

## Prerequisites

- Java 8 or higher installed on your machine.

## Getting Started

### 1. Clone the Repository

### 2. Compile the Program

```bash
javac SecretSanta.java
```

### 3. Run the Program

```bash
java SecretSanta
```

## Example Input and Output

### Input

In the `main` method, update the following:

- **List of Participants**:
  ```java
  List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Eve");
  ```
- **Exclusions**:
  ```java
  exclusions.put("Alice", new HashSet<>(Arrays.asList("Bob"))); // Alice can't draw Bob
  exclusions.put("Bob", new HashSet<>(Arrays.asList("Alice", "Charlie"))); // Bob can't draw Alice or Charlie
  exclusions.put("Charlie", new HashSet<>(Arrays.asList("Eve"))); // Charlie can't draw Eve
  ```

### Output

Example:

```
Alice -> Charlie
Bob -> Diana
Charlie -> Alice
Diana -> Eve
Eve -> Bob
```

If no valid assignments are possible:

```
Could not generate valid assignments. Try adjusting exclusions.
```

## Customization

### Adding Participants

Update the `names` list with the participants' names.

### Defining Exclusions

Add exclusions to the `exclusions` map. For example:

```java
exclusions.put("Person1",new HashSet<>(Arrays.asList("Person2", "Person3")));
```

This prevents `Person1` from drawing `Person2` or `Person3`.

## Contributing

Feel free to fork this repository, open issues, or submit pull requests. Contributions are welcome!

## License

This project is open-source and available under the [MIT License](LICENSE).