import java.io.*;

public class RecursiveFactorial{

    public int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number \n");
        int n = Integer.parseInt(in.readLine());
        RecursiveFactorial ob = new RecursiveFactorial();
        int fact = ob.factorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }
}



