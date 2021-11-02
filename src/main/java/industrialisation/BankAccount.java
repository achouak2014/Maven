public class BankAccount {

    int solde;

    int numeroCompte;

    Client client;

    public BankAccount(int solde, int numeroCompte, Client client) {
        this.solde = solde;
        this.numeroCompte = numeroCompte;
        this.client = client;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void deposer(int montant) {
        if(montant > 0) {
            this.solde += montant;
        }
    }

    public void retirer(int montant) {
        int montantTemporaire = this.solde - montant;
        if((this.client.getAge() >= 18 || montantTemporaire > 0) && montant > 0) {
            this.solde -= montant;
        }
    }
}
