package com.ds.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	private Long id;
	private String name;
	private String description;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Student> students = new ArrayList<>();
	
	public Course() {
		
	}

	public Course(String name, String description, List<Student> students) {
		this.name = name;
		this.description = description;
		this.students = students;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + ", students=" + students + "]";
	}
}
