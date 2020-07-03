package chapter22;

public class MemberTo {
	private String id;
	private String name;
	
	public MemberTo(String id,String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "id = " + id +", name = " + name;
	}
	
		

}
