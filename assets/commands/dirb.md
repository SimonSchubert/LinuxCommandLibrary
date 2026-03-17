# TAGLINE

web directory brute-force scanner

# TLDR

**Scan a webserver using the default wordlist**

```dirb [https://example.org]```

**Scan using a custom wordlist**

```dirb [https://example.org] [path/to/wordlist.txt]```

**Scan non-recursively**

```dirb [https://example.org] -r```

**Scan with authentication**

```dirb [https://example.org] -u [admin:password]```

**Scan with specific file extensions**

```dirb [https://example.org] -X [.php,.html,.txt]```

**Save results to a file**

```dirb [https://example.org] -o [results.txt]```

# SYNOPSIS

**dirb** _url_ [_wordlist_file_] [_options_]

# DESCRIPTION

**dirb** is a web content scanner that discovers existing and hidden web objects by launching dictionary-based attacks against a web server and analyzing the responses.

It is commonly used in penetration testing to find unlinked content, backup files, configuration files, and administrative interfaces. DIRB ships with several built-in wordlists located in `/usr/share/dirb/wordlists/`.

# PARAMETERS

**-a** _agent_
> Custom User-Agent string.

**-b**
> Don't squash or merge sequences of /../ or /./ in the given URL.

**-c** _cookie_
> Set a cookie for HTTP requests.

**-E** _certfile_
> Use the specified client certificate file.

**-f**
> Fine-tune NOT_FOUND (404) detection.

**-H** _header_
> Add a custom header to the HTTP request.

**-i**
> Use case-insensitive search.

**-l**
> Print "Location" header when found.

**-N** _code_
> Ignore responses with this HTTP code.

**-o** _file_
> Save output to disk.

**-p** _proxy_[_:port_]
> Use this proxy (default port: 1080).

**-P** _user:pass_
> Proxy authentication.

**-r**
> Don't search recursively.

**-R**
> Interactive recursion (ask which directories to scan).

**-S**
> Silent mode (don't show tested words).

**-t**
> Don't force an ending '/' on URLs.

**-u** _user:pass_
> HTTP authentication username and password.

**-v**
> Show also non-existent pages.

**-w**
> Don't stop on WARNING messages.

**-x** _extfile_
> Amplify search with extensions from this file.

**-X** _extensions_
> Amplify search with these extensions (e.g., ".php,.html").

**-z** _ms_
> Add delay in milliseconds between requests.

# CAVEATS

Use only against authorized targets. Unauthorized scanning may be illegal. Use `-z` for rate limiting to avoid detection or causing denial of service. Default wordlists may not cover all cases; custom wordlists improve results.

# HISTORY

**dirb** was written by The Dark Raver and has been part of the Kali Linux security distribution. It is one of the original web content brute-forcing tools, predating modern alternatives like gobuster and feroxbuster.

# SEE ALSO

[gobuster](/man/gobuster)(1), [nikto](/man/nikto)(1), [dirbuster](/man/dirbuster)(1), [nmap](/man/nmap)(1), [curl](/man/curl)(1)
