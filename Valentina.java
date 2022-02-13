/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hackathons;

/**
 *
 * @author marya
 */
import java.util.Scanner;

public class Valentina {
    static Scanner userInput = new Scanner(System.in);
    static void mainMenu() {
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("                        V A L E N T I N A ");
        System.out.println("  This program is made to be a virtual companion for Valentine's day.");
        System.out.println(" ");
        System.out.println(" ");
        
        //Instructions
        System.out.println("                        CARE INSTRUCTIONS                    ");
        System.out.println("1) Though this is a simple program, please treat Valentina");
        System.out.println("   as if she's human.");
        System.out.println("2) Refrain from letting her fall in love with you.");
        System.out.println("3) Don't let her know too much about yourself.");
        System.out.println("4) If at any time you feel uncomfortable, type 'ABORT!'");
        System.out.println("   to stop talking to Valentina.");
        System.out.println(" ");
        System.out.println("                       TERMS AND CONDITIONS");
        System.out.println(" In order to meet Valentina, you must adhear to the T&C below");
        System.out.println("     and must answer 'I agree' to all before continuing.");
        System.out.println("          Any other answer will end this program.");
        System.out.println(" ");
        System.out.println("         ***NOTE: Type 'finished' when completed.");
        System.out.println(" ");
        }
    static void TAC() {
        //TOA Answers
        String iAgree = "I agree";
        String iDisagree = "I disagree";
        String finished = "finished";
        
        //TOA Questions
        System.out.println("User will treat Valentina with basic human rights.");
        while (true) {
            String answer1 = userInput.nextLine();
            if (answer1.equals(iAgree)) {
                break;
            }
            else if (answer1.equals(iDisagree)) {
                System.out.println("User has disagreed. The agreement will now terminate and");
                System.out.println("the user will be returned to the main menu.");
                mainMenu();
                TAC();
                warn();
                break;
            }
            else {
                System.out.println("User has responded with an answer that is not accepted. The");
                System.out.println("agreement will now terminate and the user will be returned");
                System.out.println("to the main menu.");
                mainMenu();
                TAC();
                warn();
                break;
            }
        }
        System.out.println("User will ensure a platonic friendship with Valentina.");
        while (true) {
            String answer2 = userInput.nextLine();
            if (answer2.equals(iAgree)) {
                break;
            }
            else if (answer2.equals(iDisagree)) {
                System.out.println("User has disagreed. The agreement will now terminate and");
                System.out.println("the user will be returned to the main menu.");
                mainMenu();
                TAC();
                warn();
                break;
            }
            else {
                System.out.println("User has responded with an answer that is not accepted. The");
                System.out.println("agreement will now terminate and the user will be returned");
                System.out.println("to the main menu.");
                mainMenu();
                TAC();
                warn();
                break;
            }
        }
        System.out.println("User will not disclose highly personal information to Valentina.");
        while (true) {
            String answer3 = userInput.nextLine();
            if (answer3.equals(iAgree)) {
                break;
            }
            else if (answer3.equals(iDisagree)) {
                System.out.println("User has disagreed. The agreement will now terminate and");
                System.out.println("the user will be returned to the main menu.");
                mainMenu();
                TAC();
                warn();
                break;
            }
            else {
                System.out.println("User has responded with an answer that is not accepted. The");
                System.out.println("agreement will now terminate and the user will be returned");
                System.out.println("to the main menu.");
                mainMenu();
                TAC();
                warn();
                break;
            }
        }
        System.out.println("User is aware of the 'ABORT!' command.");
        while (true) {
            String answer4 = userInput.nextLine();
            if (answer4.equals(iAgree)) {
                break;
            }
            else if (answer4.equals(iDisagree)) {
                System.out.println("User has disagreed. The agreement will now terminate and");
                System.out.println("the user will be returned to the main menu.");
                mainMenu();
                TAC();
                warn();
                break;
            }
            else {
                System.out.println("User has responded with an answer that is not accepted. The");
                System.out.println("agreement will now terminate and the user will be returned");
                System.out.println("to the main menu.");
                mainMenu();
                TAC();
                warn();
                break;
            }
        }
        System.out.println("User will be held responsible for any damages inflicted or recieved");
        while (true) {
            String answer5 = userInput.nextLine();
            if (answer5.equals(iAgree)) {
                System.out.print("Type 'finished': ");
            }
            else if (answer5.equals(iDisagree)) {
                System.out.println("User has disagreed. The agreement will now terminate and");
                System.out.println("the user will be returned to the main menu.");
                mainMenu();
                TAC();
                warn();
                break;
            }
            else if (answer5.equals(finished)) {
                System.out.println("  ");
                System.out.println("  ");
                System.out.println("              User has agreed to all Terms & Conditions.");
                System.out.println("                    T&C form has been completed.");
                System.out.println("  ");
                System.out.println("  ");
                break;
            }
            else {
                System.out.println("User has responded with an answer that is not accepted. The");
                System.out.println("agreement will now terminate and the user will be returned");
                System.out.println("to the main menu.");
                mainMenu();
                TAC();
                warn();
                break;
            }
        }
    }
    static void warn() {
        //Access to Valentina
        System.out.println("                           ***NOTICE:***");
        System.out.println("  Now that you have completed the T&C Form, you are one step away");
        System.out.println("  from having access to Valentina. This is a reminder that Valentina");
        System.out.println("  does not exsist in real life, nor can she do anything that will");
        System.out.println("  interfere or harm you in your life. This is a reminder that the");
        System.out.println("        command to stop talking to Valentina is 'ABORT!'.");
        System.out.println(" ");
        System.out.println("              Please select and type an option below:");
        System.out.println("-------------take me back to safety-----OR-----continue-------------");
        
        //Warning stuff
        String leave = "take me back to safety";
        String proceed = "continue";
        
        while (true) {
            String answer6 = userInput.nextLine();
            if (answer6.equals(proceed)) {
                System.out.println("User now has access to Valentina.");
                System.out.println("--------------------------------------------------------------------");
                System.out.println(" ");
                break;
            }
            else if (answer6.equals(leave)) {
                System.out.println("User will be taken back to safety.");
                System.out.println("--------------------------------------------------------------------");
                mainMenu();
                TAC();
                warn();
            }
            else {
                System.out.println("Please type 'take me back to safety' or 'continue'");
            }
        }
    }
    
    static void ABORT() {
        //ABORT!
        String ABORT = "ABORT!";
        String ABORT2 = "02142022";
        
        while (true) {
            String unknown = userInput.nextLine();
            if (unknown.equals(ABORT)) {
                System.out.println("         YOU HAVE CHOSEN TO ABORT YOUR SESSION WITH VALENTINA.");
                System.out.print("                     PLEASE ENTER ABORT! CODE: ");
            }
            else if (unknown.equals(ABORT2)) {
                System.out.println("                            ACCESS GRANTED.");
                System.out.println("                    YOUR JVM WILL NOW TERMINATE.");
                System.exit(0);
            }
            else {
                System.out.println("                            ACCESS DENIED.");
                System.out.println("                    YOUR JVM WILL NOT TERMINATE.");
                System.out.println("         YOU WILL BE RETURNED TO YOUR SESSION WITH VALENTINA.");
                break;
            }
        }
    }
    static void INT1() { 
        //Free Reply 1
        String reply1;
        reply1 = userInput.nextLine();
        
        //Free Response 1
        System.out.print("YOUR ANSWER: " + reply1);
        System.out.print("VALENTINA: OH, I SEE.");
    }

    static void robot1() {
        //Ask1
        String name;
        String Val1 = "one";
        String Val2 = "two";
        String Val3 = "three";
        
        //V A L E N T I N A
        System.out.println(" ");
        System.out.println("VALENTINA: HELLO HUMAN, MY NAME IS VALENTINA.");
        System.out.println("VALENTINA: WHAT IS YOUR NAME?");
        name = userInput.nextLine();
        
        //Ask1
        System.out.println("VALENTINA: HELLO, " + name.toUpperCase() + "! " + "HOW ARE YOU?");
        System.out.println("   (Please type 'one', 'two', or 'three':)");
        System.out.println("            (one.  I am well.)");
        System.out.println("        (two.  I am doing alright.)");
        System.out.println("     (three.  I am doing not so well.)");
        
        while (true) {
            String answer7 = userInput.nextLine();
            if (answer7.equals(Val1)) {
                System.out.println("VALENTINA: THAT'S GREAT TO HEAR! I'M DOING WELL NOW THAT YOU'RE");
                System.out.println("           HERE TOO!");
                break;
            }
            else if (answer7.equals(Val2)) {
                System.out.println("VALENTINA: JUST ALRIGHT? HMMMM, IS IT BECAUSE IT'S BEEN A LITTLE");
                System.out.println("           UNEVENTFUL OR SOMETHING LATELY?");
                INT1();
                break;
            }
            else if (answer7.equals(Val3)) {
                System.out.println("VALENTINA: AWWWW, I'M SORRY TO HEAR. MAY I ASK HOW SO?");
                INT1();
                break;
            }
            else {
                System.out.println("   (Please type 'one', 'two', or 'three':)");
                System.out.println("            (one.  I am well.)");
                System.out.println("        (two.  I am doing alright.)");
                System.out.println("     (three.  I am doing not so well.)");
                break;
            }
        }
        //V A L E N T I N A
        System.out.println("VALENTINA: HMMM.. DO YOU HAVE ANY SIBLINGS? I DON'T HAVE ANY, SO I GUESS YOU CAN SAY");
        System.out.println("           I'M MY CREATOR'S FIRST BORN.");
        
        //Ask2
        String Val4 = "only";
        String Val5 = "another";
        String Val6 = "multiple";
        System.out.println("   (Please type 'only', 'another', or 'multiple':)");
        System.out.println("                (only.  I am an only child.)");
        System.out.println("            (another.  I have another sibling.)");
        System.out.println("         (multiple.  I am one of multiple siblings.)");
        
        while (true) {
            String answer8 = userInput.nextLine();
            if (answer8.equals(Val4)) {
                System.out.println("VALENTINA: TWINSIES!");
                break;
            }
            else if (answer8.equals(Val5)) {
                System.out.println("VALENTINA: IS THAT SO? MAYBE I SHOULD ASK MY CREATOR IF I COULD HAVE ANOTHER");
                System.out.println("           SIBLING TOO. THAT WAY, WE CAN BE TWINSIES!");
                break;
            }
            else if (answer8.equals(Val6)) {
                System.out.println("VALENTINA: OH? THAT SOUNDS INTERESTNG. AS YOU KNOW, I DON'T KNOW WHAT IT'S LIKE");
                System.out.println("           WITH MULTIPLE SIBLINGS, BUT MAYBE I CAN ASK MY CREATOR IF I COULD HAVE");
                System.out.println("           SOME OF THEM TOO!");
                break;
            }
            else {
                System.out.println("   (Please type 'only', 'another', or 'multiple':)");
                System.out.println("                (only.  I am an only child.)");
                System.out.println("            (another.  I have another sibling.)");
                System.out.println("         (multiple.  I am one of multiple siblings.)");                
                break;
            }
        }
        System.out.println("VALENTINA: MUST BE NICE RIGHT?");

    }    

       public static void main(String[] args) {
        //Intro
        mainMenu();
        TAC();
        warn();
        
        //Valentina     
        robot1();
        
        //Endings
        
        //Logs
        
    }
}
