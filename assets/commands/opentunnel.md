# TAGLINE

Ephemeral, end-to-end encrypted command tunnel for AI agents

# TLDR

**Install and start a host session on a remote machine**

```curl -fsSL https://opentunnel.sh | sh```

**Open a host session that an agent can connect to**

```opentunnel create```

**Execute a command on the host through the tunnel**

```opentunnel exec [command]```

**Run a self-hosted relay server**

```opentunnel relay --public-url [https://relay.example.com]```

# SYNOPSIS

**opentunnel** _create_ | _exec_ | _relay_ [_options_]

# DESCRIPTION

**opentunnel** creates an ephemeral, end-to-end encrypted command tunnel between an AI agent and a remote machine. It lets an agent run shell commands on another host without SSH keys, standing credentials, or permanent infrastructure: a host session prints a one-time invite, and the agent uses it to execute commands whose stdout, stderr, and exit codes come back as if the command had run locally.

The connection is encrypted end to end, so the relay that brokers the two sides only ever sees ciphertext. There is no persistent state: sessions, invites, and payloads are never stored, no accounts or long-lived tokens are involved, and pressing **Ctrl+C** on the host revokes access immediately. The relay is self-hostable and runs in Docker with minimal dependencies.

opentunnel is typically installed with a one-line shell script that downloads a checksum-verified binary and opens a single foreground session. The **create** subcommand starts a host session, **exec** runs commands through an established tunnel, and **relay** operates the brokering server.

# PARAMETERS

**create**

> Start a host session on the local (remote-to-the-agent) machine and print an invite.

**exec** _command_

> Execute a command on the host through the tunnel, returning stdout, stderr, and the exit code.

**relay**

> Run the relay server that brokers encrypted traffic between agent and host.

**--public-url** _URL_

> Set the relay's public URL. HTTPS is required for non-localhost origins.

# CAVEAT

opentunnel grants an agent the ability to run arbitrary commands on the host machine for the lifetime of the session, so only share an invite with an agent you trust and end the session as soon as the work is done. Although the relay sees only ciphertext, running your own relay gives the most control over where traffic is brokered.

# SEE ALSO

[ssh](/man/ssh)(1), [ngrok](/man/ngrok)(1), [cloudflared](/man/cloudflared)(1), [socat](/man/socat)(1)

# RESOURCES

```[Source code](https://github.com/akoenig/opentunnel)```

```[Homepage](https://opentunnel.sh)```

<!-- verified: 2026-06-23 -->
