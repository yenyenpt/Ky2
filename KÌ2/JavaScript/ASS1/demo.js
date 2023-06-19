features = [
    {
        id:1,
        username:"thienth",
        password:"thiendeptrai"
    },
    {
        id:2,
        username:"minhdq",
        password:"minhdiachu"
    },
    {
        id:3,
        username:"tiennh",
        password:"tiencute"
    }
]

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
var featuresBox = document.querySelector(".features");
for (var con1 of features){
    featuresBox.innerHTML += `
    <img src="${con1.image}" alt=""><br>
  
        <div class="con1">
            <a>${con1.title}</a><br>
            <button>${con1.year}</button><br>
            <p>${con1.desc}</p>
        </div>
    `
}
