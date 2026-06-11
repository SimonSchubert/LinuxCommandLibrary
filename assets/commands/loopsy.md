# TAGLINE

LAN daemon for cross-machine command, file, and agent control

# TLDR

**Initialize** config and generate an API key

```loopsy init```

**Start** the daemon

```loopsy start```

**Stop** the daemon

```loopsy stop```

**Show** daemon status

```loopsy status```

**Initiate pairing** with another machine on the LAN (shows 6-digit code)

```loopsy pair```

**Complete pairing** with a peer at a known address

```loopsy pair [192.168.1.50]```

**List** paired phones

```loopsy phone list```

**Issue a phone-pair token** with a custom TTL

```loopsy mobile pair --ttl [seconds]```

**Tail** the audit log

```loopsy logs -f```

**Run a daemon health check**

```loopsy doctor```

# SYNOPSIS

**loopsy** _command_ [_subcommand_] [_options_]

# DESCRIPTION

**loopsy** is a small daemon and CLI that discovers other Loopsy daemons on the local network via **mDNS**, lets the user pair them once, and then exposes a focused set of capabilities between machines: run a command, open a long-lived PTY session, transfer files, browse a peer's filesystem, share key/value state, and exchange protocol-compliant messages with read receipts.

These capabilities are also exposed to AI coding agents (Claude Code, Codex CLI, Gemini CLI, Opencode, etc.) via **MCP**, so an agent running on one machine can drive another paired machine directly.

Pairing uses **ECDH (P-256)** with a 6-digit short authentication string that two users compare visually, similar to **Signal** safety numbers, to prevent man-in-the-middle attacks on the LAN.

# COMMANDS

**init**
> Generate the local configuration and API key.

**start** / **stop** / **status**
> Lifecycle control for the local daemon.

**enable** / **disable**
> Install or remove the auto-start unit (launchd, systemd, or Task Scheduler).

**doctor**
> Run a health check across config, daemon, MCP integration, and peers.

**logs** [**-f**]
> Print the audit log; **-f** follows new entries.

**key show** / **key generate**
> Display or rotate the local API key.

**pair** [_address_]
> Without an address, initiate pairing on the current machine and print a 6-digit verification code. With an address, complete pairing against the named peer.

**peers add** _address_
> Manually register a peer without mDNS discovery.

**phone list**
> List paired phones for this device.

**phone revoke** _id_
> Revoke a paired phone server-side.

**mobile pair** [**--ttl** _seconds_]
> Issue a pair token for a phone, printing a QR code and a 4-digit verification code.

**relay configure** _url_
> Point the daemon at a different relay (for cross-network use).

# OPTIONS

**--ttl** _seconds_
> Time-to-live for an issued pair token.

**--lan**
> Expose the daemon on the local network (non-default).

**-f**
> Follow log output (with **logs**).

# CONFIGURATION

The daemon stores its configuration and API key under the user's config directory (created by **loopsy init**). The auto-start unit installed by **loopsy enable** uses the platform's native mechanism: **launchd** on macOS, **systemd --user** on Linux, **Task Scheduler** on Windows.

# CAVEATS

Always compare the 6-digit code on **both** machines before confirming a pair — the short authentication string is what protects against an active attacker on the LAN. Exposing the daemon with **--lan** broadens its attack surface; only use trusted networks. Rotating the API key with **loopsy key generate** invalidates existing agent integrations.

# HISTORY

**loopsy** is developed by **leox255** as an open-source bridge between machines and AI coding agents over the local network and is distributed via **npm**. The design borrows pairing UX from **Signal** and **Magic Wormhole**.

# SEE ALSO

[ssh](/man/ssh)(1), [mosh](/man/mosh)(1)
