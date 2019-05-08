import java.util.Scanner;


public class NodeApplicationTest {

	public static void main(String[] args) {
		
		showOperations();
		
		while(true)
			extractOperationWithData();		
	}

	private static void extractOperationWithData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your option");
		String commandString = scanner.nextLine();
		
		if (commandString.contains("quit") ){
				System.out.println("Application is closed.");
				System.exit(0);
			}
		
		if (commandString.equals("display-all") ){
			System.out.println("Displaying all nodes.....");
			NodeUtility.displayAllNodes();
		}
		
		if(commandString.contains("create-node") || commandString.contains("make-child")
				|| commandString.contains("revise")|| commandString.contains("quit")  ){
//			System.out.println(commandString);
			String []optionEntered = commandString.split(" ");
			String operation = optionEntered[0];
			String nameData = optionEntered[1];
			//int idForRevision = Integer.parseInt(nameData);
			//String nameDataTwo = optionEntered[2];
			
//			for(String o : optionEntered) {
//				System.out.println(o);
//			}	
			
			if (operation.equals("create-node") ){
				System.out.println("Calling create-node function.....");
				int valueData = Integer.parseInt(optionEntered[2]);
				NodeUtility.createNode(nameData, valueData);
				showOperations();
				//Scanner scanner1 = new Scanner(System.in);
				
			}
			if (operation.equals("make-child") ){
				System.out.println("Calling make-child node function.....");
				String nameDataTwo = optionEntered[2];
				NodeUtility.makeChild(nameData, nameDataTwo);
			}
			if (operation.equals("revise") ){
				System.out.println("Calling revise node function.....");
				NodeUtility.reviseNode(nameData);
			}
		}
	}

	private static void showOperations() {
		System.out.println("What do you want to do?");
		System.out.println("create-node <name> <value>");
		System.out.println("make-child <node> <node>");
		System.out.println("revise <node id>");
		System.out.println("display-all");
		System.out.println("quit");
	}
	
//	 NodeList llist = new NodeList(); 
//    llist.head  = new NodeList.Node("a", 1); 
//    NodeList.Node second = new NodeList.Node("b", 2); 
//    NodeList.Node third  = new NodeList.Node("c", 3);
//    
//    llist.head.nextReivision = second; 
//    second.nextReivision = third;
//    llist.printList();
	
}
