package com.sainath.joblisting.model;

import java.util.Arrays;
import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="JobPost")
public class Post {
	private String profile;
	private String desc;
	private int exp;
	private String techs[];

	public Post() {
		// TODO Auto-generated constructor stub
	}

	public Post(String profile, String desc, int exp, String[] techs) {
		super();
		this.profile = profile;
		this.desc = desc;
		this.exp = exp;
		this.techs = techs;
	}


	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String[] getTechs() {
		return techs;
	}
	public void setTechs(String[] techs) {
		this.techs = techs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(techs);
		result = prime * result + Objects.hash(desc, exp, profile);
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
		Post other = (Post) obj;
		return Objects.equals(desc, other.desc) && exp == other.exp && Objects.equals(profile, other.profile)
				&& Arrays.equals(techs, other.techs);
	}
	@Override
	public String toString() {
		return "Post [profile=" + profile + ", desc=" + desc + ", exp=" + exp + ", techs=" + Arrays.toString(techs) + "]";
	}

}
