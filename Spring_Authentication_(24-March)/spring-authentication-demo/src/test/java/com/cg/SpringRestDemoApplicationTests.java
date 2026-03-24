package com.cg;

import com.cg.dao.IEmployeeRepo;
import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.entity.Employee;
import com.cg.exception.EmployeeNotFoundException;
import com.cg.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.text.html.parser.Entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class SpringRestDemoApplicationTests {

	@Mock // creates a mock or dummy repository
	private IEmployeeRepo repo;
	@InjectMocks // injects the mock repo into service
	private EmployeeService service;

	// to test with data in database
//    @Test
//    void testEmployeeById(){
//        assertNotNull(service.getEmployee(152));
//        assertThrows(EmployeeNotFoundException.class,()->service.getEmployee(220));
//        assertEquals("Astam", service.getEmployee(204).getFullName());
//    }

	@Test
	void testEmployeeById(){
		EmployeeDTO edDto = new EmployeeDTO("Ragav", LocalDate.of(2002,10,12),34000.00);
		edDto.setEmployeeId(1032);
		Employee e = EntityMapper.convertObjectToEntity(edDto);
		Optional<Employee> op = Optional.of(e);
		when(repo.findById(1032)).thenReturn(op);
		assertNotNull(service.getEmployee(1032));
	}

	@Test
	void testEmployeeByIdWithException(){
		when(repo.findById(1002)).thenThrow(EmployeeNotFoundException.class);
		assertThrows(EmployeeNotFoundException.class, ()->service.getEmployee(1002));
	}

	@Test
	void testGetAllEmployees(){
		List<EmployeeDTO> ed = new ArrayList<>();
		ed.add(new EmployeeDTO("Sadiq",LocalDate.of(2002,7,16),50000.0));
		ed.add(new EmployeeDTO("Ayush",LocalDate.of(2003,4,9),45000.0));
		ed.add(new EmployeeDTO("Rhythm",LocalDate.of(2001,1,12),36000.0));

		List<Employee> emp = new ArrayList<>();
		ed.forEach(e->emp.add(EntityMapper.convertObjectToEntity(e)));
		when(repo.findAll()).thenReturn(emp);
		assertNotNull(service.getAllEmployee());
	}

	@Test
	void testCreateEmployee(){
		EmployeeDTO ed = new EmployeeDTO("Sadiq",LocalDate.of(2002,7,16),50000.0);
		Employee emp = EntityMapper.convertObjectToEntity(ed);
		when(repo.saveAndFlush(any(Employee.class))).thenReturn(emp);

		EmployeeDTO result = service.createEmployee(ed);
		assertNotNull(result);
		assertEquals("Sadiq",result.getFullName());
	}

	@Test
	void testRemoveEmployee(){
		EmployeeDTO ed = new EmployeeDTO("Sadiq",LocalDate.of(2002,7,16),50000.0);
		ed.setEmployeeId(1005);
		Employee emp = EntityMapper.convertObjectToEntity(ed);
		Optional<Employee> op = Optional.of(emp);
		when(repo.findById(1005)).thenReturn(op);
		String result = service.removeEmployee(1005);
		assertEquals("Employee Deleted", result);
		verify(repo,times(1)).deleteById(1005);
	}

	@Test
	void testDeleteEmployee_NotFound(){
		when(repo.findById(1)).thenReturn(Optional.empty());
		assertThrows(EmployeeNotFoundException.class, () -> service.removeEmployee(1));
	}

	@Test
	void testUpdateEmployee(){
		EmployeeDTO ed = new EmployeeDTO("Sadiq",LocalDate.of(2002,7,16),50000.0);
		ed.setEmployeeId(1005);
		Employee emp = new Employee("Sadique",LocalDate.of(2002,7,16),50000.0);
		Optional<Employee> op = Optional.of(emp);
		when(repo.findById(1005)).thenReturn(op);
		when(repo.saveAndFlush(any(Employee.class))).thenReturn(emp);
		EmployeeDTO updated = service.updateEmployee(ed);
		assertNotNull(updated);
		assertEquals("Sadique", updated.getFullName());
	}

	@Test
	void testUpdateEmployee_NotFound() {
		EmployeeDTO ed = new EmployeeDTO("Sadiq", LocalDate.of(2002,7,16), 50000.0);
		ed.setEmployeeId(1005);
		when(repo.findById(1005)).thenReturn(Optional.empty());
		EmployeeDTO result = service.updateEmployee(ed);
		assertNull(result);   // because service returns null
		verify(repo, never()).saveAndFlush(any(Employee.class));
	}

	@Test
	void testEmployeeByName(){
		List<EmployeeDTO> ed = new ArrayList<>();
		ed.add(new EmployeeDTO("Sadiq",LocalDate.of(2002,7,16),50000.0));
		ed.add(new EmployeeDTO("Ayush",LocalDate.of(2003,4,9),45000.0));
		ed.add(new EmployeeDTO("Rhythm",LocalDate.of(2001,1,12),36000.0));

		List<Employee> emp = new ArrayList<>();
		ed.forEach(e->emp.add(EntityMapper.convertObjectToEntity(e)));
		when(repo.findByName("Sadiq")).thenReturn(emp);
		assertNotNull(service.getEmployeeByName("Sadiq"));
	}
}
