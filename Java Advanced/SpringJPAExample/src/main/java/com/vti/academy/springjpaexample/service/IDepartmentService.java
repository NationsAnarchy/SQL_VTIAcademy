package com.vti.academy.springjpaexample.service;

import java.util.List;

import com.vti.academy.springjpaexample.entity.Department;

public interface IDepartmentService {

	public List<Department> getAllDepartments();

	public Department getDepartmentByID(short id);

	public Department getDepartmentByName(String name);

	public void createDepartment(Department department);

	public void updateDepartment(Department department);

	public void deleteDepartment(short id);

	public boolean isDepartmentExistsByID(short id);

	public boolean isDepartmentExistsByName(String name);
}
