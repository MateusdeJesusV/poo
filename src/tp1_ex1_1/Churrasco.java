package tp1_ex1_1;

public class Churrasco {

    public double qtdCarne;

    public void verificarConsumo() {
    	if (Pessoa.idade <= 3 || Pessoa.vegetariana==true) { 
    	this.qtdCarne  = 0;
		System.out.println(qtdCarne);}
    	else if (Pessoa.vegetariana == false && Pessoa.idade >=4 && Pessoa.idade <=12){
    	this.qtdCarne = 1;
		System.out.println(qtdCarne);}
    	else if (Pessoa.vegetariana == false && Pessoa.idade >=13){
    	this.qtdCarne = 2;
    	System.out.println(qtdCarne);}
	    }
    }

