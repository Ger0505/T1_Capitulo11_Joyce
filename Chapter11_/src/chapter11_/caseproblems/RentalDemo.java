package chapter11_.caseproblems;

/**
 *
 * @author Gerardo A A
 */
public class RentalDemo {
    public static void rentalDemo(){
        
        for(int i =0 ;i<3;i++){
            if(i%2 ==0){
                EquipmentWithLesson eq = new EquipmentWithLesson(i);
                Rental rental = new Rental("A0"+i,100+i*5,eq);
                imprimir(rental);
            }else{
                EquipmentWithoutLesson eq = new EquipmentWithoutLesson(i+3);
                Rental rental = new Rental("B0"+i,100+i*5,eq);
                imprimir(rental);
            }
            
            
        }
    }
    
    private static void imprimir(Rental renta){
        System.out.println("----------------------------------------------------");
        System.out.println("Contract #"+renta.getContact_number());
        System.out.println("For a rental of "+renta.getHours_rental()+" hours and "+renta.getExtra_minutes()+" minutes.");
        System.out.println("   at a rate of $"+Rental.HOURLY_RATE+" per hour and $"+Rental.EXTRA_MIN+" per extra minutes");
        System.out.println("   the base price is $"+renta.getBase());
        System.out.println("Contact number is:"+renta.getContact_number());
        System.out.println("Equipment rented is type #"+renta.getEquipment().getType()+" -- "+renta.getEquipment().getName());
        System.out.println("");
        System.out.println(renta.getEquipment().lessonPolicy());
        System.out.println("The equipment fee with lesson is $"+renta.getEquipment().getFee());
        System.out.println("The total price is $"+renta.getPrice());
    }
}

