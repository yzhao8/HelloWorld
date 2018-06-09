package hello;

public class Fix1 {
    private String f = "Test";
    // test merge
    protected static String comeFix1() {
        return "come from fix1 but merge";
    }

    public void setFix(String f) {
        this.f = f;
    }
}
