blogs = [
    {
        id:1,
        title:"UI Interactions of the week",
        image:"https://i.ibb.co/QnjbGTP/blog-img1.jpg",
        datetime:"12 Feb 2019",
        note:"Express, Handlebars",
        desc:"Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet."
    },
    {
        id:2,
        title:"UI Interactions of the week",
        image:"https://i.ibb.co/Kr2KSKs/blog-img2.jpg",
        datetime:"12 Feb 2019",
        note:"Express, Handlebars",
        desc:"Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet."
    },
    {
        id:3,
        title:"UI Interactions of the week",
        image:"https://i.ibb.co/mNWBJ8f/blog-img3.jpg",
        datetime:"12 Feb 2019",
        note:"Express, Handlebars",
        desc:"Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet."
    },
    {
        id:4,
        title:"UI Interactions of the week",
        image:"https://i.ibb.co/s3jytRw/blog-img4.jpg",
        datetime:"12 Feb 2019",
        note:"Express, Handlebars",
        desc:"Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet."
    }
]
const id = Number(new URLSearchParams(window.location.search).get('id'));
var blogDiv =document.querySelector(".box1");
var chiTiet =document.querySelector(".chiTiet");
for(var i of blogs){
    if(blogDiv){
        blogDiv.innerHTML += `
        <img src="${i.image}" alt="">
        <a href="/chiTiet.html?id=${i.id}">${i.title}</a>
        <div class="box2">
            ${i.datetime}  | <span>${i.note}</span>
        </div>
        <p>${i.desc}</p>`
    }
    if(chiTiet){
        if(id===i.id){
            chiTiet.innerHTML=`
            <img src="${i.image}" alt="">
            <h4>${i.title}</h4>
            <div class="box2">
                ${i.datetime}  | <span>${i.note}</span>
            </div>
            <p>${i.desc}</p>`
        }
    }
}