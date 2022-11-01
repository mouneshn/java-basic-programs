class LastDigit{
    public static void main(String[] args) {
        lastDigit(22);
        lastDigit(777);
        lastDigit(21);
    }
    public static void lastDigit(int num){
        int res = num%10;
        System.out.println(res);
    }
}