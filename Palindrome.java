class Palindrome{
    public static void main(String[] args) {
        add();
    }
    public static void add(){
        int n =2342;
        int reverse = 0;
        while(n!=0){
            int last = n%10;
            reverse = reverse*10 + last;
            num = n/10;
            System.out.println(reverse);
        }

    }
}