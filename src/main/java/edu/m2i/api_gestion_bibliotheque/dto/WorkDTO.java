package edu.m2i.api_gestion_bibliotheque.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class WorkDTO {

	@NotNull(message = "Titre obligatoire")
	@Size(min = 5, max = 50, message = "Nombre de caratères compris entre 5 et 50")
	private String title;

	@NotNull(message = "Auteur principale obligatoire")
	@Size(min = 3, max = 30, message = "Nombre de caratères compris entre 3 et 30")
	private String mainAuthor;

	@Size(min = 5, max = 50, message = "Nombre de caratères compris entre 5 et 50")
	private String otherAuthor;

	@NotNull(message = "Genre obligatoire")
	private Integer idGenreWork;

	@NotNull(message = "Editeur obligatoire")
	@Size(min = 3, max = 30, message = "Nombre de caratères compris entre 3 et 30")
	private String editor;

	private LocalDate publishedDate;

	@Size(min = 5, max = 150, message = "Nombre de caratères compris entre 5 et 150")
	private String comment;

	private Boolean availability;

	@NotNull(message = "Type de l'ouvrage obligatoire")
	private Integer idTypeWork;

	public Integer getIdTypeWork() {
		return idTypeWork;
	}

	public void setIdTypeWork(Integer idTypeWork) {
		this.idTypeWork = idTypeWork;
	}
	
	public Integer getIdGenreWork() {
		return idGenreWork;
	}

	public void setIdGenreWork(Integer idGenreWork) {
		this.idGenreWork = idGenreWork;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMainAuthor() {
		return mainAuthor;
	}

	public void setMainAuthor(String mainAuthor) {
		this.mainAuthor = mainAuthor;
	}

	public String getOtherAuthor() {
		return otherAuthor;
	}

	public void setOtherAuthor(String otherAuthor) {
		this.otherAuthor = otherAuthor;
	}


	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

}
