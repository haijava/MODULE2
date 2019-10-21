package module2.java.practic.comparable;

public class ComparableCircle extends Circle implements Comparable {

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Object o) {
        ComparableCircle tmp = (ComparableCircle) o;
        if (getRadius()>tmp.getRadius()){
            return 1;
        }else if( getRadius()<tmp.getRadius() ) return -1;
        else return 1;
    }
}
