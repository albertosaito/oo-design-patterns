## oo-design-patterns
### Contents
#### Creational
- **AbstractFactory:**
The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes. In normal usage, the client software creates a concrete implementation of the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part of the theme. The client doesn't know (or care) which concrete objects it gets from each of these internal factories, since it uses only the generic interfaces of their products. This pattern separates the details of implementation of a set of objects from their general usage and relies on object composition, as object creation is implemented in methods exposed in the factory interface. (From Wikipedia)
- **Builder:**
Separate the construction of a complex object from its representation so that the same construction process can create different representations.
- **Prototype:**
If creating a complete new instance of our class is potentially harmful or resource-expensive, we might consider to specify the type of objects to create using a prototypical instance, and create new objects by cloning this prototype.