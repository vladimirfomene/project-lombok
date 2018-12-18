package EqualsAndHashCode;

import java.util.Objects;

public class VanillaLecture {

    private String lectureName;

    private String lectureCode;

    public VanillaLecture(String lectureName, String lectureCode) {
        this.lectureName = lectureName;
        this.lectureCode = lectureCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VanillaLecture that = (VanillaLecture) o;
        return Objects.equals(lectureName, that.lectureName) &&
                Objects.equals(lectureCode, that.lectureCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lectureName, lectureCode);
    }
}
