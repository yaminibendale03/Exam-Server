package com.exam.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.Question;
import com.exam.model.Quiz;
import com.exam.repo.QuestionRepository;
import com.exam.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question getQuestion(Long questionId) {
		return this.questionRepository.findById(questionId).get();
	}

	@Override
	public Set<Question> getQuestionOfQuiz(Quiz quiz) {
		return this.questionRepository.findByQuiz(quiz);
	}
}
