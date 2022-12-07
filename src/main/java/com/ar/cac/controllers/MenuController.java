package com.ar.cac.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ar.cac.Models.Menu;
import com.ar.cac.services.MenuService;

@RestController
public class MenuController {

	private final MenuService menuService;
	
	public MenuController(MenuService menuService) {
	    this.menuService = menuService;
	}

	@GetMapping("/api/menu/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<Menu> byId(@PathVariable("id") int id) {
	    return menuService.find(id);
	}
	
	@GetMapping("/api/menu")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Menu> getUsers(){
		return (List<Menu>) menuService.findAll();
	}
	
	@PostMapping("/api/menu")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Menu create(@RequestBody Menu menu) {
	    return menuService.create(menu);
	}
	
	@PutMapping("/api/menu/")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Menu update(@RequestBody Menu menu) {
	    return menuService.update(menu);
	}
	
	@PatchMapping("/api/menu/")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Menu change(@RequestBody Menu menu) {
	    return menuService.change(menu);
	}
	
	@DeleteMapping("/api/menu/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Boolean delete(@PathVariable("id") int id) {
	    return menuService.remove(id);
	}
}
