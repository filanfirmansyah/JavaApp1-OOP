public class Javaaplication1
{
	public static void main(String args[])
	{
		Manusia a = new Manusia();
		Hewan b = new Hewan();
		Telepon c = new Telepon();

		boolean value = true;
		String output = Boolean.toString(value);

		System.out.println("Manusia: ");
		System.out.println("Bermain: " + a.bermain("Sepak Bola"));
		System.out.println("Makan: " + a.makan("Nasi Goreng"));
		a.tidur();
		System.out.println("Bekerja: " + a.bekerja("Pengusaha"));
		System.out.println("Memasak: " + a.memasak("Air Panas"));
		System.out.println("Mencuci: " + a.mencuci("Pakaian"));

		System.out.println("Hewan: ");
		System.out.println("Bermain: " + b.bermain("Bola Karet"));
		System.out.println("Makan: " + b.makan("Ikan giling"));
		b.tidur();

		System.out.println("Telepon: ");
		System.out.println("Menerima Panggilan: " + c.terima_panggilan("Menerima"));
		System.out.println("Melakukan Panggilan: " + c.melakukan_panggilan("Memanggil"));
		a.tidur();

	}

}