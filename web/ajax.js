 function ajaxSubscribeFormSubmit() {
     var xmlHttp;
     if (window.XMLHttpRequest) {
         xmlHttp = new XMLHttpRequest();
     } else if (window.ActiveXObject) {
         xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
     } else {
         document.write("browser not supported");
     }
     xmlHttp.onreadystatechange=function() {
         if (xmlHttp.readyState == 4) {
             var html = document.getElementById("divResponse");
             html.innerHTML = xmlHttp.responseText;
         }
     }
     var name = document.getElementById("name").value;
     var email = document.getElementById("email").value;
     var queryString = "?name=" + name + "&email=" + email;
     xmlHttp.open("GET","Subscribe" + queryString,true);
     xmlHttp.send(null);
  }