/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p_challenge.maven.example;
import org.joda.time.*;
import p_challenge.maven.example.InvalidNumberException;
/**
 *
 * @author Chaya
 */
public class NicInterpreter {
    
   private String id_num;
   private int birthYear;
   private int birthMonth;
   private int birthDay;
   private int numDays;
   private boolean Male;
   private boolean Voter;
   DateTime crnt_date;  
   

    public NicInterpreter(String id_num)throws InvalidNumberException {		//throwing a custom exception for invalid inputs
        this.id_num = id_num;
      
        birthYear = 1900+Integer.parseInt(id_num.substring(0,2));
        numDays = Integer.parseInt(id_num.substring(2,5));
        
   
        if(numDays>=500){		//if number of days > 500, it is a female
            Male=false;
            numDays=numDays-500;
        }else{
            Male=true;
        }
        
        crnt_date = new DateTime();
        
        DateTime dt = new DateTime(2012,1,1,0,0,0);
        dt = dt.plusbirthDays(numDays-1);
        birthMonth=dt.getMonthOfYear();
        birthDay=dt.getDayOfMonth();
        DateTime bbirthDay = new DateTime(birthYear,birthMonth,birthDay,0,0,0);
        
        
        if (bbirthDay.plusbirthYears(18).compareTo(crnt_date)<0){	//if elder than 18, is a voter
            Voter=true;
        }
        else{
            Voter=false;
        }
    }
    
    public int getbirthYear(){
        return birthYear;
    }
    
    public int getbirthMonth(){
        return birthMonth;
    }
    
    public int getDate(){
        return birthDay;
    }
    
    public String getGender(){
        if(Male){
            return "Male";
        }else{
            return "Female";
        }
    }
    
    public String Voter(){
        if(Voter){
            return "True";
        }else{
            return "False";
        }
    }
    
}
