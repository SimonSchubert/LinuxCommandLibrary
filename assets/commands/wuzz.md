# TAGLINE

Interactive terminal HTTP client

# TLDR

**Start interactive HTTP client**

```wuzz```

**Start with URL**

```wuzz -u [https://api.example.com]```

**With config file**

```wuzz -c [config.yaml]```

# SYNOPSIS

**wuzz** [_-u url_] [_-c config_] [_options_]

# PARAMETERS

**-u** _URL_
> Initial URL.

**-c** _FILE_
> Config file.

**--insecure**
> Skip TLS verify.

# DESCRIPTION

**wuzz** is an interactive HTTP inspection tool with a terminal user interface. It provides a keyboard-driven environment for building HTTP requests, setting headers and body content, and viewing formatted responses without leaving the terminal.

The tool maintains a history of previous requests for easy re-execution and modification. It serves as a lightweight alternative to graphical tools like Postman for quick API testing and debugging directly from the command line.

# CAVEATS

Terminal UI only. Go implementation. Basic features.

# HISTORY

**wuzz** was created as an interactive command-line HTTP inspection tool with a TUI.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [postman](/man/postman)(1)
