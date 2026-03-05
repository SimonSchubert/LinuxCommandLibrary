# TAGLINE

Lightweight real-time terminal chat with E2E encryption

# TLDR

**Start the chat server**

```marchat-server```

**Connect to a chat server**

```marchat-client [server_address]```

# SYNOPSIS

**marchat-server** [_options_]

**marchat-client** [_options_] [_server_]

# DESCRIPTION

**marchat** is a self-hosted, terminal-based group chat application with real-time WebSocket messaging, optional end-to-end encryption, a plugin system, file sharing, admin panel, and code snippet support. The TUI client is built with Bubble Tea and data is stored in SQLite.

The plugin system supports community-built enhancements like ANSI image sharing, text filters, and custom commands.

# CAVEATS

Requires running your own server instance. End-to-end encryption is optional and must be explicitly enabled.

# HISTORY

**marchat** was created by **Cod-e-Codes** and is written in **Go**.

# SEE ALSO

[irssi](/man/irssi)(1), [weechat](/man/weechat)(1)
