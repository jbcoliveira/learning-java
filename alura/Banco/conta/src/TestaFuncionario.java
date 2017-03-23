class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        

        f1.setNome("Hugo");
        f1.setSalario(100);
        f1.setDepartamento("RH");
        

        Data d = new Data();
        d.preencheData(1,12,2016);
        f1.setDataEntrada(d);

        f1.setRG("123456");
        
        f1.recebeAumento(50);

        f1.mostra();
        f2.mostra();
        
        
    }
}
