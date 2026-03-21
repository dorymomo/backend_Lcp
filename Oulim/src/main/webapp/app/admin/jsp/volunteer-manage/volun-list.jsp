<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>volun-list</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/reset.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/variable.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/core/Typography.css" />
    <!-- 컨포넌트 css 선택-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/pagination.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/input.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/button.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/asset/css/component/select.css" />
  
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/volunteer-manage/volun-list.css" />
  <script defer src="${pageContext.request.contextPath}/app/admin/js/volunteer-manage/volun-list.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/app/admin/css/aside.css" />
</head>

<body>
	<main class="l-main">
	<jsp:include page="/app/admin/jsp/aside.jsp"/>
	
	  <section class="l-content">
	    <div class="header">
	      <h1>봉사 활동 관리</h1>
	    </div>
	
		<div class="search-section">
		  <form action="/admin/volunteer/list" method="get" class="search-form">
		    <div class="search-container">
		      
		      <div class="search-row">
		        <div class="search-group">
		          <label class="search-label">진행상태</label>
		          <select name="status" class="c-select">
		            <option value="all">전체</option>
		            <option value="recruiting">모집중</option>
		            <option value="ongoing">진행중</option>
		            <option value="closed">종료</option>
		          </select>
		        </div>
		
		        <div class="search-group">
		          <label class="search-label">봉사기간</label>
		          <div class="search-date-range">
		            <input type="date" name="startDate" class="c-input">
		            <span class="search-separator">~</span>
		            <input type="date" name="endDate" class="c-input">
		          </div>
		        </div>
		      </div>
		
		      <div class="search-row">
		        <div class="search-group search-group--full">
		          <label class="search-label">검색어</label>
		          <div class="search-input-wrapper">
			          <select class="c-select" name="searchType">
				          <option value="title">봉사번호</option>
				          <option value="point">봉사명</option>
				       </select>
				       <input class="c-input" type="text" name="keyword" value="${search.keyword}" placeholder="검색어 입력" />		          
		          </div>
		        </div>
		      </div>
		
		      <div class="search-actions">
		        <button type="submit" class="c-button c-button--primary c-button--md">조회</button>
		        <button type="reset" class="c-button c-button--Tertiary c-button--md">초기화</button>
		      </div>
		
		    </div>
		  </form>
		</div>
		
		<div class="c-list-container">
		  <div class="c-list">
		  
		    <!-- 헤더 -->
		    <div class="c-list__header">
		      <div class="c-list__col">봉사번호</div>
		      <div class="c-list__col">봉사명</div>
		      <div class="c-list__col">단체명</div>
		      <div class="c-list__col">시작일</div>
		      <div class="c-list__col">종료일</div>
		      <div class="c-list__col">진행상태</div>
		    </div>
		
		    <!-- 바디 -->
		    <div class="c-list__body">
		      <c:choose>
		        <c:when test="${not empty volunList}">
			      <c:forEach var="v" items="${volunList}">
			        <div class="c-list__row">
						<div class="c-list__col">${v.volunActNo}</div>
						<div class="c-list__col">${v.volunActTitle}</div>
						<div class="c-list__col">${v.orgName}</div>
						<div class="c-list__col">${v.volunActProcBegin}</div>
						<div class="c-list__col">${v.volunActProcEnd}</div>
						<div class="c-list__col">${v.recruStatus}</div>
			        </div>
			      </c:forEach>
		        </c:when>
		        <c:otherwise>
		          <div class="c-list__row">
		            <div class="c-list__col" style="width:100%; text-align:center;">
		              데이터가 없습니다.
		            </div>
		          </div>
		        </c:otherwise>
		      </c:choose>
		    </div>
		  </div>
		</div>
	
	    <div class="pagination-area">
	       </div>
	  </section>
	</main>
</body>

</html>