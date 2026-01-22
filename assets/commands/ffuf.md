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
> Filter by status code.

**-fs** _SIZE_
> Filter by response size.

**-mc** _CODES_
> Match status codes.

**-ms** _SIZE_
> Match response size.

**-t** _N_
> Number of threads.

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

# SEE ALSO

[gobuster](/man/gobuster)(1), [dirb](/man/dirb)(1), [wfuzz](/man/wfuzz)(1)
