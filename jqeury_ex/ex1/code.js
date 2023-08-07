$(function(){
    //要素
    let text = $("#text-1");
    //要素の内容の所得Hello
    console.log(text.html());
    //HelloをGoodByeに変更
    text.html("GoodBye")

    //リンク
    let link = $("#link-1");
    //リンクのURL
    console.log(link.attr("href"));

    //リンク書き換え
    link.attr("href","https://kinarino.jp/cat8/38722");
    link.attr("target","_blank");

    //css
    let texts = $(".text-class");
    //とってきた要素に色をつける
    texts.css("color","red");
   });