package com.javastream.examples.company;

import com.javastream.Client;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/*  Created by JavaStream   */

public class DeleteCompanyById {

    public void start() {

        // Инициализация клиента (вебхук токен и аккаунт CRM)
        Client client = new Client("token", "your-account.bitrix24.ru", 1);


        // Удаляет Лид по его ID (в примере удаляется лид с id=8)
        client.getCempanyService().deleteCompanyById(4);
    }

}
