public class Main {
    public static void main(String[] args) {
        ContBancarLei contLei1 = new ContBancarLei("RO12AAAA1", 1000);
        ContBancarLei contLei2 = new ContBancarLei("RO12AAAA2", 500);
        ContBancarEuro contEuro = new ContBancarEuro("RO12BBBB1", 600);

        ContBancar[] conturiClient1 = {contLei1, contEuro};
        ContBancar[] conturiClient2 = {contLei2};

        Client client1 = new Client("Ion Popescu", "Str. Libertatii, Nr. 1", conturiClient1);
        Client client2 = new Client("Ana Ionescu", "Str. Independentei, Nr. 2", conturiClient2);

        Client[] clienti = {client1, client2};

        Banca banca = new Banca(clienti, "B12345");

        // Test transferuri
        contLei1.transfer(contLei2, 200);
        System.out.println("Suma cont Lei 1 dupa transfer: " + contLei1.getSuma());
        System.out.println("Suma cont Lei 2 dupa transfer: " + contLei2.getSuma());

        // Test dobanda cont Euro
        System.out.println("Dobanda cont Euro: " + contEuro.getDobanda());
    }
}
