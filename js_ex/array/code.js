//配列の初期
let arr = [1,2,3,"Alice",12,5];
console.log(arr);
//配列の長さ
console.log(arr.lebgth);
//配列に値
arr.push("追加した");
console.log(arr);
//中身の削除
arr.pop();
console.log(arr);


//配列の作成
let arr2 = new Array(5);
arr[0] = 23;
console.log(arr2);

//for-ofをしよして
for(let a of arr){
    console.log(a);
}