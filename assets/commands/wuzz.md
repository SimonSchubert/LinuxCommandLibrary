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

**wuzz** is an HTTP inspector. It's interactive.

TUI interface. Keyboard-driven.

Request building. Headers, body.

Response viewing. Formatted output.

History support. Previous requests.

# CAVEATS

Terminal UI only. Go implementation. Basic features.

# HISTORY

**wuzz** was created as an interactive command-line HTTP inspection tool with a TUI.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [postman](/man/postman)(1)
