# TAGLINE

View Python module documentation

# TLDR

**View documentation** for a module

```pydoc [module]```

**View documentation** for a class or function

```pydoc [module.ClassName]```

**Search module synopses** for a keyword

```pydoc -k [keyword]```

**Start a local documentation HTTP server**

```pydoc -p [8080]```

**Start server and open** in the default browser

```pydoc -b```

**Write HTML documentation** to a file in the current directory

```pydoc -w [module]```

# SYNOPSIS

**pydoc** [**-k** _keyword_] [**-p** _port_] [**-b**] [**-w**] [_name_...]

# PARAMETERS

_name_
> Module, package, class, function, or keyword to document.

**-k** _keyword_
> Search synopsis lines of all available modules for keyword.

**-p** _port_
> Start HTTP documentation server on the given port.

**-b**
> Start HTTP server and open a web browser to its page.

**-w** _name_
> Write HTML documentation for the module to a file in the current directory.

**-n** _host_
> Hostname for the HTTP server (default: localhost). Python 3.11+.

# DESCRIPTION

**pydoc** is Python's built-in documentation tool that displays module documentation generated from docstrings and introspection. It can show documentation for modules, classes, functions, and keywords in the terminal, search across all installed modules with **-k**, or generate static HTML files with **-w**.

The **-p** flag starts a local HTTP documentation server that provides a browsable interface to all installed Python modules, and **-b** opens this server automatically in the default web browser. pydoc is part of the Python standard library and provides the same functionality as the interactive **help()** function.

The **PAGER** environment variable controls which program is used for terminal display. The **BROWSER** environment variable controls which browser is used with **-b**.

# CAVEATS

Documentation quality depends on the presence of docstrings in the module source. Importing a module to inspect it may execute module-level code. The **-n** flag for specifying the server hostname requires Python 3.11+.

# HISTORY

**pydoc** has been part of the Python standard library since **Python 2.1** (2001). It was written by **Ka-Ping Yee** as a built-in documentation viewer, providing the same functionality as the interactive **help()** function.

# SEE ALSO

[python](/man/python)(1), [help](/man/help)(1), [pydoc3](/man/pydoc3)(1)

