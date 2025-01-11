# Difference between Static and Dynamic (instance) 

**Please note that there is no keyword as "Dynamic" in Java. but instance variables and methods are in dynamic category**

## 1) STATIC 

- Belongs to the Class itself
- Shared among all the instance of the class
 eg: static studentCounter in Student class is used among all the objects of Student class


- **Can not access instance variables inside a static method**
- But static variables can be used among any instance method (eg: static studentCounter)

## 2) DYNAMIC/ NON-STATIC

- Belongs to the object
- Need to create an object to access any instance variable/method
- Not accessible in static methods
