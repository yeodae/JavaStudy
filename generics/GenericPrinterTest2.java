package generics;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //Powder������ GenericPrinter Ŭ���� ����
		powderPrinter.setMaterial(new Powder( ));
		powderPrinter.printing();


		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();//Plastic������ Ŭ���� ����
		plasticPrinter.setMaterial(new Plastic( ));
		plasticPrinter.printing();
	}

}
