package example;

public class Task {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "task{" +
                "name='" + name + '\'' +
                '}';
    }
}
