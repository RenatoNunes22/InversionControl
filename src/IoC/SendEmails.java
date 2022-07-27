package IoC;

public class SendEmails {
    public SendEmails(String type, String address, String password){

    }
    public static SendEmails getEmailData(){
        return new SendEmails("SDMD", "contato@email.com","senha");
    }
    public void response(String message){
        System.out.println("Email enviado");
    }
}
