//オブジェクト
let obj = {name:"Alice",id:122,isStudent:true};
console.log(obj);
//Aliceを表示
console.log(obj.name);
console.log(obj["name"]);
//上書き
obj.id = 30;
console.log(obj.id);
obj["isStudent"] = false;
console.log(obj["isStudent"]);
//for文
for(let key in obj){
    console.log(key + ":"+obj[key]);
}