import extend.modifier.Father;

public class Son extends Father {
    public void show() {
        // privateMethod(); // error
        // method(); // error
        protectedMethod();
        publicMethod();
    }
}
