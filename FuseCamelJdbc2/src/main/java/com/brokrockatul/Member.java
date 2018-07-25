package com.brokrockatul;

public class Member {
    
    private String Id;
    private String Name;

    

    public String getId() {
		return Id;
	}



	public void setId(String id) {
		Id = id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Member [memberId=");
        builder.append(Id);
        builder.append(", memberName=");
        builder.append(Name);
        builder.append("]");
        return builder.toString();
    }
}
