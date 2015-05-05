function keyDownMenu(e, num) {
    console.log("test1 >> " + e.innerHTML);
    var ui = document.getElementById('myUi');
    var li = ui.getElementsByTagName("li")[num];
    // li.setAttribute("class", "active"));
    console.log("test2 >> " + li.getAttribute("class"));

    if(e.innerHTML == "Admin") {
    	li.setAttribute("class", "active");
    	console.log(" >>>> ");
    } else if(e.innerHTML == "Employee") {
    	console.log("Employee");
    } else {
    	console.log("ELSE");
    }
    return false;
}
