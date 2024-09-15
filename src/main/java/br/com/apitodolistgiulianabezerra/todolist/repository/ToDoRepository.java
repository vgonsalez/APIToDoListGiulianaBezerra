package br.com.apitodolistgiulianabezerra.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apitodolistgiulianabezerra.todolist.entity.Todo;

public interface ToDoRepository extends JpaRepository<Todo, Long> {
}
