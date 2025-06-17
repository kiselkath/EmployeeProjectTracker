
## 🚀 Task 1: Get all project names

**Goal:** Flatten the list of employees and collect all project names.

🧾 **Expected result:**

```
["Apollo", "Hermes", "Orion"]
```

---

## 🔍 Task 2: Find all active projects

**Goal:** Filter only projects with status `"active"` and collect their names.

🧾 **Expected result:**

```
["Apollo", "Orion"]
```

---

## 📊 Task 3: Count total number of all projects

**Goal:** Count how many projects exist across all employees.

🧾 **Expected result:**

```
3
```

---

## 🧮 Task 4: Sum all project budgets

**Goal:** Use `flatMap` + `mapToDouble` + `sum()` to calculate total budget.

🧾 **Expected result:**

```
220000.0
```

---

## 👥 Task 5: Get "employee: project" pairs

**Goal:** For each employee, produce a string like:

```
Alice: Apollo  
Alice: Hermes  
Bob: Orion
```

---

## 🧠 Task 6: Find employees who have at least one active project

**Goal:** Return a `List<String>` of employee names.

🧾 **Expected result:**

```
["Alice", "Bob"]
```

💡 Tip: Use `.filter()` + `anyMatch()` inside.

---

## 💸 Task 7: Get all projects with a budget greater than 60,000

**Goal:** Filter and collect the names of high-budget projects.

🧾 **Expected result:**

```
["Apollo", "Orion"]
```

---

## 📌 Task 8: Group all projects by status

**Goal:** Collect projects into a `Map<String, List<String>>`, grouped by their status (`"active"`, `"completed"`).

🧾 **Expected result:**

```java
{
  "active": ["Apollo", "Orion"],
  "completed": ["Hermes"]
}
```

---

## 🔁 Task 9: Join all project names into a single string

**Goal:** Use `flatMap`, `map(Project::getName)`, and `Collectors.joining(", ")`.

🧾 **Expected result:**

```
"Apollo, Hermes, Orion"
```

---

## ⭐ Task 10 (Challenge): Find the busiest employee (who has the most projects)

**Goal:** Use `max()` to find the employee with the largest number of projects.

🧾 **Expected result:**

```
Alice (2 projects)
```

💡 Tip: `max(Comparator.comparingInt(e -> e.getProjects().size()))`

