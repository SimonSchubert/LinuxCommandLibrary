# TAGLINE

Interactive web server for inspecting and mocking HTTP requests

# TLDR

**Start httplab** on the default port

```httplab```

**Start on a specific port**

```httplab -port [8080]```

**Start with an initial response status**

```httplab -response [200]```

**Start with an initial response delay**

```httplab -delay [500]```

**Enable CORS**

```httplab -cors```

# SYNOPSIS

**httplab** [**-port** _port_] [**-response** _code_] [**-delay** _ms_] [**-cors**]

# DESCRIPTION

**httplab** is an interactive web server that lets you inspect incoming HTTP requests and forge responses in real time through a terminal UI. It runs a local HTTP server and displays each request's method, path, headers, and body, while allowing you to customize the response status code, headers, and body interactively.

Pre-built responses can be saved and loaded from a **.httplab** configuration file. The tool is useful for API development, webhook testing, and debugging HTTP client behavior.

# CAVEATS

Designed for development and testing only; not suitable for production use. Default port is 10080, which may conflict with other services.

# HISTORY

**httplab** was created by **Gustavo Chaín** (qustavo) and is written in **Go**. It was designed to provide developers with a quick way to inspect and mock HTTP interactions without configuring a full mock server.

# SEE ALSO

[curl](/man/curl)(1), [nc](/man/nc)(1), [httpie](/man/httpie)(1)
