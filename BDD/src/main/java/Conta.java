import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Conta {

    /**
     * Define um cliente especial com saldo negativo.
     *
     * @author KaykyOda
     * @param arg1 Este é o saldo negativo inicial do cliente especial em reais.
     * @throws Throwable Se ocorrer uma exceção durante o processamento.
     */
    @Given("^um cliente é especial com saldo atual de -(\\d+) reais$")
    public void um_cliente_é_especial_com_saldo_atual_de_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Solicita um saque de uma quantia específica.
     *
     * @param arg1 Este é o valor do saque solicitado em reais.
     * @throws Throwable Se ocorrer uma exceção durante o processamento.
     */
    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public void for_solicitado_um_saque_no_valor_de_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Efetua o saque e atualiza o saldo da conta.
     *
     * @param arg1 Este é o saldo atualizado da conta após o saque em reais.
     * @throws Throwable Se ocorrer uma exceção durante o processamento.
     */
    @Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /**
     * Verifica outros resultados.
     *
     * @throws Throwable Se ocorrer uma exceção durante o processamento.
     */
    @Then("^check more outcomes$")
    public void check_more_outcomes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
