package member.vo;

import java.util.Arrays;

public class MemberVO {
	private String memId;
	private String memPw;
	private String memSex;
	private String[] memInterest;
	
	public MemberVO(){
		
	}

	public MemberVO(String memId, String memPw, String memSex, String[] memInterest) {
		super();
		this.memId = memId;
		this.memPw = memPw;
		this.memSex = memSex;
		this.memInterest = memInterest;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemSex() {
		return memSex;
	}

	public void setMemSex(String memSex) {
		this.memSex = memSex;
	}

	public String[] getMemInterest() {
		return memInterest;
	}

	public void setMemInterest(String[] memInterest) {
		this.memInterest = memInterest;
	}

	@Override
	public String toString() {
		return "MemberVO [memId=" + memId + ", memPw=" + memPw + ", memSex=" + memSex + ", memInterest="
				+ Arrays.toString(memInterest) + "]";
	}
	
	
}
