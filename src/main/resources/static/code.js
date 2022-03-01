let list = document.querySelector("ul")

//Getting list of blogs when opening the webpage
getBlogs()

//Form button action.
document.querySelector("button")
.addEventListener("click", e =>{
    e.preventDefault()

    //Creating blog object from the form information
    let blog = {
        author: document.getElementById("auth").value,
        message: document.getElementById("msg").value
    }

    //Posting the object as JSON to server
    //After posting getting the updated list of blogs from the server
    fetch("http://localhost:8080/addblog",
        {
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify(blog)
        })
        .then(resp => getBlogs())
})


//Function for getting all the blogs
function getBlogs()
{
    //Empty the list in webpage
    list.innerHTML = ""

    //Fetch all the blogs from the server
    fetch("http://localhost:8080/blogs")
    .then(response => response.json())
    .then( data =>
    {
        //Create list item of each blog object
        data.forEach(i => {
            let li = document.createElement("li")
            li.innerText = i.message
            list.appendChild(li)
        })
    })
}

