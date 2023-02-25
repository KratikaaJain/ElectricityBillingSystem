let date1 = new Date();
console.log(date1);

setInterval(displayTime, 1000);

function displayTime() {
    let date = new Date();
    let hours = date.getHours();
    let min = date.getMinutes();
    let sec = date.getSeconds();
    let am_pm = 'AM';

    am_pm = (hours < 12) ? 'AM' : 'PM';
    hours = (hours > 12) ? hours - 12 : hours;
    hours = (hours == 0) ? 12 : hours;


    hours = (hours < 10) ? "0" + hours : hours;
    min = (min < 10) ? "0" + min : min;
    sec = (sec < 10) ? "0" + sec : sec;


    let todayDate = hours + " : " + min + " : " + sec + " " + am_pm;
    let time = document.getElementById('clock');
    time.innerHTML = `<p>${todayDate}</p>`;
    // console.log(todayDate);
}


displayTime();
