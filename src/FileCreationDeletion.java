import java.io.IOException;
import java.util.Scanner;

public class FileCreationDeletion {
    public static void main(String[] args) throws IOException {
        BusinessOperation businessOperation = new BusinessOperation();
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("*********  Welcome to LockersMe.com **************");
        System.out.println("*********  Developed By : Richa  **********************");
        System.out.println("********************************************************");

        boolean Flag = true;
        while(Flag) {
            System.out.println("#######################################");
            System.out.println("\t\tSelect the option one");
            System.out.println("\t\t1. Retrieve Files");
            System.out.println("\t\t2. More Business Operations");
            System.out.println("\t\t3. Close Program");
            System.out.println("#######################################");
            int number=sc.nextInt();
            switch (number) {
                case 1:
                    businessOperation.getFolderContent();
                    break;
                case 2:
                    businessOperation.businessLogic();
                    break;
                case 3:
                    System.out.println("Closing The Program");
                    Flag = false;
                    break;
                default:
                    System.out.println("Invalid Selection, Please select from 1 to 3");
                    break;
            }
        }
    }
}
