interface rectangle {
    height: number,
    width: number
}

interface coloredretangle extends rectangle {
    color: string
}

const Coloredretangle: coloredretangle = {
    height: 20,
    width: 10,
    color: "red"
}

console.log(Coloredretangle)