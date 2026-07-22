# TAGLINE

TUI gRPC client for the terminal

# TLDR

**Launch the gRPC client**

```wireman```

**Activate server reflection** (inside the UI, on the selection tab)

```Ctrl+r```

# SYNOPSIS

**wireman**

# DESCRIPTION

**WireMan** is a terminal-based gRPC client written in Rust. It reads .proto files from a configuration file and provides a TUI for sending requests, browsing services and methods, and viewing responses.

The client supports server reflection, server-side streaming, header and metadata management, environment-based token loading via shell scripts, and exporting requests as **grpcurl** commands. Request history is persisted between sessions.

# CONFIGURATION

**~/.config/wireman/wireman.toml**
> Main configuration file specifying proto file paths, addresses, default headers, and history settings.

# KEY BINDINGS

**Tab**
> Switch between selection, request, response, and headers tabs.

**Ctrl+r**
> Activate server reflection mode (on the selection tab).

**Enter**
> Send the request or confirm a selection.

**?**
> Show in-app help.

# CAVEATS

Requires a configuration file pointing to local .proto files or a server with reflection enabled. Some advanced gRPC features (e.g. client-side streaming) may have limited UI support.

# HISTORY

**wireman** was created by **preiter93** and is written in Rust. It targets developers who prefer a keyboard-driven terminal workflow over GUI tools like Postman or BloomRPC.

# INSTALL

```pacman: sudo pacman -S wireman```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[grpcurl](/man/grpcurl)(1), [curl](/man/curl)(1), [protoc](/man/protoc)(1)
