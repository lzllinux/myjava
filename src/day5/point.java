package day5;

public class point implements Comparable<point>{
	private Integer x;
	private Integer y;
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
	public point(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return "("+x+","+y+")";
	}
	public int compareTo(point o)
	{
		int len = this.x+this.y;
		int olen = o.x+o.y;
		return len-olen;
	}
}
