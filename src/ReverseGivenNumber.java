public class ReverseGivenNumber {
    public static void main(String[] args) {
        int a=12345;
        int b;
        while(a>0){
            b=a%10;
            a=a/10;
            System.out.print(b);
        }


    }
}
