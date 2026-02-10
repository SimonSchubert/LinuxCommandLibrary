# TAGLINE

discovers API endpoints through context-aware scanning

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

**kiterunner** is a context-aware content discovery tool designed specifically for finding API endpoints on web applications. Unlike traditional directory brute-forcing tools that simply append paths to a base URL, kiterunner understands API routing conventions and sends requests that mimic legitimate API calls, including appropriate HTTP methods, headers, and content types for each candidate route.

The tool ships with curated wordlists from Assetnote that are tailored for common API frameworks such as Rails, Django, Express, and Spring. It supports both a `scan` mode for intelligent API-aware discovery and a `brute` mode for traditional directory enumeration, giving security professionals flexibility during reconnaissance and penetration testing engagements.

# CAVEATS

Security testing tool. Authorized use only. Go-based.

# HISTORY

kiterunner was created by **Assetnote** for API endpoint discovery during security assessments.

# SEE ALSO

[ffuf](/man/ffuf)(1), [gobuster](/man/gobuster)(1), [dirsearch](/man/dirsearch)(1)
