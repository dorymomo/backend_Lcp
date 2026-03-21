<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>dashboard</title>

    <!-- base css 필수 삽입-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/reset.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/variable.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/Typography.css" />
    <!-- 컨포넌트 css 선택-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/pagination.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/input.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/button.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/list.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/card.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/DetailCard.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/badge.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/dashboard/dashboard.css" />
  <script defer src="${pageContext.request.contextPath}/app/admin/js/dashboard/dashboard.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/aside.css" />
</head>

<body>
	<main class="l-main">
	<jsp:include page="/app/admin/jsp/aside.jsp"/>


      <!-- 메인 컨텐츠 -->
      <section class="l-content">
        <div class="header">
          <h1>통계</h1>
        </div>

        <div id="content-area">
          <p>2026-03-04</p>
        </div>
        <div class="today">
          <div id="content-area">
            <p>현재 진행중 봉사: 1000000</p>
          </div>
          <div id="content-area">
            <p>결제 미처리 봉사건 : 3000</p>
          </div>
          <div id="content-area">
            <p>가입 기업: 30</p>
          </div>
          <div id="content-area">
            <p>미처리 기업회원 : 3000</p>
          </div>
          <div id="content-area">
            <p>총 단체 회원수 : 3000</p>
          </div>
          <div id="content-area">
            <p>총 회원수 : 3000</p>
          </div>
        </div>
        <!-- 미처리 봉사건 -->
        <div class="volun-notyet">
          <div class="notyet-head">
            <p>미처리 봉사 건</p>
            <button class="volun-list">바로가기</button>
          </div>
          <div class="c-list c-list--4col">
            <div class="c-list__header">
              <span class="c-list__col">봉사번호</span>
              <span class="c-list__col">단체명</span>
              <span class="c-list__col">종료일</span>
              <span class="c-list__col">처리</span>
            </div>
            <div class="c-list__body">
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 1 </span>
                <span class="c-list__col clicktitle"> 봉사만세 </span>
                <span class="c-list__col clicktitle"> 2023-01-15 </span>
                <div class="c-list__actions">
                  <button class="c-button c-button--primary c-button--md">
                    메일 발송
                  </button>
                </div>
              </div>
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 1 </span>
                <span class="c-list__col clicktitle"> 봉사만세 </span>
                <span class="c-list__col clicktitle"> 2023-01-15 </span>
                <div class="c-list__actions">
                  <button class="c-button c-button--primary c-button--md">
                    메일 발송
                  </button>
                </div>
              </div>
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 1 </span>
                <span class="c-list__col clicktitle"> 봉사만세 </span>
                <span class="c-list__col clicktitle"> 2023-01-15 </span>
                <div class="c-list__actions">
                  <button class="c-button c-button--primary c-button--md">
                    메일 발송
                  </button>
                </div>
              </div>
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 1 </span>
                <span class="c-list__col clicktitle"> 봉사만세 </span>
                <span class="c-list__col clicktitle"> 2023-01-15 </span>
                <div class="c-list__actions">
                  <button class="c-button c-button--primary c-button--md">
                    메일 발송
                  </button>
                </div>
              </div>
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 1 </span>
                <span class="c-list__col clicktitle"> 봉사만세 </span>
                <span class="c-list__col clicktitle"> 2023-01-15 </span>
                <div class="c-list__actions">
                  <button class="c-button c-button--primary c-button--md">
                    메일 발송
                  </button>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- =======새로운 기업 신청 -->
        <div class="new-company">
          <div class="new-company-list">
            <p>신규 기업 회원 관리</p>
            <button>바로가기</button>
          </div>
          <div class="c-list c-list--4col">
            <div class="c-list__header">
              <span class="c-list__col">단체명</span>
              <span class="c-list__col">이름</span>
              <span class="c-list__col">신청일</span>
              <span class="c-list__col">이메일</span>
            </div>
            <div class="c-list__body">
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 봉사만세</span>
                <span class="c-list__col clicktitle"> 김말순 </span>
                <span class="c-list__col clicktitle"> 2026-01-01 </span>
                <span class="c-list__col clicktitle"> qwer@asdf.com</span>
              </div>
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 봉사만세</span>
                <span class="c-list__col clicktitle"> 김말순 </span>
                <span class="c-list__col clicktitle"> 2026-01-01 </span>
                <span class="c-list__col clicktitle"> qwer@asdf.com</span>
              </div>
              <div class="c-list__row">
                <span class="c-list__col clicktitle"> 봉사만세</span>
                <span class="c-list__col clicktitle"> 김말순 </span>
                <span class="c-list__col clicktitle"> 2026-01-01 </span>
                <span class="c-list__col clicktitle"> qwer@asdf.com</span>
              </div>
            </div>
          </div>
        </div>
      </section>
    </main>

  </body>
</html>
