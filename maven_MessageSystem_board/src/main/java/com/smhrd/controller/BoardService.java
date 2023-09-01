package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.smhrd.command.Command;
import com.smhrd.model.BoardDAO;
import com.smhrd.model.BoardVO;

public class BoardService implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String path = request.getServletContext().getRealPath("./file");
		// System.out.println(path);

		// 3. 파일 최대크기
		int maxSize = 1024 * 1024 * 10; // 10MB

		// 4. 인코딩방식
		String encoding = "UTF-8";

		// 5. 중복제거
		DefaultFileRenamePolicy rename = new DefaultFileRenamePolicy();

		// 파일 선택 후 전송버튼을 누르면 MultipartRequest객체를 통해서 넘어온다
		MultipartRequest multi;
		try {
			multi = new MultipartRequest(request, path, maxSize, encoding, rename);
		

		// 데이터 가져오기
		String title = multi.getParameter("title");
		String writer = multi.getParameter("writer");
		String filename = multi.getFilesystemName("filename");
		String content = multi.getParameter("content");

		// 잘 넘어왔는지 확인

		// -> 콘솔창에 잘 뜨는지, file폴더에 사진이 들어가 있는지, 똑같은 file업로드 시 중복제거가 되는지
		System.out.println("title : " + title);
		System.out.println("writer : " + writer);
		System.out.println("filename : " + filename);
		System.out.println("content : " + content);

		BoardVO board = new BoardVO(title, writer, filename, content);
		int cnt = new BoardDAO().boardWrite(board);

		if (cnt > 0) {
			System.out.println("글작성 성공!");
		} else {
			System.out.println("글작성 실패...");
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "BoardMain.jsp";
	}

}
