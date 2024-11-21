# Adapter

### Intention
Convert the interface of a class into another interface clients expect.
Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

### Problem
We want to use a class that has an incompatible interface without modifying its source code.

### Solution
Create a middle-layer class that works with the incompatible interface and exposes the desired interface.

### Components of Object Adapter

 **Client Interface**
 - The interface that the client expects to work with.

 **Adaptee Service**
 - Service that the client cannot use directly because of incompatible interfaces.
  
 **Adapter**
 - Adapter class that implements the client interface and delegates calls to the adaptee service.

### Pros of the Adapter Pattern
- Easier to introduce new type of adapters without modifying existing code. (open/closed principle)

### Cons of the Adapter Pattern
- It's more complex to introduce new interfaces than modifying existing code.
