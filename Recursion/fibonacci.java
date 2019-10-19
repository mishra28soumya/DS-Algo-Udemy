import java.io.*;

public class fibonacci{

    public int fibo(int n){
        if (n < 1){
            return 1;
        }
        if(n==1){
            return 1;
        }
        else{
            return n*fibo(n-1);
        }
    }

    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number \n");
        int n = Integer.parseInt(in.readLine());
        fibonacci ob = new fibonacci();
        int result = ob.fibo(n);
        System.out.println("Fibonacci of "+n+" is "+result);
    }
}



