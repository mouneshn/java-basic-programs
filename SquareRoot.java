class SquareRoot{
    public static void main(String[] args) 
    {
        int res = power(10,5);
        System.out.println(res);
    }
    public static int power(int m , int n)
    {
        int power = 1;
        for( int i =1;i<=n;i++)
        {
            power*=m;
        }
        return power;
    }
}