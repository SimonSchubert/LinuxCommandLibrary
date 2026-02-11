# TAGLINE

Python 2.7 documentation viewer

# TLDR

**View Python 2.7 documentation**

```pydoc2.7 [module]```

**Search documentation**

```pydoc2.7 -k [keyword]```

**Start documentation server**

```pydoc2.7 -p [8080]```

# SYNOPSIS

**pydoc2.7** [_options_] [_module_]

# PARAMETERS

_MODULE_
> Module to document.

**-k** _KEYWORD_
> Search keyword.

**-p** _PORT_
> Start HTTP server.

**-w**
> Write HTML file.

# DESCRIPTION

**pydoc2.7** is the Python 2.7 version of the pydoc documentation tool. It displays module documentation, searches installed packages, and can serve documentation via a local HTTP server, specifically for the Python 2.7 interpreter and its installed libraries.

This version-specific binary exists on systems with multiple Python versions installed. Since Python 2 has reached end of life, users should migrate to **pydoc3** for active Python development.

# CAVEATS

Python 2 deprecated. Use pydoc3 instead.

# HISTORY

pydoc2.7 is **Python 2.7's** documentation tool.

# SEE ALSO

[pydoc](/man/pydoc)(1), [pydoc3](/man/pydoc3)(1), [python2.7](/man/python2.7)(1)

