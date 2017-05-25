package heranca4;

public class Vendedor extends Funcionario {

	private float comissao;
	

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}



	public Vendedor(String nome, float salario, float comissao) {
		super(nome, salario);
		this.comissao = comissao;
	}

	@Override
	public float getSalario() {
		// TODO Auto-generated method stub
		
		return super.getSalario() + getComissao();
	}

}
