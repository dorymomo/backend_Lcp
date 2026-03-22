
function deleteApply(volunActNo, userNo){
    if(confirm("삭제하시겠습니까?")){
        location.href = "/admin/deleteApply?volunActNo=" 
            + volunActNo + "&userNo=" + userNo;
    }
}