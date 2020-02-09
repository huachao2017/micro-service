package com.icloudshield.course.dto;

import com.icloudshield.thrift.user.dto.TeacherDTO;

import java.io.Serializable;

public class CourseDTO implements Serializable {

    private int id;
    private String name;
    private String description;

    private TeacherDTO teacherDTO;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TeacherDTO getTeacherDTO() {
        return teacherDTO;
    }

    public void setTeacherDTO(TeacherDTO teacherDTO) {
        this.teacherDTO = teacherDTO;
    }
}
