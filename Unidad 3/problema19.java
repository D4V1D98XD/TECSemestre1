
import java.util.Scanner; //6677122489
public class problema19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String numeros, formato = "";
		
		for(int i=0; i<8; i++) {
			numeros = scan.next();
			if(numeros.length() == 10) {
				formato = "(" + numeros.substring(0,3) + ")" + numeros.substring(3,6) + "-" + numeros.substring(6,8) + "-" + numeros.substring(8,10);
			}
			System.out.println(formato);
		}
	}

}
