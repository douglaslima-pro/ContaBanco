package contabanco.packages.model;

/**
 * <h1>Sintaxe - Desafio</h1>
 * <p>Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.</p>
 * <ol>
 * <li>Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:</li>
 * <br>
 * <li>Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.</li>
 * <table>
 * <tr>
 * <th>Atributo</th>
 * <th>Tipo</th>
 * <th>Exemplo</th>
 * </tr>
 * <tr>
 * <td>Numero</td>
 * <td>Inteiro</td>
 * <td>1021</td>
 * </tr>
 * <tr>
 * <td>Agencia</td>
 * <td>Texto</td>
 * <td>067-8</td>
 * </tr>
 * <tr>
 * <td>Nome Cliente</td>
 * <td>Texto</td>
 * <td>MARIO ANDRADE</td>
 * </tr>
 * <tr>
 * <td>Saldo</td>
 * <td>Decimal</td>
 * <td>237.48</td>
 * </tr>
 * </table>
 * <br>
 * <li>Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:</li>
 * <ul>
 * <li>Programa: "Por favor, digite o número da Agência !"</li>
 * <li>Usuário: 1021 <em>(depois ENTER para o próximo campo)</em></li>
 * </ul>
 * <li>Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:</li>
 * <q>Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque</q>
 * </ol>
 * <p>Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.</p>
 * @author Douglas Souza de Lima
 * @version 1.0
 * @since 03/05/2024
 */
public class ContaTerminal {
	
	/**
	 * Número da conta bancária.
	 */
	private int numero;
	/**
	 * Código da agência.
	 */
	private String agencia;
	/**
	 * Nome do cliente.
	 */
	private String clienteNome;
	/**
	 * Saldo total da conta.
	 */
	private double saldo;

	/**
	 * Método construtor da classe ContaBanco.
	 * @param numero número da conta bancária
	 * @param agencia código da agência
	 * @param clienteNome nome do cliente
	 * @param saldo saldo total da conta
	 */
	public ContaTerminal(int numero, String agencia, String clienteNome, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.clienteNome = clienteNome;
		this.saldo = saldo;
	}
	
	/**
	 * <p>Exibe a seguinte mensagem:</p>
	 * <q>Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque</q>
	 * <p>Obs.: Os campos em [ ] são alterados pelas informações que foram inseridas pelo usuário.</p>
	 */
	public void exibirDetalhesConta() {
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",this.clienteNome,this.agencia,this.numero,this.saldo);
	}

	//SETTERS
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//GETTERS
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public String getClienteNome() {
		return this.clienteNome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
}