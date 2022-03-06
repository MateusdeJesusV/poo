package tp1_ex1_1;

	public class Pessoa {

		static String nome;
		static String sexo;
		static int idade;
		static boolean vegetariana;
		

		public Pessoa(String nome, String sexo, int idade, boolean vegetariana, double qtdCarne) {
			Pessoa.nome =nome;
			Pessoa.sexo = sexo;
			Pessoa.idade = idade;
			Pessoa.vegetariana = vegetariana;
		}
		void verificarNome() {
			System.out.println(nome);
		}

	     void verificarSexo() {
			System.out.println(sexo);
		}

		 void verificarIdade() {
			System.out.println(idade);
		}

		 void verificarVegetariana() {
			if (vegetariana == true) {
			System.out.println("ele(a) é vegetariano(a)");}
			else if (vegetariana == false) {
				System.out.println("ele(a) não é vegetariano(a)");}
			}

	     void verificarConsumo() {
	    	Churrasco churrasco = new Churrasco();
			churrasco.verificarConsumo();
		    }
	    }



