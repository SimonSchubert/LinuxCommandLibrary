# TAGLINE

HTTP credential proxy and vault for AI agents

# TLDR

**Start the vault server** and credential proxy (HTTP API + TLS proxy)

```agent-vault server -d```

**Run an AI agent command** with transparent credential brokering

```agent-vault vault run -- [claude]```

**Run any subprocess** through the credential proxy

```agent-vault vault run -- [curl https://api.example.com]```

**Stop the background** server daemon

```agent-vault server stop```

**Check the version**

```agent-vault --version```

# SYNOPSIS

**agent-vault** _command_ [_subcommand_] [_options_] [**--** _agent_command_]

# PARAMETERS

**server**
> Start the HTTP API (default port **14321**) and the TLS-encrypted transparent HTTPS proxy (default port **14322**).

**server** **-d**, **--daemon**
> Run the server in the background as a daemon.

**server stop**
> Stop a running server daemon.

**vault run** **--** _command_
> Execute _command_ with credential brokering enabled. Automatically creates a scoped session, injects **HTTPS_PROXY** and CA-trust environment variables, and transparently proxies outgoing HTTPS requests.

**--config** _FILE_
> Use an alternative configuration file.

**--port** _PORT_
> Override the HTTP API port (default **14321**).

**--proxy-port** _PORT_
> Override the HTTPS proxy port (default **14322**).

**--version**
> Print the Agent Vault version and exit.

**--help**
> Show help for Agent Vault or for a specific subcommand.

# DESCRIPTION

**agent-vault** is an HTTP credential proxy and vault designed to keep secrets away from AI agents while still letting them call authenticated APIs. Instead of handing raw API keys or tokens to the agent process, Agent Vault runs the agent as a child process with **HTTPS_PROXY** pointed at a local TLS-terminating proxy. The proxy injects the correct credentials into outbound HTTPS requests for allowed destinations, so the agent never sees the secret itself.

The server exposes an HTTP API on port **14321** (where credentials, policies, and sessions are managed via a web UI) and a transparent HTTPS proxy on port **14322**. The **agent-vault vault run -- <command>** wrapper spawns a short-lived scoped session, sets **HTTPS_PROXY** and the proxy's CA certificate in the child's environment, and tears the session down when the command exits.

This reduces the blast radius of a compromised or misbehaving agent: even if the agent is tricked into exfiltration, it cannot leak credentials it never held.

# CONFIGURATION

The web UI at **http://localhost:14321** is used to register credentials, define which hosts an agent session may reach, and inspect session activity. The server persists state under a data directory (e.g. the Docker volume **agent-vault-data** at **/data**).

# CAVEATS

Requires the agent to honor the **HTTPS_PROXY** environment variable and to trust the proxy's CA certificate; processes that bypass the proxy (e.g. via direct TCP or pinned certificates) will not benefit from credential brokering. The proxy terminates TLS locally, so traffic between the agent and the proxy is re-encrypted by Agent Vault rather than end-to-end to the remote host.

# HISTORY

**agent-vault** is developed by **Infisical** as part of their focus on secrets management for AI workloads, addressing the risk of giving autonomous agents long-lived credentials.

# SEE ALSO

[vault](/man/vault)(1), [mitmproxy](/man/mitmproxy)(1), [curl](/man/curl)(1)
