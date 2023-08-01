package com.exam.app.controller;

import com.exam.app.model.Exam;
import com.exam.app.model.Qview;
import com.exam.app.model.Response;
import com.exam.app.service.ExamSer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("exam")
public class Examcon {

    @Autowired
    ExamSer examSer;

    @PostMapping("create")
    public ResponseEntity<String> createExam(@RequestParam String qsubject, @RequestParam int numQ, @RequestParam String title){
        return examSer.createExam(qsubject,numQ, title);
    }
    @PutMapping("create")
    public ResponseEntity<String> createExa(@RequestBody Map<String, String> req){
        return examSer.createExam(req.get("qsubject"), Integer.parseInt(req.get("numQ")), req.get("title"));
    }
    
    @GetMapping("load/{id}")
    public ResponseEntity<List<Qview>> getQuizQuestions(@PathVariable Integer id){
        return examSer.getExamQuestions(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitExam(@PathVariable Integer id, @RequestBody List<Response> responses){
        return examSer.calculateResult(id, responses);
    }


}