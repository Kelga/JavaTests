import java.util.Scanner;
import java.io.*;

public class main {
    
    public static void main(String args[]){
        
            System.out.println("Program start here");

            Scanner in = new Scanner(System.in);
            String chose;

            System.out.print("What do you do(Log / Reg): ");
            chose = in.nextLine();

            if (chose.equals("reg")){

                reg(in);

            }

            else if (chose.equals("log")){

                log(in);

            }

            System.out.println("Program end here");

    }


    static public void reg(Scanner in){

        try{

            String login, password;

            System.out.print("Write your login: ");
            login = in.nextLine();

            System.out.print("Write your password: ");
            password = in.nextLine();

            File f = new File("files\\" + login + ".txt");
            if (password.length() >= 5){

                if (f.createNewFile()){

                    FileWriter fw = new FileWriter("files\\" + login + ".txt");
                    fw.write(login + "\n" + password);

                    System.out.println("User file created");
                    fw.close();

                }

                else{

                    System.out.println("User already exists");

                }

            }

            else{

                System.out.println("Long of the password need be biggest then 5");
                reg(in);

            }
        }

        catch (IOException ex){

            System.out.println(ex);

        }
    }
    

    static public void log(Scanner in){

        try{

            String login, password;

            System.out.print("Write your login: ");
            login = in.nextLine();

            System.out.print("Write your password: ");
            password = in.nextLine();

            FileReader fr = new FileReader("files\\" + login + ".txt");
            Scanner inr = new Scanner(fr);
            String testLogin = inr.nextLine();
            String testPassword = inr.nextLine();

            if (testLogin.equals(login) & testPassword.equals(password)){

                System.out.println("You login sucsessfuly!");
                fr.close();

            }

            else{

                System.out.println("You faled logining");
                fr.close();

            }
        }

        catch (IOException ex){

            System.out.println(ex);

        }
    }

}