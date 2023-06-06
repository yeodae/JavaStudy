package generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //Powder������ GenericPrinter Ŭ���� ����
		
		powderPrinter.setMaterial(new Powder( ));
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();//Plastic������ Ŭ���� ����
		
		plasticPrinter.setMaterial(new Plastic( ));
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);

	}

}
