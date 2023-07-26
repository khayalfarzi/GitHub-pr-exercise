package az.iktlab.javasiplessons.lesson1;

public class Task {
    public static void main(String[] args) {
        int n =10;
        for (int i = 0; i < n; i++) {
            System.out.println(pellNumber(i));
        }

    }
    public static int pellNumber(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }else{
            return 2*pellNumber(n-1)+pellNumber(n-2);
        }
    }
}