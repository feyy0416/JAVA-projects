import java.util.Stack;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.FileOutputStream; 
import java.io.PrintStream; 
import java.io.FileNotFoundException;

public class project1 {      

    private static Stack<Character> charStack = new Stack<Character>();
    private static Stack<Double> numStack = new Stack<Double>();

    public static Double caculate(String str) {      
        String temp;
        StringBuffer tempX = new StringBuffer();
        StringBuffer string = new StringBuffer().append(str);      
        String FirstElement = string.substring(0, 1);  

        if (FirstElement.equals("-")){
        	numStack.push(0.00);
        	charStack.push('-');
        	string.delete(0, 1); 
        	//first element is '-';
        }
        
        while (string.length() != 0) {      
            temp = string.substring(0, 1);      
            string.delete(0, 1);      

            if ((!isNum(temp))&&(!temp.equals("."))) {
            	

            	
            	if (!"".equals(tempX.toString())&&!"-".equals(tempX.toString())) {
                	Double num = Double.parseDouble(tempX.toString());      
                    numStack.push(num);  
                    tempX.delete(0, tempX.length());     
                    

                } 
            	
            	if(string.length() >= 1 &&string.substring(0, 1).equals("-")&& !temp.equals(")")) {
            		tempX.append("-");
            		string.delete(0, 1);
            	}
            	
                while (!compare(temp.charAt(0)) && (!charStack.empty())) {   
                   Double a = (Double) numStack.pop();
                   Double b = (Double) numStack.pop();
                   char ope = charStack.pop();      
                   Double ans = 0.00;
                   switch (ope) {      
                    case '+':      
                    	ans = b + a;      
                        numStack.push(ans);      
                        break;      
                    case '-':      
                    	ans = b - a;      
                        numStack.push(ans);      
                        break;      
                    case '*':      
                    	ans = b * a;      
                        numStack.push(ans);      
                        break;      
                    case '/':      
                    	ans = b / a;
                        numStack.push(ans);      
                        break;      
                    }      
                }      

                if (temp.charAt(0) != '=') {      
                	charStack.push(new Character(temp.charAt(0)));      
                    if (temp.charAt(0) == ')') {
                    	charStack.pop();      
                    	charStack.pop();      
                    }      
                }      
            }
            else      
                tempX = tempX.append(temp);
        }      
        return numStack.pop();      

    }      
    


    public static boolean isNum(String temp) {      
        return temp.matches("[0-9]");      
    }      

    public static boolean compare(char str) {      
        if (charStack.empty()) {      
            return true;      
        }      
        char last = (char) charStack.lastElement();      
        if (last == '(') {      
            return true;      
        }      
        switch (str) {      
        case '=':      
            return false;
        case '(':      
            return true;      

        case ')':                
            return false;      
        case '*': {                 
            if (last == '+' || last == '-')      
                return true;      
            else      
                return false;      
        }      
        case '/': {      
            if (last == '+' || last == '-')      
                return true;      
            else      
                return false;      
        }               
        case '+':      
            return false;      
        case '-':      
            return false;      
        }      
        return true;    
    }      
     
	public static void main(String[] args) throws Exception{
		BufferedReader in= new BufferedReader(new FileReader("input.txt"));
		PrintStream ps = new PrintStream("e:/project1_output.txt");
		String line;
		DecimalFormat df = new DecimalFormat("0.00");
		while((line=in.readLine())!=null) {
			 String lineFinal = line.replace(" ", "")+"=";
			 System.setOut(ps);
			 System.out.print(lineFinal);
			 System.setOut(ps);
			 System.out.println(df.format(project1.caculate(lineFinal))); 
			}
		  	 	  
	}
      

}    
