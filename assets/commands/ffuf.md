# TAGLINE

fast web fuzzer written in Go

# TLDR

**Directory fuzzing**

```ffuf -u [https://target.com/FUZZ] -w [wordlist.txt]```

**POST parameter fuzzing**

```ffuf -u [https://target.com/api] -w [wordlist.txt] -X POST -d "param=FUZZ"```

**Filter by status** code

```ffuf -u [https://target.com/FUZZ] -w [wordlist.txt] -fc [404]```

**Match response size**

```ffuf -u [https://target.com/FUZZ] -w [wordlist.txt] -ms [1234]```

**Multiple wordlists**

```ffuf -u [https://target.com/FUZZ1/FUZZ2] -w [list1.txt]:FUZZ1 -w [list2.txt]:FUZZ2```

**Virtual host discovery via Host header**

```ffuf -u [https://target.com] -w [vhosts.txt] -H "Host: FUZZ.target.com"```

**Recursive discovery with extensions**

```ffuf -u [https://target.com/FUZZ] -w [wordlist.txt] -recursion -e [.php,.html,.txt]```

# SYNOPSIS

**ffuf** [_options_]

# PARAMETERS

**-u** _URL_
> Target URL with FUZZ keyword.

**-w** _WORDLIST_
> Wordlist file.

**-X** _METHOD_
> HTTP method.

**-d** _DATA_
> POST data.

**-H** _HEADER_
> Custom header.

**-fc** _CODES_
> Filter out responses by status code.

**-fs** _SIZE_
> Filter out responses by size.

**-fw** _COUNT_
> Filter out responses by word count.

**-fl** _COUNT_
> Filter out responses by line count.

**-mc** _CODES_
> Match status codes (default 200-299,301,302,307,401,403,405,500).

**-ms** _SIZE_
> Match response size.

**-e** _EXTENSIONS_
> Comma-separated extensions to append to each word.

**-recursion**
> Scan recursively into discovered directories.

**-recursion-depth** _N_
> Maximum recursion depth.

**-t** _N_
> Number of concurrent threads (default 40).

**-rate** _N_
> Rate limit in requests per second (0 = unlimited).

**-o** _FILE_
> Write results to a file.

**-of** _FORMAT_
> Output format (json, csv, html, md, ...).

**-c**
> Colorize output.

**-s**
> Silent mode, show only results.

**--help**
> Display help information.

# DESCRIPTION

**ffuf** (Fuzz Faster U Fool) is a fast web fuzzer written in Go. It discovers hidden content, parameters, and vulnerabilities by sending requests with wordlist entries substituted at marked positions.

The tool excels at content discovery, parameter fuzzing, and virtual host enumeration. Filtering options allow matching or excluding responses by status, size, words, or lines.

ffuf's speed and flexibility make it popular for penetration testing and security assessments.

# CAVEATS

Only use against authorized targets. High thread counts may overwhelm servers. Results need manual verification.

# HISTORY

ffuf was created by **joohoi** as a fast, flexible web fuzzer. Written in Go for performance, it has become a standard tool in web application security testing.

# INSTALL

```apt: sudo apt install ffuf```

```dnf: sudo dnf install ffuf```

```apk: sudo apk add ffuf```

```brew: brew install ffuf```

```nix: nix profile install nixpkgs#ffuf```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gobuster](/man/gobuster)(1), [dirb](/man/dirb)(1), [wfuzz](/man/wfuzz)(1)
