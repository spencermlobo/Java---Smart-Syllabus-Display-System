import java.util.*;
import java.util.Scanner;
import package_Sem3.Sem3;
import package_Sem3.Math3;
import package_Sem3.EIC;
import package_Sem3.NT;
import package_Sem3.EDC;
import package_Sem3.DSD;
import package_Sem4.Sem4;
import package_Sem4.Maths4;
import package_Sem4.LIC;
import package_Sem4.Micro;
import package_Sem4.PCE;
import package_Sem4.SandS;
class UsernameException extends Exception {
    public UsernameException(String msg) {
        super(msg);
    }
}
class PasswordException extends Exception {
    public PasswordException(String msg) {
        super(msg);
    }
}
public class Year_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String username, password;
        System.out.print("\fEnter the Username and Password provided");
        System.out.print("\n\nEnter username :- ");
        username = s.nextLine();
        System.out.print("Enter password :- ");
        password = s.nextLine();
        int ch;
        String eps;
        try {
            if(username.equals("student_xie") && password.equals("sem3_2020"))
            { System.out.println("Login Successful!!!");
                System.out.println("\n\nPress Enter to Continue.");
                eps=s.nextLine();
                do
                {
                    Scanner sc=new Scanner(System.in);
                    Math3 A=new Math3();
                    EIC B=new EIC();
                    NT C=new NT();
                    EDC D=new EDC();
                    DSD E=new DSD();
                    float m,n;
                    double res;
                    System.out.println("\fWelcome to Semister 3");
                    System.out.println("You have these subjects this year:");
                    System.out.println(" 1. Engineering Mathematics-III");
                    System.out.println(" 2. Electronic Devices & Circuits");
                    System.out.println(" 3. Digital System Design");
                    System.out.println(" 4. Network Theory");
                    System.out.println(" 5. Electronic Instrumentation & Control Systems");
                    System.out.println(" 6. Exit");
                    System.out.println("entry the number across each subject to know more");
                    ch=sc.nextInt();
                    String ent;
                    switch(ch)
                    {
                        case 1: A.Details();
                        System.out.println("\n\nPress Enter to Go Back.");
                        ent=s.nextLine();
                        break;
                        case 2: D.Details();
                        System.out.println("\n\nPress Enter to Go Back.");
                        ent=s.nextLine();
                        break;
                        case 3: E.Details();
                        System.out.println("\n\nPress Enter to Go Back.");
                        ent=s.nextLine();
                        break;
                        case 4: C.Details();
                        System.out.println("\n\nPress Enter to Go Back.");
                        ent=s.nextLine();
                        break;
                        case 5: B.Details();
                        System.out.println("\n\nPress Enter to Go Back.");
                        ent=s.nextLine();
                        break;
                        case 6: System.exit(0);
                        break;
                        default: System.out.println("Invalid Entry!!!");
                    }
                }while(ch!=6);}
            else if(username.equals("student_xie") && password.equals("sem4_2020"))
            { System.out.println("Login Successful!!!");
                System.out.println("\n\nPress Enter to Continue.");
                eps=s.nextLine();
                do
                {
                    Scanner sc=new Scanner(System.in);
                    Maths4 F =new Maths4();
                    LIC H =new LIC();
                    PCE G =new PCE();
                    Micro Z =new Micro();
                    SandS I =new SandS();
                    float m,n;
                    double res;
                    System.out.println("\fWelcome to Semister 4");
                    System.out.println("You have these subjects this Semister:");
                    System.out.println(" 1. Engineering Mathematics-IV");
                    System.out.println(" 2. Linear Integrated Circuits");
                    System.out.println(" 3. Microcontrollers");
                    System.out.println(" 4. Principles of Communication Engineering");
                    System.out.println(" 5. Signals & Systems");
                    System.out.println(" 6. Exit");
                    System.out.println("entry the number across each subject to know more");
                    ch=sc.nextInt();
                    String ent;
                    switch(ch)
                    {
                        case 1: F.Details();
                        System.out.println("\n\nPress Enter to Go Back.");
                        ent=s.nextLine();
                        break;
                        case 2: H.Details();
                        System.out.println("\n\nPress Enter to Go Back.");
                        ent=s.nextLine();
                        break;
                        case 3: Z.Details();
                        System.out.println("\n\nPress Enter to Go Back.");
                        ent=s.nextLine();
                        break;
                        case 4: G.Details();
                        System.out.println("\n\nPress Enter to Go Back.");
                        ent=s.nextLine();
                        break;
                        case 5: I.Details();
                        System.out.println("\n\nPress Enter to Go Back.");
                        ent=s.nextLine();
                        break;
                        case 6: System.exit(0);
                        break;
                        default: System.out.println("Invalid Entry!!!");
                    }
                }while(ch!=6);}
            else if(!username.equals("student_xie"))
                throw new UsernameException("Incorrect username\nType correct username ???");
            else if(!password.equals("sem3_2020 && sem4_2020"))
                throw new PasswordException("Incorrect password\nType correct password ???");
        }
        catch (UsernameException u) {
            u.printStackTrace();
        }
        catch (PasswordException p) {
            p.printStackTrace();
        }
        finally {
        }

    }
}