import java.util.ArrayList;


public class Graph {
	
	private ArrayList<GraphEdgeNode> nodelist;

	
//	public void display_DFS(){
//	
//		StringBuilder sb = new StringBuilder();
//		
//		if(nodelist.isEmpty()){
//			sb.append("the graph does not contain any node.");
//		}
//		else{
//			sb.append("the BFS order of the graph is:");
//			
//			for(int i=0;i<nodelist.size();i++){
//				GraphEdgeNode node = nodelist.get(i);
//				while(node.getNextedge()!=null&&!node.getNextedge().isVisited()){
//					
//					System.out.println("invoke the function display_DFS(nodelist.get("+i+"),sb)");
//					display_DFS(node,sb);
//					node.setNextedge(node.getNextedge().getNextedge());
//					System.out.println("the value of node.getNextedge is:"+node.getNextedge().getValue());
//				}
//			}	
//		}
//		System.out.println(sb.toString());
//		
//	}
//
//	private void display_DFS(GraphEdgeNode node, StringBuilder sb){
//		
//		if(!node.isVisited()){
//			
//			sb.append(node.getValue()).append(" ");
//			node.setVisited(true);
//			System.out.println("put the node "+node.getValue()+" into the StringBuidler and set it visited.");
//			
//			System.out.println("****************");
//			
//			System.out.println("value is:"+node.getNextedge().getValue());
//			
//			int temp = nodelist.indexOf(node.getNextedge());
//		
//			System.out.println("index is:"+temp);
//			
//			System.out.println("&&&&&&&&&&&&&&&&&&");
//			if(temp!=-1){
//				display_DFS(nodelist.get(temp),sb);
//			}
//		}
//		else if(!node.getNextedge().isVisited()){
//		
//			sb.append(node.getNextedge().getValue()).append(" ");
//			node.getNextedge().setVisited(true);
//
//			int temp = nodelist.indexOf(node.getNextedge().getNextedge());
//			
//			if(temp!=-1){
//				display_DFS(nodelist.get(temp),sb);
//			}
//		}
//		else{
//			System.out.println("!node.isVisited() "+"||"+" !node.getNextedge().isVisited()");
//			
//			
//		}
//		
//		
//	}
	
	
	/*
	
	public void display_DFS(){
		
		StringBuilder sb = new StringBuilder();
		
		if(nodelist.isEmpty()){
			sb.append("the graph does not contain any node.");
		}
		else{
			sb.append("the DFS order of the graph is:");
			
			System.out.println("begin to loop the nodelist");
			for(int i=0; i<nodelist.size();i++){	
				
				System.out.println("invoke the function display_DFS("+nodelist.get(i).getValue()+",sb)");
				
				if(!nodelist.get(i).isVisited()){
					display_DFS(nodelist.get(i),sb);					
				}
			}	
		}
		System.out.println(sb.toString());
	}
	
	
	private void display_DFS(GraphEdgeNode node, StringBuilder sb){
		
		sb.append(node.getValue()).append(" ");
		node.setVisited(true);
		
		System.out.println("put the node "+node.getValue()+" into the StringBuilder and set it was visited.");
		
		if(node.getNextedge()!=null){
			int temp = nodelist.indexOf(node.getNextedge());
			while(!nodelist.get(temp).isVisited()){
				System.out.println("the value of the node "+node.getValue()+"'s nextedge is "+nodelist.get(temp).getValue());
				
				System.out.println("invoke the function display_DFS("+nodelist.get(temp).getValue()+",sb)");
				display_DFS(nodelist.get(temp),sb);	
			}
		}
		
//		System.out.println("begin to loop to find out the node "+node.getValue()+"'s nextedge.");
//		while(node.getNextedge()!=null&&!node.getNextedge().isVisited()){
//			
//			int temp = nodelist.indexOf(node.getNextedge());
//			System.out.println("the index of the node "+node.getValue()+"'s nextedge is "+temp);
//			
//			System.out.println("invoke the function display_DFS("+nodelist.get(temp).getValue()+",sb)");
//			display_DFS(nodelist.get(temp),sb);
//			
//		}
		
	}
	
	*/
	
	
	public void display_DFS(){
		
		StringBuilder sb = new StringBuilder();
		
		if (nodelist.isEmpty()){
			sb.append("the graph does not contain any node.");
		}
		else{
			
			sb.append("the DFS order of the graph is:");
			
			System.out.println("��ʼforѭ������");
			for (int i=0;i<nodelist.size();i++){
				if(!nodelist.get(i).isVisited()){
					
					System.out.println("invoke function display_DFS("+nodelist.get(i).getValue()+",sb)");
					display_DFS(nodelist.get(i),sb);
				}
//				System.out.println("****************");
			}
		}
		
		System.out.println(sb.toString());
		
	}
	
	private void display_DFS(GraphEdgeNode node, StringBuilder sb){
		
		sb.append(node.getValue()).append(" ");
		node.setVisited(true);
		System.out.println("put the node "+node.getValue()+" into StringBuilder and make the node "+node.getValue()+" visited.");
		
		//define a GraphEdgeNode currentnode to temporarily store node
		GraphEdgeNode currentnode = new GraphEdgeNode(node.getValue(),node.getNextedge());		
		System.out.println("��ʼwhileѭ������");
		
		
		
		int temp = nodelist.indexOf(node.getNextedge());
		
		while (node.getNextedge()!=null&&!nodelist.get(temp).isVisited()){
			
			
			display_DFS(nodelist.get(temp),sb);
			
			//����ʱ�������ﵽָ���ƶ���Ч����
			currentnode = currentnode.getNextedge();
		}
	}
	
	
	//constructor function
	public Graph() {
		
		super();
		nodelist = new ArrayList<GraphEdgeNode>();
	}

	//constructor function
	public Graph(ArrayList<GraphEdgeNode> nodelist) {
		super();
		this.nodelist = nodelist;
	}

	
	
	
	
	public ArrayList<GraphEdgeNode> getNodelist() {
		return nodelist;
	}

	public void setNodelist(ArrayList<GraphEdgeNode> nodelist) {
		this.nodelist = nodelist;
	}
	
	
	
	
	

}
