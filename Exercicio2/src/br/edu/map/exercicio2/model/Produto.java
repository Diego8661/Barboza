/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.map.exercicio2.model;

/**
 *
 * @author diego
 */
public class Produto {
    private int codigo_produto;
    private String nome;
    private float preco;
    private Especificacao esp;

    public Produto() {
        this.esp = new Especificacao();
    } 
  
    public int getCodigo() {
        return codigo_produto;
    }

    public void setCodigo(int codigo) {
        this.codigo_produto = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Especificacao getEsp() {
        return esp;
    }

    public void setEsp(Especificacao esp) {
        this.esp = esp;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nome: ")
                .append(nome)
                .append("\n")
                .append("Preco: R$ ")
                .append(preco)
                .append("2.f")
                .append("\n")
                .append(esp);
        
        return sb.toString();
    }
    
}
