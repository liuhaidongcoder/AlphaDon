<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="include/css-top.jsp"%>

<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>H+ 后台主题UI框架 - 首页示例四</title>

</head>

<body class="gray-bg top-navigation">

<div id="wrapper">
    <div id="page-wrapper" class="gray-bg">
        <div class="row border-bottom white-bg">
            <nav class="navbar navbar-static-top" role="navigation">
                <div class="navbar-header">
                    <button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
                        <i class="fa fa-reorder"></i>
                    </button>
                    <a href="index_v5.html#" class="navbar-brand">Hplus</a>
                </div>
                <div class="navbar-collapse collapse" id="navbar">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a aria-expanded="false" role="button" href="index.html"> 返回首页</a>
                        </li>
                        <li class="dropdown">
                            <a aria-expanded="false" role="button" href="index_v5.html#" class="dropdown-toggle" data-toggle="dropdown"> 菜单 <span class="caret"></span></a>
                            <ul role="menu" class="dropdown-menu">
                                <li><a href="index_v5.html">菜单列表</a>
                                </li>
                                <li><a href="index_v5.html">菜单列表</a>
                                </li>
                                <li><a href="index_v5.html">菜单列表</a>
                                </li>
                                <li><a href="index_v5.html">菜单列表</a>
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a aria-expanded="false" role="button" href="index_v5.html#" class="dropdown-toggle" data-toggle="dropdown"> 菜单 <span class="caret"></span></a>
                            <ul role="menu" class="dropdown-menu">
                                <li><a href="index_v5.html">菜单列表</a>
                                </li>
                                <li><a href="index_v5.html">菜单列表</a>
                                </li>
                                <li><a href="index_v5.html">菜单列表</a>
                                </li>
                                <li><a href="index_v5.html">M菜单列表</a>
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a aria-expanded="false" role="button" href="index_v5.html#" class="dropdown-toggle" data-toggle="dropdown"> 菜单 <span class="caret"></span></a>
                            <ul role="menu" class="dropdown-menu">
                                <li><a href="index_v5.html">菜单列表</a>
                                </li>
                                <li><a href="index_v5.html">菜单列表</a>
                                </li>
                                <li><a href="index_v5.html">菜单列表</a>
                                </li>
                                <li><a href="index_v5.html">菜单列表</a>
                                </li>
                            </ul>
                        </li>

                    </ul>
                    <ul class="nav navbar-top-links navbar-right">
                        <li>
                            <a href="login.html">
                                <i class="fa fa-sign-out"></i> 退出
                            </a>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
        <div class="wrapper wrapper-content">
            <div class="container">

                <div class="row">

                    <div class="col-lg-12">
                        <table id="feaCtr"></table>
                    </div>

                </div>

            </div>

        </div>
        <div class="footer">
            <div class="pull-right">
                By：<a href="../../index.html" target="_blank">zihan's blog</a>
            </div>
            <div>
                <strong>Copyright</strong> H+ &copy; 2014
            </div>
        </div>

    </div>
</div>

<%@include file="include/scripts-bottom.jsp"%>
<script src="/resources/script/index.js"></script>
</body>

</html>

