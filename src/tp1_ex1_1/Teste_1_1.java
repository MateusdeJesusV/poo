package tp1_ex1_1;

public class Teste_1_1 {

		public static double qtdCarne;

		public static void main(String[] args) {

			Pessoa a = new Pessoa("Mateus", "Masculino", 23, false, qtdCarne);
			a.verificarNome();
			a.verificarSexo();
			a.verificarIdade();
			a.verificarVegetariana();
			a.verificarConsumo();

			Pessoa b = new Pessoa("Larissa", "Feminino", 7, true, qtdCarne);
			b.verificarNome();
			b.verificarSexo();
			b.verificarIdade();
			b.verificarVegetariana();
			b.verificarConsumo();

			Pessoa c = new Pessoa("Jose", "Masculino", 3, false, qtdCarne);
			c.verificarNome();
			c.verificarSexo();
			c.verificarIdade();
			c.verificarVegetariana();
			c.verificarConsumo();

			Pessoa d = new Pessoa("Lydia", "Feminino", 7, false, qtdCarne);
			d.verificarNome();
			d.verificarSexo();
			d.verificarIdade();
			d.verificarVegetariana();
			d.verificarConsumo();

	}

}
