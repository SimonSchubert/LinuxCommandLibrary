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

**varnishlog** shows Varnish logs. It displays VSL data.

Real-time viewing. Live request logs.

Powerful filtering. VSL query language.

Request tracing. Full transaction.

Debugging tool. Cache analysis.

# CAVEATS

Varnish specific. VSL knowledge helpful. Running Varnish needed.

# HISTORY

**varnishlog** is part of **Varnish Cache**, displaying the Varnish Shared Memory Log for debugging.

# SEE ALSO

[varnishhist](/man/varnishhist)(1), [varnishstat](/man/varnishstat)(1), [varnishd](/man/varnishd)(1)
