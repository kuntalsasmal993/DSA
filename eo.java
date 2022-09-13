public class eo {
    public static void main(String[] args) {
    
        String a = "1234567";
        int mid = a.length()/2;
        
        char x[] = a.toCharArray();

        for(int i = 0; i< a.length(); i++){

            if(a.length()%2!=0 && i!=mid){
                System.out.println(x[i]);
            }else if(i!=mid-1 && i!=mid){
                System.out.println(x[i]);
            }

        }
    }
}
