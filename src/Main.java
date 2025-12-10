import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void print(String string){
        System.out.print(string);
    }
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        // Section for Save Student Data
        ArrayList<String[]> DB = new ArrayList<>();
        for(int count=1;true;count++) {
            String[] data = new String[2];
            print("Enter name of student "+count+": ");
            data[0] = input.nextLine();
            print("Enter score number of student "+count+": ");
            data[1] = input.nextLine();

            //Data of DB
//            String name = data[0];
            String score = data[1];
            //Data of DB

            if(Double.parseDouble(score)<0) {
                break;
            }
            if(Double.parseDouble(score)>20){
                print("score is higher than 20\n");
                --count;
            }
            else {
                DB.add(data);
            }
        }
        while (true){
            print("\n[1] Show all students: \n[0]Exit\n");
            print("enter your choice: ");
            choice = input.nextInt();
            if (choice == 0){
                print("Program Ended...");
                break;
            }
            switch(choice) {
                case 1:
                    if (DB.isEmpty()) {
                        print("No scores entered.");
                    }else {
                        for(String[] student : DB) {
                            print("-----------------------------------\n");
                            print(student[0] + " : " + student[1] + "\n");
                        }
                        print("-----------------------------------");
                    }
                    break;
                default:
                    print("Invalid choice.\ntry again\n");
            }
        }
    }
}