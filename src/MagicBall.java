import java.util.Scanner;
public class MagicBall {
    public static void main(String[] args){
        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.println("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();
        int num = (int) (Math.random() * 9) + 1;
        String response = "";  // update this variable with the response
        if (num == 1) {
            response = "Yas!";
        }
        if (num == 2){
            response = "Outlook is not so great.";
        }
        if (num == 3) {
            response = "NO!!!!";
        }
        if (num == 4) {
            response =  "100% YES!!";
        }
        if (num == 5) {
            response = "My sources say NO!";
        }
        if (num == 6) {
            response = "Meh";
        }
        if (num == 7) {
            response = "Deffo";
        }
        if (num == 8) {
            response = "No yeah";
        }
        if (num == 9) {
            response = "Yeah no";
        }
        System.out.println(response);  // print response
    }
}
