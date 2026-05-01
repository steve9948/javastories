import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String input = sc.nextLine();

            //Check for the stop character
            if("0".equals(input)) {
                break;
            }
            try{
                //attempt convert to integer
                int num = Integer.parseInt(input);
                System.out.println(num * 10);
            }catch (NumberFormatException e) {
                // If conversion fails, catch the exception and print the error message
                System.out.println("Invalid user input: "+ input);
            }

        }
        sc.close();
    }
}