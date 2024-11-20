## Abstract Factory

### Intention
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

### Implementation

1. **Define a series of abstract products**  
   Examples: `Chair`, `Table`, and `Sofa`. These serve as the base classes or interfaces for the product families.

2. **Create concrete products**  
   Examples: `ChineseStyleChair`, `ChineseStyleTable`, and so on. These are specific implementations of the abstract products.

3. **Abstract Factory Interface**
    - Define methods for creating each type of abstract product (e.g., `createChair()`, `createTable()`, `createSofa()`).

4. **Concrete Factory**
    - Implement the abstract factory interface, with each factory responsible for producing a specific family of concrete products.
    - Ensure the return type of each creation method is abstract, allowing the client to interact with products uniformly without depending on their concrete implementations.  
   
Pros of the Abstract Factory Pattern:
- Ensures that clients receive products that are compatible with each other.
- Decouples the client code from specific concrete product implementations.
- Facilitates the creation of new families of products without modifying existing code, adhering to the Open/Closed Principle.

Cons of the Abstract Factory Pattern:
- If a new type of product needs to be added, the abstract factory interface must be updated, which may require extensive changes across the entire codebase.

