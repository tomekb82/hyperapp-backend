package hyperapp.domain.todo;

import java.util.List;

public interface TodoRepository {

    List<Todo> getAll();
}
