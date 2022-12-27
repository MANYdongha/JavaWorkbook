# 중요설정 파일 주소
C:\Windows\System32\drivers\etc\hosts				=>	개발 및 서버주소 설정	\n 
C:\enoviaV6R2021x\server\win_b64\code\bin\enovia.ini		=>	enovia설정

이슈리스트

2022-12-20
	문제 													                         	이슈내용 											        	문제해결
	APPIndentedTable 생성시 테이블생성할때 문제발생 			  오류: .NullPointerException							road하면 바로 data를 서치하므로 데이터처리하는   
	                                                       테이블 열을 가져올 수 없음		           JPO에서 빈값으로 넘어올수 있게 new로 생성해줘야함.


2022-12-27
	dialLogFS.jsp에서 requerd에 있을 빨간글이랑 header가 안뜸			ui에 반영이 안됨											빨간글 안없어짐
																												1. 먼저 ctrl + shift + R로 위치 id를 찾음  
																												2. ui정의된 파일에 찾아들어 id를 검색해봄 / id를 검색해봄 
																												3. ui정의된 곳에서 정의된 param을 찾음 
																												4. 프레임소스보기에서 url을 가져와서 정의된 parm을 넣어서 ui의 변경사항을 확인해봄
																												5. 그리고 소스파일에서 재정의 해줌
																												
																												header가 ui에 안생김
																												1. fram에 set을 해줘야 적용을 할 수 있다.

#### 주요내용
1. 프로그래머스
- 1.


2. BackJoon
