public class Group {
    private int id;
    private int hmanIndex = 0;
    private Student[] students;

    public Group (int id) {
        this.id = id;
    }

    public Student hmanElect() {

        for (int i = 1; i < students.length; i++){

            if (students[hmanIndex].getMeanMark() < students[i].getMeanMark()){
                hmanIndex = i;
            }
        }

        return students[hmanIndex];
    }

    public int getHmanIndex() {
        return hmanIndex;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents () {
        return students;
    }

    @Override
    public String toString() {
        String s = "Group[" + (id+1) +"]:\n";
        for (int i = 0; i < students.length; i++){
            s += students[i].toString() + "\n";
        }
        return s;
    }
}
