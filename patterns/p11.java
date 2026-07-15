import java.util.Scanner;

public class p11 {

    public void p11(int n){
        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=1;j<=i;j++){
                System.out.print(k);
                if(k==1){
                    k=0;
                }
                else{
                    k=1;
                }
            }
            System.out.println();
        }
    }
    
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        p11 obj = new p11();
        obj.p11(n);

        sc.close();
    }
}