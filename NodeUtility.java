import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class NodeUtility /*implements NodeUtilityInterface*/ {

	static List<NodeList.Node> nodeList = new ArrayList<>();
	private NodeList.Node nodeRef = new NodeList.Node();
	
	public static NodeList createNode(String name, int value) {
		int latestId = generateId();
		NodeList llist = new NodeList();
	    llist.head  = new NodeList.Node(latestId, name, value); 
	    nodeList.add(llist.head);
	    //System.out.println( nodeList.add(llist.head));
	    llist.displayNode();
		return llist;
	}

	private static int generateId() {
		int max=0,latestId=0;
		if(!nodeList.isEmpty()){
			for(NodeList.Node n : nodeList){
				max = n.getId();
				if(n.getId() > max){
					max = n.getId();
					System.out.println("max  " + max);
				}
			}
			latestId = max+1;
		}
		else{
			latestId = max+1;
		}
		System.out.println("latestId " + latestId);
		return latestId;
	}

	public static void makeChild(String a, String b) {
		System.out.println("inside make child ");
		boolean aExists = isNodePresent(a);
		boolean bExists = isNodePresent(b);
		
		if(!aExists){
			System.out.println("Node " + a + " does not exist");
		}
		if(!bExists){
			System.out.println("Node " + b + " does not exist");
		}
		if(aExists && bExists){
			System.out.println("Nodes " + a + " and " + b + " exist.");
		}
		
		if(checkChildIdValueForNode(a)){
			updateChildNodeIdForParentNode(a);
			updateChildNodeParentRevisionId(b);
		}
		
//		Collection<String> c = new ArrayList<>();
//		c.add(a);
//		c.add(b);
//		
//		System.out.println(nodeList.contains(a));
//		System.out.println(nodeList.contains(b));
			
		 }
	
	private static void updateChildNodeParentRevisionId(String b) {
		NodeList.Node n = extractNode(b);
		if (n != null){
			System.out.println("n.getParentRevision()" + n.getParentRevision());
			n.setParentRevision(1);
		}		
	}

	private static NodeList.Node extractNode(String b) {
		NodeList.Node n = new NodeList.Node();
		if(!nodeList.isEmpty()){
			for(NodeList.Node node : nodeList){
				System.out.println(n.getChildIdOne());
				
				if(b == n.getName()){
					
					System.out.println("Found Node: " + b);
					n = node;
				}
			}
		};
		return n;
	}

	private static void updateChildNodeIdForParentNode(String a) {
		if(!nodeList.isEmpty()){
			for(NodeList.Node n:nodeList){
				System.out.println(n.getChildIdOne());
				
				if(a == n.getName()){
					
					if(n.getChildIdOne() == -1){
						 n.setChildIdOne(1);
						 System.out.println("Child Node One created.");
					}
					else if(n.getChildIdTwo() == -1){
						n.setChildIdTwo(1);
						System.out.println("Child Node Two created.");
					}
				}
			}
		};
		
	}

	private static boolean checkChildIdValueForNode(String a){
		boolean status = false;
		if(!nodeList.isEmpty()){
			for(NodeList.Node n:nodeList){
				System.out.println(n.getChildIdOne());
				
				if(a == n.getName()){
					
					int i = n.getChildIdOne();
					int j = n.getChildIdTwo();
					
					if((i == 1) && (j == 1)){
						System.out.println("Cannot create child to this node.");
					}
					else if ((i == -1) || (j == -1)) {
						status = true;
						System.out.println("Child node can be created.");
					}
				}
			}
		};
			return status;
	}

	private static boolean isNodePresent(String a) {
		NodeList.Node node = new NodeList.Node();
		boolean status = false;
		node = extractNode(a);
		if (node != null)
			status = true;
		
		System.out.println("isNodePresent " + a + " " + status);
		return status;
	}
		
	public static void reviseNode(String nameData) {
		String revisedName="";
		int revisedValue=0, revisedRevisionId=0;
		int nodeId = Integer.parseInt(nameData);
		if(!nodeList.isEmpty()){
			for(NodeList.Node n:nodeList){
				System.out.println(n.getId());
				if(nodeId == n.getId()){
					System.out.println("ID found: " + nodeId);
					revisedName = n.getName();
					revisedValue = n.getValue();
					revisedRevisionId = n.getRevision()+1;
					System.out.println("revisedRevisionId" + revisedRevisionId);	
				}
			};	
		 }
			System.out.println(revisedName + " " + revisedValue + " " + revisedRevisionId);
			createNode(revisedName, revisedValue, revisedRevisionId);
		}

	private static void createNode(String revisedName, int revisedValue, int revisedRevisionId) { 
		System.out.println("123");
		int latestId = generateId();
		NodeList llist = new NodeList();
		llist.head  = new NodeList.Node(latestId, revisedName, revisedValue, revisedRevisionId); 
	    nodeList.add(llist.head);
	    //System.out.println( nodeList.add(llist.head));
	    //node.displayNode();
	}

	public static int quit() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void displayAllNodes() {
		if(!nodeList.isEmpty())
			for(NodeList.Node n:nodeList){
				System.out.println("Id: " +n.getId()+ 
								   " Name: " +n.getName() + 
								   " Value: "+ n.getValue()+ 
								   " Revision-Id: " +n.getRevision() + 
								   " Revision-Id: " +n.getParentRevision() );
			};
	}

	
}
