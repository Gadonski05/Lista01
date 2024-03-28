class Produto{

    String nome;
    int codigo;
    int qtd;
    double preco;

    public Produto(String nome, int codigo, int qtd, double preco){

        this.nome = nome;
        this.codigo = codigo;
        this.qtd = qtd;
        this.preco = preco;

    }
    public void Estoque(int qtd){
        this.qtd += qtd;
    }
    
}