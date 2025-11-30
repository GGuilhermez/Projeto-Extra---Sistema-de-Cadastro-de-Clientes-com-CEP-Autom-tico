package service;

import model.Address;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class CepService {

    public Address findAddress(String cep) {
        try {
            // Forma correta e moderna (sem deprecation)
            URI uri = new URI("https://viacep.com.br/ws/" + cep + "/json/");
            URL url = uri.toURL();

            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            StringBuilder json = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                json.append(line);
            }

            br.close();

            Address address = new Address();
            address.setStreet(getField(json.toString(), "logradouro"));
            address.setCity(getField(json.toString(), "localidade"));
            address.setState(getField(json.toString(), "uf"));

            return address;

        } catch (Exception e) {
            System.out.println("Erro ao consultar o CEP: " + e.getMessage());
            return null;
        }
    }

    private String getField(String json, String field) {
        try {
            int start = json.indexOf("\"" + field + "\":") + field.length() + 3;
            int firstQuote = json.indexOf("\"", start) + 1;
            int lastQuote = json.indexOf("\"", firstQuote);
            return json.substring(firstQuote, lastQuote);
        } catch (Exception e) {
            return "";
        }
    }
}
