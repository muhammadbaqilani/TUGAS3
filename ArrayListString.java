import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		
		ArrayList<String> nama= new ArrayList<String>();
		nama.add("AQIL");
		nama.add("GAZALI");
		nama.add("DANDI");
		System.out.println(nama);
		
		nama.remove("GAZALI");
		System.out.println(nama);
		
		ArrayList<String> Nama= (ArrayList<String>)nama.clone();
		Nama.add("ZULIN");
		System.out.println("arls" +nama);
		System.out.println("arlS" +Nama);
		
		System.out.println("DIANGDI:" + nama.isEmpty());
		if (nama.contains("DANDI"))
			System.out.println(" DIANG I DANDI");
		else{
			System.out.println("ANDIANG I DANDI");
		}
		System.out.println("arl1" +nama);
		System.out.println("arl2" +Nama);
		System.out.println("DIANGDI PALAKA");
			
	}

}
