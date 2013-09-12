
package programmingProject.maven.ex;
import org.joda.time.*;
import programmingProject.maven.ex.InvalidInputException;
public class NIC_Interpreter {
    
   private String id_num;
   private int bd_year;
   private int bd_month;
   private int bd_day;
   private int number_of_days;
   private boolean male;
   private boolean voter;
   DateTime crnt_date;
   
   

    public NIC_Interpreter(String id_num)throws InvalidInputException {
        
	this.id_num = id_num;      
        bd_year = 1900+Integer.parseInt(id_num.substring(0,2));		//first two digits are the birth year.
        number_of_days = Integer.parseInt(id_num.substring(2,5));	//digits from 3rd to 5th are the number of days from the birth year to birth date
        
   
        if(number_of_days>=500){		//if this is a female person, 3rd, 4th and 5th digits of the NIC no. is greater that 500.
            male=false;
            number_of_days=number_of_days-500;		//subtract 500 to get the effective value for the number_of_days
        }else{
            male=true;
        }
        
        crnt_date = new DateTime();
        
        DateTime dt = new DateTime(2012,1,1,0,0,0);
        dt = dt.plusbd_days(number_of_days-1);		//correct day is 1 day less than the calculated days.
        bd_month=dt.getbd_month();
        bd_day=dt.getDate();
        DateTime bbd_day = new DateTime(bd_year,bd_month,bd_day,0,0,0);
        
        
        if (bbd_day.plusbd_years(18).compareTo(crnt_date)<0){	//if the person is elder than 18 years, he is a voter
            voter=true;
        }
        else{
            voter=false;
        }
    }
    
    /*Getter Methods*/

    public int getbd_year(){
        return bd_year;
    }
    
    public int getbd_month(){
        return bd_month;
    }
    
    public int getDate(){
        return bd_day;
    }
    
    public String getGender(){
        if(male){
            return "Male";
        }else{
            return "Female";
        }
    }
    
    public String voter(){
        if(voter){
            return "True";
        }else{
            return "False";
        }
    }
    
}
