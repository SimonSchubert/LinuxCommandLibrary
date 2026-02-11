# TAGLINE

View Python module documentation

# TLDR

**View module documentation**

```pydoc [module]```

**Search documentation**

```pydoc -k [keyword]```

**Start documentation server**

```pydoc -p [8080]```

**Write documentation to file**

```pydoc -w [module]```

**Browser mode**

```pydoc -b```

# SYNOPSIS

**pydoc** [_options_] [_module_]

# PARAMETERS

_MODULE_
> Module to document.

**-k** _KEYWORD_
> Search keyword.

**-p** _PORT_
> Start HTTP server.

**-w**
> Write HTML file.

**-b**
> Open in browser.

# DESCRIPTION

**pydoc** is Python's built-in documentation tool that displays module documentation generated from docstrings and introspection. It can show documentation for modules, classes, functions, and keywords in the terminal, search across all installed modules with **-k**, or generate static HTML files with **-w**.

The **-p** flag starts a local HTTP documentation server that provides a browsable interface to all installed Python modules, and **-b** opens this server automatically in the default web browser. pydoc is part of the Python standard library and provides the same functionality as the interactive **help()** function.

# CAVEATS

Built into Python. Uses docstrings.

# HISTORY

pydoc is **Python's built-in** documentation viewer.

# SEE ALSO

[python](/man/python)(1), [help](/man/help)(1), [sphinx](/man/sphinx)(1)

