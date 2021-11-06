package com.example.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

@Id
@Column(name = "book_id")
@GeneratedValue(strategy = GenerationType.AUTO)
 private Integer id;

@Column(name = "book_name")
 private String name;

@Column(name = "isbn")
 private Integer isbn ;

@Column(name = "author")
 private String author;

@Column(name = "copies")
 private Integer copies;

@Column(name = "price")
 private float price;

@Column(name = "book_cat_id")
 private Integer book_cat;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getIsbn() {
	return isbn;
}

public void setIsbn(Integer isbn) {
	this.isbn = isbn;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public Integer getCopies() {
	return copies;
}

public void setCopies(Integer copies) {
	this.copies = copies;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public Integer getBook_cat() {
	return book_cat;
}

public void setBook_cat(Integer book_cat) {
	this.book_cat = book_cat;
}
}
