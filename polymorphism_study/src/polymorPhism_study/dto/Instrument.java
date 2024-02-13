package polymorPhism_study.dto;

// 부모 클래스
public class Instrument {
	private String greatestPlayer; // 개쩌는 플레이어
	private String band;		   // 소속 밴드
	private String country;		   // 소속 국가
	private boolean fight;		   // 밴드 멤버 끼리 불화 여부

	// 기본 생성자
	public Instrument() {
}
	// 매개변수 생성자 : alt shift s o
	public Instrument(String greatestPlayer, String band, String country, boolean fight) {
		super();
		this.greatestPlayer = greatestPlayer;
		this.band = band;
		this.country = country;
		this.fight = fight;
	}
	
	// getter, setter
	public String getGreatestPlayer() {
		return greatestPlayer;
	}
	public void setGreatestPlayer(String greatestPlayer) {
		this.greatestPlayer = greatestPlayer;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isFight() {
		return fight;
	}
	public void setFight(boolean fight) {
		this.fight = fight;
	}
	
	
	@Override
	// 클래스의 메서드들을 문자열로 반환
	public String toString() {
		return "Instrument [greatestPlayer=" + greatestPlayer + ", band=" + band + ", country=" + country + ", fight="
				+ fight + "]";
	}
	
	
	










	
	
		
		
	

}

