//メソッド１
function printHello(){
    console.log("hello");
}
//メソッドの呼びたし
printHello();

//メソッド２returnあり
function sum(a,b){
    return a + b;
}
console.log(sum(1,2));

//デフォルト
function print(str1,str2="世界",str3="!!!"){
    console.log(str1 + ""+str2 + ""+str3);
}
//呼ぶたし
print("aaaa");
print("bbbb","ccccc");
print("aaaa","bbbbb","ccccc");

//ラムダ式
let add =(x,y)=>x+y;
console.log(add(2,3));



const CALC_NUM = 100;

function isPrime(x) {
    for (let i = 2; i < x; i++) {
        if (x % i === 0) {
            return false;
        }
    }
    return true;
}

function findPrimes() {
    const primes = [];
    let k = 0;
    for (let i = 2; k < CALC_NUM; i++) {
        if (isPrime(i)) {
            primes.push(i);
            k++;
        }
    }
    return primes;
}

const primesArray = findPrimes();
console.log(primesArray);
