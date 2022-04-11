
let w: unknown = 1;
w = "string";       // no error

w = {
    runANonExistentMethod: () => {
        console.log("Testing....");
    }
} as { runANonExistentMethod: () => void }

if (typeof w === 'object' && w !== null ) {
    (w as { runANonExistentMethod: Function
}).runANonExistentMethod();
}