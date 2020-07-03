package chapter23;

public class Nation {
	String nation;
	public Nation(String nation) {
		this.nation=nation;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return nation.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Nation) {
			Nation na = (Nation)obj;
			if(this.nation==na.nation) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
}
