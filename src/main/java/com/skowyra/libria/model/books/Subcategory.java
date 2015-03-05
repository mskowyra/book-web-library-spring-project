package com.skowyra.libria.model.books;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author Maciej Skowyra
 * @date Feb 11, 2015 10:32:30 AM
 */
@Entity
@Table(name = "subcategory")
public class Subcategory implements Serializable {

	private static final long serialVersionUID = -8672427105462471041L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long subcategoryId;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subcategory" ,cascade={CascadeType.ALL})
	private Set<Books> bookSet = new HashSet<Books>();

	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;
	
	private String name;
	
	public Subcategory() {
	}

	public Subcategory(String name) {
		this.name = name;
	}

	public Subcategory(String name, Set<Books> bookSet) {
		this.name = name;
		this.bookSet = bookSet;
	}
	
	public Subcategory(String name, Category category){
		this.name = name;
		this.category = category;
	}

	public long getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(long subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Books> getBookSet() {
		return bookSet;
	}

	public void setBookSet(Set<Books> bookSet) {
		this.bookSet = bookSet;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookSet == null) ? 0 : bookSet.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ (int) (subcategoryId ^ (subcategoryId >>> 32));
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
		Subcategory other = (Subcategory) obj;
		if (bookSet == null) {
			if (other.bookSet != null)
				return false;
		} else if (!bookSet.equals(other.bookSet))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subcategoryId != other.subcategoryId)
			return false;
		return true;
	}

}
