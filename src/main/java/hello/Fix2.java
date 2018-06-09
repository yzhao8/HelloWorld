package hello;

public class Fix2 {
    private String f;
    public static void comeFix2() {
        System.out.println(" come from fix2");
    }

    public static void main(String[] args) {
        comeFix2();
    }

    // test merge and pull
    @Override
    public String toString() {
        if (f==null)
            return "Fix3 empty";
        else
            return "full?????";
    }
}