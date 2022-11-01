class Method{
    public static void noLeave () {
        System.out.println("java class");
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        noLeave();
        leave();
        System.out.println("Main Stop");
    }
    public static void leave(){
        System.out.println("sunday");
    }
}