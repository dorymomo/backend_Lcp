const pointNum = document.querySelector(".point-count");

pointNum.addEventListener("click", function(){
  location.href = "${pageContext.request.contextPath}/app/admin/jsp/member-manage/mem-edit.jsp";
});

