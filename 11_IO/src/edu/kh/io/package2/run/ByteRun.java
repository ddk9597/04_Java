package edu.kh.io.package2.run;

import edu.kh.io.package2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		ByteService service = new ByteService();
		
//		service.fileByteOutPut();
//		service.bufferedFileByteOutput();
//		service.fileByteInput();
//		service.fileByteInput2();
//		service.bufferedFileByteInput();
		service.fileCopy();
		
		
		
		
	}
}
