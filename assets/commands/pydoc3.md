# TAGLINE

Python 3 documentation browser

# TLDR

**View module documentation**

```pydoc3 [module]```

**Search documentation**

```pydoc3 -k [keyword]```

**Start documentation server**

```pydoc3 -p [8080]```

**Write HTML documentation**

```pydoc3 -w [module]```

**View builtin function**

```pydoc3 [print]```

# SYNOPSIS

**pydoc3** [_options_] [_name_]

# PARAMETERS

**-k** _keyword_
> Search for keyword.

**-p** _port_
> Start HTTP server.

**-b**
> Open browser to server.

**-w** _module_
> Write HTML file.

**-n** _host_
> Server hostname.

# DESCRIPTION

**pydoc3** is the Python 3 documentation browser. It displays docstrings, module contents, and can generate HTML documentation or serve it via built-in web server.

# EXAMPLES

```bash
# View module docs
pydoc3 os
pydoc3 json.loads

# Search for topic
pydoc3 -k sort

# Start doc server
pydoc3 -p 8080
# Then browse http://localhost:8080

# With browser auto-open
pydoc3 -b

# Generate HTML
pydoc3 -w mymodule
```

# IN PYTHON

```python
# Get help in interpreter
help(str.split)

# Same as pydoc
import pydoc
pydoc.doc(str.split)
```

# CAVEATS

Shows docstrings, not source. For source, use inspect module. Part of Python standard library.

# HISTORY

pydoc is part of the **Python** standard library, providing documentation access since Python 2.1.

# SEE ALSO

[python3](/man/python3)(1), [sphinx](/man/sphinx)(1), [help()](/man/help)(3)
