package org.tracker;

import java.util.List;
import java.util.Map;
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

        // All projects name
        List<String> projectNames = employees.stream()
                .flatMap(emp -> emp.getProjects().stream())
                .map(Project::getName)
                .collect(Collectors.toList());

        System.out.println("All employee's projects: " + projectNames);

        //active projects by employee names
        List<String> activeProjects = employees.stream()
                .flatMap(emp->emp.getProjects().stream())
                .filter(p->p.getStatus().equalsIgnoreCase("active"))
                .map(Project::getName)
                .collect(Collectors.toList());

        System.out.println("All employee's with active projects: " + activeProjects);

        //Total number of all numbers#
        // stream methods
            long totalProjects = employees.stream()
                    .flatMap(employee -> employee.getProjects().stream())
                    .count();
        System.out.println(totalProjects);

        //Sum all project budgets
        double totalBudget = employees.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .mapToDouble(project -> project.getBudget())
                .sum();

        System.out.println(totalBudget);

        // Get "employee: project" pairs
        List<String> employeeProjectPairs = employees.stream()
                .flatMap(employee -> employee.getProjects().stream()
                                .map(project -> employee.getName() + ": " + project.getName()))
                .collect(Collectors.toList());

        System.out.println(employeeProjectPairs);

        //Find employees who have at least one active project

        List<String> activeProjectEmpl = employees.stream()
                .flatMap(emp -> emp.getProjects().stream()
                                .filter(p -> p.getStatus().equalsIgnoreCase("active"))
                                .map(p -> emp.getName() + " / " + p.getName()))
                .collect(Collectors.toList());
        System.out.println(activeProjectEmpl);

        //: Get all projects with a budget greater than 60,000
        List<String> expensiveProjects = employees.stream()
                .flatMap(emp -> emp.getProjects().stream())
                .filter(project -> project.getBudget() > 60_000)
                .map(Project::getName) // берём только имя
                .collect(Collectors.toList());

        System.out.println(expensiveProjects);

        //Group all projects by status

        Map<String, List<String>> projectsByStatus = employees.stream()
                .flatMap(emp -> emp.getProjects().stream())
                .collect(Collectors.groupingBy(
                        Project::getStatus, // ключ — статус
                        Collectors.mapping(Project::getName, Collectors.toList()) // значения — имена проектов
                ));

        projectsByStatus.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) // сортировка по статусу
                .forEach(entry -> {
                    System.out.println("Status: " + entry.getKey());
                    entry.getValue().forEach(name -> System.out.println("  • " + name));
                });


        //Join all project names into a single string
        String joinedNames = employees.stream()
                .flatMap(emp -> emp.getProjects().stream())
                .map(Project::getName)
                .collect(Collectors.joining(", "));
        System.out.println(joinedNames);
    }



}

