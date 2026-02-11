# TAGLINE

Extract main text content from web pages

# TLDR

**Extract text from URL**

```trafilatura -u [https://example.com]```

**Extract from file**

```trafilatura -i [page.html]```

**Output as XML**

```trafilatura -u [url] --xml```

**Include comments**

```trafilatura -u [url] --with-comments```

**Output as JSON**

```trafilatura -u [url] --json```

**Batch processing**

```trafilatura -i [urls.txt] --batch```

# SYNOPSIS

**trafilatura** [_-u url_] [_-i file_] [_--xml_] [_--json_] [_options_]

# PARAMETERS

**-u** _URL_
> Input URL.

**-i** _FILE_
> Input file.

**--xml**
> XML output.

**--json**
> JSON output.

**--with-comments**
> Include comments.

**--batch**
> Batch mode.

# DESCRIPTION

**trafilatura** extracts the main text content from web pages, automatically removing navigation, ads, headers, footers, and other boilerplate elements. It can fetch pages from URLs directly or process local HTML files.

Output is available in plain text, XML, or JSON formats. The tool also extracts metadata such as publication dates, authors, and page titles. Batch processing mode handles multiple URLs from a list file, making it suitable for web scraping and corpus building workflows.

# CAVEATS

Python required. Extraction varies by site. Network access needed.

# HISTORY

**trafilatura** was created for web scraping and text extraction, removing boilerplate from web pages.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [lynx](/man/lynx)(1)
