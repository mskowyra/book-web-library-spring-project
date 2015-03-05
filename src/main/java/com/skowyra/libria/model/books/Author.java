package com.skowyra.libria.model.books;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Maciej Skowyra
 *
 * @since 6 gru 2014
 *
 */


@Entity
@Table(name = "author")
public class Author implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7161755641526081768L;
	@Id
	@Column(name="authorId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long authorId;
	private String name;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
	private Set<Books> bookSet = new HashSet<Books>();

	public Author(){
		
	}
	
	public Author(String name){
		this.name = name;
	}
	
	public Author(String name, Set<Books> bookSet) {
		this.name = name;
		this.bookSet = bookSet;
	}

	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long authorId) {
		this.authorId = authorId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (authorId ^ (authorId >>> 32));
		result = prime * result + ((bookSet == null) ? 0 : bookSet.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Author other = (Author) obj;
		if (authorId != other.authorId)
			return false;
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
		return true;
	}


}
