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

    public void Infos(){
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Quantidade em estoque: " + qtd);
        System.out.println("Preço: " + preco);
    }
}