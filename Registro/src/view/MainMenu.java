package view;

import controller.ClientController;
import model.Client;
import java.util.Scanner;

public class MainMenu {

    private Scanner sc = new Scanner(System.in);
    private ClientController controller = new ClientController();

    public void start() {
        System.out.println("=== SISTEMA DE CADASTRO ===");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("E-mail: ");
        String email = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        Client client = new Client();
        client.setName(name);
        client.setEmail(email);
        client.setCep(cep);

        controller.register(client);
    }
}
