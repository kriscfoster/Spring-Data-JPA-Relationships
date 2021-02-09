package com.kriscfoster.school.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @PostMapping
    Course createCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }
}
