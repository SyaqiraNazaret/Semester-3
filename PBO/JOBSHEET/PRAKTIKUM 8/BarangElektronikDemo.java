public class BarangElektronikDemo {
        public static void main(String[] args) {
            Televisi tv1 = new Televisi();

            Televisi tv2 = new Televisi("Samsung", "QLED", 1000000, 55);
            System.out.println(tv2.getAllInfo());
    
            Kulkas kulkas1 = new Kulkas();
            Kulkas kulkas2 = new Kulkas("LG", "GN-B202", 4000000, 210);
            System.out.println(kulkas2.getAllInfo());  
        }
    }

