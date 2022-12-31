<!DOCTYPE html>
<html>
<body>

<?php
// make a exclimation
function exclaim($str) {
  return $str . "! ";
}
// make a question
function ask($str) {
  return $str . "? ";
}
// format the string
function printFormatted($str, $format) {
  // Calling the $format callback function
  echo $format($str);
}

// Pass "exclaim" and "ask" as callback functions to printFormatted()
printFormatted("Hello world", "exclaim");
printFormatted("Hello world", "ask");
?>

</body>
</html>
