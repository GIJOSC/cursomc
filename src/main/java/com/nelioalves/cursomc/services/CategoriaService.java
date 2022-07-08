package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public ResponseEntity<Optional<Categoria>> buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		return ResponseEntity.ok().body(obj);			
		
	}

}
