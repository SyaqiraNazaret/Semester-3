import java.util.ArrayList;

public class NewDemo {
    public static void main(String[] args) {
        WebPage webpage1 = new WebPage();
        webpage1.title = "Jurusan Teknologi Informasi Polinema";
        webpage1.url = "https://jti.polinema.ac.id";
        webpage1.content = "<h1>Ini contoh heading</h1><br/>";
        webpage1.print();
        webpage1.displayInfo();

        Document doc1 = new Document();
        doc1.fileName = "PBO 2024.docx";
        doc1.content = "Contoh content Pemrograman Berorientasi Objek";

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(webpage1);
        printables.add(doc1);

        Printer printer1 = new Printer();
        printer1.cetak(webpage1);
        printer1.cetak(doc1);
    }
}
