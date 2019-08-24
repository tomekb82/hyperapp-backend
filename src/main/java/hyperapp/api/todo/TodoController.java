package hyperapp.api.todo;

import hyperapp.domain.todo.Todo;
import hyperapp.domain.todo.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    @ResponseBody
    public List<Todo> getAll() {
        return todoService.getAll();
    }

}
