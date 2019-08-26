package hyperapp.domain.todo;

import java.util.List;

public interface TodoRepository {

    List<Todo> getAll();

    Todo create(Todo todo);

    Todo get(String id);
}
