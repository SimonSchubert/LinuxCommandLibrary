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

```marchat-client --server [ws://host:8080/ws] --username [name] --admin --admin-key [key]```

**Connect with end-to-end encryption**

```marchat-client --server [ws://host:8080/ws] --username [name] --e2e --keystore-passphrase [passphrase]```

**Reconnect using a saved profile**

```marchat-client --quick-start```

**Show server diagnostics**

```marchat-server --doctor```

# SYNOPSIS

**marchat-server** [_options_]

**marchat-client** [_options_]

# PARAMETERS

**--interactive**
> Server: guided setup wizard, used only when required configuration such as MARCHAT_ADMIN_KEY or MARCHAT_USERS is missing.

**--admin-panel**
> Server: enable the built-in admin panel TUI.

**--web-panel**
> Server: enable the web admin panel, served at /admin.

**--config-dir** _PATH_
> Server: override the configuration directory (default: ./config in development, $XDG_CONFIG_HOME/marchat in production).

**--doctor**
> Server and client: print environment and configuration diagnostics, then exit.

**--doctor-json**
> Server and client: same as --doctor with JSON output.

**--username** _NAME_
> Client: username to connect with.

**--server** _URL_
> Client: server WebSocket address to connect to (e.g. `ws://localhost:8080/ws`).

**--admin**
> Client: connect with admin privileges (requires --admin-key).

**--admin-key** _KEY_
> Client: admin authentication key. On the server this flag is deprecated in favor of MARCHAT_ADMIN_KEY.

**--skip-tls-verify**
> Client: skip TLS certificate verification (useful with self-signed certificates).

**--e2e**
> Client: enable end-to-end encryption.

**--keystore-passphrase** _PASS_
> Client: passphrase for the E2E keystore.

**--quick-start**
> Client: use the last connection or select from saved profiles.

**--auto**
> Client: connect automatically using the most recent profile.

**--non-interactive**
> Client: skip interactive prompts. With --e2e, --keystore-passphrase is required on the command line.

**--theme** _THEME_
> Client: color theme.

**--config** _PATH_
> Client: path to a config file.

# DESCRIPTION

**marchat** is a self-hosted, terminal-based group chat application with real-time WebSocket messaging, optional end-to-end encryption, a plugin system, file sharing, admin panel, and code snippet support. The TUI client is built with Bubble Tea and data is stored in SQLite.

The server is configured via environment variables (`MARCHAT_PORT`, `MARCHAT_ADMIN_KEY`, `MARCHAT_USERS`, `MARCHAT_GLOBAL_E2E_KEY`, etc.), which replace the deprecated `--port` and `--admin-key` server flags. End-to-end encryption uses ChaCha20-Poly1305 with a shared symmetric key. The plugin system supports community-built extensions for ANSI image sharing, text filters, and custom commands.

# CAVEATS

Requires running your own server instance. End-to-end encryption is optional, is enabled per client with **--e2e**, and uses one key shared by all participants (from the keystore or `MARCHAT_GLOBAL_E2E_KEY`), so it is not pairwise. Running the client without arguments launches an interactive configuration prompt.

# HISTORY

**marchat** was created by **Cod-e-Codes** and is written in **Go**.

# SEE ALSO

[irssi](/man/irssi)(1), [weechat](/man/weechat)(1)

# RESOURCES

```[Source code](https://github.com/Cod-e-Codes/marchat)```

<!-- verified: 2026-11-09 -->
