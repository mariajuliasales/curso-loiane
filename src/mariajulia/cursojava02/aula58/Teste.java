package mariajulia.cursojava02.aula58;

public class Teste {

	public static void main(String[] args) {
		
		// autoboxing
		// transformar tipo primitivo em classe; 
		Integer num = 100;
		
		// auto un-boxing
		// transformar tipo classe em um tipo primitivo
		int num2 = num;
			
		// autoboxing
		num++;
		
		System.out.println(num2);
		System.out.println(num);
		
		//auto unboxing num9 -> autoboxing num13/num9 -> num14
		Integer num3 = (num2/num);
		
		System.out.println(num3);
				
		//mau uso
		Double a, b, c;
		a = 10.0;
		b = 12.2;
		c = 4.7;
		
		Double media = (a+b+c)/3;
		System.out.println(media);
		
	}

}
