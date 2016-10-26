<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="include/css-top.jsp"%>
<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <title>Tanabata Festival</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <style type="text/css">
        @font-face {
            font-family: digit;
            src: url("<%=basePath%>resources/fonts/digital-7_mono.ttf") format("truetype");
        }
    </style>
    <link href="<%=basePath%>resources/css/default.css" type="text/css" rel="stylesheet">
    </head>

<body>
<div id="mainDiv">
    <div id="content">
        <div id="code">
            <span class="comments">/**</span><br />
            <span class="space"/><span class="comments">* Hi zijun</span><br />
            <span class="space"/><span class="comments">* I used your poem to celebrate Tanabata Festival</span><br />
            <span class="space"/><span class="comments">*/</span><br />
            <br/>
            思君令人老,岁月忽已晚,<br/>
            大概思念是人生最漫长的等待了吧,<br/>
            就这样,就老了,<br/>
            还记否,那惊艳在岁月里的白衣少年.<br/>
            剑眉星目,笑容阳光,<br/>
            微风吹过白衬衫,一转眼便事过多年.<br/><br/>

            不过数年,时光荏苒,物是人非.<br/>
            青春太短,爱太长.<br/><br/>

            玲珑骰子安红豆,入骨相思知不知?<br/><br/>
            <span class="comments">/**</span><br />
            <span class="space"/><span class="comments">* In the end</span><br />
            <span class="space"/><span class="comments">* Let our friendship go on</span><br />
            <span class="space"/><span class="comments">*/</span><br />
        </div>
        <div id="loveHeart">
            <canvas id="garden"></canvas>
            <div id="words">
                <div id="messages">
                    &nbsp;子君
                    <div id="elapseClock"></div>
                </div>
                <div id="loveu">
                    七夕快乐<br/>
                    <div class="signature"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-sm-12">
        <EMBED src="<%=basePath%>/resources/music/TheSoundOfSilence.mp3" width=300 height=45 type=audio/mpeg loop="-1" autostart="false" volume="0"></EMBED>
    </div>
    <div id="copyright">
        designed by <a href="#">FlowerPower</a> haidong<br />
        Copyright © 2016 <a href='http://daizijun.me'>daizijun.me</a> 2016-...
    </div>
</div>

<script type="text/javascript" src="<%=basePath%>resources/script/love/jquery.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/script/love/garden_dev.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/script/love/garden.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/script/love/functions_dev.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/script/love/functions.js"></script>
<script type="text/javascript">

        var offsetX = $("#loveHeart").width() / 2;
        var offsetY = $("#loveHeart").height() / 2 - 55;
        var together = new Date();
        together.setFullYear(2016, 7, 1);
        together.setHours(7);
        together.setMinutes(7);
        together.setSeconds(7);
        together.setMilliseconds(7);

        if (!document.createElement('canvas').getContext) {
            var msg = document.createElement("div");
            msg.id = "errorMsg";
            msg.innerHTML = "Your browser doesn't support HTML5!<br/>Recommend use Chrome 14+/IE 9+/Firefox 7+/Safari 4+";
            document.body.appendChild(msg);
            $("#code").css("display", "none")
            $("#copyright").css("position", "absolute");
            $("#copyright").css("bottom", "10px");
            document.execCommand("stop");
        } else {
            setTimeout(function () {
                startHeartAnimation();
            }, 5000);

            timeElapse(together);
            setInterval(function () {
                //var result = "<span class=\"digit\">2016</span> 年 <span class=\"digit\">7</span>月<span class=\"digit\">" + hours + "</span> hours <span class=\"digit\">" + minutes + "</span> minutes <span class=\"digit\">" + seconds + "</span> seconds";
               // $("#elapseClock").html(result);
                timeElapse(together);
            }, 500);

            adjustCodePosition();
            $("#code").typewriter();
        }

</script>
</body>

</html>



