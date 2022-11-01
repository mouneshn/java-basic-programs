class GretestMethod{
    public static void main(String[] args) {
        int res = gretest(6,7,8);
        System.out.println(res);
    }
public static int gretest(int a , int b ,int c) {
    if(a>b&&a>c){
        return a;
    }
    else if(b>a&&b>c){
        return  b;
    }
    else{
        return c;
    }
}
}