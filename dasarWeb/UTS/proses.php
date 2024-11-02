
<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $nama = $_POST['nama'];
    $angka = $_POST['angka'];

    // Format angka menjadi format Rp dengan titik pemisah ribuan
    $formatRupiah = "Rp " . number_format($angka, 0, ',', '.');

    // Hitung jumlah digit angka
    $jumlahDigit = strlen($angka);

    // Hasil output
    echo "<p>Nama: $nama</p>";
    echo "<p>Jumlah: $formatRupiah</p>";
    echo "<p>Jumlah Digit: $jumlahDigit digit</p>";
}
?>
