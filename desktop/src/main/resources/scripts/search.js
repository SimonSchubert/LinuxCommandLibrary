var input, filter, ul, li, a, i, headers, value, index, lastSearch = "";

window.onload = (event) => {
    input = document.getElementById('search');
    ul = document.getElementById("commandlist");
    li = ul.getElementsByTagName('a');
    headers = ul.getElementsByTagName('div');
};

document.addEventListener('keyup', (e) => {
  if (e.keyCode == 38) {
        focusPreviousTabStop();
  } else if (e.keyCode == 40) {
        focusNextTabStop();
  }
});

function getVisibleTabs() {
    var universe = document.querySelectorAll('#commandlist a');
    return Array.prototype.filter.call(universe, function(item) {return item.parentNode.style.display !== "none"});
}

function focusNextTabStop() {
    var tabs = getVisibleTabs();
    var index = tabs.indexOf(document.activeElement);
    return (tabs[index + 1] || tabs[0]).focus();
}

function focusPreviousTabStop() {
    var tabs = getVisibleTabs();
    var index = tabs.indexOf(document.activeElement);
    if(index == 0) {
        input.focus();
    } else {
        (tabs[index - 1] || tabs[0]).focus();
    }
}

function search(){
  return Promise.resolve()
  .then(function() {
    setTimeout(function() {
        filter = input.value.toLowerCase();
        if(lastSearch === filter) {
            return
        }
        if(lastSearch === "") {
            for (i = 0; i < headers.length; i++) {
                headers[i].style.display = "none";
            }
        }
        if(filter === "") {
            for (i = 0; i < headers.length; i++) {
                headers[i].style.display = "";
            }
        }
        lastSearch = filter;
        var numberOfResults = 0;
        for (i = 0; i < li.length; i++) {
            value = li[i].getAttribute('data-c');
            index = value.indexOf(filter);
            if (index > -1) {
                value = value.substring(0, index) + "<span class='highlight'>" + value.substring(index, index + filter.length) + "</span>" + value.substring(index + filter.length);
                li[i].innerHTML = value;
                numberOfResults++;
                li[i].style.display = "";
            } else {
                li[i].style.display = "none";
            }
        }

        var noresults = document.getElementById("no-results");
        if(numberOfResults == 0) {
            noresults.innerHTML = "No commands found for '" + filter + "'";
            noresults.style.display = "block";
            ul.style.display = "none";
        } else {
            noresults.style.display = "none";
            ul.style.display = "block";
        }
    }, 0);
  });
}