
public class MyStudent implements Comparable{
	int scores;

	public MyStudent(int scores) {
		super();
		this.scores = scores;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		MyStudent other = (MyStudent) o;
		if (scores > other.scores) return 1;
		else if (scores < other.scores) return -1;
		return 0;
	}
}
