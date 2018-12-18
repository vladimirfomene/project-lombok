package EqualsAndHashCode;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class LombokLecture {

    private String lectureName;

    private String lectureCode;

    public LombokLecture(String lectureName, String lectureCode) {
        this.lectureName = lectureName;
        this.lectureCode = lectureCode;
    }
}