# TAGLINE

HTTP credential proxy and vault for AI agents

# TLDR

**Start the vault server** in the background (prompts for the master password)

```agent-vault server -d```

**Start the server** non-interactively, reading the master password from stdin

```echo "[password]" | agent-vault server --password-stdin -d```

**Stop the background** server

```agent-vault server stop```

**Log in** to a server from the CLI

```agent-vault login --address [http://127.0.0.1:14321]```

**Store a credential** in the active vault

```agent-vault vault credential set [ANTHROPIC_API_KEY]=[sk-ant-...]```

**Run an AI agent** with transparent credential brokering

```agent-vault run -- [claude]```

**Run an agent** in an isolated container instead of on the host

```agent-vault run --isolation container -- [claude]```

**Print version** and build information

```agent-vault version```

# SYNOPSIS

**agent-vault** _command_ [_subcommand_] [_options_] [**--** _agent_command_]

# PARAMETERS

**server** [_options_]
> Start the server: HTTP API and web UI on port **14321**, transparent HTTP/HTTPS (MITM) proxy on port **14322**.

**server -d**, **--detach**
> Run the server in the background after unlocking.

**server -p**, **--port** _PORT_
> Port for the API/UI (default **14321**; also respects the **PORT** environment variable).

**server --host** _HOST_
> Address to bind to (default **127.0.0.1**).

**server --mitm-port** _PORT_
> Port for the transparent proxy (default **14322**; **0** disables it).

**server --password-stdin**
> Read the master password from stdin for non-interactive use.

**server --database-url** _URL_
> Use PostgreSQL instead of the default local SQLite database (also respects **DATABASE_URL**).

**server --log-level** _LEVEL_
> **info** (default) or **debug** for per-request proxy logs.

**server stop**
> Stop a running server.

**login** [**--address** _URL_] [**--email** _EMAIL_]
> Authenticate the CLI against a server with email and password.

**run** [_options_] **--** _command_ [_args_]
> Wrap an agent process with Agent Vault access: creates a scoped session, sets **HTTPS_PROXY** and CA trust in the child's environment, and brokers credentials on outbound requests. Also available as **vault run**.

**run --isolation** **host**|**container**
> Run the agent directly on the host (default) or inside a Docker container with egress firewall rules.

**run --ttl** _SECONDS_
> Session lifetime (300 to 604800; server default is 24h).

**run --vault** _NAME_
> Target vault, overriding the active context.

**vault create** _NAME_
> Create a new vault.

**vault init**
> Bind the current directory to a vault (writes **agent-vault.json**).

**vault credential** **list**|**get**|**set**|**delete**
> Manage credentials stored in a vault.

**migrate-db --to** _URL_
> Migrate existing data to a PostgreSQL database.

**version**
> Print the version and build information (**--version** also works).

# DESCRIPTION

**agent-vault** is an HTTP credential proxy and vault designed to keep secrets away from AI agents while still letting them call authenticated APIs. Credentials (e.g. **ANTHROPIC_API_KEY**, a GitHub token) are stored in Agent Vault, and the agent is given dummy placeholder values such as **__anthropic_api_key__**. Outbound requests are routed through the proxy, which substitutes the real credentials or rewrites auth headers before forwarding to the target API, so the agent never holds the secret.

A single binary acts as both server and CLI client. The server exposes a management web UI and API on port **14321** and a transparent proxy on port **14322** that handles **CONNECT** for HTTPS upstreams and forward-proxy requests for HTTP. Service rules control which hosts and endpoints each agent may reach, and authenticated traffic is logged. Requests not matching a service are forwarded as plain proxy traffic unless the vault is set to deny unmatched hosts.

Agents connect using the **AGENT_VAULT_ADDR**, **AGENT_VAULT_TOKEN** and **AGENT_VAULT_VAULT** environment variables, or by being launched through **agent-vault run**.

# CONFIGURATION

**AGENT_VAULT_MASTER_PASSWORD**
> Master password used to encrypt stored data; read once at startup and then unset from the process.

**AGENT_VAULT_ADDR**, **AGENT_VAULT_TOKEN**, **AGENT_VAULT_VAULT**
> Server address, agent token, and target vault for agents running against a remote Agent Vault.

**DATABASE_URL**
> PostgreSQL connection string for production or multi-instance deployments.

The web UI at **http://localhost:14321** is used to create the owner account, vaults, credentials, service rules and agents. With Docker, state is kept in the **/data** volume.

# CAVEATS

The upstream repository now marks this standalone open-source project as **no longer recommended** for new setups; Infisical directs users to **Agent Vault in Infisical** instead. The agent must honor **HTTPS_PROXY** and trust the proxy's CA certificate; processes that bypass the proxy or pin certificates are not brokered. Upstream recommends running Agent Vault on a separate host from the agents and keeping the proxy port private to the agents' network.

# HISTORY

**agent-vault** was released as open source by **Infisical** in **2026**, written in **Go**. Its functionality has since been integrated into the Infisical platform, which is now the recommended way to run it.

# SEE ALSO

[vault](/man/vault)(1), [mitmproxy](/man/mitmproxy)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/Infisical/agent-vault)```

```[Documentation](https://docs.agent-vault.dev)```

<!-- verified: 2026-11-23 -->
