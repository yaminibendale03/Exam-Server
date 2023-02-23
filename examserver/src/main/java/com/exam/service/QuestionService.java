package com.exam.service;

import java.util.Set;

import com.exam.model.Question;
import com.exam.model.Quiz;

public interface QuestionService {

	public Question getQuestion(Long questionId);
	
	public  Set<Question> getQuestionOfQuiz(Quiz quiz);
}
