package com.spring.data.sql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.spring.data.sql.bean.Subject;

@Service
public interface SubjectRepository extends CrudRepository<Subject,String> {

}
