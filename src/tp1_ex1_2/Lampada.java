package tp1_ex1_2;

public class Lampada {
	static boolean estado;
	int contador;
	
	void mudarEstado() {
		if (estado == true) {
			estado = false;
			contador = contador + 1;
			System.out.println("DESLIGOU");}
				if (contador == 7){
				estado = false;
			}
		else if (estado == false) {
			estado = true;
			System.out.println("LIGOU");}
				if (contador == 7){
			estado = false;
			}
		}

	void estadoAtual() {
		if (estado == true) {
		System.out.println("A LAMPADA ESTA LIGADA");}
		else if (estado == false) {
			System.out.println("A LAMPADA ESTA DESLIGADA");}
		}



	
}
