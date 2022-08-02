package sbk.template;

public class fibanocci {

    public static void main(String[] args) {

        int n = 10;

        System.out.println(fibanoccirec(n));
    }



    static int fibanoccirec(int n) {
            if(n<=1)
            {
                return n;
            }
           return fibanoccirec(n) + fibanoccirec(n-1);
    }
}