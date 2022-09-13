package com.shashwatksingh.project1.controllers;

import com.shashwatksingh.project1.entity.Department;
import com.shashwatksingh.project1.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping(path = "/department")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside save departments of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping(path = "/department")
    public List<Department> fetchDepartmentList() {
        LOGGER.info("Inside fetch departments of Department Controller");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping(path = "/department/{id}")
    public Optional<Department> fetchDepartmentById(@PathVariable(value = "id") Long departmentId) {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping(path = "/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }

    @PutMapping(path = "/department/{id}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId){
        return departmentService.updateDepartment(department, departmentId);
    }

    @GetMapping(path = "/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }

}
