package context.spring.task2;


import lombok.Data;

@Data
public class Application {
    private BankClientsApp bankClientsApp;
    private DataBase dataBase;
    private TransferByPhoneApp transferByPhoneApp;
    void checkUser(){
        if (bankClientsApp.getOurСlients().equals(false)){
            System.out.println("Пошел вон!");
        }else{
            System.out.println("На номер " + transferByPhoneApp.getNumber() + " переведено " + transferByPhoneApp.getSum());
            System.out.println("История номера " + dataBase.getStory());
        }
    }

}