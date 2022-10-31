public class if_statement {

    public static void main(String[] args){
        int range = 43;

        if(range < 10){
            System.out.println("Alert!Incoming Object");
        }
        else if(range > 10 && range < 50){
            System.out.println("Object approaching from close range");
        }
        else{
            System.out.println("No object detected!!!");
        }
    }
}
