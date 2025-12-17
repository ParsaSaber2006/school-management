import java.util.Scanner;

public class Menu {
    public static void print(String string){
        System.out.print(string);
    }
    public  static Scanner input = new Scanner(System.in);

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        int choice;
        while (true){
            print("\n[1] Show all students \n[2] Show all teachers\n[3] Add user \n[0] Exit\n");
            print("enter your choice: ");
            choice = input.nextInt();
            if (choice == 0){
                print("Program Ended...");
                break;
            }
            switch(choice) {
                case 1:
                    if (Database.Students.isEmpty()) {
                        print("No Student entered.");
                    }else {
                        for(Student student : Database.Students) {
                            print("-----------------------------------\n");
                            print("name: "+student.name);
                            print("\nage: "+student.age);
                            print("\nScore: " + (student.getScore()==0 ? "not registered" : student.getScore()));
                        }
                        print("-----------------------------------");
                    }
                    break;
                case 2:
                    if (Database.Teachers.isEmpty()) {
                        print("No Teacher entered.");
                    }else {
                        for(Teacher teacher : Database.Teachers) {
                            print("-----------------------------------\n");
                            print("name: "+teacher.name);
                            print("\nage: "+teacher.age);
                        }
                    }
                case 3 :
                    addUser();
                    break;

                default:
                    print("Invalid choice.\ntry again\n");
            }
        }
    }
    public static void addUser(){
        for(int count=1;true;count++) {
            Menu.print("Enter your choice: \n");
            Menu.print("[1] Student\n[2] Teacher\n[0] Main menu\n");
            int choice = input.nextInt();
            if (choice == 0){
                break;
            }
            if (!(choice == 1 || choice == 2)) {
                Menu.print("Invalid choice.\ntry again\n");
                count -=1;
                continue;
            }
            print("Creating a new " + (choice==1 ? "Student ...\n": "Teacher ...\n"));
            Menu.print("Enter name of User "+count+": ");
            String name = input.next();
            Menu.print("Enter age of User "+count+": ");
            int age = input.nextInt();
            if (choice == 1) {
                Database.Students.add(new Student(name, age));
                System.out.println("Student added successfully.\n");
            }
            else {
                Database.Teachers.add(new Teacher(name, age));
                System.out.println("Teacher added successfully.\n");
            }

        }
    }
}
