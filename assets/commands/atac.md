# TAGLINE

Postman-like API client for the terminal

# TLDR

**Launch the TUI** in the current directory

```atac```

**Specify a custom application directory**

```atac -d [path/to/directory]```

**Send a one-shot GET request**

```atac try [https://api.example.com/endpoint]```

**Send a request from a collection**

```atac request [collection/request_name] send```

**Send a request using an environment**

```atac request [collection/request_name] send --env [my_env]```

**Import a Postman collection**

```atac import postman [path/to/collection.json]```

**Import from a cURL command**

```atac import curl "[curl -X GET https://example.com]"```

**Generate shell completions**

```atac completions [bash|zsh|fish]```

# SYNOPSIS

**atac** [**-d** _directory_] [**--filter** _regex_] [**--dry-run**] [**--no-ansi-log**] [**-v**...] [_subcommand_]

# PARAMETERS

**-d** _directory_, **--directory** _directory_
> Main application directory containing collection files, the atac.toml config file, and the atac.log file

**--filter** _regex_
> Only parse collection files whose names match the given regular expression

**--tui**
> Run the TUI after executing a CLI subcommand

**--dry-run**
> Avoid saving data to collection and environment files

**--no-ansi-log**
> Avoid using ANSI formatting in log file output

**-v**, **--verbose**
> Increase verbosity level; can be repeated for more detail

**collection**
> Manage collections (list, create, delete, rename)

**request**
> Manage and send requests within a collection

**try**
> One-shot request sender for quick API calls without a saved collection

**env**
> Manage environment files and variables

**import**
> Import collections, requests, or environments from Postman v2.1.0, cURL, or OpenAPI formats

**completions**
> Generate shell completion scripts for bash, zsh, or fish

**man**
> Generate the ATAC man page

# DESCRIPTION

**atac** (Arguably a Terminal API Client) is a feature-rich, terminal-based API testing tool written in Rust. It provides a Postman-like experience entirely within the terminal, supporting both an interactive TUI mode and a scriptable CLI mode.

The TUI presents a full interface for building and organizing HTTP requests, viewing responses with syntax highlighting, managing collections, and switching between environments. The CLI mode allows sending requests, managing collections, and importing data non-interactively, making it suitable for scripting and automation.

atac supports all standard HTTP methods including GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, TRACE, and CONNECT. Authentication options include Basic, Bearer token, Digest, and JWT. Request bodies can be JSON, XML, HTML, plain text, multipart form, URL-encoded form, or file uploads. Full response details are available including status codes, headers, cookies, and timing.

Beyond HTTP, atac includes a WebSocket client supporting text, binary, ping, pong, and close messages. A built-in JavaScript runtime enables pre-request and post-request scripting for dynamic request modification and response processing.

Collections and environments are stored as human-readable JSON or YAML files, designed to be committed to version control. Environment variables are defined in .env files and referenced in requests using **{{variable_name}}** syntax. The tool can import from Postman v2.1.0 collections, OpenAPI specifications, and cURL commands, and can export requests to cURL, PHP Guzzle, Node.js Axios, Rust Reqwest, and raw HTTP formats.

# CONFIGURATION

**atac.toml** -- Main configuration file placed in the application directory. All keys are optional.

**disable_syntax_highlighting**
> Set to true to disable response syntax highlighting (default: false)

**disable_cors**
> Set to true to disable CORS handling (default: false)

**[proxy] http_proxy**
> HTTP proxy URL

**[proxy] https_proxy**
> HTTPS proxy URL

Key bindings are configured via a separate TOML file specified by the **ATAC_KEY_BINDINGS** environment variable. Default and Vim-style key binding templates are provided.

The **ATAC_MAIN_DIR** environment variable can be used as an alternative to the **-d** flag for specifying the application directory.

# CAVEATS

Requires Rust 1.82 or later to build from source. On macOS, binaries downloaded from GitHub releases may need the quarantine attribute removed with **xattr -rd com.apple.quarantine**. OAuth and AWS authentication are not yet supported. Only Postman v2.1.0 collection format is supported for import.

# HISTORY

**atac** was created by **Julien Caposiena** (Julien-cpsn) and first published to crates.io in **April 2024**. The project is open source under the MIT license and hosted on GitHub. It was built to provide a free, account-less, offline-first alternative to graphical API clients like Postman and Insomnia.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [wget](/man/wget)(1), [websocat](/man/websocat)(1), [posting](/man/posting)(1)
