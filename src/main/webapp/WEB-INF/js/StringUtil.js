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
// 是否为中文
function isChinese(str) {
    var reg = /[\u4e00-\u9fa5]/;
    return reg.test(str);
}
// 是否为身份证
function isCardID(str) {
    var reg = /^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
    return reg.test(str);
}
// 是否为身高
function isHeight(str) {
    var height =  parseInt(str);
    if(isNaN(height) || height<30 || height >300){
        return false;
    }

    return true;
}
// 是否为体重
function isWeight(str) {
    var weight =  parseFloat(str);
    if(isNaN(weight) || weight<5 || weight >150){
        return false;
    }

    return true;
}