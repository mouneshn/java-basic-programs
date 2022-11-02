class Palindrome1{
    public static void main(String[] args) {
        int res =gretestOf(22888, 55);
        System.out.println(res);
    }
    public static int gretestOf(int n1,int n2){
        if(n1>n2){
            return n1;
        }
        else{
            return n2;
        }
    }
}