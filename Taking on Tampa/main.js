//Weather API

 let tampaWeather = {};

 //send a GET request to this endppint to get Tampa weather
 let weatherApiURL = 'http://api.openweathermap.org/data/2.5/weather?q=Tampa,us&units=imperial&APPID=859d47520ac736ebe8bbce1fef74269c';

 function getTampaWeather() {
     fetch(weatherApiURL).then((response) => {return response.json();
    }).then((data) => {
        tampaWeather = data;
        console.log('The Temperature is: '+data.main.temp+' degrees');
        updateWeather();
        updateWeather2();
        updateWeather3();
    });
 }
    function updateWeather() {
        let newPara = document.createElement("p")
        newPara.innerText = 'Current Temperature: '+tampaWeather.main.temp+'°';
        //add new p element as a child of weatherDiv
        document.getElementById("weatherDiv").appendChild(newPara);
}
    function updateWeather2() {
        let newPara = document.createElement("p")
        newPara.innerText = 'Current Humidty: '+tampaWeather.main.humidity+'%';
        //add new p element as a child of humidityDiv
        document.getElementById("humidityDiv").appendChild(newPara);
}
    function updateWeather3() {
        let newPara = document.createElement("p")
        newPara.innerText = 'Wind Speed: '+tampaWeather.wind.speed+' MPH';
        //add new p element as a child of humidityDiv
        document.getElementById("currentDiv").appendChild(newPara);
}

window.onload=function(){
    getTampaWeather();
}

