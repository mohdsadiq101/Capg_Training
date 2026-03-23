package com.cg;

import com.cg.controller.EmployeeController;
import com.cg.dto.EmployeeDTO;
import com.cg.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;


import java.time.LocalDate;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockitoBean
    private IEmployeeService service;

    @Test
    void getEmployeeByIdApiTest() throws Exception{
        EmployeeDTO ed = new EmployeeDTO("Sadiq", LocalDate.of(2002,7,16),50000.0);
        when(service.getEmployee(1)).thenReturn(ed);

        mockMvc.perform(get("/api/employee/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fullName").value("Sadiq"))
                .andExpect(jsonPath("$.salary").value(50000));
    }
}
