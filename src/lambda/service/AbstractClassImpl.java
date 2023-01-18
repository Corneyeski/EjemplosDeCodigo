package lambda.service;

public class AbstractClassImpl extends AbstractClass {

    @Override
    public void greetings(String name) {
        System.out.println("Greetings " + name);
    }
}
