<<<<<<< HEAD
<?php
// Tangkap input username dan password dari form
$username = $_POST['username'];
$password = $_POST['password'];

// Lakukan validasi (contoh menggunakan hardcode data pengguna)
if ($username == "mahasiswa" && $password == "12345") {
    // Login berhasil, arahkan ke halaman dashboard mahasiswa
    header("Location: dashboardMahasiswa.html");
    exit();
} else {
    // Login gagal, kembali ke halaman login dengan pesan error
    echo "<script>alert('Username atau Password salah!'); window.location.href='index.html';</script>";
    exit();
}
?>
=======
<?php
// Tangkap input username dan password dari form
$username = $_POST['username'];
$password = $_POST['password'];

// Lakukan validasi (contoh menggunakan hardcode data pengguna)
if ($username == "mahasiswa" && $password == "12345") {
    // Login berhasil, arahkan ke halaman dashboard mahasiswa
    header("Location: dashboardMahasiswa.html");
    exit();
} else {
    // Login gagal, kembali ke halaman login dengan pesan error
    echo "<script>alert('Username atau Password salah!'); window.location.href='index.html';</script>";
    exit();
}
?>
>>>>>>> 4c269c13f5d70164ca5dd24244db2a7d78d8107f
