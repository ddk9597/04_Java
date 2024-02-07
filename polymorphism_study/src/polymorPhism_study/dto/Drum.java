package polymorPhism_study.dto;

public class Drum extends Instrument{

	// 띵곡
	private String BestSong;
	
	// 기본 생성자
	public Drum() {
		
	}
	
	// 매개변수 생성자
	public Drum(String greatestPlayer, String band, String country, boolean fight, String bestSong) {
		super(greatestPlayer, band, country, fight);
		BestSong = bestSong;
	}

	// getter/ setter
	public String getBestSong() {
		return BestSong;
	}

	
	public void setBestSong(String bestSong) {
		BestSong = bestSong;
	}

	@Override
	public String toString() {
		return "Drum [BestSong=" + BestSong + "]" + super.toString();
	}
	
	
	
	
}
