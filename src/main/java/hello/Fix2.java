package hello;

public class Fix2 {
    public static void comeFix2() {
        System.out.println(" come from fix2");
    }

    public static void main(String[] args) {
        comeFix2();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}