package nl.gpesoft.sbd.domain;

public class Greeting {

    private final String template = "Hello, %s!";
    private final String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return (String.format(template, name));
    }
}