<?php
    include "koneksi.php";

    $username = $_POST['Username'];
    $password = md5($_POST['Password']);

    $sql = "SELECT * FROM user WHERE Username='$username' and Password='$password'";
    $result = mysqli_query($connect, $sql);
    $cek = mysqli_num_rows($result);

    if($cek > 0){
        session_start();
        $_SESSION['Username'] = $username;
        $_SESSION['status'] = 'login';
        ?>
        Anda Berhasil Login, silahkan menuju 
        <a href="homeSession.php">Halaman Home </a> <?php
    } else {
        ?>
        Gagal Login, silahkan login lagi 
        <a href="sessionLoginForm.html">Halaman Login</a> <?php
        echo mysqli_error($connect);
    }