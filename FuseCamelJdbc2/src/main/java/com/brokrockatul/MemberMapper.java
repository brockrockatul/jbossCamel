package com.brokrockatul;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberMapper {

	public Map<String, Object> getMap(Member member) {
		Map<String, Object> answer = new HashMap<String, Object>();
		answer.put("MemberId", member.getId());
		answer.put("MemberName", member.getName());
		return answer;
	}

	public String readMembersJson(List<Map<String, String>> dataList) {

		String members = new String();

		StringBuilder builder = new StringBuilder();
		builder.append("<Members>");
		for (Map<String, String> data : dataList) {
			builder.append("<Member>");
			builder.append("<memberId>");
			builder.append(data.get("ID"));
			builder.append("</memberId>");
			builder.append("<memberName>");
			builder.append(data.get("NAME"));
			builder.append("</memberName>");
			builder.append("</Member>");
		}
		builder.append("</Members>");

		members = builder.toString();
		return members;
	}

	public List<Member> readMembers(List<Map<String, String>> dataList) {

		System.out.println("data:" + dataList);

		List<Member> members = new ArrayList<Member>();

		for (Map<String, String> data : dataList) {

			Member member = new Member();

			member.setId(data.get("ID"));
			member.setName(data.get("NAME"));

			members.add(member);
		}

		return members;
	}

}
