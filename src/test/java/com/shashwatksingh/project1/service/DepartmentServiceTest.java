package com.shashwatksingh.project1.service;

import com.shashwatksingh.project1.entity.Department;
import com.shashwatksingh.project1.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {
    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder().departmentAddress("Bangalore, Karnataka").departmentCode("HR").departmentName("human Resources").departmentId(1L).build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("Human Resources")).thenReturn(department);
    }

    @Test
    @DisplayName(value = "Get data based on Valid Department name")
    public void whenValidDepartmentName_thenDepartmentShouldBeFound() {
        String departmentName = "Human Resources";
        Department found = departmentService.fetchDepartmentByName(departmentName);
        assertTrue(departmentName.equalsIgnoreCase(found.getDepartmentName()));
    }
}