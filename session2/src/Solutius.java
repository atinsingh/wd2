public class Solutius {
    
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend==true){

            if(cigars>=40){
                return true;
            }

        }

        if(isWeekend==false){
            if(cigars>=40 && cigars <=60){
                return true;
            }
        }

        return false;
    }
}
