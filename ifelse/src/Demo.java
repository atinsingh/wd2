public class Demo {
    public static void main(String[] args) {
       String countryCode  = "IN";

       switch (countryCode){
           case "AU" : {
               System.out.println("Autralia");
           }break;
           case "AF": {
               System.out.println("Afghanistan");
           }break;
           case "CA": {
               System.out.println("Canada");
           }break;
           case "IN" : {
               System.out.println("India");
           }break;
           default:{
               System.out.println("No matching country");
           }
       }


    }
}
