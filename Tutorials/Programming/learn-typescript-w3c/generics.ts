
function createPair<S, T>(v1: S, v2: T): [S, T] {
    return [v1, v2]
}

console.log(createPair<string, number>('hello', 42))


class NamedValue<T> {
    private _value: T | undefined

    constructor(private name: string) {}
    
    public setValue(_value: T) {
        this._value = _value
    }

    public getValue(): T | undefined {
        return this._value
    }

    public toString(): string {
        return `${this.name}: ${this._value}`
    }
}

let value = new NamedValue<number>('mynumber')
value.setValue(10)
console.log(value.toString())