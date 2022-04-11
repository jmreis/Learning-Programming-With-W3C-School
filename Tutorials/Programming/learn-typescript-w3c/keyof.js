function personproperty(person, property) {
    console.log("".concat(property, " - ").concat(person[property]));
}
var person = {
    name: "Max",
    age: 27
};
personproperty(person, "name");
