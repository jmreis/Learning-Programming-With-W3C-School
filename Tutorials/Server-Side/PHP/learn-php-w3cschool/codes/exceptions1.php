<!DOCTYPE html>
<html>
<body>

<?php
function divide($dividend, $divisor) {
  if($divisor == 0) {
    throw new Exception("Division by zero");
  }
  return $dividend / $divisor;
}
// using try catch
try {
  echo divide(5, 0);
} catch(Exception $e) {
  echo "Unable to divide.";
}
?>

</body>
</html>