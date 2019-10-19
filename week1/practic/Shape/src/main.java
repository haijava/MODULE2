public class main {
    public static void main(String[] args) {
        //Circle
        Circle s1 =new Circle(4,true,"red");
        double are =s1.getArea();
        System.out.println("Area is "+Math.round(are));
        double prime = s1.getPerimeter();
        System.out.println("Perimeter is "+ Math.round(prime));
        System.out.println("olala \n"+s1.toString());
        s1.setColor("vang");
        System.out.println("olala \n"+s1.toString());
        s1.setFilled(false);
        System.out.println("olala \n"+s1.toString());


        //Rectangle
        Rectangle rec1 =new Rectangle();
        rec1.setLength(10);
        rec1.setWidth(20);
        rec1.setColor("do");
        rec1.setFilled(true);
        double recArea = rec1.getArea();
        System.out.println("Area of Rectangle is " + recArea);
        System.out.println("Rectangle "+rec1.toString());


    }
}
