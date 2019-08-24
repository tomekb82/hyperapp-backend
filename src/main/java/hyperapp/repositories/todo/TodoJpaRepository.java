package hyperapp.repositories.todo;

import hyperapp.domain.todo.Todo;
import hyperapp.domain.todo.TodoRepository;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TodoJpaRepository implements TodoRepository {

    List<Todo> todos = Arrays.asList(
            new Todo("n1", "d1", "s1"),
            new Todo("n1", "d1", "s1")
    );

    @Override
    public List<Todo> getAll() {
        return todos;
    }
}
