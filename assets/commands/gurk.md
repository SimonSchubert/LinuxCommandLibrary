# TAGLINE

Signal Messenger client for the terminal

# TLDR

**Start gurk** and link to Signal account

```gurk```

**Start with a specific config file**

```gurk --config [path/to/config.toml]```

# SYNOPSIS

**gurk** [**--config** _path_]

# DESCRIPTION

**gurk** is a Signal Messenger client that runs entirely in the terminal. It provides a TUI interface for sending and receiving encrypted messages through the Signal protocol, supporting both individual and group conversations.

On first launch, gurk displays a **QR code** that can be scanned with the Signal mobile app to link the terminal client as a secondary device. Once linked, messages sync between devices and conversations can be managed using keyboard shortcuts.

The client stores its data and configuration in a local directory, and supports customizable key bindings through a TOML configuration file.

# CAVEATS

Requires an existing Signal account on a mobile device for linking. Does not support creating new Signal accounts. Some Signal features like voice/video calls and stories are not available in the terminal client. Message history before linking is not synced.

# HISTORY

**gurk** (gurk-rs) was created by **boxdot** and is written in **Rust**. The name is German slang for cucumber. It is the only actively maintained Signal client for the terminal, providing privacy-focused messaging for headless systems and terminal-centric workflows.

# SEE ALSO

[iamb](/man/iamb)(1), [weechat](/man/weechat)(1)
