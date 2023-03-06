package com.tl.org.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tl.org.demo.dto.EmployeeDto;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	List<EmployeeDto> list = new ArrayList<>();
	static {
		// Value 1
		EmployeeDto dto2 = new EmployeeDto();
		dto2.setId(4);
		dto2.setFirstName("Jack");
		dto2.setLastName("Smith");
		dto2.setEmail("jack.smith@example.com");
		dto2.setPhoneNumber(888999000);

		// Value 2
		EmployeeDto dto3 = new EmployeeDto();
		dto3.setId(5);
		dto3.setFirstName("Samantha");
		dto3.setLastName("Jones");
		dto3.setEmail("samantha.jones@example.com");
		dto3.setPhoneNumber(333444555);

		// Value 3
		EmployeeDto dto4 = new EmployeeDto();
		dto4.setId(6);
		dto4.setFirstName("Michael");
		dto4.setLastName("Davis");
		dto4.setEmail("michael.davis@example.com");
		dto4.setPhoneNumber(777888999);

		// Value 4
		EmployeeDto dto5 = new EmployeeDto();
		dto5.setId(7);
		dto5.setFirstName("Emily");
		dto5.setLastName("Wilson");
		dto5.setEmail("emily.wilson@example.com");
		dto5.setPhoneNumber(222333444);

		// Value 5
		EmployeeDto dto6 = new EmployeeDto();
		dto6.setId(8);
		dto6.setFirstName("Alex");
		dto6.setLastName("Garcia");
		dto6.setEmail("alex.garcia@example.com");
		dto6.setPhoneNumber(555667777);

		// Value 6
		EmployeeDto dto7 = new EmployeeDto();
		dto7.setId(9);
		dto7.setFirstName("Olivia");
		dto7.setLastName("Taylor");
		dto7.setEmail("olivia.taylor@example.com");
		dto7.setPhoneNumber(999887777);

		// Value 7
		EmployeeDto dto8 = new EmployeeDto();
		dto8.setId(10);
		dto8.setFirstName("Daniel");
		dto8.setLastName("Kim");
		dto8.setEmail("daniel.kim@example.com");
		dto8.setPhoneNumber(444556666);

		// Value 8
		EmployeeDto dto9 = new EmployeeDto();
		dto9.setId(11);
		dto9.setFirstName("Sophie");
		dto9.setLastName("Anderson");
		dto9.setEmail("sophie.anderson@example.com");
		dto9.setPhoneNumber(1112223333);

		// Value 9
		EmployeeDto dto10 = new EmployeeDto();
		dto10.setId(12);
		dto10.setFirstName("Nathan");
		dto10.setLastName("Harris");
		dto10.setEmail("nathan.harris@example.com");
		dto10.setPhoneNumber(778889999);

		// Value 10
		EmployeeDto dto11 = new EmployeeDto();
		dto11.setId(13);
		dto11.setFirstName("Isabelle");
		dto11.setLastName("Gomez");
		dto11.setEmail("isabelle.gomez@example.com");
		dto11.setPhoneNumber(223334444);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<EmployeeDto> findAll() {
		return list;
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public EmployeeDto findById(@PathVariable("id") long id) {
		return findById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public long create(@RequestBody EmployeeDto dto) {
		return 0l;
	}

	@RequestMapping(method = RequestMethod.PUT)
	public String udpate(@RequestBody EmployeeDto dto) {
		return "Updated";
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") long id) {
		return "Deleted";
	}

	@ExceptionHandler
	void handleIllegalArgumentException(IllegalArgumentException e, HttpServletResponse response) throws Exception {
		response.addHeader("message", e.getMessage() + " " + e.getLocalizedMessage());
		response.sendError(HttpStatus.BAD_REQUEST.value());
	}

}