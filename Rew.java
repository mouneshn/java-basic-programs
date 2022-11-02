class Rew{
    public static void main(String[] args) {
        add();
    }
    public static void add(){
        int num =2342;
        int reverse = 0;
        while(num!=0){
            int last = num%10;
            reverse = reverse*10 + last;
            num = num/10;
		}
            System.out.println(reverse);

    }
}