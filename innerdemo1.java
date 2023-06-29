public class innerdemo1 {
	int data ;
	void display() {
		System.out.println("Hello I AM HIMANSU");
		} 
	private class inner1{
		void call () {
			data++ ;
			display();
			}
		}
	public static void main (String args[]){
		innerdemo1 ii = new innerdemo1();
		inner1 xx = ii.new inner1();
		xx.call();
		xx.call();
		xx.call();
		xx.call();
		xx.call();
	System.out.println("data is : "+ii.data);
	}
}