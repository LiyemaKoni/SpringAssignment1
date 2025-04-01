package com.cscdepartment.courseservice.spring_assignment1;

public class CscCourses {
    private String courseName;
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
