package tp1_ex1_3;

public class Teste_1_3 {

    public static void main (String[] args) {
	Complexo a = new Complexo (1, 1);
	Complexo b = new Complexo (1, 1);
	System.out.println (a); 
    System.out.println (b); 
    System.out.println (Complexo.somar (a, b)); 
	System.out.println (Complexo.multiplica (a, b)); 
}
}