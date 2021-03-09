
public class TestesClassesWrapper {
	
	public static void main(String[] args) {
		
		int x = 5;
		Integer i = 5;
		
		byte y = i.byteValue();
		
		
		String valor = "15.5";
		Float v = Float.valueOf(valor);
		
		System.out.println(v + 3);
		
		int idade = Integer.parseInt("27");
		System.out.println("Daqui a 5 anos você terá: " + (idade + 5) + " anos");
		
		try {
				double custo = Double.parseDouble("Vinte e reais e cinquinta centavos");
				System.out.println("Custo total " + custo);
		} catch (NumberFormatException e) {
			System.out.println("Numero invalido para conversão");
		}
	}

}
