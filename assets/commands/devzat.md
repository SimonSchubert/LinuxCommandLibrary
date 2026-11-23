# TAGLINE

SSH-based chat server you join with your existing SSH client

# TLDR

**Connect** to the public Devzat server

```ssh [devzat.hackclub.com]```

**Pick a display name** on first login by passing it as the SSH username

```ssh [nickname]@[devzat.hackclub.com]```

**Connect over port 443** (behind restrictive firewalls, or without an SSH key)

```ssh [devzat.hackclub.com] -p 443```

**Run your own Devzat server** (listens on port 2221 by default)

```devzat```

**Run a server on a custom port**

```PORT=[4242] devzat```

**Run a server with a specific config file**

```DEVZAT_CONFIG=[path/to/devzat.yml] devzat```

# SYNOPSIS

**ssh** [_user_@]_devzat-host_ [**-p** _port_]

**devzat**   _(server-side)_

# DESCRIPTION

**Devzat** is a custom SSH server that drops connecting clients into a real-time chat room instead of giving them a shell. Because the protocol is plain SSH, **there is no client to install**: every device with an SSH client (Linux, macOS, Windows, even mobile SSH apps) can join.

On first login, the display name is the username supplied during the SSH handshake (**user@host**); change it later with the in-chat **nick** command. Servers identify users by their SSH public key, so the same key maps to the same identity across reconnects.

Chat supports rooms, direct messages, Markdown with syntax-highlighted code fences, per-user timezones, emoji shortcodes, and small built-in games. Self-hosted instances can bridge to Slack and Discord and expose a gRPC plugin API.

The **devzat** binary is the **server**; end users never need it. It takes no command-line flags: it reads **devzat.yml** in the current directory (or the path in **DEVZAT_CONFIG**), writing a default config on first run.

# IN-CHAT COMMANDS

**users**
> List users currently in the room.

**=**_user_ _message_
> Send a direct message to another user.

**cd** [_#room_|_user_]
> Join a room or a DM, or list rooms when run without arguments.

**nick** _name_
> Change your display name.

**tz** _Zone/City_ [**24h**]
> Set your timezone for message timestamps.

**man** _cmd_
> Show help for a specific command.

**cmds**
> List all available commands (**rest** lists uncommon ones).

**exit**
> Leave the chat (Ctrl+C also works).

# CONFIGURATION

**devzat.yml**
> Server config: **port**, **alt_port**, **admins**, **allowlist** (private mode), **integration_config** and more.

**PORT**
> Overrides the configured SSH listen port (default 2221).

**DEVZAT_CONFIG**
> Path to the config file.

# CAVEATS

If the server rejects you with **Permission denied (publickey)**, generate a key with **ssh-keygen** or join on port 443, which does not require a key. Server operators can read all messages (SSH only encrypts the hop to the server); do not share secrets in chat.

# HISTORY

**Devzat** was created by **Ishan Goel** (quackduck) in **April 2021** and is written in **Go**. The flagship public instance runs at **devzat.hackclub.com**, associated with Hack Club.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1), [weechat](/man/weechat)(1), [irssi](/man/irssi)(1)

# RESOURCES

```[Source code](https://github.com/quackduck/devzat)```

```[Documentation](https://github.com/quackduck/devzat/blob/main/Admin's%20Manual.md)```

<!-- verified: 2026-11-23 -->
