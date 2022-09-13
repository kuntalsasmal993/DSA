class palindrome_String{

    public static void main(String[] args) {
        String is ="super ";
        String rev_is = "";

        for(int i = is.length()-1; i>=0; i--){
            rev_is = rev_is + is.charAt(i);
        }
        if(is.equals(rev_is)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}