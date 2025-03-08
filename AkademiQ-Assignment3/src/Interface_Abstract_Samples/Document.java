package Interface_Abstract_Samples;
interface showable{
    void show();
}
interface printable{
    void print();
}
public class Document implements showable, printable {
    @Override
    public void print() {
        System.out.println("Document printing");
    }

    @Override
    public void show() {
        System.out.println("Document showing");
    }
}
