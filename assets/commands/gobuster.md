# TLDR

**Directory brute-force**

```gobuster dir -u [https://example.com] -w [wordlist.txt]```

**DNS subdomain enumeration**

```gobuster dns -d [example.com] -w [subdomains.txt]```

**Vhost discovery**

```gobuster vhost -u [https://example.com] -w [wordlist.txt]```

**With file extensions**

```gobuster dir -u [https://example.com] -w [wordlist.txt] -x [php,html,txt]```

**With custom threads**

```gobuster dir -u [https://example.com] -w [wordlist.txt] -t [50]```

**Follow redirects**

```gobuster dir -u [https://example.com] -w [wordlist.txt] -r```

# SYNOPSIS

**gobuster** _mode_ [_options_]

# DESCRIPTION

**gobuster** is a fast directory and DNS brute-forcing tool written in Go. It discovers hidden directories, files, and subdomains through wordlist-based enumeration.

The tool is designed for web application security testing, helping identify hidden content that may reveal vulnerabilities or sensitive information.

# PARAMETERS

**dir**
> Directory/file brute-forcing mode.

**dns**
> DNS subdomain enumeration mode.

**vhost**
> Virtual host discovery mode.

**-u** _url_
> Target URL.

**-w** _file_
> Wordlist file.

**-t** _n_
> Number of threads.

**-x** _extensions_
> File extensions to search.

**-r**
> Follow redirects.

**-k**
> Skip TLS certificate verification.

**-o** _file_
> Output file.

**-s** _codes_
> Status codes to consider valid.

**-b** _codes_
> Status codes to blacklist.

# CAVEATS

Only for authorized security testing. May trigger WAF rules. Large wordlists slow on remote hosts. Respect rate limits.

# HISTORY

**gobuster** was created by **OJ Reeves** as a fast alternative to tools like DirBuster. Written in Go for concurrency and performance, it became a standard tool in penetration testing and bug bounty hunting.

# SEE ALSO

[dirb](/man/dirb)(1), [ffuf](/man/ffuf)(1), [wfuzz](/man/wfuzz)(1), [feroxbuster](/man/feroxbuster)(1)
