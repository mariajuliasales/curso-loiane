package mariajulia.cursoed.modulo01;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		
		if(existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}
		
		int posicao = arrayList.indexOf("C");
		if(posicao>-1) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}
		
		System.out.println(arrayList.get(posicao));
		
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		arrayList.add("A");
		arrayList.add("C");

		System.out.println(arrayList.size());
	}

}
