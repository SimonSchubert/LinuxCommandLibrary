# TAGLINE

Interactive terminal HTTP client

# TLDR

**Start interactive HTTP client**

```wuzz```

**Start with a URL pre-filled**

```wuzz -u [https://api.example.com/users]```

**Start with a config file**

```wuzz -c [~/.wuzz/config.toml]```

**Start with TLS verification disabled**

```wuzz --insecure -u [https://self-signed.example.com]```

# SYNOPSIS

**wuzz** [_-u url_] [_-c config_] [_options_]

# PARAMETERS

**-u** _URL_
> Pre-fill the URL field with this URL.

**-c** _FILE_
> Use the specified configuration file.

**--insecure**
> Skip TLS certificate verification.

# DESCRIPTION

**wuzz** is an interactive HTTP inspection tool with a terminal user interface. It provides a keyboard-driven environment for building HTTP requests, setting headers and body content, and viewing formatted responses without leaving the terminal.

The interface has separate panels for URL, method, headers, request body, query parameters, and response. Navigation uses **Tab**/**Shift+Tab** between panels and **Ctrl+R** to send the request. The tool maintains a history of previous requests accessible with **Ctrl+S** (search) for easy re-execution.

# CAVEATS

Terminal UI only. Does not support WebSocket connections or file uploads. Configuration file uses TOML format.

# HISTORY

**wuzz** was created by **Asmaa Asaad** as an interactive command-line HTTP inspection tool, written in Go.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [postman](/man/postman)(1)
