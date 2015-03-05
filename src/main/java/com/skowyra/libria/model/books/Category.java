package com.skowyra.libria.model.books;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author Maciej Skowyra
 * @date Feb 11, 2015 10:32:36 AM
 */
@Entity
@Table(name = "category")
public class Category implements Serializable {

	private static final long serialVersionUID = -8248968833960914999L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long categoryId;

	private String name;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	private List<Subcategory> subcategorySet;
	
	public Category(){};
	
	public Category(String name) {
		
		this.name = name;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subcategory> getSubcategorySet() {
		return subcategorySet;
	}

	public void setSubcategorySet(List<Subcategory> subcategorySet) {
		this.subcategorySet = subcategorySet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (categoryId ^ (categoryId >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((subcategorySet == null) ? 0 : subcategorySet.hashCode());
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
		Category other = (Category) obj;
		if (categoryId != other.categoryId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subcategorySet == null) {
			if (other.subcategorySet != null)
				return false;
		} else if (!subcategorySet.equals(other.subcategorySet))
			return false;
		return true;
	}
	
	
}
