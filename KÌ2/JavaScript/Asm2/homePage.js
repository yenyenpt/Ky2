

features = [
    {
        id:1,
        title: "Designing Dashboards",
        image:"https://i.ibb.co/xLx7N0L/image1.png",
        year: 2022,
        desc: "Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet."
    },
    {
        id:2,
        title: "Vibrant Portraits of 2020",
        image:"https://i.ibb.co/xzNVNc7/image2.png",
        year: 2022,
        desc: "Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet."
    },
    {
        id:3,
        title: "36 Days of Malayalam type",
        image:"https://i.ibb.co/Zz0jk3v/image3.png",
        year: 2021,
        desc: "Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet."
    }
]
const id = Number(new URLSearchParams(window.location.search).get('id'));
var featureDiv = document.querySelector(".box2");
var chiTietHp = document.querySelector(".chiTietHp");
for(var i of features){
    if(featureDiv){
        featureDiv.innerHTML += `
        <img src="${i.image}" alt="">
        <a src="" href="/chiTietHp.html?id=${i.id}" >${i.title}</a>
        <div class="box3">${i.year}</div>
        <p>${i.desc}</p>
         <br>
        `
    }
    if(chiTietHp){
        
        if(id===i.id){
            chiTietHp.innerHTML=`<img src="${i.image}" alt="">
                <h4>${i.title}</h4>
                <div class="box3">${i.year}</div>
                <p>${i.desc}</p>
                 <br>`
        }
    }
}
