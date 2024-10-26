package jp.learningdesign.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("傻逼" + this.name);
	}

	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
class RemoteStaff extends Staff {

	public String location;
	public RemoteStaff(String name, int staffid, String email) {
		super(name, staffid, email);
		// TODO Auto-generated constructor stub
	}
	
}
public class Staffinf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staff yamada = new Staff("河野太郎",114514,"1114514@konobaka.jp");

		RemoteStaff kishida = new RemoteStaff("岸田文雄",514114,"souzaimegane.co.jp");
		kishida.location = "東京";
		//yamada.sayhello();
		System.out.println("【社員情報】");
		System.out.println("氏名：" + yamada.getName());
		System.out.println("社員番號：" + yamada.getStaffid());
		System.out.println("Email：" + yamada.getEmail());

		System.out.println("【社員情報】");
		System.out.println("氏名：" + kishida.getName());
		System.out.println("社員番號：" + kishida.getStaffid());
		System.out.println("Email：" + kishida.getEmail());
		System.out.println("勤務地：" + kishida.location);
	}

}
