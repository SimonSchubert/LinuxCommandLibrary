# TAGLINE

Discover hidden HTTP parameters in web applications

# TLDR

**Find GET parameters** for a URL

```arjun -u [https://example.com/page]```

**Find POST parameters**

```arjun -u [https://example.com/api] -m POST```

**Scan with a custom wordlist**

```arjun -u [https://example.com] -w [path/to/wordlist.txt]```

**Scan multiple URLs** from a file

```arjun -i [urls.txt]```

**Use JSON body** for POST requests

```arjun -u [https://example.com/api] -m POST --json```

**Set custom headers**

```arjun -u [https://example.com] --headers "[Cookie: session=abc]"```

**Output results** to a file

```arjun -u [https://example.com] -o [results.txt]```

**Set number of threads**

```arjun -u [https://example.com] -t [20]```

# SYNOPSIS

**arjun** [_-u url_] [_-i file_] [_-m method_] [_-w wordlist_] [_-o output_] [_-t threads_] [_options_]

# PARAMETERS

**-u**, **--url** _url_
> Target URL to scan for parameters.

**-i**, **--input** _file_
> File containing URLs to scan (one per line).

**-m**, **--method** _method_
> HTTP method to use (GET, POST, PUT, DELETE, PATCH). Default: GET.

**-w**, **--wordlist** _file_
> Custom wordlist for parameter names.

**-o**, **--output** _file_
> Save results to file.

**-t**, **--threads** _n_
> Number of concurrent threads (default: 2).

**--json**
> Send POST data as JSON instead of form data.

**--headers** _headers_
> Custom headers in format "Header: value".

**--passive**
> Use passive sources to find parameters.

**--stable**
> Use more reliable but slower detection.

**-d**, **--delay** _seconds_
> Delay between requests.

**--include** _params_
> Parameters to always include in requests.

**--timeout** _seconds_
> Request timeout.

**-q**, **--quiet**
> Suppress output except results.

# DESCRIPTION

**Arjun** is a parameter discovery tool designed for web application security testing. It identifies hidden or undocumented HTTP parameters by sending crafted requests and analyzing responses for differences that indicate valid parameters.

The tool uses a combination of techniques to detect parameters: it monitors response length, status codes, and content changes when different parameter names are submitted. This allows it to find parameters that trigger distinct server behavior, even when the application doesn't explicitly advertise them.

Arjun includes a built-in wordlist of common parameter names but supports custom wordlists for targeted testing. It can discover parameters in GET requests (query strings), POST form data, and JSON bodies. The passive mode queries external sources like web archives and search engines for known parameters.

The tool is commonly used in penetration testing and bug bounty hunting to find attack surface that might be missed during initial reconnaissance. Parameters discovered may reveal hidden functionality, debug modes, or additional attack vectors.

# CAVEATS

Should only be used on applications you have permission to test. High thread counts or no delay may trigger rate limiting or WAF blocks. Detection is heuristic-based and may produce false positives/negatives. Large wordlists significantly increase scan time.

# HISTORY

**Arjun** was created by Somdev Sangwan (s0md3v) and released as an open-source security tool. It gained popularity in the bug bounty and penetration testing community for its effectiveness at finding hidden parameters. The tool is written in Python and actively maintained with updates for new detection techniques.

# SEE ALSO

[ffuf](/man/ffuf)(1), [wfuzz](/man/wfuzz)(1), [burpsuite](/man/burpsuite)(1), [httpx](/man/httpx)(1), [paramspider](/man/paramspider)(1)
