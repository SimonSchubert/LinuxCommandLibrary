var timeout;

function copy(text) {
	var inp = document.createElement('input');
	document.body.appendChild(inp);
	inp.value = unEscapeHtml(text);
	inp.select();
	document.execCommand('copy', false);
	inp.remove();

	clearTimeout(timeout);
	hide();
	timeout = setTimeout(function() {
		hide();
	}, 1500);
	setTimeout(function() {
		show();
	}, 100);
}

function show() {
	var element = document.getElementsByClassName("tooltip")[0];
	element.classList.remove("hidden");
	element.classList.add("visible");
}

function hide() {
	var element = document.getElementsByClassName("tooltip")[0];
	element.classList.remove("visible");
	element.classList.add("hidden");
}

function unEscapeHtml(unsafe) {
	return unsafe
		.replace(/&amp;/g, "&")
		.replace(/&lt;/g, "<")
		.replace(/&gt;/g, ">")
		.replace(/&quot;/g, "\"")
		.replace(/&#039;/g, "'")
		.replace(/&#47;/g, "index.html")
		.replace(/\\/g, "\\\\");
}