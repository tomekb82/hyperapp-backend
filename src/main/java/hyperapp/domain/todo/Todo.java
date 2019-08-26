package hyperapp.domain.todo;

import java.util.UUID;

public class Todo {
    private String id;
    private final String name;
    private final String description;
    private final String status;

    public Todo(String name, String description, String status) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.id = UUID.randomUUID().toString();
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
