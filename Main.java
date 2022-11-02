import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    private static final Main main = new Main();
    private static final MATH math = new MATH();
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
          
        String keyword = input.nextLine();
        
        if (keyword.equals("calc-math")) {
            main.enter(input);
        } else {
            System.out.println("no keywords--");
            return;
        }
    
    }
    
    private static void enter(Scanner input) {
        
        System.out.println("Enter two numbers you want to calculate!....");
        System.out.print("Number1: ");
        
        long num1 = input.nextInt();
        
        input.nextLine();
        
        System.out.print("Number2: ");
        
        long num2 = input.nextInt();
        
        input.nextLine();
        
        System.out.println("Operate in --> ");
        
        String op = input.nextLine();
        
        math.getCalculate(num1, num2, op);
        
    }
}

// Calculate the num1 and num2
public class MATH {
    
    private static final Ascii ascii = new Ascii();
    
    public static void  getCalculate(long num1, long num2, String op) {
        
        String line = String.format("\u001B[0m%s","====================================");
        long calc = switch(op) {
            case "--add" -> num1 + num2;
            case "--sub" -> num1 - num2;
            case "--mul" -> num1 * num2;
            case "--div" -> num1 / num2;
            default -> 0;
        };
        
        
        System.out.println(line);
        System.out.println();
        String longToString = String.valueOf(calc);
        for (byte i = 0; i < longToString.length(); i++) {
            
            ascii.getNumbers(longToString.charAt(i));
            System.out.println();
        }
        System.out.println(line);
        System.out.println(String.format("answer: %d", calc));
        
    }
    
}

// Ascii object
public class Ascii {
    
    private static final Ascii ascii = new Ascii();

    public static void getNumbers(char number) {
        
        String blank = "";
        final String[] textColors = new String[10];
        
        int turn = 0;
        int m = 31;
        int index = 0;
        String colorLength = "";
        for (int i = 0; i < textColors.length; i++) {
            if (m > 37) {
                
                m = 91;
                
                if (m > 93) {
                    return;
                }
            }
            textColors[i] = String.format("\u001B[%s", String.valueOf(m).concat("m"));
            
            m++;
            
            int random = (int) (Math.random() * textColors.length);
            
            blank = String.format("        %s", textColors[random]);
            
        }
        
        
        switch(number) {
            case '0':
                ascii.draw(blank + "       O))      ");
                ascii.draw(blank + "    O))   O))   "); 
                ascii.draw(blank + "   O))      O)) ");
                ascii.draw(blank + "   O))      O)) ");
                ascii.draw(blank + "    O))   O))   ");
                ascii.draw(blank + "       O)))     ");
            break;
            case '1':
                ascii.draw(blank + "     O))        ");
                ascii.draw(blank + "       O))      ");
                ascii.draw(blank + "       O))      ");
                ascii.draw(blank + "       O))      ");
                ascii.draw(blank + "       O))      ");         
                ascii.draw(blank + "      O))))     ");    
            break;
            case '2':
                ascii.draw(blank + "      O)O))     ");
                ascii.draw(blank + "    O)    O))   ");
                ascii.draw(blank + "         O))    "); 
                ascii.draw(blank + "       O))      ");
                ascii.draw(blank + "     O))        ");
                ascii.draw(blank + "    O))))))))   ");
            break;
            case '3':
                ascii.draw(blank + "    O)) O))     ");
                ascii.draw(blank + "       O))      "); 
                ascii.draw(blank + "     O))        ");
                ascii.draw(blank + "       O))      ");
                ascii.draw(blank + "         O))    ");
                ascii.draw(blank + "    O)))))      ");
            break;
            case '4':
                ascii.draw(blank + "        O))      ");
                ascii.draw(blank + "      O O))      ");
                ascii.draw(blank + "     O) O))      ");
                ascii.draw(blank + "   O))  O))      ");
                ascii.draw(blank + "  O)))) O) O))   ");
                ascii.draw(blank + "        O))      ");
            break;
            case '5':
                ascii.draw(blank + "    O)) O)))     ");
                ascii.draw(blank + "    O))          ");
                ascii.draw(blank + "    O)))         ");
                ascii.draw(blank + "        O))      ");  
                ascii.draw(blank + "          O))    ");
                ascii.draw(blank + "    O))) O))     "); 
            break;               
            case '6':
                ascii.draw(blank + "        O))      ");   
                ascii.draw(blank + "      O))        ");
                ascii.draw(blank + "     O))         ");
                ascii.draw(blank + "    O)    O))    ");
                ascii.draw(blank + "    O))     O))  ");
                ascii.draw(blank + "      O)) O))    ");
            break;
            case '7':
                ascii.draw(blank + "   O))))) O))    ");
                ascii.draw(blank + "         O))     ");
                ascii.draw(blank + "        O))      ");
                ascii.draw(blank + "       O))       ");  
                ascii.draw(blank + "       O))       ");
                ascii.draw(blank + "       O))       ");   
            break;
            case '8':
                ascii.draw(blank + "        O)       ");
                ascii.draw(blank + "     O))  O))    ");
                ascii.draw(blank + "    O))     O)   ");
                ascii.draw(blank + "      O)) O)     ");
                ascii.draw(blank + "    O))     O)   ");
                ascii.draw(blank + "      O))))      "); 
            break;
            case '9':
                ascii.draw(blank + "       O) O))    ");
                ascii.draw(blank + "     O))    O))  ");
                ascii.draw(blank + "    O)      O))  ");
                ascii.draw(blank + "      O)) O))    ");  
                ascii.draw(blank + "        O))      ");   
                ascii.draw(blank + "      O))        ");    
            break;
                                         
        }
        
        
        
    }
    
    
    
    private static void draw(String string) {
        System.out.println(string);
    }
    
}

