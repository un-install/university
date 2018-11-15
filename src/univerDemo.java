import java.util.Scanner;

public class univerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor proffesor = new Professor();

        System.out.println("Input amount of groups: ");
        int amountOfGroups = sc.nextInt();

        Group[] groups = new Group[amountOfGroups];

        for (int i = 0; i < amountOfGroups; i++) {
            groups[i] = new Group(i);
            Student[] students;

            System.out.println("Input filling method(r -random; m - manual:");
            if (sc.next().charAt(0) == 'r'){
                int amountOfStudents = (int) (Math.random() * 50 + 1);

                students = new Student[amountOfStudents];

                for (int j = 0; j < amountOfStudents; j++) {
                    students[j] = new Student((float)((int)(Math.random()*5+1) + (int)(Math.random()*5+1) +
                            (int)(Math.random()*5+1)) / 3, (int)(Math.random()*2) == 1, j, i);
                }
            }
            else {
                System.out.println("Input amount of students of group" + (i + 1) + ":");
                int amountOfStudents = sc.nextInt();

                students = new Student[amountOfStudents];

                System.out.println("Input mark of math, mark of literature, mark of physics \n " +
                        "and presence (true - is present, false - is absent) for each student: ");
                for (int j = 0; j < amountOfStudents; j++) {
                    System.out.println("Student[" + (j + 1) + "]:");
                    students[j] = new Student((float) (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3, sc.nextBoolean(), j, i);
                }
            }
            groups[i].setStudents(students);

            System.out.println(groups[i].toString());

            System.out.println("headman of group:"+ (i+1) + "\n" + groups[i].hmanElect().toString() + "\n");

            proffesor.countStudents(groups[i].getStudents());
        }
    }
}
