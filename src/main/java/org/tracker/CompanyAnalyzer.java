package org.tracker;
/**
public class CompanyAnalyzer {
    public List<Project> getAllProjects(List<Employee> employees) {
        return employees.stream()
                .flatMap(e -> e.getProjects().stream())
                .collect(Collectors.toList());
    }
}
 */
