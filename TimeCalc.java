public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0]; // קלט שעה
        int Addedminutes = Integer.parseInt(args[1]); // קלט דקות
        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4)); 
        int howmuchhours = Addedminutes/60; // מחלק את הדקות לשעות
        int howmuchminutes = Addedminutes%60; // 
        hours = hours + howmuchhours;
        minutes = minutes + howmuchminutes;
        if (minutes>59){
            hours = hours +(minutes % 60);
            minutes = minutes % 60; 
        }
        if (hours>23){
            hours = hours % 24;
        } 
        if(hours == 0){
            hours = 00;
        }
        if (hours<10 && minutes<10){
            System.out.println("0" + hours + ":" + "0" + minutes);
        }
        
         else if (hours<10){
            System.out.println("0" + hours + ":" +  minutes);
        }
        
        else if (minutes<10){
            System.out.println(hours + ":" + "0" + minutes);
        }else{
    
        System.out.println(hours + ":" + minutes);
        }
        

        

    }
}
