# TAGLINE

Python 3.4 documentation viewer

# TLDR

**View module documentation**

```pydoc3.4 [module]```

**Search for keyword** in module synopses

```pydoc3.4 -k [keyword]```

**Start documentation HTTP server**

```pydoc3.4 -p [8080]```

**Write HTML documentation** to file

```pydoc3.4 -w [module]```

**View documentation for a class or function**

```pydoc3.4 [module.ClassName]```

# SYNOPSIS

**pydoc3.4** [_options_] [_name_]

# PARAMETERS

_name_
> Module, package, class, function, or keyword to document. A '/' in the name is used as a path to a Python source file.

**-k** _KEYWORD_
> Search for keyword in synopsis lines of all available modules.

**-p** _PORT_
> Start HTTP documentation server on specified port. Use port 0 for an arbitrary unused port.

**-b**
> Start HTTP server and open a web browser.

**-w** _name_
> Write HTML documentation to a file in the current directory.

# DESCRIPTION

**pydoc3.4** is the Python 3.4 version of the pydoc documentation tool. It displays module documentation, searches installed packages, and can serve documentation via a local HTTP server, specifically for the Python 3.4 interpreter and its installed libraries.

This version-specific binary exists on systems with multiple Python versions installed. For current development, use the latest **pydoc3** instead. If name is 'keywords', 'topics', or 'modules', a listing of these categories is displayed.

# CAVEATS

Python 3.4 reached end-of-life in March 2019. Use the latest **pydoc3** for current development.

# SEE ALSO

[pydoc](/man/pydoc)(1), [pydoc3](/man/pydoc3)(1), [python3.4](/man/python3.4)(1), [python3](/man/python3)(1)

