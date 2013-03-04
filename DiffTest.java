public class DiffTest{

public int diff21(int n) {
int a;
if (n <=21){
   a = 21-n;
}
else
   a =(n-21)*2;

return a;
}

public static void main (String[] args) {
	DiffTest d = new DiffTest();
	System.out.println("The result of diff21(" + args[0] + ") is: " + d.diff21(Integer.parseInt(args[0])));
}

}