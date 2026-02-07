# TAGLINE

fast recursive web content discovery tool

# TLDR

**Scan a URL** for directories and files

```feroxbuster --url [https://example.com]```

**Use a custom wordlist**

```feroxbuster --url [https://example.com] --wordlist [path/to/wordlist.txt]```

**Scan with specific extensions**

```feroxbuster --url [https://example.com] --extensions [php,html,txt]```

**Scan recursively** to a specific depth

```feroxbuster --url [https://example.com] --depth [3]```

**Scan with multiple threads**

```feroxbuster --url [https://example.com] --threads [100]```

**Filter out specific status codes**

```feroxbuster --url [https://example.com] --filter-status [404,403]```

**Output results to a file**

```feroxbuster --url [https://example.com] --output [results.txt]```

**Scan through a proxy**

```feroxbuster --url [https://example.com] --proxy [http://127.0.0.1:8080]```

# SYNOPSIS

**feroxbuster** [_-u url_] [_-w wordlist_] [_-x extensions_] [_-t threads_] [_-d depth_] [_-o output_] [_options_]

# PARAMETERS

**-u**, **--url** _url_
> Target URL to scan.

**-w**, **--wordlist** _file_
> Wordlist to use (default: built-in seclists).

**-x**, **--extensions** _ext_
> File extensions to check (comma-separated).

**-t**, **--threads** _n_
> Number of concurrent threads (default: 50).

**-d**, **--depth** _n_
> Maximum recursion depth (default: 4, 0 for infinite).

**-o**, **--output** _file_
> Output file for results.

**-n**, **--no-recursion**
> Disable recursive scanning.

**-f**, **--add-slash**
> Append / to each request.

**-C**, **--filter-status** _codes_
> Filter out specific HTTP status codes.

**-S**, **--filter-size** _size_
> Filter out responses of specific size.

**-W**, **--filter-words** _count_
> Filter out responses with specific word count.

**-L**, **--filter-lines** _count_
> Filter out responses with specific line count.

**--proxy** _url_
> Proxy to use for requests.

**-H**, **--headers** _header_
> Custom headers (can be used multiple times).

**-k**, **--insecure**
> Disable TLS certificate verification.

**-q**, **--quiet**
> Minimal output.

**--json**
> Output in JSON format.

# DESCRIPTION

**feroxbuster** is a fast, recursive content discovery tool written in Rust. It brute-forces directories and files on web servers by sending HTTP requests from a wordlist, identifying hidden resources through response analysis.

Speed is a key feature: Rust's performance combined with asynchronous requests enables scanning thousands of paths per second. The tool supports recursive scanning, automatically continuing into discovered directories up to a configurable depth.

Advanced filtering options reduce false positives by hiding responses based on status code, response size, word count, line count, or regex patterns. This helps when servers return generic pages for non-existent paths.

The interactive mode provides real-time statistics and allows pausing, resuming, adding new URLs, and adjusting settings during the scan. Results are color-coded by status code for quick interpretation.

Feroxbuster integrates with tools like Burp Suite via proxy support and can save state to resume interrupted scans. Output formats include plain text, JSON, and formats compatible with other security tools.

# CAVEATS

Only use on systems you have permission to test. High thread counts may trigger rate limiting or IP bans. Large wordlists with recursion can generate enormous traffic. Some WAFs detect and block the tool's patterns.

# HISTORY

**feroxbuster** was created by Ben "epi" Risher, with the first release around **2020**. The name combines "ferox" (Latin for fierce/wild) with "buster." Written in Rust for performance, it quickly gained popularity as a modern alternative to tools like dirb, gobuster, and dirsearch.

# SEE ALSO

[gobuster](/man/gobuster)(1), [dirsearch](/man/dirsearch)(1), [ffuf](/man/ffuf)(1), [dirb](/man/dirb)(1)
