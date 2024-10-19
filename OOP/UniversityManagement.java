
// manage the universities steudents, professors, courses
public class UniversityManagement {
    private List<Student> students;// list to hold students
    private List<professors> professors;// list to hold professors
    private List<Course> courses;// list to hold courses

    // constructor to initilize printing lists for students, professors, courses
    public UniversityManagement() {
        students = new ArrayList();
        professors = new ArrayList();
        course = new ArrayList();
    }

    // method to add a student
    public void addStudent(String name) {
        students.add(new student(name));
    }

    // method to add professor
    public void addProfessor(String name) {
        professors.add(new professors(name));
    }

    // method to add courses
    public void addCourses(String title) {
        courses.add(new course(title));
    }

    public void enrollStudentInCourse(String studenName, String courseName){
        // find the student by name 
        Student student = findStudentByName(String studentName);
        // find the course by title
        Course course = findCourseByTitle(String courseTitle);

        if(student!= null&&course!=null){
            // Enroll the student in the course
            student.enrollInCourse(course);
        }else{
            System.out.println("Student or course not found.");
        }
    }

    public void assignCourseToProfessor(String professorName, String courseTitle) {
        Course course = findCourseByTitle(courseTitle);
        Professor professor = findProfessorByName(professor);

        if (professor != null && course != null) {
            professor.assignCourse(course);
        } else {
            System.out.println("Professor or course or not Found ");
        }
    }

    public void listStudents() {
        System.out.println("List of students in university : ");
        for (Student student : students) {
            System.out.println(student);// print each student name
        }
    }

    public void listProfessors() {
        System.out.println("List of professors in university : ");
        for (Professor professor : professors) {
            System.out.println(professor);
        }
    }

    public void listCourses() {
        System.out.println("List of all courses : ");
        for (Courses course : courses) {
            System.out.println(course);
        }
    }

    public void displayStudentCourses() {

    }
}