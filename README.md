# ✨ Advanced Software Construction Patterns in Java ✨

## 📚 Description
Understanding and applying software construction patterns is crucial for building maintainable and scalable applications. Think carefully before constructing your software! This repository explores two essential design patterns: **Builder** and **Observer**.

---
## 💪 Level 1: Builder Pattern
### ἵ5 Pizza Order Management System
Using the **Builder Pattern**, develop a pizza ordering system that allows customers to create customized pizzas with different:
- **Sizes**
- **Dough**
- **Toppings**

#### 📄 Implementation Details:
1. Define a `Pizza` class with attributes for size, dough, and toppings.
2. Create a `PizzaBuilder` interface with methods to set these attributes.
3. Implement concrete builders (`HawaiianPizzaBuilder`, `VegetarianPizzaBuilder`, etc.).
4. Create a `MasterPizzaDirector` class that receives a `PizzaBuilder` and constructs pizzas.
5. In the `Main` class, demonstrate the usage of the **Builder Pattern** by creating different types of pizzas.

---
## 🔥 Level 2: Observer Pattern
### 📈 Stock Market Notification System
Design a system where a **Stock Agent (Observable)** notifies multiple **Stock Agencies (Observers)** when the stock market rises or falls.

#### 📄 Implementation Details:
1. Implement the **Observer Pattern** where:
   - The `Broker` class (Observable) maintains a list of observers.
   - The `NewStockAgency` class (Observer) gets notified of stock changes.
2. Ensure proper subscription and unsubscription mechanisms.
3. Demonstrate in the `Main` class how stock agencies receive notifications.

---
## 💪 Technologies Used
- **Java JBR17** ☕
- **IntelliJ IDEA** ⚙

---
## ▶️ How to Run

1. Clone this repository:
   ```bash
   git clone git@github.com:acocinas/S302Patterns2.git
   cd git@github.com:acocinas/S302Patterns2.git
2. Open the project in your preferred IDE (IntelliJ IDEA recommended).

3. Run the Main classes in each level to see the patterns in action:

Level 1: Run level1BuilderPattern.Main.

Level 2: Run level2ObserverPattern.Main.
  

---
## 💼 Objectives
- Master **software construction patterns** for better **code organization**.
- Implement **Builder** and **Observer** patterns in real-world scenarios.
- Enhance understanding of **creational and behavioral** design patterns in Java.

Happy Coding! 🚀

