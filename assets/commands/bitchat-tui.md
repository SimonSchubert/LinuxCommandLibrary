# TAGLINE

Peer-to-peer encrypted chat over Bluetooth LE in the terminal

# TLDR

**Launch bitchat-tui** and connect to nearby peers

```bitchat-tui```

**Set your nickname** after launching

```/name [alice]```

**Join a channel** with an optional password

```/j #[channel] [password]```

**Send a direct message** to a user

```/dm [bob] [message]```

**List all online users**

```/online```

**Block a user**

```/block @[username]```

# SYNOPSIS

**bitchat-tui**

# DESCRIPTION

**bitchat-tui** is a terminal user interface client for BitChat, a secure peer-to-peer messaging protocol that operates over Bluetooth Low Energy. It enables off-grid encrypted communication without requiring internet connectivity or central servers. The application automatically scans for nearby peers via Bluetooth LE and establishes direct mesh connections.

All messages are end-to-end encrypted using **X25519** Elliptic Curve Diffie-Hellman for key exchange, **AES-256-GCM** for message encryption with integrity authentication, and **Ed25519** digital signatures for verifying message authenticity. Channel passwords are derived using **PBKDF2-SHA256** with 100,000 rounds. Large messages are automatically fragmented and reassembled across Bluetooth LE's limited packet size.

The TUI provides a sidebar-based interface built with **ratatui** and **crossterm**, organizing conversations into public chat, named channels, direct messages, and a blocked users list. Unread message indicators and section counters help track activity across channels.

Written in Rust, bitchat-tui runs on Linux, macOS, and Windows.

# CONFIGURATION

State is persisted in **~/.bitchat/state.json** and includes:

**Identity** -- Ed25519 signing key and X25519 encryption key, generated on first launch
**Nickname** -- User-chosen display name
**Channels** -- Joined channels, ownership info, and encrypted channel passwords
**Blocked peers** -- SHA256 fingerprints of blocked users

Channel passwords are encrypted at rest using AES-256-GCM with keys derived from the identity key.

# CAVEATS

The application accepts no command-line flags or options; all configuration is done interactively through TUI commands after launch. Requires a Bluetooth LE capable adapter. On Linux, the **dbus** system is required for Bluetooth access. Building from source on Windows requires Microsoft Visual C++ Build Tools with the "Desktop development with C++" workload. Communication range is limited by Bluetooth LE signal reach, typically around 10-100 meters depending on hardware.

# SEE ALSO

[bluetuith](/man/bluetuith)(1), [bluetoothctl](/man/bluetoothctl)(1), [hcitool](/man/hcitool)(1)
