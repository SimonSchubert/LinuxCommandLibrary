# TAGLINE

Zero-config remote terminal sharing over HTTPS

# TLDR

**Share** the current terminal session with a QR code and join URL

```reminal```

**Connect** to a remote session from another terminal

```reminal connect [session_id] [pin]```

**Show session details** for the running agent on this machine

```reminal info```

**Run diagnostics** on version, relay reachability, and shell setup

```reminal doctor```

**Install** to ~/.local/bin without sudo

```curl -fsSL https://raw.githubusercontent.com/harshalgajjar/Reminal/main/install.sh | sh```

# SYNOPSIS

**reminal** [_command_] [_options_]

# PARAMETERS

**connect** _id-or-url_ [_pin_]
> Attach to a remote session; prompts for PIN if omitted.

**info** [_--json_]
> Reprint session ID, PIN, URL, and QR for the local agent.

**qr**
> Print only the join QR code for the running agent.

**doctor**
> Check version, relay connectivity, terminal, and shell.

**upgrade**
> Download and install the latest release.

**relay** [_port_]
> Start a local development relay (default port 8080).

**completion** _bash|zsh|fish_
> Print shell completion script to stdout.

**version**
> Print version string.

**--connect** _id_ **--pin** _pin_
> Alternative connect syntax shown in session banners.

# DESCRIPTION

**reminal** is a Go CLI that shares a persistent PTY on your machine through an encrypted WebSocket relay, so you can reconnect from a browser, phone, or another **reminal** client without opening inbound ports or managing SSH keys.

Running **reminal** generates an ephemeral session ID and PIN, displays a QR code, and keeps the shell alive while viewers connect. The relay sees only ciphertext; session credentials die when the agent exits. Viewers can use the built-in web terminal at the relay URL or connect with **reminal connect**.

The host only makes outbound HTTPS/WSS connections, which works on NAT, hotel Wi-Fi, and other networks that block inbound SSH. Auto-reconnect and scrollback replay help survive brief network drops.

# CAVEATS

reminal depends on a relay service (Cloudflare Workers by default or a self-hosted relay). It is **not** a drop-in SSH replacement for arbitrary remote administration — it shares an interactive shell you already started locally. Commercial use may require a separate license under the project's dual-licensing terms.

# HISTORY

**reminal** was created by **Harshal Gajjar** and released in **2026** as a zero-setup alternative to SSH for reaching your own machine from mobile devices and browsers.

# SEE ALSO

[ssh](/man/ssh)(1), [tmux](/man/tmux)(1), [caffeinate](/man/caffeinate)(1)

# RESOURCES

```[Source code](https://github.com/harshalgajjar/Reminal)```

<!-- verified: 2026-07-11 -->