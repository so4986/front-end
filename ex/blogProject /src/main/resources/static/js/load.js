$(function(){
    $('#new').on('click',function(){
        $('#blog-register').addClass("active");
        $('#blog-register').removeClass("non-active");
        $('.blog-list').addClass("non-active");
        $('.blog-list').removeClass("active");
    });
    $('#home').on('click',function(){
        $('#blog-register').addClass("non-active");
        $('.blog-list').addClass("active");
        $('.blog-list').removeClass("non-active");
        $('#blog-register').removeClass("active");
        $('#blog-edit').removeClass("active");
        $('#blog-edit').addClass("non-active");
    });

    $('#edit').on('click',function(){
        $('#blog-register').addClass("non-active");
        $('#blog-edit').addClass("active");
        $('#blog-edit').removeClass("non-active");
        $('#blog-register').removeClass("active");
        $('.blog-list').addClass("non-active");
        $('.blog-list').removeClass("active");
    });


    $('#out').on('click',function(){
        $('#blog-register').addClass("non-active");
        $('.blog-list').addClass("active");
        $('.blog-list').removeClass("non-active");
        $('#blog-register').removeClass("active");
        $('.blog-list').addClass("non-active");
        $('.blog-list').removeClass("active");
        $('#blog-edit').removeClass("active");
        $('#blog-edit').addClass("non-active");
    });
    
})