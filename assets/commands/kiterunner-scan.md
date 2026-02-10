# TAGLINE

performs API endpoint discovery

# TLDR

**Scan URL**

```kr scan [url] -w [wordlist]```

**Scan with Assetnote wordlist**

```kr scan [url] -A apiroutes-210228```

**Scan with authentication**

```kr scan [url] -w [list] -H "Authorization: Bearer [token]"```

**Scan with concurrency**

```kr scan [url] -w [list] -x [50]```

**Filter status codes**

```kr scan [url] -w [list] --fail-status-codes 404,400```

# SYNOPSIS

**kr scan** [_options_] _target_

# PARAMETERS

_TARGET_
> URL to scan.

**-w** _WORDLIST_
> Custom wordlist file.

**-A** _KB_
> Assetnote knowledge base.

**-H** _HEADER_
> Add request header.

**-x** _N_
> Concurrent requests.

**--fail-status-codes** _CODES_
> Status codes to ignore.

**--help**
> Display help information.

# DESCRIPTION

**kr scan** is the primary scanning subcommand of kiterunner, performing context-aware API endpoint discovery against a target URL. Rather than simply appending wordlist entries as path suffixes, it constructs full API requests with appropriate HTTP methods, content types, and route parameters based on patterns in the supplied wordlist, which makes it significantly more effective at identifying real API routes.

The command supports Assetnote's pre-built knowledge base wordlists (via the -A flag) as well as custom wordlist files. You can control concurrency with -x, add authentication headers with -H, and filter out unwanted responses by status code. Results include the detected HTTP method, path, status code, and response size, providing a clear picture of the target's API surface.

# CAVEATS

Subcommand of kiterunner. Authorized testing only. Can generate high traffic.

# HISTORY

kr scan is the main scanning command in **kiterunner**, developed by Assetnote for API security testing.

# SEE ALSO

[kiterunner](/man/kiterunner)(1), [kiterunner-kb](/man/kiterunner-kb)(1)
