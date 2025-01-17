package com.peeplotech.studygroup.models;

public class SubscribedCourse {

    private String student_id;
    private String course_id;

    public SubscribedCourse() {
    }

    public SubscribedCourse(String student_id, String course_id) {
        this.student_id = student_id;
        this.course_id = course_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }
}
