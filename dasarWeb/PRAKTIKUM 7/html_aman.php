<!DOCTYPE html>
<html lang="en">
<head>
    <title>Form Input PHP</title>
</head>
<body>
    <h2>Form Input PHP</h2>
    <form method="post" action="proses_form.php">
    <label for="nama">Nama:</label>
    <input type="text" name="nama" id="nama" required><br><br>

    <label for="email">Email:</label>
    <input type="email" name="email" id="email" required><br><br>

    <input type="submit" name="submit" value="Submit">
    </form>
</body>
</html>

<?php
if (isset($_POST['input'])) {
    $input = $_POST['input'];
    $input = htmlspecialchars($input, ENT_QUOTES, 'UTF-8');

    echo "Input yang diproses: " .$input;
} else {
    echo "Tidak ada Input yang diterima";
}
//memerikasa apakah input adalah email yang valid 
$email = $_POST['email'];
if (filter_var($email, FILTER_VALIDATE_EMAIL)){
    //Lanjutkan dengan pengolahan email yang aman
} else {
    //Tangani output yang tidak valid
}
?>