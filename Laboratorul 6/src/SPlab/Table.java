package SPlab;

public class Table implements Element {
	String tableName;
	
	Table(String tableName){
		this.tableName=tableName;
	}
	
	public void add(Element elem) {
	}
	public void remove(Element elem) {
	}
	public int getChild(Element elem) {
		return 0;
	}
	public void accept(Visitor v) {
		v.visit(this);
	}
	public void print() {
		System.out.println("--TableName--");
		System.out.println(tableName);
	}
}
