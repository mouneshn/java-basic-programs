import javax.lang.model.util.ElementScanner14;

class GretestOf5{
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 77;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;
        if (n1>n2 && n1>n3 && n1>n4 && n1>n5){
            System.out.println(n1 + "is greter");
        }
        else if (n2>n1 && n2>n3 && n2>n4 && n2>n5){
            System.out.println( n2  +" is greter");
        }
        else if (n3>n1 && n3>n2 && n3>n4 && n3>n4){
            System.out.println(n3 +"is gretest");
        }
        else if (n4>n1 && n4>n2 && n4>n3 && n4>n5){
            System.out.println(n4 +"is gretest");
        }
        else if (n5>n1 && n5>n2 && n5>n3 && n5>n4){
            System.out.println( n5 + "is gretest");
        }
    }
}