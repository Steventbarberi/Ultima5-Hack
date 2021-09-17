import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    //assigning UserInput to my menu funcition which displays the main menu
    static int UserInput = menu();

    //menu function
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        //displays the available options
        System.out.println("Welcome to your GAME EDITOR!\nPlease enter an option.\n");
        System.out.println("1) Player Stats\n2) Game Items\n3) Other Character Stats\n4) Exit");
        int UserInput = sc.nextInt();
        //keeps input validation
        if (UserInput < 1 || UserInput > 4){
            System.out.println("User input is invalid. Please enter an available option.");
        }
        return UserInput;
    }

    public static void main(String[] args) throws IOException {
        //Reads in the file
        File Game = new File("C:\\Users\\Steven\\Documents\\DOS\\Ultima_5\\Saved.Gam");
        //creating object of the AccessFile class
        AccessFile AF = new AccessFile();

        //Creating the menu and its options
        //using while loop so the user can edit many options without having to rerun each time
        while (UserInput != 4){
            Scanner sc = new Scanner(System.in);
            if (UserInput == 1){
                //takes name of character to be used in the functions
                String name = "Player";
                //Displays the possible options
                System.out.println("Choose which Player Attribute you would like to edit.");
                System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                //asks for user input
                int option = sc.nextInt();
                while(option!= 7){
                    //Strength
                    if(option == 1){
                        AF.charStrength(Game,0x0E, name);
                    }
                    //Intelligence
                    else if(option == 2){
                        AF.charIntelligence(Game,0x0F,name);
                    }
                    //Dexterity
                    else if(option == 3){
                        AF.charDexterity(Game,0x10,name);
                    }
                    //HP
                    else if(option == 4){
                        AF.charHP(Game,0x12,0x13,name);
                    }
                    //HM
                    else if(option == 5){
                        AF.charHM(Game,0x14,0x15,name);
                    }
                    //EX
                    else if(option == 6){
                        AF.charEx(Game,0x16,0x17,name);
                    }
                    //Input Validation
                    else{
                        System.out.println("Please choose one of the options.");
                    }
                    //Loops
                    System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                    option = sc.nextInt();
                }
            }else if(UserInput == 2){
                //Displays options for Items
                System.out.println("Choose which item you would like to edit.");
                System.out.println("1) Keys\n2) Skull Keys\n3) Gems\n4) Black Badge\n5) Magic Carpet\n6) Magic Axe\n7) Gold\n8) Exit");
                int option = sc.nextInt();
                while(option!= 8){
                    //Keys
                    if(option == 1){
                        AF.keys(Game);
                    }
                    //SKULLKEYS
                    else if(option == 2){
                        AF.skullKeys(Game);
                    }
                    //GEMS
                    else if(option == 3){
                        AF.gems(Game);
                    }
                    //BLACK BADGE
                    else if(option == 4){
                        AF.blackBadge(Game);
                    }
                    //Magic Carpet
                    else if(option == 5){
                        AF.magicCarpets(Game);
                    }
                    //Magic Axe
                    else if(option == 6){
                        AF.magicAxe(Game);
                    }
                    //Gold
                    else if(option == 7){
                        AF.Gold(Game,0x0204,0x0205);
                    }
                    //Input Validation
                    else{
                        System.out.println("Please choose one of the options.");
                    }
                    //Loops
                    System.out.println("1) Keys\n2) Skull Keys\n3) Gems\n4) Black Badge\n5) Magic Carpet\n6) Magic Axe\n7) Gold\n8) Exit");
                    option = sc.nextInt();
                }
            }else if(UserInput == 3){
                //Displays options (Characters)
                System.out.println("Choose which Player's stats you would like to edit.");
                System.out.println("1) Shamino\n2) Iolo\n3) Julia\n4) Toshi\n5) Jaana\n6) Mariah\n7) Dupre" +
                        "\n8) Katrina\n9) Sentri\n10) Gwenno\n11) Johne\n12) Gorn\n13) Maxwell" +
                        "\n14) Geoffrey\n15) Saduj\n16) Exit");
                int option = sc.nextInt();
                //15 Characters and 16 is to Exit
                while(option!= 16){
 /*
 Shamino is the blue print and all the other options follow the same rules
 name is the player name, the options are always the same
 and they are meant to loop until user exits the user can change multiple stats
 without having to restart
  */
                    //Shamino
                    if(option == 1){
                        //Player name to be used for functions
                        String name = "Shamino";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            //Strength
                            if(choice == 1){
                                AF.charStrength(Game,0x002E,name);
                            }
                            //Intelligence
                            else if(choice == 2){
                                AF.charIntelligence(Game,0x002F,name);
                            }
                            //Dexterity
                            else if(choice == 3){
                                AF.charDexterity(Game,0x0030,name);
                            }
                            //HP
                            else if(choice == 4){
                                AF.charHP(Game,0x0032,0x0033,name);
                            }
                            //HM
                            else if(choice == 5){
                                AF.charHM(Game,0x0034,0x0035,name);
                            }
                            //EX
                            else if(choice == 6){
                                AF.charEx(Game,0x0036,0x0037,name);
                            }
                            //Input Validation
                            else{
                                System.out.println("Please choose one of the options.");
                            }
                            //Loop
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 2){
                        String name = "Iolo";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x004E,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x004F,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x0050,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x0052,0x0053,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x0054,0x0055,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x0056,0x0057,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 3){
                        String name = "Julia";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x006E,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x006F,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x0070,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x0072,0x0073,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x0074,0x0075,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x0076,0x0077,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 4){
                        String name = "Toshi";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x008E,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x008F,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x0090,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x0092,0x0093,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x0094,0x0095,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x0096,0x0097,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 5){
                        String name = "Jaana";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x00AE,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x00AF,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x00B0,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x00B2,0x00B3,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x00B4,0x00B5,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x00B6,0x00B7,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 6){
                        String name = "Mariah";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x00CE,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x00CF,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x00D0,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x00D2,0x00D3,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x00D4,0x00D5,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x00D6,0x00D7,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 7){
                        String name = "Dupre";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x00EE,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x00EF,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x00F0,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x00F2,0x00F3,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x00F4,0x00F5,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x00F6,0x00F7,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 8){
                        String name = "Katrina";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x010E,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x010F,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x0110,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x0112,0x0113,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x0114,0x0115,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x0116,0x0117,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 9){
                        String name = "Sentri";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x012E,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x012F,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x0130,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x0132,0x0133,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x0134,0x0135,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x0136,0x0137,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 10){
                        String name = "Gwenno";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x014E,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x014F,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x0150,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x0152,0x0153,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x0154,0x0155,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x0156,0x0157,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 11){
                        String name = "Johne";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x016E,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x016F,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x0170,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x0172,0x0173,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x0174,0x0175,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x0176,0x0177,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 12){
                        String name = "Gorn";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x018E,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x018F,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x0190,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x0192,0x0193,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x0194,0x0195,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x0196,0x0197,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 13){
                        String name = "Maxwell";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x01AE,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x01AF,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x01B0,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x01B2,0x01B3,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x01B4,0x01B5,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x01B6,0x01B7,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 14){
                        String name = "Geoffrey";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x01CE,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x01CF,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x01B0,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x01D2,0x01D3,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x01D4,0x01D5,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x01D6,0x01D7,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }else if(option == 15){
                        String name = "Saduj";
                        System.out.println("You are editing "+name+".\nPlease choose a stat to edit.\n" +
                                "1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                        int choice = sc.nextInt();
                        while(choice!= 7){
                            if(choice == 1){
                                AF.charStrength(Game,0x01EE,name);
                            }else if(choice == 2){
                                AF.charIntelligence(Game,0x01EF,name);
                            }else if(choice == 3){
                                AF.charDexterity(Game,0x01F0,name);
                            }else if(choice == 4){
                                AF.charHP(Game,0x01F2,0x01F3,name);
                            }else if(choice == 5){
                                AF.charHM(Game,0x01F4,0x01F5,name);
                            }else if(choice == 6){
                                AF.charEx(Game,0x01F6,0x01F7,name);
                            }else{
                                System.out.println("Please choose one of the options.");
                            }
                            System.out.println("1) Strength\n2) Intelligence\n3) Dexterity\n4) Health\n5) Max Health\n6) Experience\n7) Exit");
                            choice = sc.nextInt();
                        }
                    }
                    //Input Validation
                    else{
                        System.out.println("Please choose one of the options.");
                    }
                    //LOOPS
                    System.out.println("Choose which Player's stats you would like to edit.");
                    System.out.println("1) Shamino\n2) Iolo\n3) Julia\n4) Toshi\n5) Jaana\n6) Mariah\n7) Dupre" +
                            "\n8) Katrina\n9) Sentri\n10) Gwenno\n11) Johne\n12) Gorn\n13) Maxwell" +
                            "\n14) Geoffrey\n15) Saduj\n16) Exit");
                    option = sc.nextInt();
                }
            }
            //Input Validation
            else{
                System.out.println("Please choose one of the options.");
            }
            //LOOP
            UserInput = menu();
        }


    }
}
