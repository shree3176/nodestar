
public class NodeList {

	Node head;
	
	static class Node{
		private int id;
		private String name;
		private int value;
		private int revision;
		private int parentRevision;
		private int childIdOne;
		private int childIdTwo;
		Node nextReivision;
		
		public Node() {
			super();
		}

		Node(int id, String name, int value)  {
			this.id = id;
			this.name = name;  
			this.value= value;
			this.revision = 1;
			this.parentRevision = -1;
			this.childIdOne = -1;
			this.childIdTwo = -1;
			nextReivision = null;
		} // Constructor 
		
		public Node(int id, String revisedName, int revisedValue, int revisedRevisionId) {
			// TODO Auto-generated constructor stub
			System.out.println("in 3 arg constructor " + revisedName + revisedValue + revisedRevisionId);
			this.id = id;
			this.name = revisedName;  
			this.value= revisedValue;
			this.revision = revisedRevisionId;
			this.parentRevision = -1;
			this.childIdOne = -1;
			this.childIdTwo = -1;
			nextReivision = null;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public int getRevision() {
			return revision;
		}
		public void setRevision(int revision) {
			this.revision = revision;
		}
		public int getParentRevision() {
			return parentRevision;
		}
		public void setParentRevision(int parentRevision) {
			this.parentRevision = parentRevision;
		}
		public int getChildIdOne() {
			return childIdOne;
		}
		public void setChildIdOne(int childIdOne) {
			this.childIdOne = childIdOne;
		}
		public int getChildIdTwo() {
			return childIdTwo;
		}
		public void setChildIdTwo(int childIdTwo) {
			this.childIdTwo = childIdTwo;
		}
		
	}
	
	 public void printList() 
	    { 
	        Node n = head; 
	        while (n != null) 
	        { 
	            System.out.println("Id:" + n.id +" " + " " +
	            				 "Name:" +	n.name + " " +
	            				 "Value:" + n.value + " " +
	            				 "Revision:" + n.revision + " " +
	            				 "Parent Revision:" + n.parentRevision + " " +
	            				 "Child Id One:" + n.childIdOne + " " +
	            				 "Child Id Two:" + n.childIdTwo); 
	            n = n.nextReivision; 
	        } 
	    } 
	
	public  void displayNode() {
		// TODO Auto-generated method stub
		System.out.println("----------------------------" + "\n" +
				 "Id:" + head.id + "\n" +
				 "Name:" +	head.name + "\n" +
				 "Value:" + head.value + "\n" +
				 "Revision:" + head.revision + "\n" +
				 "Parent Revision:" + head.parentRevision + "\n" +
				 "Child Id One:" + head.childIdOne + "\n" +
				 "Child Id Two:" + head.childIdTwo + "\n" +
				 "----------------------------"); 
	}
}
