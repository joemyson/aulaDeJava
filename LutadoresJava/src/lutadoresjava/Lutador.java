/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lutadoresjava;

/**
 *
 * @author joemyson
 *///
//------Clases----------------------------------------------------
public class Lutador implements interfaceLutador{

    // atribultos----------------------------------
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private int vitorias;
    private String categorias;
    private int derrotas;
    private int empates;

    //construtor------------------------------

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
     //gets--------------------------metodos assessores

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public int getVitorias() {
        return vitorias;
    }

    public String getCategorias() {
        return categorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

   
    public int getEmpates() {
        return empates;
    }

    //Sets------------------metodos modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategorias();
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setCategorias() {
        if(this.peso<52.2){
        
        this.categorias="invalido";
        
        }else if(this.peso<=70.2){
        
        this.categorias="Leve";
        
        
        }else if(this.peso<=83.9){
        
        this.categorias="Medio";
        }else if(this.peso<=102.2){
        
        
        this.categorias="pesado";
        }else{
        this.categorias="categoria invalida";
        
        }
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
   

    // metodos especiais---------------------------------
    //usando emcapsulamento com metodos abstratos

    @Override
    public void apresentar() {
        
        
        System.out.println("lutador :"+this.getNome());
        System.out.println("Origem :"+ this.getNacionalidade());
        System.out.println(this.getIdade() +"  anos");
        System.out.println(this.getAltura()+" m de altura");
        System.out.println("Pesando : "+this.getPeso());
        System.out.println("Ganhou :"+ this.getVitorias());
        System.out.println("Perdeu : "+this.getDerrotas());
        System.out.println("Empatou :"+ this.getEmpates());
        
        
        
    }

    @Override
    public void status() {
        System.out.println(this.getNome());
        System.out.println(" e um peso : "+ this.getCategorias());
        System.out.println(this.getVitorias()+" Vitorias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpates()+" Empates");
    }

    @Override
    public void ganhaLutar() {
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perdeLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarluta() {
        this.setEmpates(this.getEmpates()+1);
    }
    
    
    
}
