// Declaration
var userForm = document.querySelector("#user-form");
var btnSubmit = document.querySelector("#btn-submit");
var userTable = document.querySelector("#user-table");

// Cách 2 get value
// var username = document.getElementById("username");
// var email = document.getElementById("email");
// var phone = document.getElementById("phone");
var formField = ["username", "email", "phone"];

var users = [];
btnSubmit.onclick = function (event) {
  event.preventDefault();
  // Remove hidden
  var errors = document.querySelectorAll(".error");
  errors.forEach(function (e) {
    e.classList.add("hidden");
  });
  // Validate
  formField.forEach(function (field) {
    var element = document.getElementById(field);
    var reg = /([\w]+)(@)([\w\.]+)/;
    if (field === "phone") {
      if (element.value.trim().length < 10) {
        showError(element, "Sai định dạng số điện thoại");
      }
    }
    if (field === "email") {
      if (reg.test(element.value.trim()) === false) {
        showError(element, "Sai định dạng email");
      }
    }
    if (element.value.trim() === "") {
      showError(element, "Trường dữ liệu bắt buộc");
    }
  });

  // users.push(user);
  // render();
};

function showError(element, message) {
  var temp = element.nextElementSibling;
  temp.innerHTML = message;
  temp.classList.remove("hidden");
}

function render() {
  var content = "";
  for (var i = 0; i < users.length; i++) {
    content += `
    <tr>
      <td>${i + 1}</td>
      <td>${users[i].name}</td>
      <td>${users[i].email}</td>
      <td>${users[i].phone}</td>
      <td>
        <button>X</button>
      </td>
    </tr>
    `;
  }
  userTable.innerHTML = content;
}
