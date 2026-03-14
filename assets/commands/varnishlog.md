# TAGLINE

Display Varnish HTTP request logs

# TLDR

**Show live logs**

```varnishlog```

**Include only specific tag**

```varnishlog -i [ReqURL]```

**Filter by query**

```varnishlog -q "[RespStatus == 500]"```

**Client requests only**

```varnishlog -c```

**Backend requests only**

```varnishlog -b```

**Group by request**

```varnishlog -g request```

# SYNOPSIS

**varnishlog** [_-c_] [_-b_] [_-q query_] [_-i tag_] [_options_]

# PARAMETERS

**-c**
> Show client-side transactions only.

**-b**
> Show backend-side transactions only.

**-q** _QUERY_
> VSL query expression to filter transactions.

**-i** _TAGLIST_
> Include only records with specified tags (comma-separated).

**-I** _TAGREGEX_
> Include only records matching tag and regex pattern.

**-x** _TAGLIST_
> Exclude records with specified tags.

**-X** _TAGREGEX_
> Exclude records matching tag and regex pattern.

**-g** _MODE_
> Grouping mode (raw, vxid, request, session).

**-d**
> Process old log entries first.

**-w** _FILENAME_
> Write output to file.

# DESCRIPTION

**varnishlog** reads the Varnish Shared Memory Log (VSL) and displays detailed request and response information in real time. It shows the full lifecycle of HTTP transactions including client requests, backend fetches, cache decisions, and response headers.

The tool provides powerful filtering through the VSL query language, allowing you to isolate specific transactions by status code, URL pattern, or any logged field. Client-side (-c) and backend-side (-b) views can be shown independently, and grouping modes organize output by request, session, or raw log entries. This makes it the primary debugging tool for understanding Varnish cache behavior.

# CAVEATS

Requires a running Varnish instance. Familiarity with VSL query language is helpful for effective filtering. Output can be very verbose without filters.

# HISTORY

**varnishlog** is part of **Varnish Cache**, displaying the Varnish Shared Memory Log for debugging.

# SEE ALSO

[varnishhist](/man/varnishhist)(1), [varnishstat](/man/varnishstat)(1), [varnishd](/man/varnishd)(1)
