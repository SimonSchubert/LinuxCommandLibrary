# TLDR

**Scan a URL** with default wordlist

```dirsearch -u [https://example.com]```

**Use a custom wordlist**

```dirsearch -u [https://example.com] -w [path/to/wordlist.txt]```

**Scan with specific extensions**

```dirsearch -u [https://example.com] -e [php,html,js]```

**Scan multiple URLs** from a file

```dirsearch -l [urls.txt]```

**Set number of threads**

```dirsearch -u [https://example.com] -t [50]```

**Output results to a file**

```dirsearch -u [https://example.com] -o [results.txt]```

**Exclude specific status codes**

```dirsearch -u [https://example.com] -x [403,404,500]```

**Scan with recursive** directory discovery

```dirsearch -u [https://example.com] -r```

# SYNOPSIS

**dirsearch** [_-u url_] [_-l urllist_] [_-w wordlist_] [_-e extensions_] [_-t threads_] [_-o output_] [_options_]

# PARAMETERS

**-u**, **--url** _url_
> Target URL to scan.

**-l**, **--urls-file** _file_
> File containing list of URLs to scan.

**-w**, **--wordlist** _file_
> Custom wordlist(s) to use (comma-separated).

**-e**, **--extensions** _ext_
> Extensions to append (comma-separated, e.g., php,asp,js).

**-t**, **--threads** _n_
> Number of concurrent threads (default: 25).

**-r**, **--recursive**
> Enable recursive scanning.

**-R**, **--max-recursion-depth** _n_
> Maximum recursion depth.

**-x**, **--exclude-status** _codes_
> Exclude status codes from results.

**-i**, **--include-status** _codes_
> Include only these status codes.

**-o**, **--output** _file_
> Save results to file.

**--format** _type_
> Output format: plain, simple, json, xml, md, csv, html.

**-H**, **--header** _header_
> Custom header (can be used multiple times).

**--cookie** _cookie_
> Set cookies for requests.

**--user-agent** _ua_
> Custom User-Agent string.

**--random-agent**
> Use random User-Agent.

**-b**, **--follow-redirects**
> Follow HTTP redirects.

**--timeout** _seconds_
> Connection timeout.

**--proxy** _url_
> Use HTTP/SOCKS proxy.

**-q**, **--quiet**
> Quiet mode (minimal output).

# DESCRIPTION

**dirsearch** is a web content discovery tool that brute-forces directories and files on web servers. It sends HTTP requests for paths from a wordlist, identifying existing resources by analyzing server responses.

The tool is commonly used in penetration testing and security assessments to discover hidden content, backup files, admin panels, configuration files, and other resources not linked from the main application. It uses response status codes, content length, and other heuristics to determine validity.

Dirsearch includes built-in wordlists but supports custom lists for targeted scanning. Extensions can be specified to test multiple file types (e.g., checking for both /admin and /admin.php). The recursive mode continues scanning discovered directories.

Advanced features include proxy support, custom headers, authentication, rate limiting, and multiple output formats. The tool can filter results by status code, response size, or content patterns to reduce false positives.

# CAVEATS

Only use on systems you have permission to test. High thread counts may trigger rate limiting or get blocked. Some WAFs may block dirsearch's default patterns. Large wordlists significantly increase scan time. Recursive scanning can be very slow on large sites.

# HISTORY

**dirsearch** was created by Mauro Soria as a Python-based alternative to tools like DirBuster and gobuster. It has been actively maintained since **2014** and is widely used in the security community. The tool's ease of use and comprehensive features made it popular for web application security testing.

# SEE ALSO

[gobuster](/man/gobuster)(1), [ffuf](/man/ffuf)(1), [wfuzz](/man/wfuzz)(1), [nikto](/man/nikto)(1), [dirb](/man/dirb)(1)
