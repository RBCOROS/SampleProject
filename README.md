Name: Coros, Rhea Buenaventura
Date : April 19, 2020

1. Solutions/modules are enclosed in com.rbc.sample package
2. animal/base package - this consists of the following classes
   - AnimalImplMain : this is the main runnable class. All methods solutions per items/questions are called here.
   - AnimalBase/AnimalBaseHandler : this are classes that holds frequently called methods to reduce duplicates
   - Animal : Main animal abstract class, holds the kind object (which animal) and the main characteristics all animals does such as eat and make sound
3. constants
   - this package simply holds enum classes for constants and common validations
4. kind
   - this holds the object (animal) classes
5. vo
   - consist on the common getter/setter
6. Interfaces, since not all animals possess same characteristics, I created separated interfaces for each vital traits. This is
to implement the specific traits only to the animals that possess this.