package com.ar.cac.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ar.cac.Models.Menu;
import com.ar.cac.repositories.MenuRepository;

@Service
public class MenuService {
	private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public Menu create(Menu menu) {
        return menuRepository.save(menu);
    }

    public Menu update(Menu menu) {
        return menuRepository.save(menu);
    }

    public Menu change(Menu menu) {
        return menuRepository.save(menu);
    }

    public boolean remove(long id) {
        if (menuRepository.existsById(id)) {
            menuRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Optional<Menu> find(long id) {
        return menuRepository.findById(id);
    }
    
    public Iterable<Menu> findAll(){
    	return menuRepository.findAll();
    }
	
	
	
	
	

}
