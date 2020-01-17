package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		// TODO Auto-generated constructor stub
		Conta.total++;
		System.out.println("o total de contas é: "+Conta.total);
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void mostrarExtrato() {
		System.out.println("Imprimindo informações da conta.");
		System.out.println("Nome: " + titular.getNome());
		System.out.println("Profissão: " + titular.getProfissao());
		System.out.println("Cpf: " + titular.getCpf());
		System.out.println("Agência: " + this.agencia);
		System.out.println("Numero de conta: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("---");
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia >= 0) {
			this.agencia = agencia;
		}else {
			System.out.println("numero negativo nao pode");
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero >= 0) {
			this.numero = numero;
		}else {
			System.out.println("numero negativo nao pode");
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	
	public static int getTotal() {
		return total;
	}
	
	public static void setTotal(int total) {
		Conta.total = total;
	}
}
