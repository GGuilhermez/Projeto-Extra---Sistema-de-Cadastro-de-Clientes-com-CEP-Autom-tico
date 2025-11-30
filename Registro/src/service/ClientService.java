package service;

import model.Client;
import repository.ClientRepository;

public class ClientService {

    private ClientRepository repository = new ClientRepository();
    private CepService cepService = new CepService();

    public void register(Client client) {

        var address = cepService.findAddress(client.getCep());

        if (address == null) {
            System.out.println("Erro ao buscar CEP!");
            return;
        }

        client.setStreet(address.getStreet());
        client.setCity(address.getCity());
        client.setState(address.getState());

        repository.save(client);
    }
}
