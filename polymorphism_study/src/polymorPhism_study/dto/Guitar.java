package polymorPhism_study.dto;

public class Guitar extends Instrument{

	// 명곡
	private String BestSong;
	
	// 기본 생성자
	public Guitar() {
	}

	// 매개변수 생성자
	
	

	// getter setter
	public String getBestSong() {
		return BestSong;
	}

	public Guitar(String greatestPlayer, String band, String country, boolean fight, String bestSong) {
		super(greatestPlayer, band, country, fight);
		BestSong = bestSong;
	}

	public void setBestSong(String bestSong) {
		BestSong = bestSong;
	}

	// @Override toString
	@Override
	public String toString() {
		return "Guitar [BestSong=" + BestSong + "]" + super.toString();
	}
	
	
	
}
