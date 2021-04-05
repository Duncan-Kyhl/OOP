// Encapsulation

// Procedural Approach
  let baseSalary = 30000;
  let overtime = 10;
  let rate = 20;

  function getWage(baseSalary, overtime, rate) {
    return baseSalary (overtime * rate)
  }

// OOP Approach

  let employee = {
    baseSalary: 30000,
    overtime: 10,
    rate: 20,
    getWage: function() {
      return this.baseSalary + (this.overtime * this.rate);
    }
  };
  employee.getWage();

  // Benefits?
  // No parameters! Instead they are modeled as properties
  // This makes it easier to use and maintain


/*
Encapsulation - group related functions and variables together, which
  1. reduces complexity and
  2. increases reusability

Abstraction - hide details and complexity, showing only the essentials
  1. reduces complexity
  2. isolates the impact of changes

Inheritance
  1. eliminates redundant CODE

Polymorphism
  1. refactor if/else and switch case statements

*/

/*
The __proto__ property:
Every object has this property by default.

It can be modified:
*/

fucntion DogObject(name, age) {
    let dog = Object.create(constructorObject);
    dog.name = name;
    dog.age = age;
    return dog;
}
let constructorObject = {
    speak: function() {
        return "I am a dog"
    }
}
let bingo = DogObject("Bingo", 54);
console.log(bingo)

/*
prototype chaining?
new keyword?
what is this.something?

https://www.freecodecamp.org/news/how-javascript-implements-oop/
*/
