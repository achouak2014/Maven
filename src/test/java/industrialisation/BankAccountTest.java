package industrialisation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankAccountTest {

    private Client client;
    private BankAccount bankAccount;

    @BeforeEach
    public void init() {
        this.client = new Client("Martin", "Kelig", 47, 123);
        this.bankAccount = new BankAccount(1000, 456, client);
    }

    @Test
    void should_add_money_to_account() {
        this.bankAccount.deposer(50);
        assertEquals(1050, this.bankAccount.getSolde());
    }

    @Test
    void should_not_add_negative_amount_to_account() {
        this.bankAccount.deposer(-50);
        assertEquals(1000, this.bankAccount.getSolde());
    }

    @Test
    void should_withdraw_amount_to_account() {
        this.bankAccount.retirer(100);
        assertEquals(900, this.bankAccount.getSolde());
    }

    @Test
    void should_not_withdraw_negative_amount_to_account() {
        this.bankAccount.retirer(-100);
        assertEquals(1000, this.bankAccount.getSolde());
    }

    @Test
    void should_not_put_account_in_negative_if_not_major() {
        this.client.setAge(16);
        this.bankAccount.retirer(10000);
        assertEquals(1000, this.bankAccount.getSolde());
    }
}

