public class Main {
    public static void main(String[] args) {
        int length =3;
        Shape[]array =new Shape[length];
        array[0] = new Square();
        array[1] = new Rectangle("red",true,2,4);
        array[2] = new Circle("red",true,4);

        for (int i=0;i<3;i++){
            if (array[i]instanceof Colorable){
                ((Square)array[i]).howToColor();
            }
            else
                System.out.println(array[i].toString());
        }

    }
}
