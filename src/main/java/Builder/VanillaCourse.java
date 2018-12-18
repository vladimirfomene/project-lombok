package Builder;

public class VanillaCourse {

    private String courseName;

    private String courseCode;

    public VanillaCourse(String courseName, String courseCode){
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public static VanillaCourseBuilder builder() {
        return new VanillaCourseBuilder();
    }

    public static class VanillaCourseBuilder{

        private String courseName;

        private String courseCode;

        public VanillaCourseBuilder courseName(String courseName){
            this.courseName = courseName;
            return this;
        }

        public VanillaCourseBuilder courseCode(String courseCode){
            this.courseCode = courseCode;
            return this;
        }

        public VanillaCourse build(){
            return new VanillaCourse(courseName, courseCode);
        }

    }

    @Override
    public String toString() {
        return "VanillaCourse{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}
