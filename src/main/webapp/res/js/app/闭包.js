
/*
function foo(x) {
    var tmp = 3;
    return function (y) {
        console.log(x + y + (++tmp));
    }
}
var bar = foo(2); // bar 现在是一个闭包
bar(10);*/

/*function foo(x) {
    var tmp = 3;
    return function (y) {
        console.log(x);
        console.log(y);
        console.log(tmp);
        console.log(x + y + tmp);
        x.memb = x.memb ? x.memb + 1 : 1;
        console.log(x.memb);

    }
}
var age = new Number(2);
var bar = foo(age); // bar 现在是一个引用了age的闭包
bar(10);*/



var db = (function() {
// 创建一个隐藏的object, 这个object持有一些数据
// 从外部是不能访问这个object的
    var data = {};
// 创建一个函数, 这个函数提供一些访问data的数据的方法
    return function(key, val) {
        if (val === undefined) { return data[key] } // get
        else { return data[key] = val } // set
    }
// 我们可以调用这个匿名方法
// 返回这个内部函数，它是一个闭包
})();

db('x'); // 返回 undefined
db('x', 1); // 设置data['x']为1
db('x'); // 返回 1
// 我们不可能访问data这个object本身
// 但是我们可以设置它的成员