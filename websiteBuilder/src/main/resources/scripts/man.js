var accordionButtons = document.getElementsByClassName("accordion-button");
var toggleAllButton = document.getElementsByClassName("toggle-all-button")[0];

function togglePanel(param) {
	param.classList.toggle("active");
	updatePanel(param);

	if (allCollapsed()) {
		toggleAllButton.classList.remove("active");
		toggleAllButton.classList.add("active");
		toggleAllButton.innerText = "EXPAND ALL";
	} else if (isAnyExpanded()) {
		toggleAllButton.classList.remove("active");
		toggleAllButton.innerText = "COLLAPSE ALL";
	}
}

function toggleAll(param) {
	param.classList.toggle("active");

	if (param.classList.contains("active")) {
		param.innerText = "EXPAND ALL";
		updateList(true);
	} else {
		param.innerText = "COLLAPSE ALL";
		updateList(false);
	}
}

function updateList(collapse) {
	for (var i = 0; i < accordionButtons.length; i++) {
		accordionButtons[i].classList.remove("active");
		if (!collapse) {
			accordionButtons[i].classList.add("active");
		}
		updatePanel(accordionButtons[i]);
	}
}

function updatePanel(button) {
	var panel = button.nextElementSibling;
	if (button.classList.contains("active")) {
		panel.style.display = "flow-root";
	} else {
		panel.style.display = "none";
	}
}

function isAnyExpanded() {
	for (var i = 0; i < accordionButtons.length; i++) {
		if (accordionButtons[i].classList.contains("active")) {
			return true;
		}
	}
	return false;
}

function allCollapsed() {
	for (var i = 0; i < accordionButtons.length; i++) {
		if (accordionButtons[i].classList.contains("active")) {
			return false;
		}
	}
	return true;
}