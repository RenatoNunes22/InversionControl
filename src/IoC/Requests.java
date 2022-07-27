package IoC;

public class Requests {
    public static void main(String[] args){
        Requests request = new Requests();
        request.record();
    }
    private SendEmails send = SendEmails.getEmailData();


    public void record(){
        this.send.response("Pedido criado!");
    }
}
