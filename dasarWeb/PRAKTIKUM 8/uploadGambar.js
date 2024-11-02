$(document).ready(function(){
    $("#upload-form").submit(function(e){
        e.preventDefault(); // Mencegah form dikirimkan secara tradisional

        var formData = new FormData(this);

        $.ajax({
            url: 'uploadGambar_ajax.php',
            type: 'POST',
            data: formData,
            contentType: false,
            processData: false,
            success: function(response){
                $('#status').html(response); // Menampilkan hasil ke #status
            },
            error: function(){
                $('#status').html("Terjadi kesalahan saat mengunggah file.");
            }
        });
    });
});


