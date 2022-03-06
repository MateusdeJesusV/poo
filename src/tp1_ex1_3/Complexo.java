package tp1_ex1_3;

public class Complexo{
	
	    private double a;
		private double b;
		public Complexo (double a, double b) {
		    this.a = a; this.b = b;
		    
		}
		public Complexo () {
		    this.a = 0.0; this.b = 0.0;
		}
		
		public static Complexo somar (Complexo x, Complexo y) {
		    return new Complexo (x.a + y.a, x.b + y.b);
		}
		
		public static Complexo multiplica (Complexo x, Complexo y) {
		    return new Complexo ((x.a * y.a) + (x.a * y.b), + ((x.b * y.a) + (x.b * y.b) * -1));
		}
		
	    public String toString() {
		    return "(" + a + ", " + b + ")";
		}
	}
	
	