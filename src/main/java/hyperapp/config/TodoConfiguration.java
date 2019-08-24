package hyperapp.config;

import hyperapp.domain.todo.TodoRepository;
import hyperapp.domain.todo.TodoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfiguration {

    @Bean
    public TodoService todoService(TodoRepository repository) {
        return new TodoService(repository);
    }
}
