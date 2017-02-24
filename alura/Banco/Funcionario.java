class Funcionario{
    private String nome;
    private String departamento;
    private double salario;
    private Data data_entrada;
    private String rg;
    private int identificador ;
    private static int proximoFuncionario = 0;

    public Funcionario(){
        this.identificador = ++proximoFuncionario;
    }
    
    public Funcionario(String nome){
        this.nome = nome;
        this.identificador = ++proximoFuncionario;
    }

    
    public int getIdentificador() {
        return this.identificador;
    }    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Data getDataEntrada() {
        return this.data_entrada;
    }

    public void setDataEntrada(Data data_entrada) {
        this.data_entrada = data_entrada;
    }

    public String getRG() {
        return this.rg;
    }

    public void setRG(String rg) {
        this.rg = rg;
    }
    public void recebeAumento(double valor){
        this.salario += valor;
    }
    
    public double calculaGanhoAnual(){
        return this.salario * 12;
    }
    
    public void mostra() {
        System.out.println("ID: " + this.getIdentificador());
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de entrada: " + this.data_entrada.getFormatada() );
        System.out.println("RG: " + this.rg);
        
        System.out.println("Ganho Anual: " + this.calculaGanhoAnual()); 
    }
}

