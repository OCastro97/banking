package programacionIII;

public class LineaRecta {

	public Point p1;
	public Point p2;
	public double m;
	public boolean existe;
	public double b;
	
	
	public LineaRecta(Point x, Point y ) { //CONSTRUCTOR
		
		p1=x;
		p2=y;
		
		m = getPendiente();
	}
	
	double d;
	public double getPendiente(){ //CALCULA PENDIENTE
		
		
		 d = p2.getX()-p1.x;
		
		if(d == 0){
			
			existe = false;

		}else{
			
			existe =true;
			
			m = (p2.getY() - p1.y)/d;
			   
		}
		
		return m;
	
	}
	
	
	public String getEcuacion(){ //CALCULA LA ECUACION
		
		
		b = p1.y-m*p1.x;

		System.out.println("y = mx + b");
		
		if (b >= 0){
		
		return ("y = "+ m +"x + "+b);
		}else{
			
			return ("y = "+ m +"x "+b);
		}
		
	}
		
		
		public void getInterseccion(LineaRecta recta1, LineaRecta recta2){
			
			nuevax = ((recta1.b - recta2.m)/(recta2.m - recta1.b));
			
			y = m * nuevax + b;
			
			
		}
		
		
		public String toString() {
			return "\nPunto A [p1=" + p1.x + ", p2=" + p1.y + 
					"\nPunto B [p1=" + p2.x + ", p2=" + p2.y +
					",\n m=" + m + ", existe=" + existe + "]";
		}



		public double nuevax;
		public double y;
		
}
	
