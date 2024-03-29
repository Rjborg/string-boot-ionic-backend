package com.ruibranco.cursomc.dto;

import java.io.Serializable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import com.ruibranco.cursomc.services.validation.ClienteInsert;

@ClienteInsert
public class ClienteNewDto implements Serializable{
	private static final long serialVersionUID = 1L;

	@NotEmpty(message="Preenchimento Oobrigatório")
	@Length(min=5, max=120, message="O tamanho do campo deve ser entre 5 e 120 caracteres")
	private String nome;
	
	@NotEmpty(message="Preenchimento Oobrigatório")
	@Email(message="Email inválido")
	private String email;
	
	@NotEmpty(message="Preenchimento Oobrigatório")
	private String cpfOuCnpj;
	
	private Integer tipo;
	
	@NotEmpty(message="Preenchimento Oobrigatório")
	private String logradouro;
	
	@NotEmpty(message="Preenchimento Oobrigatório")
	private String numero;
	private String completo;
	private String bairro;
	@NotEmpty(message="Preenchimento Oobrigatório")
	private String cep;
	
	@NotEmpty(message="Preenchimento Oobrigatório")
	private String telefone1;
	private String telefone2;
	private String telefone3;
	
	private Integer cidadeId;
	
	public ClienteNewDto() {
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public Integer getTipo() {
		return tipo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public String getCompleto() {
		return completo;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public String getTelefone3() {
		return telefone3;
	}

	public Integer getCidadeId() {
		return cidadeId;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setCompleto(String completo) {
		this.completo = completo;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}

	public void setCidadeId(Integer cidadeId) {
		this.cidadeId = cidadeId;
	}
}
