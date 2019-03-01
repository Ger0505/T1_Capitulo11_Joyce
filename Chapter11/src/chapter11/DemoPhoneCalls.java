package chapter11;

/**
 *
 * @author Gerardo A A
 */
public class DemoPhoneCalls {
    public static void demoPhoneCalls(){
        IncomingPhoneCall in = new IncomingPhoneCall("9531182345");
        OutgoingPhoneCall out = new OutgoingPhoneCall("9531117872",45);
        
        in.display();
        out.display();
    }
}
