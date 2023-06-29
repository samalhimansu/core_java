import java.util.Scanner;
class Node {
	int data ;
	Node next ;
	}
public class single {
	public static Node starter ;
	public static int get () {
		return new Scanner(System.in).nextint();
		}
	public static int count() {
		if(starter==null){
			return 0;
			}else{
			int count=1;
			Node temp;
			temp=starter;
			while(temp!=null){
			count++;
			temp=temp.next;
			}
			return count;
			}
		}
		void create(){
			System.out.println("Enter number of Nodes that u want to create.");
			int no = get();
			if(no>0){
			Node temp=new Node ();
			starter temp;
			System.out.println("Enter data.");
			temp.data=get();
			for(int i=1;i<no;i++){
			temp.next=new Node();
			temp=temp.next;
			System.out.println("Enter data.");
			temp.data=get();
			}
			temp=null;
			}
		System.out.println("Total Nodes are:"+count());
			}
			void retrive(){
				if(starter==null){
			System.out.println("No Node is created.first u call create method.");
			}else{
			System.out.print("data is :");
			Node temp;
			temp=stater;
			while(true){
		System.out.print(temp.data+"\t");
			if(temp.next==null){
			break;
			}else{
			temp=temp.next;
				}
			}
		}
		System.out.println("\n\nTotal Nodes are ;"count());
			}
			void insert(){
			if(starter==null){
		System.out.println("No Node is created.first u call create method.");
			}else{
		System.out.println("Enter the position where u insert a Node.");
			int pos=get();
			Node temp;
			temp=stater;
		if((pos>1)&&(pos<=count()+1)){
			for(int i=1 ;i<(pos-1);i++){
			temp=temp.next;
			}
			Node temp1;
			temp1=temp.next;
			Node new1=new Node();
		System.out.println("insert the data.");
			new1.data=get();
			new1.next=temp1;
			temp.next=new1;
			}
		else if(pos==1){
			Node new1=new Node();
			new1.next=starter;
			starter=new1;
		System.out.println("insert the data.");
			new1.data=get();
			}else{
		System.out.println("!!!!!invalid position.!!!!!");
				}
			}
		System.out.println("Total Nodes are:"+count());
			}
		Void delete(){
			if(starter==null){
			System.out.println("No Node is created.");
			}else{
		System.out.println("Press 1>for deleting the first Node");
		System.out.println("Press 2>for deleting the last Node");
		System.out.println("Press 3>for deleting any position");
		System.out.println("Enter the Node position whom u delete.");
			int pos = get();
		if(pos==1){
			Node temp;
			temp = starter;
			starter = temp.next;
			temp.next = Null;
			temp = Null;
			}
			else if (pos==2){
			Node temp1.temp2;
			temp1 = starter;
			temp2 = Null;
			while(temp1.next! = Null){
				temp2=temp1;
				temp1=temp1.next;
			}
			temp1 = Null;
			temp2.next=Null;
			}
			else if(pos==3){
		System.out.println("Enter the position whom u delete.");
			int no = get();
			if(no>count()){
		System.out.println("!!!!!no Node is avalialable.!!!!!");
			}else{
			Node temp1.temp2;
			temp1 = starter;
			temp2 = Null;
			for(int i=1;i<(no-1);i++){
			temp1 = temp1.next;
			}
			temp2=temp1.next;
			temp1.next=temp2.next;
			temp2=Null;
		System.out.println("Node is deleted.");
			}
			}
			}else{
		System.out.println("!!!!! invalid Choice.!!!!!");
			}
		}
		System.out.println("Total Nodes are ;"+count());
			}
		public static void main(String args[]){
			SingleLink ll = new SingleLink();
			While(true){
		System.out.println("\t\t\t*****SingleLinkedList Application.*****");
		System.out.println("\t\t\t1>Create Nodes.");
		System.out.println("\t\t\t2>Traverse Nodes.");
		System.out.println("\t\t\t3>Insert Nodes.");
		System.out.println("\t\t\t4>Delete Node.");
			System.out.println("\t\t\t5>Quit.");
				System.out.println("Enter your Choice.");
					int ch = get();
			
		 