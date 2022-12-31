
<!DOCTYPE html>
<?php
// setting the cookie name
$cookie_name = "user";
// setting the cookie value
$cookie_value = "John Doe";
// setting cookie
setcookie($cookie_name, $cookie_value, time() + (86400 * 30), "/"); // 86400 = 1 day
?>
<html>
<body>

<?php
if(!isset($_COOKIE[$cookie_name])) {
    // if the cookie not setted
     echo "Cookie named '" . $cookie_name . "' is not set!";
} else {
    // if the cookie setted
     echo "Cookie '" . $cookie_name . "' is set!<br>";
     echo "Value is: " . $_COOKIE[$cookie_name];
}
?>

<p><strong>Note:</strong> You might have to reload the page to see the value of the cookie.</p>

</body>
</html>
