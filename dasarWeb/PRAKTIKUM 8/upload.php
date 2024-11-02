<?php
if (isset($_POST["submit"])) {
    // Direktori tujuan untuk menyimpan file
    $targetDirectory = "uploads/";
    // Nama file tujuan dengan ekstensi
    $targetFile = $targetDirectory . basename($_FILES["fileToUpload"]["name"]);
    // Ambil ekstensi file
    $fileType = strtolower(pathinfo($targetFile, PATHINFO_EXTENSION));

    // Ekstensi file yang diizinkan dan ukuran maksimum file
    $allowedExtensions = ["txt", "pdf", "doc", "docx"];
    $maxFileSize = 10 * 1024 * 1024; 

    // Validasi file
    if (in_array($fileType, $allowedExtensions) && $_FILES["fileToUpload"]["size"] <= $maxFileSize) {
        // Pindahkan file ke direktori tujuan
        if (move_uploaded_file($_FILES["fileToUpload"]["tmp_name"], $targetFile)) {
            echo "File berhasil diunggah.";
        } else {
            echo "Gagal mengunggah file.";
        }
    } else {
        echo "File tidak valid atau melebihi ukuran maksimum yang diizinkan.";
    }
}
?>