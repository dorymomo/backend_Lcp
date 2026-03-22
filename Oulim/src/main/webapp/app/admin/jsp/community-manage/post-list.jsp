<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>post-list</title>

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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/community-manage/post-list.css" />
  <script defer src="${pageContext.request.contextPath}/app/admin/js/community-manage/post-list.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/aside.css" />
</head>

<body>
	<main class="l-main">
	<jsp:include page="/app/admin/jsp/aside.jsp"/>


      <section class="l-content">
        <!-- 메인 위에 헤더 -->
        <div class="header">
          <h1>게시글 관리</h1>
        </div>
        <div id="content-area">
          <select class="search-item">
            <option>닉네임</option>
            <option>게시글 제목</option>
            <option>작성일</option>
          </select>
          <input type="text" class="c-input" placeholder="검색 조건">
          <button class="c-button c-button--primary c-button--md">조회</button>
        </div>

        <div class="c-list c-list--8col">
          <!-- header -->
          <div class="c-list__header">
            <label class="c-checkbox">
              <input type="checkbox" />
              <span class="c-checkbox__box"></span>
            </label>
            <span class="c-list__col">게시글 번호</span>
            <span class="c-list__col">닉네임</span>
            <span class="c-list__col">게시글 제목</span>
            <span class="c-list__col">작성일</span>
            <span class="c-list__col">추천수</span>
            <span class="c-list__col">조회수</span>
            <span class="c-list__col">삭제여부</span>
          </div>
          <!-- body -->
          <div class="c-list__body">
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col clicktitle">
                1
              </span>
              <span class="c-list__col clicktitle">
                아무개
              </span>
              <span class="c-list__col clicktitle">
                제목입니다
              </span>
              <span class="c-list__col clicktitle">
                2023-01-15
              </span>
              <span class="c-list__col clicktitle">
                11
              </span>
              <span class="c-list__col clicktitle">
                1000
              </span>
              <div class="c-list__actions">
                <button class="c-button c-button--primary c-button--md">
                  삭제
                </button>
                <div class="c-list__actions">
                </div>
              </div>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col clicktitle">
                1
              </span>
              <span class="c-list__col clicktitle">
                아무개
              </span>
              <span class="c-list__col clicktitle">
                제목입니다
              </span>
              <span class="c-list__col clicktitle">
                2023-01-15
              </span>
              <span class="c-list__col clicktitle">
                11
              </span>
              <span class="c-list__col clicktitle">
                1000
              </span>
              <div class="c-list__actions">
                <button class="c-button c-button--primary c-button--md">
                  삭제
                </button>
              </div>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col clicktitle">
                1
              </span>
              <span class="c-list__col clicktitle">
                아무개
              </span>
              <span class="c-list__col clicktitle">
                제목입니다
              </span>
              <span class="c-list__col clicktitle">
                2023-01-15
              </span>
              <span class="c-list__col clicktitle">
                11
              </span>
              <span class="c-list__col clicktitle">
                1000
              </span>
              <div class="c-list__actions">
                <button class="c-button c-button--primary c-button--md">
                  삭제
                </button>
              </div>
            </div>
            <div class="c-list__row">
              <label class="c-checkbox">
                <input type="checkbox" />
                <span class="c-checkbox__box"></span>
              </label>
              <span class="c-list__col clicktitle">
                1
              </span>
              <span class="c-list__col clicktitle">
                아무개
              </span>
              <span class="c-list__col clicktitle">
                제목입니다
              </span>
              <span class="c-list__col clicktitle">
                2023-01-15
              </span>
              <span class="c-list__col clicktitle">
                11
              </span>
              <span class="c-list__col clicktitle">
                1000
              </span>
              <div class="c-list__actions">
                <button class="c-button c-button--primary c-button--md">
                  삭제
                </button>
              </div>
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
        </div>
      </section>

  </main>


</body>

</html>