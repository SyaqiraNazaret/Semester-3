<?php
    $myArray = array(); //Array kosong
    if (empty($myArray)) {
        echo "Array tidak teridentifikasi atau kosong.<br>";
    } else {
        echo "Array teridentifikasi dan tidak kosong.<br>";
    }
    if (empty($nonExistentVar)) {
        echo " Variabel tidak terdefinisi atau kosong.<br>";
    } else {
        echo "Variabel terdefinisi dan tidak kosong.<br>";
    }
?>