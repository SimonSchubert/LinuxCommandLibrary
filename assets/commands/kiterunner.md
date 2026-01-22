# TLDR

**Scan API**

```kr scan [url] -w [wordlist.txt]```

**Brute force endpoints**

```kr brute [url] -w [wordlist.txt]```

**Use specific wordlist**

```kr scan [url] -A apiroutes-210228```

**Scan with headers**

```kr scan [url] -w [list] -H "Authorization: Bearer [token]"```

**Output to file**

```kr scan [url] -w [list] -o [results.txt]```

# SYNOPSIS

**kr** _command_ [_options_] _target_

# PARAMETERS

**scan** _URL_
> Scan target URL.

**brute** _URL_
> Brute force endpoints.

**-w** _WORDLIST_
> Wordlist file.

**-A** _ASSETNOTE_
> Use Assetnote wordlist.

**-H** _HEADER_
> Add HTTP header.

**-o** _FILE_
> Output file.

**--help**
> Display help information.

# DESCRIPTION

**kiterunner** discovers API endpoints through context-aware scanning. It uses wordlists designed for API route discovery.

The tool sends requests mimicking real API calls. It's effective for finding hidden API endpoints.

kiterunner discovers API endpoints.

# CAVEATS

Security testing tool. Authorized use only. Go-based.

# HISTORY

kiterunner was created by **Assetnote** for API endpoint discovery during security assessments.

# SEE ALSO

[ffuf](/man/ffuf)(1), [gobuster](/man/gobuster)(1), [dirsearch](/man/dirsearch)(1)
