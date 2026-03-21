<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<aside class="l-sidebar">
  <div class="adminnow">
    <div class="profile-circle">
      </div>
    <button type="button" class="c-button--logout" onclick="location.href='/logout'">로그아웃</button>
  </div>

  <nav class="sidebar-menu">
    <ul>
      <li class="menu-item ${activeMenu == 'dashboard' ? 'is-active' : ''}">
        <a href="/admin/dashboard">통계</a>
      </li>
      <li class="menu-item ${activeMenu == 'member' ? 'is-active' : ''}">
        <a href="/admin/member/list">회원관리</a>
      </li>
      <li class="menu-item ${activeMenu == 'volunteer' ? 'is-active' : ''}">
        <a href="/admin/volunteer/list">봉사 활동 관리</a>
      </li>
      <li class="menu-item ${activeMenu == 'board' ? 'is-active' : ''}">
        <a href="/admin/board/list">게시판관리</a>
      </li>
    </ul>
  </nav>
</aside>