public class WebPage implements Printable{
    public String url;
    public String title;
    public String content;

    @Override
    public void print(){
        System.out.println("URL: " + url);
        System.out.println("Title: " + title);

        String plainText = content.replaceAll("<[^>]*>", " ");
        System.out.println(plainText);
    }

    public void displayInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayInfo'");
    }
}
