package edu.m2i.api_gestion_bibliotheque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.m2i.api_gestion_bibliotheque.dto.TypeOuvrageDTO;
import edu.m2i.api_gestion_bibliotheque.entity.TypeOuvrage;
import edu.m2i.api_gestion_bibliotheque.service.GestionTypeOuvrageService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api-superlibrary/type-ouvrage")
public class GestionTypeOuvrageController {

	@Autowired
	GestionTypeOuvrageService gestionTypeOuvrageService;

	// Récupérer la liste complète des types d'ouvrage
	@GetMapping("/typesouvrage")
	public List<TypeOuvrage> getAllTypeOuvrage() {
		return gestionTypeOuvrageService.findAll();
	}

	// Ajouter un nouveau type d'ouvrage
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/add")
	public void addTypeOuvrage(@Valid @RequestBody TypeOuvrageDTO request) {
		TypeOuvrage typeOuvrage = new TypeOuvrage();
		typeOuvrage.setName(request.getName());
		gestionTypeOuvrageService.save(typeOuvrage);
	}

	// Supprimer un type d'ouvrage
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/delete/{id}")
	public void deleteTypeOuvrage(@PathVariable("id") Integer id) {
		gestionTypeOuvrageService.delete(id);
	}

	// Modifier un type d'ouvrage déjà présent dans la DB
	@PutMapping("/update/{id}")
	public void updateTypeOuvrage(@RequestBody TypeOuvrageDTO typeOuvrageDTO) {
		TypeOuvrage typeOuvrage = new TypeOuvrage();
		typeOuvrage.setName(typeOuvrageDTO.getName());
		gestionTypeOuvrageService.save(typeOuvrage);
	}
}
