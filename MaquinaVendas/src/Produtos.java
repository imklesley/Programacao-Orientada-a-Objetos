public class Produtos {

    int idProduto;
    String nome;
    float peso;
    float preco;

    public Produtos(int idProduto, String nome, float peso, float preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

   
   ///Métodos Especiais
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
