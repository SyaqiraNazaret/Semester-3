<!DOCTYPE html>
<html lang="en">
<head>
    <form action="<?php echo $_SERVER['PHP_SELF'];?>">
        Name: <input type="text" name="fname">
        <input type="submit">
    </form>
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $name = $_REQUEST['fname'];
        if (empty($name)) {
            echo "Name is empty";
        }else {
            echo $name;
        }
    }
?>
</head>
<body>
    
</body>
</html>