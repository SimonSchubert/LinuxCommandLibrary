# TAGLINE

Python web scraping and crawling framework

# TLDR

**Create new project**

```scrapy startproject [project_name]```

**Generate spider**

```scrapy genspider [spider_name] [domain.com]```

**Run spider**

```scrapy crawl [spider_name]```

**Run spider and save to file**

```scrapy crawl [spider_name] -o [output.json]```

**Interactive shell for testing**

```scrapy shell "[https://example.com]"```

**Check spider contracts**

```scrapy check [spider_name]```

**List available spiders**

```scrapy list```

**Fetch URL and show response**

```scrapy fetch [https://example.com]```

# SYNOPSIS

**scrapy** _command_ [_-o output_] [_-s setting=value_] [_options_] [_arguments_]

# PARAMETERS

**startproject** _NAME_
> Create new Scrapy project.

**genspider** _NAME_ _DOMAIN_
> Generate spider from template.

**crawl** _SPIDER_
> Run a spider.

**shell** [_URL_]
> Interactive shell for testing.

**list**
> List available spiders.

**check** [_SPIDER_]
> Run contract checks.

**fetch** _URL_
> Fetch URL and print.

**view** _URL_
> Open URL in browser.

**parse** _URL_
> Parse URL with spider.

**runspider** _FILE_
> Run spider from file.

**-o** _FILE_, **--output** _FILE_
> Output file (json, csv, xml).

**-s** _SETTING=VALUE_
> Override setting.

**-a** _NAME=VALUE_
> Spider argument.

**-t** _FORMAT_, **--output-format** _FORMAT_
> Output format.

**--nolog**
> Disable logging.

**--loglevel** _LEVEL_
> Log level: DEBUG, INFO, WARNING.

# DESCRIPTION

**Scrapy** is a Python framework for web scraping and crawling. It handles requests, parsing, and data extraction with built-in support for following links, handling cookies, and respecting robots.txt.

Projects contain spiders - classes that define how to scrape sites. Spiders specify start URLs, parse response with CSS/XPath selectors, and yield items or further requests.

The shell command provides interactive testing. You can experiment with selectors on live pages before writing spider code. Response object methods match spider context.

Items define the data structure being scraped. Item pipelines process scraped data: validation, cleaning, storage to databases or files. Multiple output formats are supported.

Middleware handles request/response processing: user agents, proxies, retries, cookies. Settings control behavior: concurrency, delays, download timeouts, and more.

Extensions add functionality: stats collection, throttling, autothrottle, and custom callbacks.

# CAVEATS

JavaScript-rendered content requires Splash or Selenium integration. Some sites block scrapers via rate limiting or CAPTCHAs. Aggressive scraping may violate ToS. Robots.txt should be respected. Debug shell doesn't persist state.

# HISTORY

**Scrapy** was created by **Pablo Hoffman** and **Shane Evans** at Insophia around **2008**. It grew from internal tools to a general-purpose framework. The project became one of the most popular Python scraping tools, with commercial company Scrapinghub (now Zyte) providing support and services.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [beautifulsoup](/man/beautifulsoup)(1), [playwright](/man/playwright)(1)
