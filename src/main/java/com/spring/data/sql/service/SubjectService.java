package com.spring.data.sql.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.data.sql.bean.Subject;
import com.spring.data.sql.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository subjectRepo;
	
	public List<Subject> getAllSubject()
	{
		List<Subject> subjects=new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(Subject subject) 
	{
		
		subjectRepo.save(subject);
	}

	public void updateSubject(String id ,Subject subject) 
	{
		subjectRepo.save(subject);
		
	}

	public void deleteSubject(String id) 
	{
		subjectRepo.deleteById(id);
		
	}

	public Optional<Subject> getoneSubject(String id)
	{
		
		return subjectRepo.findById(id);	
		
	}

}
