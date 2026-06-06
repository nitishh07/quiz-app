package com.telusko.quizapp.service;

import com.telusko.quizapp.model.Question;
import com.telusko.quizapp.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo repo;

    public List<Question> getAllQuestions() {
        return repo.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return repo.findByCategory(category);
    }

    public String addQuestion(Question question) {
        repo.save(question);
        return "success";
    }
}
