public class que2 {
    public static void main(String[] args) {
        String s = "daffodil";
        String x = "ffodil";
        int i=0 ,j=0;        

        char[] a = s.toCharArray();
        char[] b = x.toCharArray();

        int count=0;

        while(i<a.length){
            
                if(a[i]!=b[j]){
                    j=0;
                    count = 0;
                }
                    i++;
                    j++;
                    count++;
                

        }

        if(count==b.length){
            System.out.println(a.length-count);
        }else{
            System.out.println("false");
        }
        
    }
}
