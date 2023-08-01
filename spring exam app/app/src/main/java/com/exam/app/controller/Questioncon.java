package com.exam.app.controller;

import com.exam.app.model.Question;
import com.exam.app.service.QuestionSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class Questioncon {

    @Autowired
    QuestionSer questionSer;

    @GetMapping("all")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionSer.getAllQuestions();
    }

    @GetMapping("subject/{qsubject}")
    public ResponseEntity<List<Question>> getQuestionsByqsubject(@PathVariable String qsubject){
        return questionSer.getQuestionsByQsubject(qsubject);
    }

    @PutMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return  questionSer.addQuestion(question);
    }

    @PostMapping("edit/{id}")
    public ResponseEntity<String> editQuestion(@PathVariable int id, @RequestBody Question question){
        return  questionSer.editQuestion(id,question);
    }
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteQuestion(@PathVariable int id){
        return  questionSer.deleteQuestion(id);
    }
    //delete,

}