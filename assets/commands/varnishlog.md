# TAGLINE

Display Varnish HTTP request logs

# TLDR

**Show live logs**

```varnishlog```

**Filter by tag**

```varnishlog -I [ReqURL]```

**Filter by query**

```varnishlog -q "[RespStatus == 500]"```

**Client requests only**

```varnishlog -c```

**Backend requests only**

```varnishlog -b```

**Group by request**

```varnishlog -g request```

# SYNOPSIS

**varnishlog** [_-c_] [_-b_] [_-q query_] [_-I tag_] [_options_]

# PARAMETERS

**-c**
> Client side.

**-b**
> Backend side.

**-q** _QUERY_
> VSL query.

**-I** _TAG_
> Include tag.

**-g** _MODE_
> Grouping mode.

**-d**
> Process old entries.

# DESCRIPTION

**varnishlog** reads the Varnish Shared Memory Log (VSL) and displays detailed request and response information in real time. It shows the full lifecycle of HTTP transactions including client requests, backend fetches, cache decisions, and response headers.

The tool provides powerful filtering through the VSL query language, allowing you to isolate specific transactions by status code, URL pattern, or any logged field. Client-side (-c) and backend-side (-b) views can be shown independently, and grouping modes organize output by request, session, or raw log entries. This makes it the primary debugging tool for understanding Varnish cache behavior.

# CAVEATS

Varnish specific. VSL knowledge helpful. Running Varnish needed.

# HISTORY

**varnishlog** is part of **Varnish Cache**, displaying the Varnish Shared Memory Log for debugging.

# SEE ALSO

[varnishhist](/man/varnishhist)(1), [varnishstat](/man/varnishstat)(1), [varnishd](/man/varnishd)(1)
