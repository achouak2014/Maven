
public class Client {

    String nom;

    String prenom;

    int age;

    int numeroClient;


    public Client(String nom, String prenom, int age, int numeroClient) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numeroClient = numeroClient;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumeroClient() {
        return numeroClient;
    }

    public void setNumeroClient(int numeroClient) {
        this.numeroClient = numeroClient;
    }
}

