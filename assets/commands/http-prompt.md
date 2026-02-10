# TAGLINE

interactive command-line HTTP client featuring autocomplete and syntax

# TLDR

Launch a session targeting **localhost**

```http-prompt```

Launch a session with a **specific URL**

```http-prompt [http://example.com]```

Launch a session with **authentication**

```http-prompt [localhost:8000/api] --auth [username:password]```

# SYNOPSIS

**http-prompt** [_URL_] [_options_]

# PARAMETERS

**--auth** _USER:PASS_
> Set HTTP basic authentication credentials

**--version**
> Display version information

# DESCRIPTION

**http-prompt** is an interactive command-line HTTP client featuring autocomplete and syntax highlighting. It provides a REPL (Read-Eval-Print Loop) environment for exploring and testing HTTP APIs.

Built on top of HTTPie, it offers an interactive way to build HTTP requests with features like tab completion for HTTP methods, headers, and previously used values. Sessions persist settings and can be resumed.

Within the prompt, you can set headers, query parameters, and body data incrementally, then execute requests with standard HTTP methods (GET, POST, PUT, DELETE, etc.).

# CAVEATS

Requires Python and HTTPie. Sessions are stored locally and persist between invocations. Not suitable for automated scripting; use HTTPie or curl for that purpose.

# HISTORY

http-prompt was created by Chang-Hung Liang and released in **2016**. It was inspired by the interactive nature of database clients and aims to provide similar convenience for HTTP API exploration.

# SEE ALSO

[http](/man/http)(1), [curl](/man/curl)(1), [httpie](/man/httpie)(1)
