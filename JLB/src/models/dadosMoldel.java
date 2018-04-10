package models;

public class dadosMoldel {
	
	private Long id;
	private String cpf;
	private String nomeMotorista;
	private String endereco;
	private String contato;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		
	public String getNomeMotorista() {
		return nomeMotorista;
	}
	
	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getContato() {
		return contato;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	

}
