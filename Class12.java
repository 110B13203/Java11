interface Data{
	public void best();
	public void failed();
}
interface Test extends Data{
	public void showData();
	public double average();
}
class CStu implements Test{
	protected String name;
	protected int math;
	protected int english;
	public CStu(String n,int m,int e) {
		name=n;
		math=m;
		english=e;
	}
	public void best() {
		if(math>english)
			System.out.println(name+"���ƾǤ�^��n");
		else if(math==english)
			System.out.println(name+"���ƾǩM�^��@�˦n");
		else
			System.out.println(name+"���^���ƾǦn");
	}
	public void failed() {
		if(math<60 && english<60)
			System.out.println(name+"���ƾǩM�^����F");
		else if(math<60)
			System.out.println(name+"���ƾǷ��F");
		else if(english<60)
			System.out.println(name+"���^����F");
		else
			System.out.println(name+"�S����سQ��");
	}
	public double average() {
		return (double)(english+math)/2;
	}
	public void showData() {
		System.out.println("�m�W:"+name);
		System.out.println("�ƾǦ��Z:"+math);
		System.out.println("�^�妨�Z:"+english);
		System.out.println("�������Z:"+this.average());
	}
	public void show() {
		this.showData();
		this.best();
		this.failed();
	}
}
public class Class12 {

	public static void main(String[] args) {
		CStu stu=new CStu("Judy",58,91);
		stu.show();
	}

}
