<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
    <?php
        session_start();

        if ($_SESSION['status'] == 'login') {
            echo "selamat datang " . $_SESSION['Username']
            ?>
            <br> <a href="sessionLogout.php">Log out</a>
            <?php
        } else {
            echo "anda belum login. Silahkan "?>
            <a href="sessionLoginForm.html">Log in</a>
        <?php
        }
        ?>
</body>
</html>