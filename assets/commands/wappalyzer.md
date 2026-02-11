# TAGLINE

Identify technologies used on websites

# TLDR

**Scan a single URL**

```wappalyzer -i [https://example.com]```

**Scan URLs from file**

```wappalyzer -i [urls.txt] -t [10]```

**Export results to JSON**

```wappalyzer -i [https://example.com] -oJ [results.json]```

**Using webanalyze (Go version)**

```webanalyze -host [https://example.com]```

**Update technology fingerprints**

```webanalyze -update```

**Scan multiple hosts from file**

```webanalyze -hosts [urls.txt] -output json```

# SYNOPSIS

**wappalyzer** [_options_] -i _url_|_file_

**webanalyze** [_options_]

# PARAMETERS (wappalyzer)

**-i** _url_|_file_
> Input URL or file with URLs.

**-t** _num_
> Number of threads.

**-oJ** _file_
> Output JSON to file.

**-oC** _file_
> Output CSV to file.

# PARAMETERS (webanalyze)

**-host** _url_
> Single host to analyze.

**-hosts** _file_
> File containing hosts.

**-output** _format_
> Output format: stdout, csv, json.

**-update**
> Update technology fingerprints.

**-worker** _num_
> Number of workers.

# DESCRIPTION

**wappalyzer** identifies technologies used on websites including CMS platforms, JavaScript frameworks, analytics tools, and server software. It uses pattern matching against HTML, headers, cookies, and JavaScript variables.

Multiple CLI implementations exist: the Python wappalyzer package (requires Firefox/geckodriver), webanalyze (Go-based, standalone), and wappybird (multithreaded). All use fingerprints from the Wappalyzer project.

The tools are useful for security assessments, competitive analysis, and technology inventory. They can process single URLs or batch scan from files.

# CAVEATS

Python version requires Firefox and geckodriver. Fingerprints need periodic updates. Dynamic content may require browser-based scanning. Rate limiting may apply to bulk scanning.

# HISTORY

**Wappalyzer** started as a browser extension for identifying web technologies. Various CLI tools emerged to enable automation and integration. After the official project stopped open-sourcing fingerprints, community forks maintain updated detection patterns.

# SEE ALSO

[whatweb](/man/whatweb)(1), [httpie](/man/httpie)(1), [curl](/man/curl)(1)
