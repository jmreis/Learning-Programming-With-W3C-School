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

    function mytest() {
        static $x = 0;
        echo $x;
        $x++;
    }
    // add the $x value in the call function
    mytest();
    mytest();
    mytest();
    ?>

</body>
</html>