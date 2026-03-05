package com.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.course.model.Course;
import com.course.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping
    public ResponseEntity<?> addCourse(@RequestBody Course course) {

        service.addCourse(course);
        return new ResponseEntity<>("Course Added Successfully", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Course>> getCourses() {

        return new ResponseEntity<>(service.getAllCourses(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCourse(@PathVariable int id, @RequestBody Course course) {

        Course updated = service.updateCourse(id, course);

        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        }

        return new ResponseEntity<>("Course Not Found", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable int id) {

        boolean deleted = service.deleteCourse(id);

        if (deleted) {
            return new ResponseEntity<>("Course Deleted", HttpStatus.OK);
        }

        return new ResponseEntity<>("Course Not Found", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/search/{title}")
    public ResponseEntity<List<Course>> searchCourse(@PathVariable String title) {

        return new ResponseEntity<>(service.searchByTitle(title), HttpStatus.OK);
    }
}