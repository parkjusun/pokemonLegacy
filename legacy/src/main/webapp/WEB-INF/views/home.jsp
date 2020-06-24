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
						d="M3.646 4.146a.5.5 0 0 1 .708 0L8 7.793l3.646-3.647a.5.5 0 0 1 .708.708l-4 4a.5.5 0 0 1-.708 0l-4-4a.5.5 0 0 1 0-.708zM1 11.5a.5.5 0 0 1 .5-.5h13a.5.5 0 0 1 0 1h-13a.5.5 0 0 1-.5-.5z"></path>
    </g>
    </svg>
			</button>
			<div id="navbar-toggle-collapse" class="navbar-collapse collapse"
				style="display: none;">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a id="login">로그인</a></li>
					<li class="nav-item"><a href="#" target="_self"
						class="nav-link">포켓몬 도감</a></li>
					<li class="nav-item"><a href="#" target="_self"
						class="nav-link">산책로</a></li>
				</ul>
			</div>
		</nav>
		<div class="wrapper">
			<div class="homeMain">
				<div role="region" id="carousel-1" aria-busy="false"
					class="carousel slide"
					style="text-shadow: rgb(51, 51, 51) 1px 1px 2px;">
					<div id="carousel-1___BV_inner_" role="list" class="carousel-inner">
						<div role="listitem" class="carousel-item" aria-current="false"
							aria-posinset="1" aria-setsize="6" id="__BVID__16"
							aria-hidden="true">
							<img
								src="https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292832035/16954a32052d2fcef4368736f8b522e7.jpg"
								width="1024" height="480" class="img-fluid w-100 d-block">
							<div class="carousel-caption">
								<h3>고라파덕</h3>
								<!---->
								<!---->
							</div>
						</div>
						<div role="listitem" class="carousel-item" aria-current="false"
							aria-posinset="2" aria-setsize="6" id="__BVID__17"
							aria-hidden="true">
							<img
								src="https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292870465/99b983892094b5c6d2fc3736e15da7d1_1.png"
								width="1024" height="480" class="img-fluid w-100 d-block">
							<div class="carousel-caption">
								<h3>이상해꽃</h3>
								<!---->
								<!---->
							</div>
						</div>
						<div role="listitem" class="carousel-item" aria-current="false"
							aria-posinset="3" aria-setsize="6" id="__BVID__18"
							aria-hidden="true">
							<img
								src="https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292870465/f03af8a80dbb666e73e9744ed4fea64f.png"
								width="1024" height="480" class="img-fluid w-100 d-block">
							<div class="carousel-caption">
								<h3>피카츄</h3>
								<!---->
								<!---->
							</div>
						</div>
						<div role="listitem" class="carousel-item active"
							aria-current="true" aria-posinset="4" aria-setsize="6"
							id="__BVID__19" aria-hidden="false">
							<img
								src="https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292832035/a5d4ca67bf30a1033b6e4d2dde9cebc8.jpg"
								width="1024" height="480" class="img-fluid w-100 d-block">
							<div class="carousel-caption">
								<h3>고스트</h3>
								<!---->
								<!---->
							</div>
						</div>
						<div role="listitem" class="carousel-item" aria-current="false"
							aria-posinset="5" aria-setsize="6" id="__BVID__20">
							<img
								src="https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292832035/7db935e2b1b244b190d06b7323998955.jpg"
								width="1024" height="480" class="img-fluid w-100 d-block">
							<div class="carousel-caption">
								<h3>파이리</h3>
								<!---->
								<!---->
							</div>
						</div>
						<div role="listitem" class="carousel-item" aria-current="false"
							aria-posinset="6" aria-setsize="6" id="__BVID__21">
							<img
								src="https://image.fmkorea.com/files/attach/new/20180928/486616/562458984/1292832035/3f3435a302e4c35a623f60d454c7b5b8.jpg"
								width="1024" height="480" class="img-fluid w-100 d-block">
							<div class="carousel-caption">
								<h3>야도란</h3>
								<!---->
								<!---->
							</div>
						</div>
					</div>
					<a href="#" role="button" aria-controls="carousel-1___BV_inner_"
						class="carousel-control-prev"><span aria-hidden="true"
						class="carousel-control-prev-icon"></span><span class="sr-only">Previous
							Slide</span></a><a href="#" role="button"
						aria-controls="carousel-1___BV_inner_"
						class="carousel-control-next"><span aria-hidden="true"
						class="carousel-control-next-icon"></span><span class="sr-only">Next
							Slide</span></a>
					<ol id="carousel-1___BV_indicators_" aria-hidden="false"
						aria-label="Select a slide to display"
						aria-owns="carousel-1___BV_inner_" class="carousel-indicators">
						<li role="button" id="carousel-1___BV_indicator_1_" tabindex="0"
							aria-current="false" aria-label="Goto Slide 1"
							aria-controls="carousel-1___BV_inner_" class=""
							aria-describedby="__BVID__16"></li>
						<li role="button" id="carousel-1___BV_indicator_2_" tabindex="0"
							aria-current="false" aria-label="Goto Slide 2"
							aria-controls="carousel-1___BV_inner_" class=""
							aria-describedby="__BVID__17"></li>
						<li role="button" id="carousel-1___BV_indicator_3_" tabindex="0"
							aria-current="false" aria-label="Goto Slide 3"
							aria-controls="carousel-1___BV_inner_" class=""
							aria-describedby="__BVID__18"></li>
						<li role="button" id="carousel-1___BV_indicator_4_" tabindex="0"
							aria-current="true" aria-label="Goto Slide 4"
							aria-controls="carousel-1___BV_inner_" class="active"
							aria-describedby="__BVID__19"></li>
						<li role="button" id="carousel-1___BV_indicator_5_" tabindex="0"
							aria-current="false" aria-label="Goto Slide 5"
							aria-controls="carousel-1___BV_inner_" class=""
							aria-describedby="__BVID__20"></li>
						<li role="button" id="carousel-1___BV_indicator_6_" tabindex="0"
							aria-current="false" aria-label="Goto Slide 6"
							aria-controls="carousel-1___BV_inner_" class=""
							aria-describedby="__BVID__21"></li>
					</ol>
				</div>
			</div>
		</div>
		<!---->
	</div>
</body>
</html>
<script>
$('#login').click(function(){
	console.log('이동화면 진입')
	alert("<%=application.getContextPath()%>");
	location.href= "<%=application.getContextPath()%>/web/user/join/form"
})
</script>
