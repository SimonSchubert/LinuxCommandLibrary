# TLDR

**Crawl a URL**

```katana -u [https://example.com]```

**Crawl with headless browser**

```katana -u [https://example.com] -headless```

**Crawl multiple URLs from file**

```katana -list [urls.txt]```

**Set crawl depth**

```katana -u [https://example.com] -depth [3]```

**Output to file**

```katana -u [https://example.com] -o [output.txt]```

**Enable JavaScript parsing**

```katana -u [https://example.com] -js-crawl```

# SYNOPSIS

**katana** [_options_]

# PARAMETERS

**-u** _url_
> Target URL to crawl.

**-list** _file_
> File containing URLs to crawl.

**-headless**
> Use headless browser for crawling.

**-depth** _int_
> Maximum crawl depth.

**-js-crawl**
> Enable JavaScript file crawling.

**-o** _file_
> Output file for results.

**-json**
> Output in JSON format.

**-silent**
> Silent mode, minimal output.

# DESCRIPTION

**katana** is a next-generation web crawling and spidering framework by ProjectDiscovery. It supports both standard and headless browser crawling modes, making it effective for JavaScript-heavy applications. Designed for security research and reconnaissance.

# SEE ALSO

[httpx](/man/httpx)(1), [nuclei](/man/nuclei)(1), [subfinder](/man/subfinder)(1)

