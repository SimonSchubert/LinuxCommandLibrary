# TAGLINE

checks if websites are accessible

# TLDR

**Check if site is up**

```is-up [example.com]```

**Check multiple sites**

```is-up [site1.com] [site2.com]```

**Get exit code only**

```is-up -q [example.com]```

# SYNOPSIS

**is-up** [_options_] _url_...

# PARAMETERS

_URL_
> Website URL or domain to check.

**-q**, **--quiet**
> Quiet mode, exit code only.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**is-up** checks if websites are accessible. It performs HTTP requests to verify site availability.

The tool returns success if the site responds. Useful for quick uptime checks and scripting.

# CAVEATS

Checks from your location only. Network issues affect results. Simple HTTP check.

# HISTORY

is-up was created as a simple command-line tool to quickly check if websites are reachable and responding.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [ping](/man/ping)(8), [httpie](/man/http)(1)
