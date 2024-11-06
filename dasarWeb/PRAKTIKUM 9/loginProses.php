<?php
    include "koneksi.php";

    $username = $_POST['Username'];
    $password = md5($_POST['Password']);

    $query = "SELECT * FROM user WHERE Username ='$username' and Password ='$password'";
    $result = mysqli_query($connect, $query);
    $cek = mysqli_num_rows($result);

    if ($cek) {
        echo " Anda berhasil Login. Silahkan menuju ";?>
        <a href="homeAdmiin.html">Halaman HOME</a>
    <?php
    } else {
        echo "Anda gagal login. Silahkan ";?>
        <a href="loginForm.php">Login Kembali</a>
    <?php 
        echo mysqli_error($connect);
    }
?> 