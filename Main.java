import java.util.Scanner;
public class Main{
    public static void crianca(String []c,int p, int i,Scanner sc){
        while(i>0){
            c[p]=sc.next();
            i --;
            p++;
        }
        sc.close();
    }
    public static void numero(String []number,int i){
        for(int j=0; i>0; i-- , j++){
            char c;
            if(number[j].length() == 5)
                System.out.println("3");
                
            else{
                if(number[j].contains("wo")||number[j].contains("tw"))
                    System.out.println("2");
                    
                else if(number[j].charAt(0)=='t'&& number[j].charAt(2)=='o')
                    System.out.println("2");
                    
                else if(number[j].contains("on")||number[j].contains("ne"))
                    System.out.println("1");
                    
                else if(number[j].charAt(0)=='o'&& number[j].charAt(2)=='e') 
                    System.out.println("1");
            }
        }
     }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();
        String[] number= new String [i];
        int p=0;
        
        crianca(number, p,i,sc);
        numero(number,i);
        
        
    }
}
