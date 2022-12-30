<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    $x = 5;
    $y = 10;

    function mytest() {
        global  $x, $y;
        echo "<p>Variable x inside function is: $x</p>";
        // storing in $GLOBALS[index] array
        $GLOBALS['y'] = $GLOBALS['x'] + $GLOBALS['y'];
    }
    mytest();
    echo "<p>Variable x inside function is: $x</p>";
    echo "$y";  // output new $y
    ?>

</body>
</html>