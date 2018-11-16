//let state = {
   // weather: ''
 //};
 
 //const apiUrl = 'http://api.openweathermap.org/data/2.5/weather?q=Tampa,us&units=imperial&APPID=859d47520ac736ebe8bbce1fef74269c';
 


 /*
 //long form of
 //function getJokeWithFetch(){...}
 let getJokeWithFetch = function() {
    n=0;
 for(i=0; i < 10; i++){
    fetch(apiUrl, {method: "GET", headers:{"Accept":"application/json"}})
    //define behavior for when the response returns
    .then((response) => {
        //return unwrapped promise object for the next chaining operation
        return response.json();
    })
        //utilize unwrapped promise a javascript object
    .then((data) => {
        state.weather = data.weather;
        updateContent();
    })
 let updateContent = function() {
    console.log(state);
    //select joke
    const weatherElement = document.getElementById(n);
    weatherElement.innerText = state.weather;
    n++;
 }
 }
 }
 document.getElementById('new-weather-button').addEventListener('click',getWeatherWithFetch);
 */

 //Weather API

 let tampaTemp = {};

 //send a GET request to this endppint to get Tampa weather
 let weatherApiURL = 'http://api.openweathermap.org/data/2.5/weather?q=Tampa,us&units=imperial&APPID=859d47520ac736ebe8bbce1fef74269c';

 function getTampaTemp() {
     fetch(weatherApiURL).then((response) => {return response.json();
    }).then((data) => {
        tampaTemp = data;
        console.log('The Temperature is: '+data.main.temp+' degrees');
        updateWeather();
    });
 }
    function updateWeather() {
        let newPara = document.createElement("p")
        newPara.innerText = 'Current Temperature: '+tampaWeather.main.temp+'°';
        //add new p element as a child of weatherDiv
        document.getElementById("tempDiv").appendChild(newPara);
}

window.onload=function(){
    getTampaTemp();
}


/* 
    This is what's going on under the hood

function getTampaWeatherWithAjax(url, func) {
    //first: OBtain XHR
    var xhr = new XMLHttpRequest();
    //second: defne onreadystatechange
    xhr.onreadystatechange = function(){
        if (this.readyState == 4 && this.status == 200) {
            func(this);
        }
    }
    //third: prepare request
    xhr.open("GET", url, true);
    //finally: send
    xhr.send();
}

function updateWeatherWithAjax(xhr) {
    //JSON.parse() will convert a JSON formatted string to a JavaScript object
    var res = JSON.parse(xhr.responseText);
    console.log(res);
    //can use this object just as you would with a javascript fetch method
}
*/

/*
 Fetch with POST requests
 first, get a token for Artsy api
*/

/* let artsyURL = 'http://api.artsy.net/api/';

let andryWarhold = {};

funcion getAndyWarhol(){
    fetch(apiUrl+'artists/andy-warhol', {method: "GET", headers:{"X-Xapp-Toen":artsy}})
}


function getArtsyToken() {
    let clientId = "41225acd0944bc290c11"
    let clientSecret = "b7d2cfe25c5c4c616e0ae6edf2007ae"
    fetch(artsyURL+'tokens/xapp_token?client_id='+clientId+'&client_secret='+clientSecret)
    //define behavior for when the response returns
    .then((response) => {
        //return unwrapped promise object for the next chaining operation

    })
    //utilize unwrapped promise a javascript object
.then((data) => {
    console.log(data);
    artsyToken = data.token;
})
    //what if there's a problem?
.catch( (error) => {
    alert(Oh no :(''))
})

}
*/