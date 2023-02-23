package com.exam.service;

import java.util.List;
import java.util.Set;

import com.exam.model.Category;
import com.exam.model.Quiz;

public interface QuizService {

	public Set<Quiz> getQuizzes();
	
	public Quiz getQuiz(Long quizId);
	
	public List<Quiz> getQuizzesOfCategory(Category category);
}
