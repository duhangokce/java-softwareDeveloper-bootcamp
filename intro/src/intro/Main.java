package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String metin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		int vade = 12;
		
		double dolarDun = 18.19;
		double dolarBugun = 18.21;
		
		boolean dolarDustuMu = false;
		String okYonu = "";
		
		if (dolarBugun < dolarDun) {
			okYonu ="down.svg";
			System.out.println(okYonu);
			
		}else if (dolarBugun > dolarDun) {
			okYonu="up.svg";
			
		}
		else {
			okYonu ="equal.svg";
			System.out.println(okYonu);

		}

	}

}
