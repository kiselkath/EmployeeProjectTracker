package org.tracker;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering", List.of(
                        new Project("Apollo", 100_000, "active"),
                        new Project("Hermes", 50_000, "completed")
                )),
                new Employee("Bob", "Marketing", List.of(
                        new Project("Orion", 70_000, "active")
                ))
        );
    }
}