<?php
// function perkenalan(){
//     echo "Assalamualaikum, ";
//     echo "Perkenalkan, nama saya Syaqira</br> ";
//     echo "Senang berkenalan dengan anda</br> ";
// }
//pemanggilan fungsi yang sudah dibuat
// perkenalan();
// perkenalan();
function Perkenalan($nama, $salam = "Assalamualaikum"){
    echo $salam.", ";
    echo "Perkenalkan, nama saya ".$nama."</br> ";
    echo "Senang berkenalan dengan anda</br> ";
}
Perkenalan("Syaqira", "Hallo");

echo "<hr>";

$saya = "Syaqira";
$ucapSalam = "Selamat Pagi";
//memanggil lagi
Perkenalan($saya);
?>

   