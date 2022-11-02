class Vowel{
    public static void main(String[] args) {
        vowel('z');
    }
    public static void vowel(char ch){
        if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("not vowel");
        }
    }
}