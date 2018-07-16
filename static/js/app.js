document.getElementById('btn1').addEventListener("click", doStuff);

function doStuff() {
    location.href='http://cnn.com';
}
const commentList = document.querySelector('.commentList')
// Create event listener
commentList.addEventListener('click', removeComment)

function removeComment(event) {
if (event.target.commentList.contains('delete')) {
	// select delete button
	const deleteButton = event.target
	
	// traverse to city container
	const commentContainer = deleteButton.parentElement
	
	// get 'href' attribute from link
	const hrefArray = commentContainer.querySelector('a').getAttribute('href').split("/")
	const naname = hrefArray[2]
	
	
	// set up action for response
	const xhr = new XMLHttpRequest()
	// repopulate list with existing cities (pass response as a parameter)
	xhr.onreadystatechange = function(response) {
		if(xhr.readyState == 4 && xhr.status == 200) {
			const remainingComments = JSON.parse(response.currentTarget.response);
			let list = ''
			remainingComments.forEach(function(comment) {
				// `abbreviation` and `cityId` reference lines 16 & 17
				list += `
					<li>
						<a href="/reviews/${comment}/comment/${comment.name}">
							${comment.name}
						</a>
						<!-- Create a .delete button -->
						<button class="delete">Remove</button>
					</li>
				`
			})
			commentList.innerHTML = list
		}
	}
	
	// send request to server
	xhr.open("DELETE", `/api/review/${review.comments}/comments?name=${comment}`, true)
	xhr.send()
	
}
}







    
