package com.shashwatksingh.project1.service;

import com.shashwatksingh.project1.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Optional<Department> fetchDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Department department, Long departmentId);

    Department fetchDepartmentByName(String departmentName);
}
