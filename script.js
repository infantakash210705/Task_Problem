// let year = 2028;
// if(year % 4 == 0){
//     if(year % 100 == 0){
//         if(year % 400 == 0){
//             console.log("Leap Year");
//         }
//         else{
//             console.log("Not a Leap Year");
//         }
//     }
//     else{
//         console.log("Leap Year");
//     }
// }
// else{
//     console.log("Not a Leap Year");
// }

// let num = 3;

// function oddOrEven(num){
//     if(num % 2 == 0){
//         return "even";
//     }
//     else{
//         return "odd";
//     }
// }
// console.log(oddOrEven(num));

// let mul = (n) => n * 5;

// console.log(mul(4));

// let gender = "Male, semi-adult";
// let pet = {
//     name : "dog",
//     breed: gender+", lab",
//     type: "little furry",
//     "colour varity": "lite brown",
//     age: 2,
//     marketPrice: 20000,
//     breederPrice(){
//         return this.marketPrice - 10000;
//     }
// }
// pet["price"] = 15000;
// // pet["age"] = 3;
// // or
// pet.age = 4;
// delete pet["type"];
// console.log(pet.breederPrice());

/* 
let user = {}

user["name"] = "Infant Akash"; //or user.name = "Infant Akash" when property contains space ex: first name that time used ["first name"]
console.log(user);

user.name = "Infant Akash W";
console.log(user);

delete user.name;
console.log(user);
*/

/* 
let gender = "Male, semi-adult";
let pet = {
    name : "dog",
    breed: gender+", lab",
    type: "little furry",
    "colour varity": "lite brown",
    age: 2,
    marketPrice: 20000,
}

console.log("age" in pet);

for(key in pet){
    console.log(key + " : " + pet[key]);
} 
*/

/* 
function Sum(){
    this.n1 = 2;
    this.n2 = 3;

    this.add = function(n3){
        return this.n1 + this.n2 + n3;
    }
}

let obj = new Sum();

console.log(obj.add(5));
 */

/*
let arr = new Array();

arr = ['one','two','three','four'];

console.log(arr);
console.log(arr[1]);
arr.push('five');

console.log(arr);
arr.pop();

arr.unshift('zero');
console.log(arr);

arr.shift();
console.log(arr);
*/



/* 
let mat = [
    [1,2,3],
    [4,5,6],
    [7,8,9,5]
]

for(let i = 0; i < mat.length; i++){
    for(let j = 0; j < mat[i].length; j++){
        console.log(mat[i][j]);
    }
} 
*/


/* 
let map = new Map();

map.set(1, 'akash').set(2, 'infant').set('gender', 'male');

for(key of map){
    console.log(key);
    
}
 */

/* 
let set = new Set();

set.add('akash').add('infant').add('akash');
console.log(set);
// output:
// Set(2) { 'akash', 'infant' }
// set donot allow duplicates

console.log(set.has('akash'));

for(s of set){
    console.log(s);    
}
*/

/* 
let json = {
    name : "akash",
    age : 21,
    gender : "male"
};

let object = '{"name" : "akash", "age" : 21}';

console.log(JSON.stringify(json)); // convert object to JSON
console.log(JSON.parse(object)); // convert JSON to object
*/

/* 
let date = new Date();
console.log(date);
*/

/*
function Sum(n){
    if(n == 0){
        return 0;
    }
    return n + Sum(n - 1);
}

console.log(Sum(2));
*/


/* 
class User{
    #pin;
    constructor(name, age, pin){
        this.name = name;
        this.age = age;
        this.#pin = pin;
    }

    display(){
        console.log(this.name);
        console.log(this.age);
        console.log(this.#pin);
    }

    get pin(){
        return this.#pin;
    }

    set pin(pin){
        this.#pin = pin;
    }
}

let use = new User('akash', 21, 210705);

// use.display();

use.pin = 2116;
console.log(use.pin);
*/

/* 
class Animal{
    legs;
    tail;
    organism;

    constructor(legs, tail, organism){
        this.legs = legs;
        this.tail = tail;
        this.organism = organism;
    }

    display(){
        console.log(this.legs);
        console.log(this.tail);
        console.log(this.organism);
    }
}

class Human extends Animal{
    nationality;
    constructor(legs, tail, organism, nationality){
        super(legs, tail, organism);
        this.nationality = nationality;
    }
    
    display(){
        console.log("Human Detils:");
        console.log('legs: '+this.legs);
        console.log('tail: '+this.tail);
        console.log('organism: '+this.organism);
        console.log("nationality: "+this.nationality);
    }
}


let human = new Human(2, false, "human", 'indian');

human.display(); 
*/


/* 
try{
    console.log(a);
        
}
catch(error){
    console.log(error.message);
    throw new Error("a is undefined");
}
*/

let sweet = Boolean(Math.round(Math.random())); //or Math.random() < 0.5;

function waitingForBuySweets(){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            if(sweet){
                resolve('Successfully buy the sweets😊');
            }
            else{
                reject('Sweets are finished😔');
            }
        }, 2000)
    });
}

async function afterCompleted(){
    waitingForBuySweets().then((message)=>{
        console.log(message);
    })
    .catch((error)=>{
        console.log(error);
    })
    .finally(()=>{
        console.log('Bye go Home👋');
    })

    // or using await

    /* try{
        let result = await waitingForBuySweets();
        console.log(result);
    }
    catch(error){
        console.log(error);
    } */
}

afterCompleted();

console.log("wait for 2 seconds🫸🏻");












