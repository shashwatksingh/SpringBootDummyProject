package com.shashwatksingh.project1.service;

import com.shashwatksingh.project1.entity.Department;
import com.shashwatksingh.project1.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Department department, Long departmentId) throws DepartmentNotFoundException;

    Department fetchDepartmentByName(String departmentName);
}
