
public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0;
		int f2=1;
		int f3;
		System.out.print(f1+"\t"+f2);
		
		for(int i=0;i<20;i++) {
			f3=f1+f2;
			System.out.print("\t"+f3);
		}
	}

}
