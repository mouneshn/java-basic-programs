class Alpha{
    public static void main(String[] args) {
       char ch ='9';
       if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
        System.out.println("Alphabets");
       }
       else if(ch>='0'&&ch<='9'){
        System.out.println("num");
       } 
       else {
        System.out.println("special character");
       }
    }
}