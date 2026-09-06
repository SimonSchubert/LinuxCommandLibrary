# TAGLINE

Linux actor runtime that turns a directory tree into an agent colony

# TLDR

Print the **installed version** (templates must match this tag)

```meclaw --version```

Report which **sandbox properties this host can enforce** (Landlock, netns, cgroup v2, seccomp)

```meclaw --sandbox-probe```

**Validate** a colony tree without spawning cells or opening HTTP

```meclaw --validate --root [path/to/colony] --templates [path/to/templates]```

Treat dangling edges and unregistered cell directories as **errors**

```meclaw --validate --validate-strict --root [path/to/colony]```

Run a colony as a **headless daemon** (no HTTP)

```meclaw --root [path/to/colony] --templates [path/to/templates] --daemon```

Boot a colony with the **HTTP API and operator UI**

```meclaw --root [path/to/colony] --templates [path/to/templates] --daemon --api [127.0.0.1:7777]```

**Apply a mutation manifest** and exit (receipt on stdout; `-` reads stdin)

```meclaw --root [path/to/colony] --templates [path/to/templates] --apply [grow.json]```

**List names** stored in a vault cell (never the secret values)

```meclaw --root [path/to/colony] --vault [/main/access/vault] --vault-status```

Store a **secret from stdin** into a vault cell

```printf '%s' "[secret]" | meclaw --root [path/to/colony] --vault [/main/access/vault] --vault-add [name]```

# SYNOPSIS

**meclaw** [**--root** _DIR_] [**--templates** _DIR_] [**--env** _PATH_] [**--api** _BIND_] [**--daemon**] [**--validate**] [**--apply** _PATH_] [_options_]

# PARAMETERS

**--root** _DIR_
> Filesystem root of the colony. Default **.**. Two daemons cannot share one root: a lease is taken before `colony.db` is opened.

**--templates** _DIR_
> Template library directory. Default **\<root>/templates**. Clone the git tag that matches **meclaw --version** so the library and the binary agree.

**--rescan-templates**
> Rebuild the templates registry from the templates directory on this boot.

**--env** _PATH_
> `.env` file used for `${VAR}` substitution. Default **\<root>/.env**. Behaviour knobs live in cell `params`; `.env` is the provider lane (API keys, model ids, endpoints).

**--api** _BIND_
> Bind address for the HTTP API and operator web UI (for example **127.0.0.1:7777**). Off by default: no port is opened.

**--daemon**
> Keep the process in the foreground until SIGTERM or Ctrl-C. Does not fork or call `setsid` (systemd **Type=simple**). Independent of **--api**: without it the colony runs headless.

**--validate**
> Dry run: bootstrap plan, schema checks, template scan, and mutation replay. No cell spawns, no HTTP listen. Exit **0** only when every check is clean. Takes precedence over **--api**, **--daemon**, and **--apply**.

**--validate-strict**
> With **--validate**, promote otherwise-warned findings (dangling `params.graph` endpoints, unregistered cell directories, header-contract violations) to a non-zero exit. Does nothing without **--validate**.

**--apply** _PATH_
> After boot, submit one mutation body or manifest (an ordered list of mutation bodies). **`-`** reads stdin. Without **--daemon** or **--api** this is a one-shot: boot, apply, print the receipt, shut down. The exit code follows the receipt's verdict. Against an already running colony, POST the same body to **/colony/mutations**.

**--sandbox-probe**
> Print which `params.sandbox` properties this **host** can enforce and exit **0**. Needs no colony root, opens no `colony.db`, and takes precedence over every other mode.

**--log** _PATH_
> JSONL tracing log. Default **\<root>/log.jsonl**. **--help**, **--version**, and **--sandbox-probe** do not create this file.

**--log-level** _LEVEL_
> Tracing default level (default **info**). Overridden by `colony.json` when present.

**--log-filter** _EXPR_
> `RUST_LOG`-style per-module filter.

**--blobs** _DIR_
> Blob storage directory. Default **\<root>/blobs**.

**--stdio-format** _FORMAT_
> Wire format of the stdin/stdout bridge in direct mode: **text** (default, one line in, one line out) or **json** (one JSON frame per line with the full envelope).

**--vault** _CELL_PATH_
> Colony path of the vault cell this invocation talks to (for example **/main/access/vault**). Required by every **--vault-*** mode. These modes do not boot a colony.

**--vault-add** _NAME_
> Store a secret under _NAME_. The secret is read from stdin (never from an argument). Refused while another meclaw process holds the root lease.

**--vault-status**
> List names and versions held by **--vault**, never content.

**--vault-revoke** _NAME_
> Revoke every active version of _NAME_. Needs no passphrase.

**--vault-key-source** _SOURCE_
> Where the vault passphrase comes from: **auto** (default; systemd credentials directory if `$CREDENTIALS_DIRECTORY` is set, otherwise a terminal prompt), **prompt**, **systemd-cred**, or **plainfile**. The flag never carries key material.

**--vault-key-file** _PATH_
> Key file for **--vault-key-source plainfile**. Refused unless group and others cannot read it (mode **0600**).

**-h**, **--help**
> Print the clap help listing.

**-V**, **--version**
> Print the binary version.

# DESCRIPTION

**meclaw** is a single static **Linux** binary that runs a **colony**: a directory tree of actors. Every folder is a cell (or a hive scope marker); its `config.json` is its definition; edges between folders are the routes a message can take. The harness is files, so `ls`, `grep`, `diff`, and `git` are the tooling, and agents can rewrite topology at runtime by posting a mutation to **/colony/mutations**.

The project ships three layers, and you only install the first. **meclaw** is the substrate (this binary). **meclaw-os** is an experimental operating system for agents, grown onto a running colony from JSON rather than deployed as a second package. An **assistant** is grown the same way. Typical talk to a running colony is HTTP (`POST /messages`, `POST /colony/mutations`) plus an operator UI at **http://BIND/ui/** when **--api** is set.

Without **--api**, **--daemon**, or **--apply**, meclaw runs **direct mode**: a stdin/stdout bridge that requires the colony root itself to be a hive (`config.json` with `"cell":{"type":"hive"}` at `/`). **--daemon** without **--api** boots the full colony headless until a signal. **--apply** boots, applies one manifest, prints the receipt, and exits.

Cells communicate with atomic messages. Built-in types include `llm`, `store`, `code` (runs **python3**), `bash`, `web_fetch`, `file`, `edit`, `proxy`, `timer`, `mcp`, `vault`, and `web`. An `llm` cell makes one provider call and emits one message; tool loops are edges, not an inner SDK loop.

Sandboxing is kernel-backed and fail-closed: **Landlock**, network namespaces, **cgroup v2**, and **seccomp**. A `restricted` profile that cannot be enforced refuses to spawn rather than running unsandboxed. That is why there is no macOS build. Authentication is left to a reverse proxy, as for any Linux daemon.

The public contract on 0.x is additive: the HTTP API, the template DSL, template ports, and documented `error_code` strings. The Rust crates are internals with no library SemVer.

# CONFIGURATION

**\<root>/**
> Colony filesystem. Passed with **--root**. Every directory that exists in the tree needs a `config.json`.

**\<root>/config.json**
> Per-node definition. `cell` is substrate (`type`, timeouts, mailbox). `params` is handed to the cell. Hive markers use `cell.type: "hive"` and may carry `params.graph` (initial edges) and `params.contract` (accepted/emitted lanes). A `cell.type: "ref"` marker names a template to grow on first boot.

**\<root>/colony.json**
> Optional colony-wide settings (watchdog, mailbox defaults, `mutation_receipts`, TTL). Absent file means defaults. A present-but-invalid file is a hard boot failure and a **--validate** error.

**\<root>/.env**
> Provider lane: secrets, model ids, endpoints (for example `OPENROUTER_API_KEY`, `MODEL_BRAIN`). Substituted as `${VAR}` when configs are read. Override with **--env**.

**\<root>/templates/**
> Class library. Cells in `templates/` are classes; cells in the tree are instances. Default location; override with **--templates**.

**\<root>/colony.db**
> SQLite persistence: registry, message log, mutation log, template index. Never deleted rows; disconnected cells are marked inactive.

**\<root>/log.jsonl**
> JSON tracing log (created on a real boot, not on **--help** / **--version** / **--sandbox-probe**).

**\<root>/blobs/**
> Blob store for large message bodies. Override with **--blobs**.

**\<root>/cell.db** (per cell directory)
> That cell's own state. A cell never reads another cell's database or `colony.db`; foreign state is requested with a message.

# CAVEATS

Linux only. The security model is the kernel; without Landlock, unprivileged user/net namespaces, cgroup v2, and seccomp, "sandboxed" would be a promise. Run **meclaw --sandbox-probe** on the target host. Resource **limits** need the daemon under a systemd **user** unit (`Delegate=yes`); an ssh session scope often cannot move processes into a sub-cgroup.

The first cold start of the ~25 MB binary can stay silent for around 40 seconds; later starts are well under a second.

`code` cells run **python3**, nothing else. Voice is not implemented. The project is 0.x and not recommended for unsupervised production.

Templates must match the binary: clone `v$(meclaw --version | cut -d' ' -f2)`. Growing the shipped OS and assistant needs a provider key (OpenRouter in the README quickstart).

**--vault-add** refuses to write while a colony is running on the same root. **--vault-revoke** proceeds with a warning; restart the daemon for the live vault cell to see it.

Unknown CLI flags are rejected. Hidden debug flags (`--tokio-console`, `--tokio-console-port`) are omitted from **--help**.

# HISTORY

**meclaw** is a Rust (edition 2024) project by **mmeyerlein**, dual-licensed MIT or Apache 2.0. The public GitHub repository was created on **16 June 2026**. The binary version at documentation time is **0.30.1** (5 September 2026). There is no `meclaw` library API; the CLI and HTTP/template surfaces are the product.

# SEE ALSO

[curl](/man/curl)(1), [jq](/man/jq)(1), [git](/man/git)(1), [python3](/man/python3)(1), [openclaw](/man/openclaw)(1)

# RESOURCES

```[Source code](https://github.com/mmeyerlein/meclaw)```

```[Homepage](https://meclaw.ai)```

```[Documentation](https://github.com/mmeyerlein/meclaw/blob/main/docs/README.md)```

<!-- verified: 2026-09-07 -->
