package br.com.gabrielmiranda._1.testjunior_todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.gabrielmiranda._1.testjunior_todolist.entity.Todo;
import br.com.gabrielmiranda._1.testjunior_todolist.repository.TodoRepository;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    List<Todo> list() {
        Sort sort = Sort.by("priority").descending().and(
                Sort.by("name").ascending());
        return todoRepository.findAll(sort);
    }

    List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();

    }

    List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}
