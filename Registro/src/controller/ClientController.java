package controller;

import model.Client;
import service.ClientService;

public class ClientController {

    private ClientService service = new ClientService();

    public void register(Client client) {
        service.register(client);
    }
}
