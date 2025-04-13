package com.cscdepartment.courseservice.controller;
import com.cscdepartment.courseservice.spring_assignment1.CscCourses;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/csccourses")



public class CscCourseService {

    CscCourses cscCourses;
    private List<CscCourses> courses = new ArrayList<>(Arrays.asList(
            new CscCourses("CSC113F: Elementary Computer Programming", "Foundation1"),
            new CscCourses("MAT111F: Mathematics", "Foundation2"),
            new CscCourses("CSC212: Computer Architecture and Design", "Undergraduate1"),
            new CscCourses("CSC211: Advanced Programming", "Undergraduate2"),
            new CscCourses("CSC224: Database Management and Design", "Undergraduate3"),
            new CscCourses("CSC312: Operating Systems", "Undergraduate4"),
            new CscCourses("CSC313: Object-Oriented Programming", "Undergraduate5"),
            new CscCourses("CSC512: Computer Networks", "Honours1"),
            new CscCourses("CSC515: Advanced Java", "Honours2"),
            new CscCourses("CSC517: Theory of Computing", "Honours3")
    ));

    // Endpoint to create a new course
    @PostMapping
    public String createCourse(@Valid @RequestBody CscCourses newCourse, BindingResult result) {
        if (result.hasErrors()) {
            return result.getAllErrors().get(0).getDefaultMessage();
        }
        courses.add(newCourse);
        return "Course information created successfully.";
    }

    // Endpoint to get a course by its type
    @GetMapping("{courseType}")
    public CscCourses getCourseByType(@PathVariable String courseType) {
        for (CscCourses course : courses) {
            if (course.getCourseType().equalsIgnoreCase(courseType)) {
                return course;
            }
        }
        throw new IllegalArgumentException("Invalid course type: " + courseType);
    }

    @PutMapping("{courseType}")
    public String updateCourse(@PathVariable String courseType, @Valid @RequestBody CscCourses updatedCourse, BindingResult result) {
        if (result.hasErrors()) {
            return result.getAllErrors().get(0).getDefaultMessage();
        }

        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseType().equalsIgnoreCase(courseType)) {
                courses.set(i, updatedCourse);
                return "Course updated successfully.";
            }
        }
        throw new IllegalArgumentException("Course type not found: " + courseType);
    }

    @DeleteMapping("{courseType}")
    public String deleteCourse(@PathVariable String courseType) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseType().equalsIgnoreCase(courseType)) {
                courses.remove(i);
                return "Course deleted successfully.";
            }
        }
        throw new IllegalArgumentException("Course type not found: " + courseType);
    }

    // Endpoint to get all courses
    @GetMapping("/all")
    public List<CscCourses> getAllCourses() {
        return courses;
    }

}
