<?php
    session_start();
?>
<!DOCTYPE html>
<html>
    <body>
        <?php
            $_SESSION["favcolor"] = "green";
            $_SESSION["favanimal"] = "cat";
            echo "Session Variable are set.";
        ?>
    </body>
</html>