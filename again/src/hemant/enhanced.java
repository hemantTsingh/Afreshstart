package hemant;

public class enhanced {

	public static void main(String[] args) {
		
		hemant obj1=new hemant();
		hemant obj2=new hemant();
			obj2.counter();
			}
		
}
	class hemant
	{
		static int i;
			public hemant() {
				i++;
			}
	public void counter() {
				System.out.println(i);
			}
		}
	
