package br.com.gabrielmiranda._1.testjunior_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielmiranda._1.testjunior_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
