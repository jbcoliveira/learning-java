class TestaEmpresa {

    public static void main(String[] args) {
        Empresa e1 = new Empresa(10);

        e1.setNome("Minha empresa");
        e1.setCnpj("001.554.222/0001");
        

        Funcionario f1 = new Funcionario("Hugo");
        f1.setSalario(100);
        f1.setDepartamento("RH");

        Data d = new Data();
        d.preencheData(1,12,2016);

        f1.setDataEntrada(d);  
        f1.setRG("123456");
        
        e1.setFuncionario(f1);
                   
        e1.mostra();   

    
        
    }
}
