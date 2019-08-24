package hyperapp.domain.todo;

import java.util.List;

public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> getAll() {
        return repository.getAll();
    }
}
