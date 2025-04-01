package com.cscdepartment.courseservice.controller;
import com.cscdepartment.courseservice.spring_assignment1.CscCourses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/csccourses")


public class CscCourseService {
    @GetMapping("/foundation1")
    public CscCourses getFoundationCourse1() {
        return new CscCourses("CSC113F:Elementary computer programming ", "Foundation");
    }
    @GetMapping("/foundation2")
    public CscCourses getFoundationCourse2() {
        return new CscCourses("MAT111F:Mathematics", "Foundation");
    }
    @GetMapping("/undergraduate1")
    public CscCourses getUndergraduateCourse1() {
        return new CscCourses("CSC212:Computer Architecture and Design", "Undergraduate");
    }
    @GetMapping("/undergraduate2")
    public CscCourses getUndergraduateCourse2() {
        return new CscCourses("CSC211: Advance Programing", "Undergraduate");
    }
    @GetMapping("/undergraduate3")
    public CscCourses getUndergraduateCourse3() {
        return new CscCourses("CSC224:Database Management and Design", "Undergraduate");
    }
    @GetMapping("/undergraduate4")
    public CscCourses getUndergraduateCourse4() {
        return new CscCourses("CSC312: Operating Systems", "Undergraduate");
    }
    @GetMapping("/undergraduate5")
    public CscCourses getUndergraduateCourse5() {
        return new CscCourses("CSC313: Object-Oriented Programming", "Undergraduate");
    }
    @GetMapping("/honours1")
    public CscCourses getHonoursCourse1() {
        return new CscCourses("CSC512: Computer Networks", "Honours");
    }
    @GetMapping("/honours2")
    public CscCourses getHonoursCourse2() {
        return new CscCourses("CSC515: Advance Java", "Honours");
    }
    @GetMapping("/honours3")
    public CscCourses getHonoursCourse3() {
        return new CscCourses("CSC517:Theory of Computing", "Honours");
    }
    @GetMapping("/honours4")
    public CscCourses getHonoursCourse4() {
        return new CscCourses("CSC518:Intelligence Systems", "Honours");
    }

    private final CscCourses[] courses = {
            new CscCourses("CSC113F: Elementary Computer Programming", "Foundation"),
            new CscCourses("MAT111F: Mathematics", "Foundation"),
            new CscCourses("CSC212: Computer Architecture and Design", "Undergraduate"),
            new CscCourses("CSC211: Advanced Programming", "Undergraduate"),
            new CscCourses("CSC224: Database Management and Design", "Undergraduate"),
            new CscCourses("CSC312: Operating Systems", "Undergraduate"),
            new CscCourses("CSC313: Object-Oriented Programming", "Undergraduate"),
            new CscCourses("CSC512: Computer Networks", "Honours"),
            new CscCourses("CSC515: Advanced Java", "Honours"),
            new CscCourses("CSC517: Theory of Computing", "Honours"),
            new CscCourses("CSC518: Intelligent Systems", "Honours")
    };

    @GetMapping("/all")
    public CscCourses[] getAllCourses() {
        return courses; // Return all courses in an array
    }
}
