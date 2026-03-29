# TAGLINE

Lightweight real-time terminal chat with E2E encryption

# TLDR

**Start the chat server interactively**

```marchat-server --interactive```

**Start the server with the admin panel enabled**

```marchat-server --admin-panel```

**Connect to a server as a named user**

```marchat-client --server [ws://host:8080/ws] --username [name]```

**Connect as an admin**

```marchat-client --server [ws://host:8080/ws] --admin --admin-key [key]```

**Show server diagnostics**

```marchat-server --doctor```

# SYNOPSIS

**marchat-server** [_options_]

**marchat-client** [_options_]

# PARAMETERS

**--interactive**
> Guided setup prompt for the server when environment variables are not set.

**--admin-panel**
> Enable the in-terminal admin interface on the server.

**--web-panel**
> Enable the web-based admin interface on the server.

**--config-dir** _PATH_
> Override the default configuration directory.

**--doctor**
> Display server diagnostics in text format.

**--doctor-json**
> Display server diagnostics as JSON.

**--username** _NAME_
> Set the client username when connecting.

**--server** _URL_
> Server WebSocket address to connect to (e.g. `ws://localhost:8080/ws`).

**--admin**
> Connect with admin privileges.

**--admin-key** _KEY_
> Admin authentication key.

**--skip-tls-verify**
> Skip TLS certificate verification (useful with self-signed certificates).

# DESCRIPTION

**marchat** is a self-hosted, terminal-based group chat application with real-time WebSocket messaging, optional end-to-end encryption, a plugin system, file sharing, admin panel, and code snippet support. The TUI client is built with Bubble Tea and data is stored in SQLite.

The server is configured via flags or environment variables (`MARCHAT_PORT`, `MARCHAT_ADMIN_KEY`, `MARCHAT_GLOBAL_E2E_KEY`, etc.). End-to-end encryption uses X25519/ChaCha20-Poly1305. The plugin system supports community-built extensions for ANSI image sharing, text filters, and custom commands.

# CAVEATS

Requires running your own server instance. End-to-end encryption is optional and must be explicitly enabled via `MARCHAT_GLOBAL_E2E_KEY`. Running either binary without arguments launches an interactive configuration prompt.

# HISTORY

**marchat** was created by **Cod-e-Codes** and is written in **Go**.

# SEE ALSO

[irssi](/man/irssi)(1), [weechat](/man/weechat)(1)
