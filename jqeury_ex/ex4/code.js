$(function(){
    $(".sample_btn").click(function(){
        $.ajax({
            url:'test.html',
            type:'GET',
            dataType:'html'

        }).done(function(data){
            //通信が成功
            $(".result").html(data);
        }).fail(function(){
            //通信が失敗
            confirm.log("通信が失敗した");
        });
    });
});