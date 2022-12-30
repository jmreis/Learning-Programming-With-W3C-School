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
    define("GREETING", "Welcome to W3C", true);
    echo greeting;

    define("cars", [
        "alfa romeo",
        "bmw",
        "toyota"
    ]);
    echo "<br>";
    echo cars[0];
    ?>
</body>
</html>