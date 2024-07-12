package context.spring.task2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    Application application(){
        Application application = new Application();
        application.setBankClientsApp(bankClientsApp());
        application.setDataBase(dataBase());
        application.setTransferByPhoneApp(transferByPhoneApp());
        return application;
    }
    @Bean
    BankClientsApp bankClientsApp(){
        BankClientsApp bankClientsApp = new BankClientsApp();
        bankClientsApp.setOurСlients(false);
        return bankClientsApp;
    }
    @Bean
    DataBase dataBase(){
        DataBase dataBase = new DataBase();
        dataBase.setStory("была удалена");
        return dataBase;
    }
    @Bean
    TransferByPhoneApp transferByPhoneApp(){
        TransferByPhoneApp transferByPhoneApp = new TransferByPhoneApp();
        transferByPhoneApp.setNumber(777777);
        transferByPhoneApp.setSum(777);
        return transferByPhoneApp;
    }
}