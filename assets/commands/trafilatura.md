# TAGLINE

Extract main text content from web pages

# TLDR

**Extract text from URL**

```trafilatura -u [https://example.com]```

**Extract from local HTML file**

```trafilatura -i [page.html]```

**Output as JSON with metadata**

```trafilatura -u [https://example.com] --json --with-metadata```

**Extract without comments or tables**

```trafilatura -u [https://example.com] --no-comments --no-tables```

**Batch process URLs from a file to output directory**

```trafilatura -i [urls.txt] -o [output_dir]```

**Favor precision over recall**

```trafilatura -u [https://example.com] --precision```

# SYNOPSIS

**trafilatura** [_-u url_] [_-i file_] [_options_]

# PARAMETERS

**-u, --URL** _URL_
> Fetch and process a URL.

**-i, --input-file** _FILE_
> Input file (HTML file or list of URLs for batch processing).

**-o, --output-dir** _DIR_
> Write results to specified directory.

**--output-format** _FORMAT_
> Output format: txt, csv, json, html, markdown, xml, xmltei.

**--json**
> JSON output shorthand.

**--xml**
> XML output shorthand.

**--csv**
> CSV output shorthand.

**--no-comments**
> Exclude comments from extraction.

**--no-tables**
> Exclude table elements from extraction.

**--with-metadata**
> Extract and include metadata in output.

**--precision**
> Favor extraction precision (less noise, less text).

**--recall**
> Favor extraction recall (more text, possibly more noise).

**-f, --fast**
> Fast extraction without fallback detection.

**--formatting**
> Include text formatting (bold, italic, etc.).

**--links**
> Include links with targets in output.

**--deduplicate**
> Filter out duplicate documents and sections.

**--feed** [_URL_]
> Look for feeds or pass feed URL as input.

**--sitemap** [_URL_]
> Look for sitemaps or enter sitemap URL.

**--parallel** _N_
> Number of cores/threads for downloads and processing.

# DESCRIPTION

**trafilatura** extracts the main text content from web pages, automatically removing navigation, ads, headers, footers, and other boilerplate elements. It can fetch pages from URLs directly or process local HTML files.

Output is available in plain text, CSV, JSON, HTML, Markdown, XML, or XML-TEI formats. The tool also extracts metadata such as publication dates, authors, and page titles. Batch processing handles multiple URLs from a list file, making it suitable for web scraping and corpus building. Link discovery via feeds, sitemaps, and crawling is built in.

# CAVEATS

Python required. Extraction quality varies by site structure. Network access needed for URL fetching.

# HISTORY

**trafilatura** was created by **Adrien Barbaresi** as an academic project for web scraping and text extraction, written in **Python**.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [scrapy](/man/scrapy)(1), [lynx](/man/lynx)(1)
