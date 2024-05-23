package com.example.spring.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.spring.jdbc.dao.EmpDAO;
import com.example.spring.jdbc.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmpDAO empDAO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listEmployees(Model model) {
		System.out.println("getiing...");
		List<Employee> employees = empDAO.getAllEmployees();
		model.addAttribute("employees", employees);
		return "list-employees";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addEmployeeForm(Model model) {
		System.out.println("get1..");
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "addEmployee";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute Employee emp) {
		empDAO.createEmployee(emp);
		return "redirect:/";
	}

	@RequestMapping(value = "/edit/{empNo}", method = RequestMethod.GET)
	public String editEmployeeForm(@PathVariable int empNo, Model model) {
		Employee emp = empDAO.getEmployeeById(empNo);
		model.addAttribute("employee", emp);
		return "editEmployee";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String editEmployee(@ModelAttribute Employee emp) {
		empDAO.updateEmployee(emp);
		return "redirect:/";
	}

	@RequestMapping(value = "/delete/{empNo}", method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable("empNo") Integer empNo) {
		Employee employee = empDAO.getEmployeeById(empNo);
		empDAO.deleteEmployee(employee);
		return "redirect:/";
	}
}
