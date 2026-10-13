# TAGLINE

CLI for Agor, a local daemon and web workspace for multiplayer AI coding agents

# TLDR

**Initialize** config, database, and selected agent tools

```agor init```

Start the **daemon** in the background

```agor daemon start```

Open the **web UI** in a browser

```agor open```

Check the **installation** and agent tools

```agor doctor```

**Sign in** to a remote workspace

```agor login --url [https://my-workspace.example.com]```

Add a **git repository**

```agor repo add [git@github.com:org/repo.git]```

List **sessions**

```agor session list```

Reconcile **agent tool** packages after an upgrade

```agor install --sync```

# SYNOPSIS

**agor** [_command_] [_subcommand_] [_options_]

# DESCRIPTION

**agor** is the oclif command line for **Agor**, a self-hosted workspace that runs coding agents (Claude Code, Codex, Gemini, OpenCode, Copilot, and Cursor in beta) on isolated git branches. The CLI and the React web UI both talk to a local **daemon** (FeathersJS: REST, WebSocket, and MCP). The npm package is **agor-live**; the binary you type is **agor**.

Typical first run: `npm install -g agor-live`, then **agor init**, **agor daemon start**, **agor open**. **init** creates `~/.agor/` (config and database) and installs the agentic tool packages you select. Interactive init requires at least one tool; a headless install with no tools must pass **--agentic-tools none**. Later, **agor install** changes or repairs those packages; it does not recreate Agor. **agor install --sync** reconciles the recorded selection without prompting.

The daemon owns the database, services, and MCP HTTP endpoint (default `http://localhost:3030`, MCP at `/mcp`). Packaged **daemon start** and **daemon restart** refuse to detach when a selected integration is missing, corrupt, or from a different Agor version, and print the **agor install --sync** repair command. Default config is `~/.agor/config.yaml`; default SQLite/LibSQL database is `~/.agor/agor.db`. PostgreSQL is supported for multi-user deployments.

Most resource commands (boards, branches, repos, sessions, users, MCP, knowledge) need a running daemon and a login. **agor login** authenticates against the local effective config or **--url**. Hosted workspaces can use **--web** (browser-assisted key) or **--api-key**. **agor open** launches the UI for the local deployment, or **--remote** for the connected host.

Requires **Node.js ≥ 22.12** and **git** on `PATH`. Linux and macOS are supported; native Windows is not (WSL or a remote daemon plus a browser). HTTPS remotes need a working system CA store; SSH remotes need an SSH client and keys or agent.

# PARAMETERS

**init**
> Create config and database and install selected agentic tools. **--force** deletes the entire `.agor` directory and re-initializes. **--skip-if-exists** is idempotent (Docker). **--agentic-tools** is a comma-separated list, or **all** / **none**. **--non-interactive** fills missing state without prompts. **--daemon-port**, **--daemon-host**, **--instance-label** set listen address and a deployment label.

**install**
> Select or repair agentic tool packages. **--sync** reconciles without changing the selection.

**doctor**
> Check the local install and agent tools. **--json** prints machine-readable output.

**open**
> Open the web UI. **--local** (default) or **--remote**.

**login**
> Authenticate with a deployment. **--url**, **--local**, **--email** / **--password**, **--web**, **--api-key**.

**logout**
> Clear the current connection. **--keep-key** leaves the server-side CLI key; **--force** drops the local login even if the key could not be deleted.

**version**
> Show daemon version from `/health`. **--remote** inspects the connected host.

**config**
> Print effective config (YAML file + environment + defaults). **--yaml**; **--show-secrets** (requires **--yaml**).

**daemon start**
> Start the daemon. **--config** / **-c** (default `~/.agor/config.yaml`). **--foreground** / **-f** stays in the terminal.

**daemon stop**, **daemon restart**, **daemon status**
> Stop, restart, or report the managed daemon.

**daemon logs**
> Last lines of the production log (**-n** / **--lines**, default 50).

**db migrate**
> Apply pending migrations. **-y** / **--yes** skips the prompt. **--offline-cutover** is required for non-rolling upgrades when every daemon using the database is stopped.

**db status**
> Show applied migrations. **-v** / **--verbose**; **--json**.

**repo add** _url_
> Register a git remote (SSH or HTTPS). **-s** / **--slug** `org/name`. **repo list**, **repo rm**.

**branch add** _name_
> Create or checkout a branch on a board. Requires **--repo-id** and **--board-id**. **branch list**, **show**, **update**, **rm**, **archive**, **unarchive**. **branch env start** / **stop** / **restart** / **status** manage the per-branch dev environment.

**board list**
> List boards. Also **board clone**, **export**, **import**, **add-session**.

**session list**
> List agent sessions. **--status**, **--agent** (`claude-code`, `codex`, `gemini`, `opencode`, `copilot`), **--board**, **-l** / **--limit**.

**mcp add** / **list** / **show** / **remove**
> Manage MCP servers connected to the daemon.

**kb namespace list** / **show**, **kb document list** / **get**, **kb export** / **import** / **validate**
> Knowledge-base namespaces and documents.

**user create** / **list** / **update** / **delete**
> Local user accounts. **user create** accepts **--email**, **--name**, **--password**, **--role** (`superadmin`, `admin`, `member`, `viewer`).

**telemetry**, **telemetry on** / **off** / **test**
> Community telemetry status and opt-in.

**local add-repo**, **local create-admin**, **local scrub-git-remotes**, **local uploads cleanup**
> Filesystem operations that do not go through the remote API.

**tenant export** / **import** / **inspect** / **verify** / **delete**, **tenant gate acquire** / **inspect** / **release**
> Tenant data and write gates.

**-h**, **--help**
> oclif help for the CLI or a topic.

# CONFIGURATION

**~/.agor/config.yaml**
> Deployment config written by **agor init**. **agor config** prints the effective merge of this file, environment variables, and defaults.

**~/.agor/agor.db**
> Default LibSQL/SQLite database. PostgreSQL is selected through config / **DATABASE_URL**.

**DAEMON_PORT**, **DAEMON_HOST**
> Listen address for the daemon (default port **3030**, host **localhost**).

**AGOR_TELEMETRY**
> `0` disables all telemetry (including the one-time install ping). `1` enables it. **DO_NOT_TRACK=1** also disables it.

# CAVEATS

The CLI is not a standalone agent: without a running daemon, resource commands fail. Native Windows is unsupported. **init --force** deletes the entire `.agor` directory. Secrets in **agor config --yaml --show-secrets** belong only on a protected destination. Some database upgrades need **agor db migrate --offline-cutover** with every daemon stopped. Distro indexes may have no package; the documented install is **npm** (`agor-live`) or Docker Compose. The project license is **BSL 1.1**.

# HISTORY

**Agor** is developed by **Preset** (preset-io). The published npm bundle is **agor-live**; the CLI package inside the monorepo is **@agor/cli**. 0.26 series at the time of writing.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [gemini](/man/gemini)(1), [opencode](/man/opencode)(1), [git](/man/git)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/preset-io/agor)```

```[Homepage](https://agor.live)```

```[Documentation](https://agor.live/guide/getting-started)```

<!-- verified: 2026-10-13 -->
