// Owner : Raymond

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
public class Pass {
    static String password;
    public static void main(String args[]){
        File file = new File ("Passwords.txt");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your intended application?");
        String application = keyboard.next();
        System.out.println("How long do you want your generated password?");
        int size = keyboard.nextInt();
        System.out.println("Your application: " + application + " Your PW length: " + size );
        application = application + ": ";        
        password = "";
        for (int i = 0; i < size; i++) {
            int gen = (int)(Math.random()*62);            
            addLetter(gen);
        }   
        System.out.println( "This is your generated password: " +password);
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(application);
            writer.write(password);
            writer.write(System.getProperty( "line.separator" ));
            writer.close();   
        } catch (Exception e) {
            System.out.println("File Writer failed");
        }
        
        System.out.println("\"password.txt\" made for your convenience. Thank you for using this program");
    }
    
    
    static void addLetter( int gen ) {
        // this is where the magic happens
        switch ( gen ) {
            case 0: password = password + "0";
                    break;                    
            case 1: password = password + "1";
                    break;
            case 2: password = password + "2";
                    break;                   
            case 3: password = password + "3";
                    break;                    
            case 4: password = password + "4";
                    break;                   
            case 5: password = password + "5";
                    break;
            case 6: password = password + "6";
                    break;
            case 7: password = password + "7";
                    break;                   
            case 8: password = password + "8";
                    break;                   
            case 9: password = password + "9";
                    break;

            case 10: password = password + "a";
                    break;                    
            case 11: password = password + "b";
                    break;
            case 12: password = password + "c";
                    break;                   
            case 13: password = password + "d";
                    break;                    
            case 14: password = password + "e";
                    break;                   
            case 15: password = password + "f";
                    break;
            case 16: password = password + "g";
                    break;
            case 17: password = password + "h";
                    break;                   
            case 18: password = password + "i";
                    break;                   
            case 19: password = password + "j";
                    break;
 
            case 20: password = password + "k";
                    break;                    
            case 21: password = password + "l";
                    break;
            case 22: password = password + "m";
                    break;                   
            case 23: password = password + "n";
                    break;                    
            case 24: password = password + "o";
                    break;                   
            case 25: password = password + "p";
                    break;
            case 26: password = password + "q";
                    break;
            case 27: password = password + "r";
                    break;                   
            case 28: password = password + "s";
                    break;                   
            case 29: password = password + "t";
                    break;

            case 30: password = password + "u";
                    break;                    
            case 31: password = password + "v";
                    break;
            case 32: password = password + "w";
                    break;                   
            case 33: password = password + "x";
                    break;                    
            case 34: password = password + "y";
                    break;                   
            case 35: password = password + "z";
                    break;
            case 36: password = password + "A";
                    break;
            case 37: password = password + "B";
                    break;                   
            case 38: password = password + "C";
                    break;                   
            case 39: password = password + "D";
                    break;

            case 40: password = password + "E";
                    break;                    
            case 41: password = password + "F";
                    break;
            case 42: password = password + "G";
                    break;                   
            case 43: password = password + "H";
                    break;                    
            case 44: password = password + "I";
                    break;                   
            case 45: password = password + "J";
                    break;
            case 46: password = password + "K";
                    break;
            case 47: password = password + "L";
                    break;                   
            case 48: password = password + "M";
                    break;                   
            case 49: password = password + "N";
                    break;
                    
            case 50: password = password + "O";
                    break;                    
            case 51: password = password + "P";
                    break;
            case 52: password = password + "Q";
                    break;                   
            case 53: password = password + "R";
                    break;                    
            case 54: password = password + "S";
                    break;                   
            case 55: password = password + "T";
                    break;
            case 56: password = password + "U";
                    break;
            case 57: password = password + "V";
                    break;                   
            case 58: password = password + "W";
                    break;                   
            case 59: password = password + "X";
                    break;
                    
            case 60: password = password + "Y";
                    break;                    
            case 61: password = password + "Z";
                    break;
            case 62: password = password + "!";
                    break;                   
            case 63: password = password + "@";
                    break;                    
            case 64: password = password + "#";
                    break;                   
            case 65: password = password + "$";
                    break;
            case 66: password = password + "%";
                    break;
            case 67: password = password + "^";
                    break;                   
            case 68: password = password + "&";
                    break;                   
            case 69: password = password + "*";
                    break;
            case 70: password = password + "(";
                    break;                    
            case 71: password = password + ")";
                    break;
        }    
    }
}

