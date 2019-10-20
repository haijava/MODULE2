public class Main {
    public static void main(String[] args) {
        Shape sha1 = new Shape("red",true);
        System.out.println("information " +sha1.toString());

        Triangle trian1 = new Triangle(2,3,4,"red",true);
        System.out.println("information "+trian1.toString());
    }
}
