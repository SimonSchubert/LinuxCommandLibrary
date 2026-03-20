# TAGLINE

Interactive terminal HTTP client

# TLDR

**Start interactive HTTP client**

```wuzz```

**Start with a URL pre-filled**

```wuzz [https://api.example.com/users]```

**Start with custom headers** (cURL-compatible syntax)

```wuzz -H "[Content-Type: application/json]" [https://api.example.com]```

**Start with POST data**

```wuzz -X POST -d '{"key":"value"}' [https://api.example.com]```

**Start with a config file**

```wuzz -c [~/.wuzz/config.toml]```

# SYNOPSIS

**wuzz** [**-H** _header_]... [**-d** _data_] [**-X** _method_] [**-t** _msecs_] [**-c** _config_] [_URL_]

# PARAMETERS

**-H**, **--header** _HEADER_
> Set a request header (can be specified multiple times).

**-d**, **--data** _DATA_
> Set the request body data.

**-X**, **--request** _METHOD_
> Set the HTTP method (GET, POST, PUT, etc.).

**-t**, **--timeout** _MSECS_
> Request timeout in milliseconds.

**-F**, **--form** _FIELD_
> Set multipart form data.

**-c**, **--config** _FILE_
> Use the specified configuration file.

**--insecure**
> Skip TLS certificate verification.

# DESCRIPTION

**wuzz** is an interactive HTTP inspection tool with a terminal user interface. Command line arguments are compatible with cURL syntax, so requests can be copied from browser network inspectors using "copy as cURL".

The interface has separate panels for URL, method, headers, request body, query parameters, and response. Navigation uses **Tab**/**Shift+Tab** between panels and **Ctrl+R** to send the request. **Ctrl+S** saves the response, **Ctrl+E** saves the request, **Ctrl+F** loads a saved request, and **Alt+H** toggles history. **F2-F9** jump to specific panels.

# CAVEATS

Terminal UI only. Configuration file uses TOML format (default: $XDG_CONFIG_HOME/wuzz/config.toml on Linux, ~/.wuzz/config.toml elsewhere).

# HISTORY

**wuzz** was created by **asciimoo** as an interactive command-line HTTP inspection tool, written in Go. Available at https://github.com/asciimoo/wuzz.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [postman](/man/postman)(1)
