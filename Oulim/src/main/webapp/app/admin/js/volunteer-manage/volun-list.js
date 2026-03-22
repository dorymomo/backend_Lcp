
// 상세 페이지 이동 (기존 유지)
const volunDetail = document.querySelectorAll(".volundetail");

volunDetail.forEach((btn) => {
  btn.addEventListener("click", function () {
    location.href = "/Oulim/admin/html/volunteer-manage/volun-detail.html";
  });
});


// 최종 검색 검증 함수
function validateSearchForm() {
  const start = document.getElementById("startDate").value;
  const end = document.getElementById("endDate").value;

  console.log("start:", start);
  console.log("end:", end);

  // 둘 다 없으면 OK
  if (!start && !end) return true;

  // 형식 체크 (YYYY-MM-DD)
  const regex = /^\d{4}-\d{2}-\d{2}$/;

  if (start && !regex.test(start)) {
    alert("시작일 형식이 올바르지 않습니다. (YYYY-MM-DD)");
    return false;
  }

  if (end && !regex.test(end)) {
    alert("종료일 형식이 올바르지 않습니다. (YYYY-MM-DD)");
    return false;
  }

  // 년도 4자리 체크 
  if (start) {
    const year = start.split("-")[0];
    if (year.length !== 4) {
      alert("시작일의 연도는 4자리여야 합니다.");
      return false;
    }
  }

  if (end) {
    const year = end.split("-")[0];
    if (year.length !== 4) {
      alert("종료일의 연도는 4자리여야 합니다.");
      return false;
    }
  }

  // ️둘 다 있을 때만 비교
  if (start && end && start > end) {
    alert("시작일은 종료일보다 클 수 없습니다.");
    return false;
  }

  return true;
}