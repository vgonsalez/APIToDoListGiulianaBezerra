package br.com.apitodolistgiulianabezerra.todolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apitodolistgiulianabezerra.todolist.entity.Todo;
import br.com.apitodolistgiulianabezerra.todolist.service.ToDoService;

@RestController
@RequestMapping("/todos")
public class ToDoController {
	private ToDoService todoService;
	
	public ToDoController(ToDoService todoService) {
		this.todoService = todoService;
	}
	
	@PostMapping
	List<Todo> create(@RequestBody Todo todo){
		return todoService.create(todo);
	}
	
	@GetMapping
	List<Todo> list(){
		return todoService.list();
	}
	
	@PutMapping
	List<Todo> update(@RequestBody Todo todo) {
		return todoService.update(todo);
	}
	
	@DeleteMapping("{id}")
	List<Todo> delete(@PathVariable("id") Long id){
		return todoService.delete(id);
	}
}
