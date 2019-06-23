// 是否为空
function isNull(str) {
    if (str == null|| str == "") return true;
    return false;
}
// 是否为手机号
function isPhone(str) {
    var reg = /^1\d{10}$/;
    return reg.test(str);
}
// 长度不大于max
function lengthMax(str,max) {
    return str.length<=max;
}
// 长度不小于min
function lengthMin(str,min) {
    return str.length>=min;
}