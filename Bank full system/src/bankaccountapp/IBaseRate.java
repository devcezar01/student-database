package bankaccountapp;

public interface IBaseRate {
	
	// escreve o metodo que retorna a base
	default double getBaseRate() {
		return 2.5;
	}
}
