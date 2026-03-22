<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>company-certification</title>

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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/member-manage/company-certification.css" />
  <script defer src="${pageContext.request.contextPath}/app/admin/js/member-manage/company-certification.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/aside.css" />
</head>

<body>
	<main class="l-main">
	<jsp:include page="/app/admin/jsp/aside.jsp"/>


    <!-- 메인 -->
    <section class="l-content">
        <!-- 메인헤더 -->
        <div class="header">
          <h1>기업회원관리</h1>
        </div>
        <div id="content-area">
          <p id="company-count">총440</p>
          <div class="bind-button">
            <button class="c-button c-button--secondary c-button--md">
              선택반려
            </button>
            <button class="c-button c-button--primary c-button--md">
              선택승인
            </button>
          </div>
        </div>

        <div class="c-list c-list--6col">
          <!-- header -->
          <div class="c-list__header">
            <label class="c-checkbox">
              <input type="checkbox" />
              <span class="c-checkbox__box"></span>
            </label>
            <span class="c-list__col">유저번호</span>
            <span class="c-list__col">회사명</span>
            <span class="c-list__col">아이디</span>
            <span class="c-list__col">가입일</span>
            <span class="c-list__col">회사코드</span>
          </div>
          <!-- body -->
          <div class="c-list__body">
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
             </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col company-detail"> 1 </span>
              <span class="c-list__col company-detail"> 현대자동차 </span>
              <span class="c-list__col company-detail"> aaa </span>
              <span class="c-list__col company-detail"> 2023-01-15 </span>
              <span class="c-list__col company-detail"> 00001 </span>
            </div>
          </div>
        </div>
        <div class="page">
          <!-- 페이지네이션  c-pagination-->
          <nav class="c-pagination">
            <a class="c-pagination__link is-disabled">‹‹</a>
            <a class="c-pagination__link is-disabled">‹</a>
            <a class="c-pagination__link is-active">1</a>
            <a class="c-pagination__link">2</a>
            <a class="c-pagination__link">3</a>
            <a class="c-pagination__link">4</a>
            <a class="c-pagination__link">5</a>
            <a class="c-pagination__link">6</a>
            <a class="c-pagination__link">7</a>
            <a class="c-pagination__link">8</a>
            <a class="c-pagination__link">9</a>
            <a class="c-pagination__link">10</a>
            <a class="c-pagination__link">›</a>
            <a class="c-pagination__link">››</a>
          </nav>
      </section>
  </main>

</body>

</html>