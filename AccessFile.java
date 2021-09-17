import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AccessFile {

    public AccessFile(){
    }

    Scanner sc = new Scanner(System.in);

    //Changes the number of keys
    public void keys(File Game) throws IOException{
        //Accesses the Saved.Gam file and can read and write
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        //Finds the offset that I need to be edited
        raf.seek(0x0206);
        System.out.println("You currently have " + raf.read() + " Keys.");
        //Points at offset again to edit that data
        raf.seek(0x0206);
        System.out.println("Enter the amount of Keys you would like. MAX 100");
        int input = sc.nextInt();
        //Writes the User Input into the file
        raf.write(input);
        raf.seek(0x0206);
        System.out.println("You now have " + raf.read() +" Keys.");
        //closes file after writing to it
        raf.close();
    }

    //Changes number of skull Keys
    public void skullKeys(File Game) throws IOException{
        //Accesses the Saved.Gam file and can read and write
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        raf.seek(0x020B);
        System.out.println("You currently have " + raf.read() + " Skull keys.");
        //Points at offset again to edit that data
        raf.seek(0x020B);
        System.out.println("Enter the amount of Skull keys you would like. MAX 100");
        int input = sc.nextInt();
        //Writes the User Input into the file
        raf.write(input);
        raf.seek(0x020B);
        System.out.println("You now have " + raf.read() +" Skull keys.");
        //closes file after writing to it
        raf.close();
    }

    //CHanges number of Gems
    public void gems(File Game) throws IOException{
        //opens file to read and write
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        //points at the offset needed
        raf.seek(0x0207);
        System.out.println("You currently have " + raf.read() + " Gems.");
        raf.seek(0x0207);
        System.out.println("Enter the amount of Gems you would like. MAX 100");
        int input = sc.nextInt();
        //input is written into the file
        raf.write(input);
        raf.seek(0x0207);
        System.out.println("You now have " + raf.read() +" Gems.");
        //Closes file
        raf.close();
    }

    //Changes number of black badges
    public void blackBadge(File Game) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        raf.seek(0x0218);
        System.out.println("You currently have " + raf.read() + " Black Badge(s).");
        raf.seek(0x0218);
        System.out.println("Enter the amount of Black Badges you would like. MAX 255");
        int input = sc.nextInt();
        raf.write(input);
        raf.seek(0x0218);
        System.out.println("You now have " + raf.read() +" Black Badges.");
        raf.close();
    }

    //Changes number of magic carpets
    public void magicCarpets(File Game) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        raf.seek(0x020A);
        System.out.println("You currently have " + raf.read() + " Magic Carpets.");
        raf.seek(0x020A);
        System.out.println("Enter the amount of Magic Carpets you would like. MAX 99");
        int input = sc.nextInt();
        raf.write(input);
        raf.seek(0x020A);
        System.out.println("You now have " + raf.read() +" Magic Carpets.");
        raf.close();
    }

    //changes number of magic axes
    public void magicAxe(File Game) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        raf.seek(0x0240);
        System.out.println("You currently have " + raf.read() + " Magic Axe.");
        raf.seek(0x0240);
        System.out.println("Enter the amount of Magic Axe you would like. MAX 99");
        int input = sc.nextInt();
        raf.write(input);
        raf.seek(0x0240);
        System.out.println("You now have " + raf.read() +" Magic Axes.");
        raf.close();
    }
    //--------------------------------------------------------------------------------------------

    //Changes strength for the different characters
    //File is the Saved.Gam, offset is the location of the strength, name is the name
    //of the character that is being edited
    public void charStrength(File Game,long offset, String name) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        //finding the location of the strength data
        raf.seek(offset);
        //reading the current data
        System.out.println(name+"'s current Strength is: " + raf.read());
        raf.seek(offset);
        System.out.println("Enter the Strength you would like. MAX 99");
        int input = sc.nextInt();
        //writing the user data into the strength location
        raf.write(input);
        raf.seek(offset);
        System.out.println(name + "'s strength is now: " + raf.read());
        //file closed after writing to it
        raf.close();
    }

    //File is the Saved.Gam, offset is the location of the Intelligence, name is the name
    //of the character that is being edited
    public void charIntelligence(File Game, long offset, String name) throws IOException{
        //finding the location of intelligence data
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        raf.seek(offset);
        //reading the current data
        System.out.println(name + "'s current Intelligence is: " + raf.read());
        raf.seek(offset);
        System.out.println("Enter the Intelligence you would like. MAX 99");
        int input = sc.nextInt();
        //writing the user data into the intelligence location
        raf.write(input);
        raf.seek(offset);
        System.out.println(name+"'s Intelligence is now: " + raf.read());
        //closes file after writing
        raf.close();
    }

    //File is the Saved.Gam, offset is the location of the Dexterity, name is the name
    //of the character that is being edited
    public void charDexterity(File Game, long offset, String name) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        //points to location of Dexterity
        raf.seek(offset);
        //reading current data
        System.out.println(name+"'s current Dexterity is: " + raf.read());
        raf.seek(offset);
        System.out.println("Enter the Dexterity you would like. MAX 99");
        int input = sc.nextInt();
        //writing in user data
        raf.write(input);
        raf.seek(offset);
        System.out.println(name+"'s Dexterity is now: " + raf.read());
        //closing file
        raf.close();
    }

    //HP takes file Game, two offset locations and the name of the character
    public void charHP(File Game,long offset,long offset2, String name) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        System.out.println("Enter the Health you would like. MAX 999");
        //takes input of the user
        int input = sc.nextInt();
        //the string is turned into hex
        String hexInput = Integer.toHexString(input);
        //char array that will hold the 3 characters in the hex string
        char[] hex = new char[3];
        //adds each character
        hex[0] = hexInput.charAt(1);
        hex[1] = hexInput.charAt(2);
        hex[2] = hexInput.charAt(0);
        //turns each individual character into a string
        String a = String.valueOf(hex[1]);
        String b = String.valueOf(hex[2]);
        String c = String.valueOf(hex[0]);
        //concats the the strings to form each part
        String InputONE = c + a;
        String InputTWO = b;
        //each string is made into an Integer to be able to be add to the file
        Integer newInputOne = Integer.valueOf(InputONE,16);
        Integer newInputTwo = Integer.valueOf(InputTWO,16);
//        System.out.println(hexInput);
//        System.out.println(newInputOne);
//        System.out.println(newInputTwo);
        //looks for first offset location
        raf.seek(offset);
        //writes to the file
        raf.write(newInputOne);
        //looks for second offset location
        raf.seek(offset2);
        //writes to second location
       raf.write(newInputTwo);
       //closes file when done
        raf.close();
    }

    //Max Health takes file Game, two offset locations and the name of the character
    public void charHM(File Game,long offset,long offset2, String name) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        System.out.println("Enter the Max Health you would like. MAX 999");
        //takes input of the user
        int input = sc.nextInt();
        String hexInput = Integer.toHexString(input);
        //char array that will hold the 3 characters in the hex string
        char[] hex = new char[3];
        hex[0] = hexInput.charAt(1);
        hex[1] = hexInput.charAt(2);
        hex[2] = hexInput.charAt(0);
        String a = String.valueOf(hex[1]);
        String b = String.valueOf(hex[2]);
        String c = String.valueOf(hex[0]);
        //concats the the strings to form each part
        String InputONE = c + a;
        String InputTWO = b;
        //each string is made into an Integer to be able to be add to the file
        Integer newInputOne = Integer.valueOf(InputONE,16);
        Integer newInputTwo = Integer.valueOf(InputTWO,16);

        raf.seek(offset);
        raf.write(newInputOne);
        raf.seek(offset2);
        raf.write(newInputTwo);
        //closes file
        raf.close();
    }

    //Experience takes file Game, two offset locations and the name of the character
    public void charEx(File Game, long offset, long offset2, String name) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        System.out.println("Enter the Experience you would like. MAX 9999");
        //user input
        int input = sc.nextInt();
        //changes input to hex string
        String hexInput = Integer.toHexString(input);
        //creates character array with size 4
        char[] hex = new char[4];
        //adds each char of the hex string into the char array
        hex[0] = hexInput.charAt(1);
        hex[1] = hexInput.charAt(2);
        hex[2] = hexInput.charAt(0);
        hex[3] = hexInput.charAt(3);
        //turns each char into a String
        String a = String.valueOf(hex[1]);
        String b = String.valueOf(hex[2]);
        String c = String.valueOf(hex[0]);
        String d = String.valueOf(hex[3]);
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//        System.out.println("c:"+c);
//        System.out.println("d:"+d);
        //concats the Strings into two different pars
        String InputONE = a + d;
        String InputTWO = b + c;
        //each part is made into Integers so it can be added into the file
        Integer newInputOne = Integer.valueOf(InputONE,16);
        Integer newInputTwo = Integer.valueOf(InputTWO,16);

//        System.out.println(hexInput);
//        System.out.println(newInputOne);
//        System.out.println(newInputTwo);

        //looks for location of first bit
        raf.seek(offset);
        //writes into that location
        raf.write(newInputOne);
        //looks for location of second bit
        raf.seek(offset2);
        //writes to the second location
        raf.write(newInputTwo);
        //closes file
        raf.close();
    }

    //Gold takes file Game, two offset locations and the name of the character
    public void Gold(File Game, long offset, long offset2) throws IOException{
        RandomAccessFile raf = new RandomAccessFile(Game, "rw");
        System.out.println("Enter the Gold you would like. MAX 9999");
        //takes user input
        int input = sc.nextInt();
        //changes input to hex String
        String hexInput = Integer.toHexString(input);
        //creats char array of size 4
        char[] hex = new char[4];
        //adds each character of the hex String to the char array
        hex[0] = hexInput.charAt(1);
        hex[1] = hexInput.charAt(2);
        hex[2] = hexInput.charAt(0);
        hex[3] = hexInput.charAt(3);
        //changes each char into a string
        String a = String.valueOf(hex[1]);
        String b = String.valueOf(hex[2]);
        String c = String.valueOf(hex[0]);
        String d = String.valueOf(hex[3]);

        //Concats strings to create each part that will be added to each bit
        String InputONE = a + d;
        String InputTWO = b + c;
        //changes strings into Integers
        Integer newInputOne = Integer.valueOf(InputONE,16);
        Integer newInputTwo = Integer.valueOf(InputTWO,16);

        //looks for location of first bit
        raf.seek(offset);
        //writes to the first bit
        raf.write(newInputOne);
        //loos for second bit
        raf.seek(offset2);
        //writes to second bit
        raf.write(newInputTwo);
        //closes file
        raf.close();
    }


}
