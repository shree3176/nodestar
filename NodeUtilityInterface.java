
public interface NodeUtilityInterface {

  NodeList createNode(String name, int id);
  void makeChild(NodeList.Node a, NodeList.Node b);
  void reviseNode(int id);
  int quit();
	
}
