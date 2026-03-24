package com.cg;

import com.cg.controller.EmployeeController;
import com.cg.dto.EmployeeDTO;
import com.cg.service.IEmployeeService;
import org.junit.jupiter.api.MediaType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import tools.jackson.databind.ObjectMapper;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockitoBean
    private IEmployeeService service;

    @Test
    void  testGetEmployeeById() throws Exception {
        EmployeeDTO edto=new EmployeeDTO("Sadiq", LocalDate.of(2002,10,12), 30000.0);
        when(service.getEmployee(1)).thenReturn(edto);

        mockMvc.perform(get("/employees/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.employeeName")
                        .value("Sadiq"));

    }

    @Test
    void testGetAllEmployees() throws Exception {
        EmployeeDTO dto1=new EmployeeDTO("Sadiq", LocalDate.of(2002,10,12), 30000.0);
        EmployeeDTO dto2=new EmployeeDTO("Raj", LocalDate.of(2002,10,12), 30000.0);
        List<EmployeeDTO> dtoList=new ArrayList<>();
        dtoList.add(dto1);
        dtoList.add(dto2);
        when(service.getAllEmployee()).thenReturn(dtoList);

        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[1].employeeName").value("Raj"));
    }

    @Test
    void testCreateEmployee() throws Exception {
        EmployeeDTO dto=new EmployeeDTO("Raghav", LocalDate.of(2002,10,12), 30000.0);
        when(service.createEmployee(any(EmployeeDTO.class))).thenReturn(dto);

        mockMvc.perform(post("/employees").contentType(String.valueOf(MediaType.APPLICATION_JSON)).content(new ObjectMapper().writeValueAsString(dto)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.employeeName").value("Raghav"));
    }

    @Test
    void testUpdateEmployee() throws Exception {
        EmployeeDTO dto=new EmployeeDTO("Raghav", LocalDate.of(2002,10,12), 30000.0);
        when(service.updateEmployee(any(EmployeeDTO.class))).thenReturn(dto);
        mockMvc.perform(put("/employees")
                        .contentType(String.valueOf(MediaType.APPLICATION_JSON))
                        .content(new ObjectMapper().writeValueAsString(dto)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.employeeName").value("Raghav"));
    }

    @Test
    void testDeleteEmployee() throws Exception {
        when(service.removeEmployee(1)).thenReturn("Employee deleted");

        mockMvc.perform(delete("/employees/1"))
                .andExpect(status().isOk());
    }
}