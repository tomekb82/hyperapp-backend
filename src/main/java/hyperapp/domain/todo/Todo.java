package hyperapp.domain.todo;

public class Todo {
    private final String name;
    private final String description;
    private final String status;

    public Todo(String name, String description, String status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
}
