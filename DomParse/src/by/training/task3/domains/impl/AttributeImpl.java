package by.training.task3.domains.impl;

import org.w3c.dom.DOMException;

import by.training.task3.domains.intefrace.IAttribute;
import by.training.task3.domains.intefrace.IElement;
import by.training.task3.domains.intefrace.INode;

public class AttributeImpl implements IAttribute {

	private IElement ownerElement;
	private String name;
	private String value;

	public AttributeImpl() {
	}

	public AttributeImpl(String name, String value) {
		this.name = name;
	}

	@Override
	public short getNodeType() {
		return 2;
	}

	@Override
	public String getNodeValue() throws DOMException {
		return value;
	}

	@Override
	public INode getParentNode() {
		return ownerElement;
	}

	@Override
	public INode getFirstChild() {
		return null;
	}

	@Override
	public INode getLastChild() {
		return null;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public IElement getOwnerElement() {
		return ownerElement;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public void setValue(String value) throws DOMException {
		this.value = value;

	}

	@Override
	public boolean isId() {
		return name.equals("ID");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwnerElement(IElement ownerElement) {
		this.ownerElement = ownerElement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttributeImpl other = (AttributeImpl) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	

}