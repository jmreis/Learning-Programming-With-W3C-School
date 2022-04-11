var Person = /** @class */ (function () {
    function Person() {
    }
    return Person;
}());
var person = new Person();
person.name = "Jane";
console.log(person.name);
var Person1 = /** @class */ (function () {
    function Person1(name) {
        this.name = name;
    }
    Person1.prototype.getName = function () {
        return this.name;
    };
    return Person1;
}());
var person1 = new Person1("Jane");
console.log(person1.getName());
