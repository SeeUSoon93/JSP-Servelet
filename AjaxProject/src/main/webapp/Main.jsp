<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>상품목록</h1>
	<div id="table-area"></div>
	<button id="btn-req">상품데이터 요청</button>

	<script src="//code.jquery.com/jquery-3.7.0.min.js"></script>
	<script type="text/javascript">
	$("#btn-req").on("click", ()=>{
		$.ajax({
			url : "Ajax",
			dataType : "JSON",
			success : (result)=>{
				// ajax로부터 받은 데이터를 웹 페이지에 출력시키기
				// 응답밥은 데이터 : [{"menu" : "김군순", "price" : "200000"}....] -> JSON
				// JSON 형식의 데이터는 JavaScript의 Object와 같은 구조이기 떄문에
				// key갑으오 접근
				
				let resultHTML ="";
				
				resultHTML += "<table border='1'>";
				resultHTML += "<tr><th>메뉴</th><th>가격</th></tr>";
								
				// 데이터가 JSON 형식인데 JSON Array 구조이기 때문에 반복문을 통해서 데이터에 접근
				// 접근한 데이터를 태그와 융합해서 resultHTML 변수에 누적
				for(let i = 0; i < result.length; i++){
					resultHTML += "<tr>";
					resultHTML += "<td>" + result[i].menu +"</td>";
					resultHTML += "<td>" + result[i].price +"원 </td>";
					resultHTML += "</tr>";
				}
				
				resultHTML += "</table>";
				
				let tableArea = document.getElementById("table-area");
				
				tableArea.innerHTML = resultHTML;
				
				
			},
			error : ()=>{
				alert("요청실패...")
			}
			
			
		})
		
		
	})
	
	
	</script>
</body>
</html>