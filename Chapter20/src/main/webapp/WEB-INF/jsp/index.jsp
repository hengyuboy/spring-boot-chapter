<%--
  Created by IntelliJ IDEA.
  User: yuqy
  Date: 2017/4/27
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WebScoket广播式</title>
    <script src="/sockjs.min.js"></script>
    <script src="/stomp.min.js"></script>
    <script src="/jquery.min.js"></script>
</head>
<body onload="disconnect()">
    <button id="connect" onclick="connect()">连接</button>
    <button id="disconnect" onclick="disconnect()" disabled="disabled">断开连接</button><br/>
    <div id="inputDiv">
        输入名称：<input type="text" id="name"/><br/>
        <button id="sendName" onclick="sendName()">发送</button><br/>
        <p id="response"></p>
    </div>
    <script>
        var stompClient = null;
        //设置连接状态控制显示隐藏
        function setConnected(connected)
        {
            $("#connect").attr("disabled",connected);
            $("#disconnect").attr("disabled",!connected);
            if(!connected) {
                $("#inputDiv").hide();
            }else{
                $("#inputDiv").show();
            }
            $("#reponse").html("");
        }
        //连接
        function connect()
        {
            var socket = new SockJS("/endpointWisely");
            stompClient = Stomp.over(socket);
            stompClient.connect({},function (frame) {
                setConnected(true);
                console.log("connected : "+frame);
                stompClient.subscribe("/topic/getResponse",function (response) {
                    showResponse(JSON.parse(response.body).responseMessage);
                })
            })
        }
        //断开连接
        function disconnect(){
            if(stompClient!=null)
            {
                stompClient.disconnect();
            }
            setConnected(false);
            console.log("disconnected!");
        }
        //发送名称到后台
        function sendName(){
            var name = $("#name").val();
            stompClient.send("/welcome",{},JSON.stringify({'name':name}));
        }
        //显示socket返回消息内容
        function showResponse(message)
        {
            $("#response").html(message);
        }
    </script>
</body>
</html>
