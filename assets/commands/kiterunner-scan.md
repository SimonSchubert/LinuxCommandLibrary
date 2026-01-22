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

**kr scan** performs API endpoint discovery. It sends requests based on wordlist patterns to find hidden endpoints.

The tool uses context-aware scanning to detect valid APIs. It supports various HTTP methods and content types.

kr scan discovers API endpoints.

# CAVEATS

Subcommand of kiterunner. Authorized testing only. Can generate high traffic.

# HISTORY

kr scan is the main scanning command in **kiterunner**, developed by Assetnote for API security testing.

# SEE ALSO

[kiterunner](/man/kiterunner)(1), [kiterunner-kb](/man/kiterunner-kb)(1)
