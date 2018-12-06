$.ajax({
    url: "/err/getAjaxerror",
    type: "POST",
    async: false,
    success:function (data) {
        debugger;
        if(data.status == 200 && data.msg == "OK"){
            alert("success");
        }
    },
    error:function(response,ajaxOptions,throwError){
        alert("error")
    }

});