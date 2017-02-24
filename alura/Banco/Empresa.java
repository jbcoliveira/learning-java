class Empresa{
    private String nome;
    private String cnpj;
    private int posicaoLivre = 0;
    private Funcionario[] funcionariosDaEmpresa;

    public Empresa(){}

    public Empresa(int tamanhoArray){
        this.funcionariosDaEmpresa = new Funcionario[tamanhoArray];
    }

    public String getNome(){
        return this.nome;
    } 

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getCnpj(){
        return this.cnpj;
    } 

    public void setCnpj (String cnpj){
        this.cnpj = cnpj;
    }

    public int getPosicao(){
        return this.posicaoLivre;
    } 

    public void setPosicao (int posicao){
        this.posicaoLivre = posicao;
    }

    public Funcionario getFuncionario (int posicao) {
        return this.funcionariosDaEmpresa[posicao];
    }

    public void setFuncionario(Funcionario f) {
        this.funcionariosDaEmpresa[this.posicaoLivre] = f;                   
        this.posicaoLivre++;
    }
    
    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        
        for (Funcionario f : funcionariosDaEmpresa) {
             if (f != null) {
                System.out.println("=======");
                f.mostra();
            }
        }
    }
    
    boolean contem(Funcionario f) {
        for (int i = 0; i < this.funcionariosDaEmpresa.length; i++) {
            if (f == this.funcionariosDaEmpresa[i]) {
                return true;
            }
        }
        return false;
    }
}
