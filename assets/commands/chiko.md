# TAGLINE

TUI gRPC client for the terminal

# TLDR

**Launch** the interactive gRPC TUI

```chiko```

**Connect** with TLS but skip certificate verification

```chiko -insecure```

**Connect** with a custom CA certificate

```chiko -cacert [/path/to/ca.pem]```

**Connect** with client certificate authentication

```chiko -cert [/path/to/client.pem] -key [/path/to/client-key.pem]```

**Set** a connection timeout of 30 seconds

```chiko -connect-timeout 30```

# SYNOPSIS

**chiko** [_flags_]

# PARAMETERS

**-plaintext**
> Use plain-text HTTP/2 when connecting (no TLS). Default: true.

**-insecure**
> Skip server certificate and domain verification.

**-cacert** _file_
> File containing trusted root certificates for verifying the server.

**-cert** _file_
> File containing client certificate (public key).

**-key** _file_
> File containing client private key.

**-d** _data_
> Data for request contents.

**-allow-unknown-fields**
> Allow unknown fields in JSON request.

**-connect-timeout** _seconds_
> Maximum time in seconds to wait for connection (default: 10).

**-keepalive-time** _seconds_
> Maximum idle time before sending a keepalive probe.

**-max-time** _seconds_
> Maximum total operation time in seconds.

**-max-msg-sz** _bytes_
> Maximum encoded response message size (default: 4194304).

# DESCRIPTION

**chiko** is a terminal user interface for interacting with gRPC services, written in Go. It combines the power of **grpcurl** with the elegance of a visual TUI. Instead of memorizing complex grpcurl command syntax, chiko provides an interactive interface for discovering services, crafting requests, and testing gRPC APIs.

Key features include smart server reflection for automatic service discovery, built-in Bearer token support for authentication, rich metadata and custom header support, instant payload generation from service definitions, smart bookmarks for saving and replaying requests, and import/export of grpcurl commands.

# CAVEATS

The **-plaintext** flag defaults to true, meaning connections are unencrypted by default -- appropriate for local development but not production servers. Server reflection must be enabled on the gRPC server for automatic service discovery. Proto file import is not yet supported. Pre-stable software (v0.x).

# HISTORY

**chiko** was created by **Felix Angga** and is written in Go under the MIT license. It was built to provide a developer-friendly visual alternative to the raw **grpcurl** command-line tool. Available via Homebrew and Go install.

# SEE ALSO

[grpcurl](/man/grpcurl)(1), [curl](/man/curl)(1), [protoc](/man/protoc)(1)
