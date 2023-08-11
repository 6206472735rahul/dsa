package patterns;

public class patterns {
    public static void main(String[] args) {
        String str1= "Program";
        
        String str2= "even";
        for(int i=1;i<str1.length();i++){
           if(str1.charAt(i)%2!=0){
               System.out.print(str1.charAt(i));
            }
        }



    }
}
