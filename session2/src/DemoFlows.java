public class DemoFlows {
    public static void main(String[] args) {
        int age = 35;
        /*
            You have a age of person,
            you have to tell if this person is
            kid, youth, adult, senior
            age is less than 18  kid
            age is between 18-25 youth
            age is between 25-55 adult
            age is 55+ is senior
         */


        if ( age < 18 ) {
            System.out.println("Based on Age , person is kid");
        }

        if( age>= 18  && age <= 25){
            System.out.println("Got Youth");
        }

        if( age >= 25 && age<=55 ) {
            System.out.println("Got Adult");
        }

        if( age> 55 ) {
            System.out.println("Got Adult");
        }

        /*

            When squirrels get together for a party, they like to have cigars.
             A squirrel party is successful when the number of cigars is between 40 and 60,
              inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars.
               print success of failur if the party with the given values is successful, or false otherwise.
         */
        int cigars = 80;
        boolean isWeekend = true;

        if(cigars >= 40 && cigars <=60 && !isWeekend ){
            System.out.println("Party Successful");
        }
        if(cigars >=40 && isWeekend){
            System.out.println("Party Successful");
        }

    }
}
