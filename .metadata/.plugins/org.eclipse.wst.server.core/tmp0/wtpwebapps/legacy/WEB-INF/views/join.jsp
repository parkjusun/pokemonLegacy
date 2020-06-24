<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="heder.jsp"/>
	<div id="app">
		<nav class="navbar navbar-dark bg-dark">
			<div class="navbar-brand font-italic">PokeMon</div>
			<button type="button" aria-label="Toggle navigation"
				class="navbar-toggler collapsed" aria-expanded="false"
				aria-controls="navbar-toggle-collapse">
				<svg viewBox="0 0 16 16" width="1em" height="1em" focusable="false"
					role="img" alt="icon" xmlns="http://www.w3.org/2000/svg"
					fill="currentColor" class="bi-chevron-bar-down b-icon bi">
					<g>
					<path fill-rule="evenodd"
						d="M3.646 4.146a.5.5 0 0 1 .708 0L8 7.793l3.646-3.647a.5.5 0 0 1 .708.708l-4 4a.5.5 0 0 1-.708 0l-4-4a.5.5 0 0 1 0-.708zM1 11.5a.5.5 0 0 1 .5-.5h13a.5.5 0 0 1 0 1h-13a.5.5 0 0 1-.5-.5z"></path></g></svg>
			</button>
			<div id="navbar-toggle-collapse" class="navbar-collapse collapse"
				style="display: none;">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a href="#" target="_self"
						class="nav-link">로그인</a></li>
					<li class="nav-item"><a href="#" target="_self"
						class="nav-link">포켓몬 도감</a></li>
					<li class="nav-item"><a href="#" target="_self"
						class="nav-link">산책로</a></li>
				</ul>
			</div>
		</nav>
		<div class="wrapper">
			<div data-v-1902378e="" class="loginMain">
				<div data-v-1902378e="" id="loginMain_1">
					<h1 data-v-1902378e="" class="font-weight-bold">회원가입</h1>
					<div data-v-1902378e="" role="group" class="input-group mb-3">
						<div data-v-1902378e="" class="input-group-prepend">
							<div data-v-1902378e="" class="input-group-text">아이디</div>
						</div>
						<input data-v-1902378e="" id="userid" type="text"
							class="form-control">
						<button data-v-1902378e="" type="button"
							class="btn btn-outline-info">중복검사</button>
						<!---->
					</div>
					<div data-v-1902378e="" role="group" class="input-group mb-3">
						<div data-v-1902378e="" class="input-group-prepend">
							<div data-v-1902378e="" class="input-group-text">비밀번호</div>
						</div>
						<input data-v-1902378e="" id="passwd" type="text"
							class="form-control">
						<!---->
					</div>
					<div data-v-1902378e="" role="group" class="input-group mb-3">
						<div data-v-1902378e="" class="input-group-prepend">
							<div data-v-1902378e="" class="input-group-text">주소</div>
						</div>
						<input data-v-1902378e="" id="email" type="text"
							class="form-control">
						<!---->
					</div>
					<div data-v-1902378e="" role="group" class="input-group mb-3">
						<div data-v-1902378e="" class="input-group-prepend">
							<div data-v-1902378e="" class="input-group-text">이메일</div>
						</div>
						<input data-v-1902378e="" id="addr" type="text"
							class="form-control">
						<!---->
					</div>
					<div data-v-1902378e="" class="mt-3">
						<div data-v-1902378e="" role="group" class="btn-group">
							<button data-v-1902378e="" type="button" class="btn btn-success">가입하기</button>
							<button data-v-1902378e="" type="button" class="btn btn-info">취소하기</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!---->
	</div>

</body>

</html>
