//ol liの情報
let list = document.getElementById("list");

//新しい要素
let newLink = document.createElement("a");
//内容を挿入
newLink.innerHTML = "developer.mozilla.org";
list.append(newLink);

//新しい<li>を作成
let item = document.createElement("li");
list.append(item);
item.append(newLink);

//要素の削除
let removeLink = document.getElementById("link-2");
//removeLink.remove.remove();
removeLink.parentNode.remove();

/**document.getElementById("button").onclick = function() {
  // ここに#buttonをクリックしたら発生させる処理を記述する
}; */

//document.getElementById("button").onclick=()=>{

//}
let btnEvent = document.getElementById("button1");
btnEvent.onclick = function(){
    console.log("ボタン1")
}
btnEvent.onclick = function(){
    console.log("ボタン2")
}

/**対象の要素.addEventListener(種類, () => {
  // 処理を記述
}); */
// 対象の要素.addEventListener(種類, function() {
//    // 処理を記述
//  }, false);

btnEvent.addEventListener("click,",()=>{
    console.log("ボタン３");
});
btnEvent.addEventListener("click",()=>{
    console.log("ボタン４");
});
function hello(){
    console.log("hello");
}