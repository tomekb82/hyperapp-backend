package hyperapp.domain.todo;

import java.util.List;

public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public Todo get(String id){
        return repository.get(id) ;
    }

    public List<Todo> getAll() {
        return repository.getAll();
    }

    public Todo create(Todo todo){
        return repository.create(todo);
    }
}
