<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <style>
        table {
            width = 50%;
            border-collapse: collapse;
            margin = 20px 0;
            font-size: 18px;
            text-align: left;
        }
        th,td {
            padding: 12px;
            border: 1px solid #dddddd;
        }
        th{
            background-color: #f2f2f2;
        }
        td {
            background-attachment: #fafafa;
        }
    </style>
</head>
<body>
    <h2>Data Dosen</h2>
    <?php
        $Dosen = [
            'nama' => 'Elok Nur Hamdana',
            'domisili' => 'Malang',
            'jenis_kelamin' => 'Perempuan' 
        ];

        // echo "Nama : {$Dosen['nama']} <br>";
        // echo "Domisili : {$Dosen ['domisili']} <br>";
        // echo "Jenis Kelamin : {$Dosen ['jenis_kelamin']} <br>";
    ?>

    <table>
        <tr>
            <th>Data</th>
            <th>Detail</th>
        </tr>
        <tr>
            <td>Nama</td>
            <td><?php echo $Dosen['nama'];?></td>
        </tr>
        <tr>
            <td>Domisili</td>
            <td><?php echo $Dosen['domisili'];?></td>
        </tr>
        <tr>
            <td>Jenis Kelamin</td>
            <td><?php echo $Dosen['jenis_kelamin'];?></td>
        </tr>
    </table>
</body> 
</html>