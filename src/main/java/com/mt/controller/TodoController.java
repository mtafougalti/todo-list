package com.mt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mt.model.Todo;

@Controller
public class TodoController {
	@GetMapping("/todos")
	public String greeting(Model model) {
		List<Todo> list = new ArrayList<>();
		list.add(new Todo(1, "Todo1", "Todo task 1"));
		list.add(new Todo(2, "Todo2", "Todo task 2"));
		list.add(new Todo(3, "Todo3", "Todo task 3"));
		list.add(new Todo(4, "Todo4", "Todo task 4"));
		list.add(new Todo(5, "Todo5", "Todo task 5"));
		model.addAttribute("list", list);
		return "todos";
	}
}
