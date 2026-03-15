<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>rank</title>
  <link rel="stylesheet" href="/Oulim/asset/css/core/reset.css" />
  <link rel="stylesheet" href="/Oulim/asset/css/core/variable.css" />
  <link rel="stylesheet" href="/Oulim/asset/css/core/typography.css" />
  <link rel="stylesheet" href="/Oulim/asset/css/core/layout.css" />
  <link rel="stylesheet" href="/Oulim/asset/css/component/badge.css">
  <link rel="stylesheet" href="/Oulim/asset/css/pages/kkomi/rank.css">

  <script defer src="/Oulim/asset/js/pages/kkomi/rank.js"></script>
  
    <jsp:include page="/app/include/header-login.jsp" />
</head>

<body>
  <main class="l-main">
    <div class="l-container">
      <section class="p-rank">
        <h2 class="p-rank__title">도력 랭킹</h2>
        <p class="p-rank__desc">가장 많은 선행을 베푼 수행자들을 확인해보세요!</p>

        <div class="p-rank__top3 js-rank-top3">
          <div class="loading-spinner">랭킹을 불러오는 중...</div>
        </div>

        <ul class="c-rank-list js-rank-list">
        </ul>
        <button class="c-button c-button--secondary c-button--md" onclick="location.href='Kkomi-training-center.html'">
          수련소로 돌아가기
        </button>
      </section>
    </div>
  </main>
</body>
<jsp:include page="/app/include/footer.jsp" />

</html>