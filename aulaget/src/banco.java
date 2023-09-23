
public class banco {
	public int numConta;
	protected String tipo;
	private String dono;
	private Float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("------------------------");
		System.out.println("Conta: "+ this.getnumConta());
		System.out.println("Tipo: "+ this.getTipo());
		System.out.println("Dono: "+ this.getDono());
		System.out.println("Saldo: "+ this.getSaldo());
		System.out.println("Status: "+ this.getStatus());
		System.out.println("------------------------");
	}
	
	//Construtor
	public banco() {
		this.setSaldo(0f);;
		this.setStatus(false);;
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(t.equals("CC")) {
			this.setSaldo(50f);;
		}else {
			this.setSaldo(150f);;
		}
	}
	public void fecharConta() {
		if (this.getSaldo() == 0) {
			this.setStatus(false);
			System.out.println("Conta fechada");
		}else if(this.saldo > 0) {
			System.out.println("Conta com dinheiro");
		}else {
			System.out.println("Conta em débito");
		}
	}
	public void depositar(Float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
		}else {
			System.out.println("Impossivel depositar");
		}
	}
	
	public void sacar(Float v) {
		if(this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta: "+ this.getDono());
			}else {
				System.out.println("Saldo insuficiente");
			}
		}else {
			System.out.println("Impossivel sacar");
		}
	}
	
	public void pagarMensal() {
		float v = 0;
		if (this.getTipo().equals("CC")) {
			v = 12;
		}else if(this.getTipo().equals("CP")){
			v = 20;
		}
		if (this.getStatus()) {
			if(this.getSaldo() >= v) {
				this.setSaldo(getSaldo() - 12);
				System.out.println("mensalidade paga");
			}else {
				System.out.println("Saldo insuficiente");
			}
		}else {
			System.out.println("Impossivel pagar");
		}
	}
	
	//getter setter do Numero da conta
	public int getnumConta() {
		return this.numConta;
	}
	public void setnumConta(int nc) {
		this.numConta = nc;
	}
	
	//getter setter do Tipo da conta
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	//getter setter do Dono
	public String getDono() {
		return this.dono;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	
	//getter setter do Saldo
	public Float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(Float s) {
		this.saldo = s;
	}
	
	//getter setter do Status da conta
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean s) {
		this.status = s;
	}
	
}
