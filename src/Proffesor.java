public class Proffesor {
    public void countStudents(Student[] students) {
        System.out.println("List of absent students:\n");
        for (int i = 0; i < students.length; i++) {
            if (!students[i].getPresence()) {
                System.out.println(students[i].toString() + "\n");
            }
        }
    }
}
