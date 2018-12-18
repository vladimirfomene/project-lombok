package Builder;

import lombok.Builder;

@Builder
public class LombokCourse {

    private String courseName;

    private String courseCode;

    @Override
    public String toString() {
        return "LombokCourse{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}

