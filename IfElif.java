class IfElif{
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        if(n1==n2){
            System.out.println("equals");
        }
        else if (n1<n2){
            System.out.println(n1 + " is lesser than "+ n2);
        }
        else{
            System.out.println(n1 + " greter than"+ n2);
        }
    }
}