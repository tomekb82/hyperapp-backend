package hyperapp.repositories.todo;

import hyperapp.domain.todo.Todo;
import hyperapp.domain.todo.TodoRepository;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Component
public class TodoJpaRepository implements TodoRepository {

    List<Todo> todos = Arrays.asList(
            new Todo("n1", "d1", "s1"),
            new Todo("n2", "d2", "s2")
    );

    @Override
    public List<Todo> getAll() {
        return todos;
    }

    @Override
    public Todo create(Todo todo) {
        todo.setId(UUID.randomUUID().toString());
        todos.add(todo);
        return todo;
    }

    @Override
    public Todo get(String id) {
        return todos.stream()
                .filter(todo -> todo.getId().equals(id))
                .findFirst()
                .orElseGet(null);
    }
}
