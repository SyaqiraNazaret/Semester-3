
$(document).ready(function () {
    $("#submitButton").click(function () {
        const nama = $("#nama").val();
        const angka = $("#angka").val();

        $.ajax({
            url: "proses.php",
            type: "POST",
            data: { nama: nama, angka: angka },
            success: function (response) {
                $("#result").html(response);
            },
            error: function () {
                alert("Terjadi kesalahan pada proses.");
            }
        });
    });
});
