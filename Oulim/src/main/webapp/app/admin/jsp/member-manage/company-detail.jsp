<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />

  <!-- 페이지 제목 -->
  <title>기업회원 승인요청 상세</title>

  <!-- 공통 reset / 변수 / 타이포 -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/reset.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/variable.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/Typography.css" />

  <!-- 공통 컴포넌트 css -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/pagination.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/input.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/button.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/list.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/card.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/DetailCard.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/badge.css" />

  <!-- 기업회원 상세 전용 css -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/member-manage/company-detail.css" />
</head>

<body>
  <main class="l-main">


    <!-- 좌측 사이드바 시작 -->

      <!-- 사이드바 -->
    <aside>
      <!-- 관리자 영역 -->
      <div class="adminnow">
        <img src="" width="40" height="40" />
		<form action ="${pageContext.request.contextPath}/admin/logout.adm" >
        <button class="c-button c-button--primary c-button--md">
          로그아웃
        </button>
        </form>
      </div>

      <!-- 사이드바 메뉴 -->
      <nav class="sidebar-menu">
        <ul>
          <li class="menu-item">
            <a href="${pageContext.request.contextPath}/admin/dashboard.adm">통계</a>
          </li>

          <!-- 회원관리 -->
          <li class="menu-item dropdown">
            <a href="#" class="menu-title"> 회원관리 </a>

            <ul class="submenu">
              <li><a href="${pageContext.request.contextPath}/admin/companycertification.adm">기업회원</a></li>
              <li><a href="${pageContext.request.contextPath}/admin/memlist.adm">회원조회</a></li>
            </ul>
          </li>

          <!-- 봉사활동관리 -->
          <li class="menu-item dropdown">
            <a href="${pageContext.request.contextPath}/admin/volunlist.adm" class="menu-title"> 봉사활동관리 </a>
          </li>

          <!-- 게시판관리 -->
          <li class="menu-item dropdown">
            <a href="${pageContext.request.contextPath}/admin/postlist.adm" class="menu-title"> 게시판관리 </a>
          </li>
        </ul>
      </nav>
    </aside>




    <!-- 우측 메인 컨텐츠 시작 -->

    <section class="l-content">

      <!-- 상단 페이지 제목 영역 -->
      <div class="header">
        <h1>기업회원 승인요청 상세</h1>
      </div>

      <!-- 상세 본문 전체 감싸는 영역 -->
      <div class="detail-wrap">

        <!-- 안내 문구 -->
        <p class="detail-guide">
          *회원의 정보를 확인하고 기업회원 가입 승인 / 반려 처리해 주세요.
        </p>


        <div class="detail-form">

          <!-- 기관명 -->
          <div class="detail-item">
            <label class="detail-label">기관명</label>
            <div class="detail-value">
              현대자동차

            </div>
          </div>

          <!-- 이름 -->
          <div class="detail-item">
            <label class="detail-label">이름</label>
            <div class="detail-value">
              홍길동
              <!-- 나중에: ${companyDetail.userName} -->
            </div>
          </div>

          <!-- 생년월일 -->
          <div class="detail-item">
            <label class="detail-label">생년월일</label>
            <div class="detail-value">
              1999-01-01

            </div>
          </div>

          <!-- 사업자 등록번호 -->
          <div class="detail-item">
            <label class="detail-label">사업자 등록번호</label>
            <div class="detail-value">
              123-45-67890

            </div>
          </div>

          <!-- 이메일 주소 -->
          <div class="detail-item">
            <label class="detail-label">이메일 주소</label>
            <div class="detail-value">
              admin@test.com
              <!-- 나중에: ${companyDetail.userEmail} -->
            </div>
          </div>

          <!-- 주소 -->
          <div class="detail-item">
            <label class="detail-label">주소</label>
            <div class="detail-value">
              서울시 강남구 어딘가 123-45
              
            </div>
          </div>

          <!-- 재직증명서 파일 -->
          <div class="detail-item">
            <label class="detail-label">재직증명서 사본</label>

            <!-- 파일명 + 다운로드 버튼 한 줄 배치 -->
            <div class="file-row">
              <div class="detail-value file-name">
                재직증명서.pdf
   
              </div>

              <!-- 파일 다운로드 버튼 -->
              <a href="#"
                 class="c-button c-button--secondary c-button--md file-button">
                파일 다운
              </a>

 
              -->
            </div>
          </div>

          <!-- 사업자등록증 파일 -->
          <div class="detail-item">
            <label class="detail-label">사업자 등록증 사본</label>

            <!-- 파일명 + 다운로드 버튼 -->
            <div class="file-row">
              <div class="detail-value file-name">
                사업자등록증.pdf
   
              </div>

              <!-- 파일 다운로드 버튼 -->
              <a href="#"
                 class="c-button c-button--secondary c-button--md file-button">
                파일 다운
              </a>


            </div>
          </div>
        </div>

  



 
        <!-- 나중에 form submit JS 연결 가능 -->

        <div class="detail-button-wrap">
          <button type="button" class="c-button c-button--primary c-button--lg">
            승인
          </button>

          <button type="button" class="c-button c-button--secondary c-button--lg">
            반려
          </button>
        </div>
      </div>
    </section>


  </main>
</body>
</html>