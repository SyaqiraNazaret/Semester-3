<?php
//lokasi penyimpanan file gambar yang diunggah
$targetDirectory = "images/";

//Periksa apakah direktori penyimpanan ada, jika tidak maka dibuat
if (!file_exists($targetDirectory)) {
    mkdir($targetDirectory, 0777, true);
    }
if ($_FILES['images']['name'][0]) {
    $totalFiles = count($_FILES['images']['name']);

    //Loop melalui semua file gambar yang diunggah 
    for ($i = 0; $i < $totalFiles; $i++) {
        $fileName = $_FILES['images']['name'][$i];
        $targetFile = $targetDirectory .$fileName;

        // Pimdahkan file gambar yang diunggah ke direktori penyimpanan
        if(move_uploaded_file($_FILES['images']['tmp_name'][$i], $targetFile)) {
            echo "Gambar berhasil diunggah.<br>";
        } else {
            echo "Gagal mengunggah gambar .<br>";
        }
    }
} else {
    echo "Tidak ada gambar yang diunggah. ";
}
?>