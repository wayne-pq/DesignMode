package designmode.组合模式;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	private String name;
	private TreeNode parent;
	private List<TreeNode> children = new ArrayList<TreeNode>();

	public TreeNode(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	// 添加孩子节点
	public void add(TreeNode node) {
		children.add(node);
	}

	// 删除孩子节点
	public void remove(TreeNode node) {
		children.remove(node);
	}

	// 取得孩子节点
	public List<TreeNode> getChildren() {
		return children;
	}
}
