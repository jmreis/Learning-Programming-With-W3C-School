<!DOCTYPE html>
<html>
<body>

<?php
$ip = "127.0.0.1";
// validate a IP
if (!filter_var($ip, FILTER_VALIDATE_IP) === false) {
  echo("$ip is a valid IP address");
} else {
  echo("$ip is not a valid IP address");
}
?>

</body>
</html>