class BalancoTrimestral{
	public static void main (String [] args){
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        int mediaMensal = gastosTrimestre/3;
		System.out.println("Gastos no trimestre R$ " + gastosTrimestre + "\nValor da média mensal = R$ " + mediaMensal);
		}
}
