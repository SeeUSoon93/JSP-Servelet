package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// @Data -> 기본생성자, getter, setter, toString 등등
@Getter // Mybatis에서 값을 가져와 줄 수 있는 getter메소드
@AllArgsConstructor // 모든 파라미터를 받는 생성자
@RequiredArgsConstructor // 우리가 원하는 파라미터를 받는 생성자
@NoArgsConstructor // 기본생성자

public class MemberDTO {

	// 필드
	@NonNull
	private String email;
	@NonNull
	private String pw;
	private String tel;
	private String address;
	


}
