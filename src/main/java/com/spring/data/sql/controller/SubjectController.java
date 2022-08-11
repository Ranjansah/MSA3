package com.spring.data.sql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.sql.bean.Subject;
import com.spring.data.sql.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	
	@RequestMapping("/subjects")
	public List<Subject> getAllSubjects()
	{
		return subjectService.getAllSubject();
	
	}
	@RequestMapping("/subjects/{id}")
	public Optional<Subject> getoneSubjects(@PathVariable String id)
	{
		 return subjectService.getoneSubject(id);
	
	} 
	@RequestMapping(method=RequestMethod.POST,value="/subjects/")
	public void addSubject(@RequestBody Subject subject)
	{
		subjectService.addSubject(subject);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/subjects/{id}")
	public void updateSubject(@PathVariable  String id , @RequestBody Subject subject)
	{
		subjectService.updateSubject(id,subject);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/subjects/{id}")
	public void deleteSubject(@PathVariable String id)
	{
	subjectService.deleteSubject(id);	
	}
			
}
