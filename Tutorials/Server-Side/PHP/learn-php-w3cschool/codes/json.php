
<!DOCTYPE html>
<html>
<body>

<?php
$age = array("Peter"=>35, "Ben"=>37, "Joe"=>43);
// using encode 
echo json_encode($age);

echo "<br>";

// using decode
$jsonobj = '{"Peter":35,"Ben":37,"Joe":43}';
var_dump(json_decode($jsonobj));

$obj = json_decode($jsonobj);

echo "<br>";
echo $obj->Peter . "<br>";
echo $obj->Ben . "<br>";
echo $obj->Joe . "<br>";

// lopping
foreach($obj as $key => $value) {
    echo $key . " => " . $value . "<br>";
  }

?>

</body>
</html>
