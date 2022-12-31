<!DOCTYPE html>
<html>
<body>

<?php
$str = "<h1>Hello World!</h1>";
// sanitize strings
$newstr = filter_var($str, FILTER_SANITIZE_STRING);
echo $newstr;
?>

</body>
</html>