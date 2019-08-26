package hyperapp.api.todo;

import hyperapp.domain.todo.Todo;
import hyperapp.domain.todo.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/todos")
    public ResponseEntity<Todo> create(@RequestBody Todo todo, UriComponentsBuilder uriComponentsBuilder) {
        Todo created = todoService.create(todo);

        return ResponseEntity.created(uriComponentsBuilder.path("/todos/{id}")
                .buildAndExpand(created.getId()).toUri())
                .body(created);
    }

    @GetMapping("/todos/{id}")
    public ResponseEntity<Todo> get(@PathVariable("id") String id) {
        Todo updated = todoService.get(id);

        return ResponseEntity.ok(updated);
    }

    @GetMapping("/todos")
    public List<Todo> getAll() {
        return todoService.getAll();
    }

}
