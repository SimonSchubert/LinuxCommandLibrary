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

**trafilatura** extracts web content. It gets main text.

Boilerplate removal. Just the content.

Multiple formats. Text, XML, JSON.

Metadata extraction. Dates, authors.

Language detection. Multilingual.

# CAVEATS

Python required. Extraction varies by site. Network access needed.

# HISTORY

**trafilatura** was created for web scraping and text extraction, removing boilerplate from web pages.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [lynx](/man/lynx)(1)
