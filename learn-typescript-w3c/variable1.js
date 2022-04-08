var w = 1;
w = "string"; // no error
w = {
    runANonExistentMethod: function () {
        console.log("Testing....");
    }
};
if (typeof w === 'object' && w !== null) {
    w.runANonExistentMethod();
}
