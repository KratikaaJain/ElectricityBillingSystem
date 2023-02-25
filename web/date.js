let todayDate = new Date();

let date = todayDate.getDate();
let month = todayDate.getMonth() + 1;
let year = todayDate.getFullYear();
let day = todayDate.getDay();

let getday = ["Sun", "Mon", "Tue", "Wed", "Thru", "Fri", "Sat"];

let str = getday[day] + ", " + date + "/" + month + "/" + year;

document.getElementById('date').innerHTML = str;