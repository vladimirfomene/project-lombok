package Value;

import java.util.Objects;

public final class VanillaStudent {

    private final String studentName = "student";

    private final String studentID = "36272018";

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VanillaStudent that = (VanillaStudent) o;
        return Objects.equals(studentName, that.studentName) &&
                Objects.equals(studentID, that.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentID);
    }
}

