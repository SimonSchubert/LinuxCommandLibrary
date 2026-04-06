# TAGLINE

Interactive web server for inspecting and mocking HTTP requests

# TLDR

**Start httplab** on the default port

```httplab```

**Start on a specific port**

```httplab -p [8080]```

**Start with an initial response status and body**

```httplab -s [200] -b "[Hello, World]"```

**Start with an initial response delay**

```httplab -d [500]```

**Enable CORS**

```httplab --cors```

**Specify custom config path**

```httplab -c [path/to/.httplab]```

# SYNOPSIS

**httplab** [_options_]

# PARAMETERS

**-p**, **--port** _port_
> Port to bind to (default: 10080).

**-s**, **--status** _code_
> Initial response status code (default: 200).

**-b**, **--body** _string_
> Initial response body (default: "Hello, World").

**-d**, **--delay** _ms_
> Initial response delay in milliseconds.

**-H**, **--headers** _strings_
> Initial response headers (default: X-Server:HTTPLab).

**-a**, **--auto-update**
> Auto-update response when fields change (default: true).

**--cors**
> Enable CORS.

**--cors-display**
> Display CORS requests (default: true).

**-c**, **--config** _path_
> Custom config path.

**-v**, **--version**
> Print version.

# DESCRIPTION

**httplab** is an interactive web server that lets you inspect incoming HTTP requests and forge responses in real time through a terminal UI. It runs a local HTTP server and displays each request's method, path, headers, and body, while allowing you to customize the response status code, headers, and body interactively.

Pre-built responses can be saved and loaded from a **.httplab** configuration file. The tool is useful for API development, webhook testing, and debugging HTTP client behavior.

# CAVEATS

Designed for development and testing only; not suitable for production use. Default port is 10080, which may conflict with other services.

# HISTORY

**httplab** was created by **Gustavo Chaín** (qustavo) and is written in **Go**. It was designed to provide developers with a quick way to inspect and mock HTTP interactions without configuring a full mock server.

# SEE ALSO

[curl](/man/curl)(1), [nc](/man/nc)(1), [httpie](/man/httpie)(1)
