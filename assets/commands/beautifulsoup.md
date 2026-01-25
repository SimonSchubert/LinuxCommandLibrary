# TLDR

**Parse HTML and find all links**

```python3 -c "from bs4 import BeautifulSoup; import requests; print([a['href'] for a in BeautifulSoup(requests.get('[url]').text, 'html.parser').find_all('a', href=True)])"```

**Extract text from HTML file**

```python3 -c "from bs4 import BeautifulSoup; print(BeautifulSoup(open('[file.html]'), 'html.parser').get_text())"```

**Find elements by CSS class**

```python3 -c "from bs4 import BeautifulSoup; soup=BeautifulSoup(open('[file.html]'), 'html.parser'); print(soup.find_all(class_='[classname]'))"```

**Find element by ID**

```python3 -c "from bs4 import BeautifulSoup; soup=BeautifulSoup(open('[file.html]'), 'html.parser'); print(soup.find(id='[element_id]'))"```

**Select elements with CSS selector**

```python3 -c "from bs4 import BeautifulSoup; soup=BeautifulSoup(open('[file.html]'), 'html.parser'); print(soup.select('[div.class > p]'))"```

**Pretty print parsed HTML**

```python3 -c "from bs4 import BeautifulSoup; print(BeautifulSoup(open('[file.html]'), 'html.parser').prettify())"```

# SYNOPSIS

```python3 -c "from bs4 import BeautifulSoup; ..."```

# COMMON METHODS

**BeautifulSoup(markup, parser)**
> Parse HTML/XML markup with specified parser.

**soup.find(name, attrs)**
> Find first matching element.

**soup.find_all(name, attrs)**
> Find all matching elements.

**soup.select(css_selector)**
> Find elements using CSS selectors.

**element.get_text()**
> Extract text content from element.

**element['attribute']**
> Access element attribute value.

**element.string**
> Get direct string content of element.

**soup.prettify()**
> Return formatted HTML string.

# PARSERS

**html.parser**
> Built-in Python parser (no extra dependencies).

**lxml**
> Fast C-based parser (requires lxml package).

**lxml-xml**
> XML parser using lxml.

**html5lib**
> Browser-like parsing (requires html5lib package).

# DESCRIPTION

**Beautiful Soup** is a Python library for parsing HTML and XML documents. While not a command-line tool itself, it is commonly used in Python one-liners and scripts for web scraping, data extraction, and HTML manipulation.

The library creates a parse tree from HTML documents, allowing navigation, search, and modification of the tree. It works with multiple parsers and handles malformed markup gracefully, making it ideal for scraping real-world websites.

Beautiful Soup provides Pythonic idioms for navigating the parse tree, including iteration, attribute access, and CSS selector support. Combined with requests for HTTP, it forms the foundation of most Python web scraping workflows.

# INSTALLATION

```pip install beautifulsoup4```

```pip install lxml```  (optional, for faster parsing)

```pip install html5lib```  (optional, for browser-like parsing)

# CAVEATS

Beautiful Soup is for parsing only; it doesn't fetch web pages (use requests or httpx). JavaScript-rendered content requires a browser automation tool like Selenium. The default html.parser is slower than lxml. Web scraping may violate website terms of service; always check robots.txt and rate-limit requests.

# HISTORY

Beautiful Soup was created by **Leonard Richardson** and first released in **2004**. Version 4 (bs4), released in **2012**, added support for multiple parsers and Python 3. The library became one of the most popular Python tools for web scraping, valued for its simple API and ability to handle poorly-formed HTML. It remains actively maintained and widely used.

# SEE ALSO

[scrapy](/man/scrapy)(1), [curl](/man/curl)(1), [wget](/man/wget)(1), [pup](/man/pup)(1)
