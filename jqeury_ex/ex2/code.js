$(function(){
//<ol>の要素
let list = $("#list");
//新しい<a>要素を追加
let newLink = $("<a>");
//aタグの中に内容を追加
newLink.html("developer.mozilla.org");
//リストの末に追加
list.append(newLink);

//新しいliを作ってaタグを入れ
let newItem = $("<li>");
list.append(newItem);
newItem.append(newLink);

//要素を丸こと削除
//list.remove();

//要素の中を空にするempty
list.empty();

//クリックイベントjs onclick
$("#button1").click(()=>{
    console.log("hello");    
})

//クリックイベント addEvent~
$("#button1").on("click",()=>{
    console.log("Goodbye");
})
$("#button1").on("click",()=>{
    console.log("Goodbye2");
})


});