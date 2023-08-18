package tund12.staticfinal;

public class StaticTest {

    private static int numInstances = 0; //static -
    private String name;

    public StaticTest(String name) {
        this.numInstances++;
        this.name = name;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
