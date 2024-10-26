package jp.learningdesign.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("傻逼" + this.name);
	}
}
public class Staffinf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staff yamada = new Staff();
		yamada.name = "河野太郎";
		
		yamada.sayhello();
	}

}
