function add(a,b)
{
    console.log(a+b);
}
function sub(a,b)
{
    console.log(a-b);
}

add.call(sub,3,1);
/*
function Animal(){
    this.name = "Animal";
    this.showName = function(){
        console.log(name);
    }
}

function Cat(){
    this.name = "Cat";
}

var animal = new Animal();
var cat = new Cat();

//通过call或apply方法，将原本属于Animal对象的showName()方法交给对象cat来使用了。
//输入结果为"Cat"
animal.showName.call(cat,",");
//animal.showName.apply(cat,[]);*/



/*=============实现继承==============================*/
console.log('实现继承');
function Animal(name){
    this.name = name;
    this.showName = function(){
        console.log(this.name);
    }
}

function Cat(name){
    Animal.call(this, name);
}

var cat = new Cat("Black Cat");
cat.showName();

/*=============实现继承结束==============================*/

/*=============多重继承==============================*/
console.log('多重继承');
function Class10()
{
    this.showSub = function(a,b)
    {
        console.log(a-b);
    }
}

function Class11()
{
    this.showAdd = function(a,b)
    {
        console.log(a+b);
    }
}

function Class2()
{
    Class10.call(this);
    Class11.call(this);
}
var test  = new Class2();
test.showAdd(1,2);
test.showSub(4,1);
/*=============多重继承结束==============================*/