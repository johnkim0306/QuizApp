package com.john.demo.dao;

import com.john.demo.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface QuestionDao extends JpaRepository<Question, Integer> {
}
