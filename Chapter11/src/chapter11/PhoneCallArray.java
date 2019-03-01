package chapter11;

/**
 *
 * @author Gerardo A A
 */
public class PhoneCallArray {
    public static void phoneCallArray(){
        PhoneCall[] telefono = new PhoneCall[10];
        telefono[0] = new IncomingPhoneCall("9531123420");
        telefono[1] = new IncomingPhoneCall("9531123420");
        telefono[2] = new IncomingPhoneCall("9531123420");
        telefono[3] = new IncomingPhoneCall("9531123420");
        telefono[4] = new IncomingPhoneCall("9531123420");
        telefono[5] = new OutgoingPhoneCall("9531120210",30);
        telefono[6] = new OutgoingPhoneCall("9531001022",10);
        telefono[7] = new OutgoingPhoneCall("9536000210",5);
        telefono[8] = new OutgoingPhoneCall("9531150100",40);
        telefono[9] = new OutgoingPhoneCall("9531120210",120);
        
        for(PhoneCall phone:telefono){
            phone.display();
        }
    }
}
