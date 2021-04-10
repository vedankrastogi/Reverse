public class ReverseGivenNumber {
    public static void main(String[] args) {
        int a=12345;
        int c;
        c=a;
        int b;int s=0;
        while(a>0){
            b=a%10;
            s=s+b;
            a=a/10;

        }
        if(s==c){
            System.out.println("pallendrom"
                    );
        }
        else
        {
            System.out.println("not pallendron");
        }


    }
}
