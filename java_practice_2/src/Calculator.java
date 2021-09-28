import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.DataInputStream;

public class Calculator{
    public double number = 0;
    public char operator = ' ';
    public double number2 = 0;
    public double result = 0.0;
    private final static char[] operators = char[] operators = {'+', '-', '*', '/', '%'};
    
    public static void main(String[] args){
        // User Input
        // 1) BufferReader() & InputStreamReader()
        //  - Do not work well with Korean since
        // 2) DataInputStream()
        // 3) Scanner()
        Calculator Calc = new Calculator();
        Calc.input_BufferReader();
        Calc.Caculate();
    }
    
    public void input_BufferReader()  {

        try{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

           
            boolean is_valid_operator = false;

            String str_buffer = null;
            System.out.printf("Enter First Integer\n");
            str_buffer = br.readLine();
            number = Double.parseDouble(str_buffer);
            
            str_buffer = null;
            System.out.printf("\nEnter Operator\n");
            str_buffer = br.readLine();
            if(str_buffer.length() > 1){
                throw new IOException("Enter single operator character\n");
            }
            operator = str_buffer.charAt(0);
            for(int i=0; i<operators.length;i++){
                if(operator == operators[i]){
                    is_valid_operator = true;
                    break;
                }
            }
            if(is_valid_operator == false){
              throw new IOException("Invalid Operator\n");
            }

            str_buffer = null;
            System.out.printf("Enter Second Integer\n");
            str_buffer = br.readLine();
            number2 = Double.parseDouble(str_buffer);

        }
        catch(NumberFormatException e){
            initParameter();
            //e.printStackTrace();
            System.out.printf("Terminated due to NumberFormatException. Possibly wrong value entered for number\n");

        }
        catch(IOException e){
            System.out.printf("Terminated due to IOException. Possibly wrong value for Operator.\n");
        }

    }
    
    public void input_DataInputStream(){
        try{

        }
        catch(Exception e){

        }
    }

    public void input_Scanner(){
        try{

        }
        catch(Exception e){
        }
    }
    
    public void input_Console(){

    }
    
    public void Caculate(){
        switch(operator){
            case '+':
                System.out.printf("%.2f",number+number2);
                break;
            case '-':
                System.out.printf("%.2f",number-number2);
                break;
            case '*':
                System.out.printf("%.2f",number * number2);
                break;
            case '/':
                System.out.printf("%.2f",number/number2);
                break;
            case '%':
                System.out.printf("%.2f",number%number2);

        }

    }
    
    public void initParameter(){
        number = 0;
        number2 = 0;
        operator = ' ';
    }
    
}


