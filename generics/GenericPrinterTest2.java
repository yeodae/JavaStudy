package generics;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //Powder형으로 GenericPrinter 클래스 생성
		powderPrinter.setMaterial(new Powder( ));
		powderPrinter.printing();


		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();//Plastic형으로 클래스 생성
		plasticPrinter.setMaterial(new Plastic( ));
		plasticPrinter.printing();
	}

}
