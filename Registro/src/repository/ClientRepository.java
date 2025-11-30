package repository;

import model.Client;
import database.DatabaseConnection;

import java.sql.*;

public class ClientRepository {

    public void save(Client client) {
        String sql = "INSERT INTO clients (name, email, cep, street, city, state) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, client.getName());
            stmt.setString(2, client.getEmail());
            stmt.setString(3, client.getCep());
            stmt.setString(4, client.getStreet());
            stmt.setString(5, client.getCity());
            stmt.setString(6, client.getState());

            stmt.executeUpdate();
            System.out.println("Cliente salvo!");

        } catch (Exception e) {
            System.out.println("Erro ao salvar cliente: " + e.getMessage());
        }
    }
}
