
public class MultiplicationTable {
	public static void main(String[] args) {
	
		for(int i=1;i<=9;i++){
			for(int j=0;j<i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");		
			}		
			System.out.println();
		}
		
	}
}
