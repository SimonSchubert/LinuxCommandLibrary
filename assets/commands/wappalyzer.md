# TAGLINE

Identify technologies used on websites

# TLDR

**Scan a single URL**

```wappalyzer -i https://example.com```

**Scan URLs from file** with 3 workers

```wappalyzer -i [urls.txt] -w [3]```

**Export results to JSON**

```wappalyzer -i https://example.com -oJ [results.json]```

**Fast HTTP-only scan**

```wappalyzer -i https://example.com --scan-type fast```

**Scan with authentication** cookies

```wappalyzer -i https://example.com -c "[sessionid=abc123]"```

**Using webanalyze (Go version)**

```webanalyze -host https://example.com```

**Update technology fingerprints**

```webanalyze -update```

**Scan multiple hosts from file**

```webanalyze -hosts [urls.txt] -output json```

# SYNOPSIS

**wappalyzer** [_options_] -i _url_|_file_

**webanalyze** [_options_]

# PARAMETERS (wappalyzer)

**-i** _url_|_file_
> Input URL or file with URLs, one per line.

**--scan-type** _type_
> Scan type: fast (one HTTP request), balanced (more HTTP requests), or full (browser with the Wappalyzer extension, default).

**-w, --workers** _num_
> Concurrent workers (default: 5; full scans are capped at 3).

**-t, --timeout** _seconds_
> Maximum seconds to wait for a page load in full scans (default: 30).

**-oJ** [_file_]
> Output JSON to file, or stdout if omitted.

**-oC** [_file_]
> Output CSV to file, or stdout if omitted.

**-oH** [_file_]
> Output HTML to file, or stdout if omitted.

**-c, --cookie** _string_
> Cookie header for authenticated scans.

# PARAMETERS (webanalyze)

**-host** _url_
> Single host to analyze.

**-hosts** _file_
> File containing hosts, one per line.

**-output** _format_
> Output format: stdout, csv, json.

**-update**
> Update technology fingerprints.

**-apps** _file_
> Technology definition file (default: technologies.json).

**-crawl** _num_
> Links to follow from the root page.

**-header** _header_
> Custom HTTP request header, repeatable.

**-redirect**
> Follow HTTP redirects.

**-silent**
> Avoid printing the header.

**-worker** _num_
> Number of workers (default: 4).

# DESCRIPTION

**wappalyzer** identifies technologies used on websites including CMS platforms, JavaScript frameworks, analytics tools, and server software. It uses pattern matching against HTML, headers, cookies, and JavaScript variables.

Multiple CLI implementations exist: wappalyzer-next (the Python **wappalyzer** package, which runs the Wappalyzer browser extension in Chromium), webanalyze (Go-based, standalone), and wappybird (multithreaded). They use fingerprints from the Wappalyzer project or community forks of it.

The tools are useful for security assessments, competitive analysis, and technology inventory. They can process single URLs or batch scan from files.

# CAVEATS

Full scans with the Python version need Chromium installed through Playwright (**python -m playwright install chromium**); the fast and balanced modes skip the browser but are less accurate. webanalyze needs a local fingerprint file, downloaded with **-update**. Dynamic content may require browser-based scanning. Rate limiting may apply to bulk scanning.

# HISTORY

**Wappalyzer** started as a browser extension for identifying web technologies. Various CLI tools emerged to enable automation and integration. After the official project stopped open-sourcing fingerprints, community forks maintain updated detection patterns, and webanalyze now loads its definitions from such a fork.

# SEE ALSO

[whatweb](/man/whatweb)(1), [httpie](/man/httpie)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/s0md3v/wappalyzer-next)```

```[Homepage](https://www.wappalyzer.com/)```

<!-- verified: 2026-11-09 -->
