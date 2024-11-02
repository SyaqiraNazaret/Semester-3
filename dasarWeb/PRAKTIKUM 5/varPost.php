<!DOCTYPE html>
<html>
<head>
    <title>Formulir Sederhana</title>
</head>
<body>

<form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
    <label for="name">Nama:</label>
    <input type="text" id="name" name="name">
    <input type="submit" value="Kirim">
</form>

<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Ambil nilai dari input dengan nama "name"
    $name = $_POST['name'];

    // Periksa apakah nilai input kosong
    if (empty($name)) {
        echo "Nama tidak boleh kosong.";
    } else {
        echo "Halo, " . $name . "!";
    }
}
?>

</body>
</html>