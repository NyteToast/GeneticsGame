package ControlClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Node<T> {
	private T data;
	private int probability;
	private Node<T> parent;
	private List<Node<T>> children;
	
	//Get
	public T getData(){return data;}
	public int getProbability(){return probability;}
	public Node<T> getParent(){return parent;}
	public List<Node<T>> getChildren(){return children;}
	//Set
	public void setData(T data){this.data = data;}
	public void setProbability(int probability){this.probability = probability;}
	public void setParent(Node<T> parent){this.parent = parent;}
	public void setChild(Node<T> child){this.children.add(child);}
	
	//Constructors
	public Node(T rootData) {
		setData(rootData);
	    children = new ArrayList<Node<T>>();
	}
	public Node(T rootData, int probability, Node<T> parent){
		setData(rootData);
		setProbability(probability);
		children = new ArrayList<Node<T>>();
		setParent(parent);
		parent.setChild(this);
	}
	public Node(T rootData, Node<T> parent){
		setData(rootData);
		children = new ArrayList<Node<T>>();
		setParent(parent);
		parent.setChild(this);
	}
	//Methods
	public void addChild(T child, int probability){
		children.add(new Node<T>(child, probability, this));
	}
	public Node<T> getChild(){
		int[] prob = new int[children.size()];
		int count = 0;
		Random r = new Random();
		for (int i = 0; i < children.size(); i++){
			count += children.get(i).probability;
			prob[i] = count;
		}
		int roll = r.nextInt(count + 1); 
		for (int i = 0; i < prob.length; i++){
			if (roll <= prob[i]){return children.get(i);}
		}
		return null;
	}
	public Node<T> findByData(T data){
		Node<T> output = null;
		Node<T> current;
		if (getData().equals(data)){
			for(int i = 0; i < getChildren().size(); i++){
				current = getChildren().get(i).findByData(data);
				if(!current.equals(null)){return current;}
			}
		}else {
			output = this;
		}
		return output;
	}
}
