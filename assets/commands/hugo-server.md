# TAGLINE

starts a local development server with live reload

# TLDR

**Start development server**

```hugo server```

**With drafts**

```hugo server -D```

**Custom port**

```hugo server -p [8080]```

**Bind to all interfaces**

```hugo server --bind [0.0.0.0]```

**Disable live reload**

```hugo server --disableLiveReload```

**With polling**

```hugo server --poll [1000ms]```

# SYNOPSIS

**hugo server** [_options_]

# PARAMETERS

**-D**, **--buildDrafts**
> Include draft posts.

**-p**, **--port** _PORT_
> Server port.

**--bind** _ADDR_
> Listen address.

**--disableLiveReload**
> Disable live reload.

**--poll** _DURATION_
> Use polling for changes.

**-w**, **--watch**
> Watch for changes.

**--help**
> Display help information.

# DESCRIPTION

**hugo server** starts a local development server with live reload. It watches for file changes and automatically rebuilds the site.

The server provides fast iteration during development. Live reload refreshes browsers automatically when content changes.

# CAVEATS

Development only. Not for production. Memory usage with large sites.

# HISTORY

hugo server is the built-in development server for **Hugo** static site generator.

# SEE ALSO

[hugo](/man/hugo)(1), [jekyll-serve](/man/jekyll-serve)(1), [live-server](/man/live-server)(1)
