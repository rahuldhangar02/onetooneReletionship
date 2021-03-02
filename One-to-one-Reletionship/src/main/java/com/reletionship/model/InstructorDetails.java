package com.reletionship.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor_details")
public class InstructorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name = "youtube_chanel")
	private String youtubeChanel;
	@Column(name="hobby")
	private String hobby;
	//if we want delete data from side we will keep it
	//@OneToOne(mappedBy = "insdetails",cascade = CascadeType.ALL)
	// delete only records of instructor details
	@OneToOne(mappedBy = "insdetails",cascade = {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH
	})
	private Instructor instructor;
	
	
	public InstructorDetails() {
		super();

	}


	public InstructorDetails(String youtubeChanel, String hobby) {
		super();
		this.youtubeChanel = youtubeChanel;
		this.hobby = hobby;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getYoutubeChanel() {
		return youtubeChanel;
	}


	public void setYoutubeChanel(String youtubeChanel) {
		this.youtubeChanel = youtubeChanel;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	

	public Instructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}


	@Override
	public String toString() {
		return "InstructorDetails [id=" + id + ", youtubeChanel=" + youtubeChanel + ", hobby=" + hobby + ", instructor="
				+ instructor + "]";
	}


	
	
	
	
	
}
