# TAGLINE

Terminal API client for HTTP, GraphQL, gRPC, WebSocket, and SSE

# TLDR

**Launch the API client TUI**

```resterm```

**Open a request file in the TUI**

```resterm --file [path/to/request.http]```

**Run requests directly from the terminal**

```resterm run --file [path/to/request.http]```

**Initialize a new workspace with samples**

```resterm init```

**Run a specific named request in an environment**

```resterm run --file [requests.http] --request [getUser] --env [staging]```

**Import a curl command into an .http file**

```resterm --from-curl "[curl https://example.com]"```

**Convert an OpenAPI 3 spec into request files**

```resterm --from-openapi [spec.yaml]```

# SYNOPSIS

**resterm** [_options_] [_file_]

**resterm** **run** [_options_]

**resterm** **init** [_options_]

**resterm** **collection** _import_|_export_ [_options_]

# COMMANDS

**run**
> Execute one or more `.http` / `.rest` requests from the terminal.

**init**
> Bootstrap a workspace with sample requests and environment files.

**collection export**
> Export a workspace into a Git-friendly bundle.

**collection import**
> Import a bundle into another workspace.

# PARAMETERS

**--file** _PATH_
> Target a specific request file.

**--workspace** _DIR_
> Specify the workspace directory.

**--env** _NAME_
> Select an environment from the workspace.

**--env-file** _PATH_
> Use a dotenv file (opt-in).

**--request** _NAME_
> Run a specific named request.

**--timeout** _DURATION_
> Set the request timeout.

**--insecure**
> Skip TLS certificate verification.

**--follow**
> Follow redirects.

**--proxy** _URL_
> Use the specified HTTP/HTTPS proxy.

**--recursive**
> Process files recursively.

**--compare**
> Run a request across multiple environments and diff responses.

**--dry-run**
> Preview actions before executing.

**--force**
> Replace existing files during import.

**--from-curl** _CMD_
> Import a curl command as a request.

**--from-openapi** _SPEC_
> Convert an OpenAPI 3 specification into request files.

**--http-out** _FORMAT_
> Specify output format for responses.

**--check-update**
> Check for newer releases.

**--update**
> Download and install the latest version.

# DESCRIPTION

**resterm** is a keyboard-driven terminal API client supporting HTTP, GraphQL, gRPC, WebSocket, and SSE. Requests are stored in plain `.http` / `.rest` files so they can be version-controlled alongside code.

Features include OAuth 2.0 authentication, SSH tunnels, Kubernetes port-forwarding, conditional logic and multi-step workflows, response diffing, profiling, and streaming transcripts for WebSocket and SSE sessions.

# HISTORY

**resterm** was created by **unkn0wn-root** and is written in **Go**.

# SEE ALSO

[curl](/man/curl)(1), [posting](/man/posting)(1), [httpie](/man/httpie)(1)
