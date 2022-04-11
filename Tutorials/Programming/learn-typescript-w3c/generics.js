function createPair(v1, v2) {
    return [v1, v2];
}
console.log(createPair('hello', 42));
var NamedValue = /** @class */ (function () {
    function NamedValue(name) {
        this.name = name;
    }
    NamedValue.prototype.setValue = function (_value) {
        this._value = _value;
    };
    NamedValue.prototype.getValue = function () {
        return this._value;
    };
    NamedValue.prototype.toString = function () {
        return "".concat(this.name, ": ").concat(this._value);
    };
    return NamedValue;
}());
var value = new NamedValue('mynumber');
value.setValue(10);
console.log(value.toString());
