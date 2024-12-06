<<<<<<< HEAD
<?php
$host = "SYAQIRA\SYAQIRASQLSERVER"; 
$connInfo = array("Database" => "Prestasi_Mahasiswa");
$conn = sqlsrv_connect($host, $connInfo);
if ($conn) {
echo "Koneksi berhasil.<br />";
} else {
echo "Koneksi Gagal";
die (print_r(sqlsrv_errors(), true));

//Debug Data yang diterima 
var_dump($_POST);
var_dump($_FILES);
die();
=======
<?php
$host = "SYAQIRA\SYAQIRASQLSERVER"; 
$connInfo = array("Database" => "Prestasi_Mahasiswa");
$conn = sqlsrv_connect($host, $connInfo);
if ($conn) {
echo "Koneksi berhasil.<br />";
} else {
echo "Koneksi Gagal";
die (print_r(sqlsrv_errors(), true));

//Debug Data yang diterima 
var_dump($_POST);
var_dump($_FILES);
die();
>>>>>>> 4c269c13f5d70164ca5dd24244db2a7d78d8107f
}