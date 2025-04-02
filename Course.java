class Course {
    private String courseName;
    private int duration; 
    private double fee;
    private static String instituteName = "Boat";
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("====" + instituteName+"====");
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
    }

     void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}
 class course {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 500);
        Course c2 = new Course("Python for Data Science", 4, 600);
        System.out.println("Before updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("Global IT Institute");
        System.out.println("\nAfter updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

