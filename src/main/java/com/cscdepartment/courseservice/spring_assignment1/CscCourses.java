package com.cscdepartment.courseservice.spring_assignment1;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CscCourses {


    @NotBlank(message = "Course name cannot be empty")
    @Size(min = 5, message = "Course name must be at least 5 characters")
    private String courseName;

    @NotBlank(message = "Course type cannot be empty")
    private String courseType;

    public CscCourses() {
    }

    public CscCourses(String courseName, String courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseType() {
        return courseType;
    }


}
