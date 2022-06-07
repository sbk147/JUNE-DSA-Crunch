package sbk.template;

public class fibanocci {

    public static void main(String[] args) {

        int n = 10;

        fibanocci(n);
    }
    static void fibanocci(int n){
        int i = 0, j=1;
        while(j<n){
            int temp = i+j;
            i = j;j= temp;
        }

    }
}
