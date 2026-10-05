# TAGLINE

Self-hosted pooled proxy for Claude Code

# TLDR

**Install the Linux server** as a systemd service

```curl -fsSL https://github.com/jaynlabs/jaynshare/releases/latest/download/install.sh | sudo sh```

**Invite a client** (prints a one-time `jaynshare join jsi1_…` token)

```jaynshare client invite [bob]```

**Join a pool** with that invite

```jaynshare join [jsi1_…]```

**Launch Claude Code** through the pool (picker when the pool cannot choose)

```jaynshare claude```

**Pin a session** to one pooled account

```jaynshare claude --account [name]```

**Let the pool pick**, then pass arguments to Claude Code

```jaynshare claude --auto -- -p "[prompt]"```

**Bypass the pool** and run Claude Code under the local login

```jaynshare claude --direct```

**Print a shell alias** so `claude` itself goes through the pool

```jaynshare alias```

**Show the pool table** with utilisation bars

```jaynshare status```

**Add a Claude account** (OAuth) as an enrolled client

```jaynshare account login --name [name]```

**Help for one verb**

```jaynshare help [claude]```

# SYNOPSIS

**jaynshare** [_global-options_] _verb_ [_options_] [_arguments_] [**--** _passthrough_]

# DESCRIPTION

**jaynshare** is a self-hosted proxy that pools Anthropic Claude subscriptions and API keys for **claude** (Claude Code). One Rust binary covers the Linux server, the operator CLI, and the enrolled client. After a server is installed, accounts are added, and a client joins with a single-use invite, engineers run **jaynshare claude** instead of **claude** and draw from an account that still has quota.

The server listens on a private-network address (Tailscale, or the host's only private address). TLS is pinned to the server's own identity. Clients present a per-machine secret. The pool routes each request by model glob, account eligibility, priority (lower wins), and optional per-route preference. On launch, **claude** can open a keyboard or numbered picker, take **--account**, take **--auto**, or skip the pool with **--direct**. Arguments after **--**, and remaining words after the launcher's own options, go to Claude Code unchanged.

The same executable is used as a remote operator with **--server** and **--operator-secret-file**. **--json** prints one JSON document on standard output for verbs that accept it; **jaynshare schema** prints the matching JSON Schema. **jaynshare help** and **jaynshare help** _verb_ never contact a server.

The project is MIT-licensed, written by Jayn Labs, and is not made by, endorsed by, or affiliated with Anthropic.

# PARAMETERS

**--json**
> One JSON document on standard output (global).

**-q**, **--quiet**
> Suppress progress and hints on standard error; errors still print.

**--no-color**
> Never emit colour. **NO_COLOR** in the environment has the same effect.

**--config** _path_
> Configuration file. Same meaning as **JAYNSHARE_CONFIG**, and wins over it.

**--server** _origin_
> Address a running instance by its base-URL origin as a remote operator.

**--operator-secret-file** _path_
> Protected file holding the remote-operator secret for **--server**.

**--tls-ca** _path_
> Extra trust anchor (PEM) for an https **--server** origin.

**--timeout** _seconds_
> Deadline for one control request (default 10).

**--yes**
> Answer every skippable confirmation.

**-V**, **--version**
> Version and build identity.

**help** [_verb_…]
> Help for the executable or one verb (one or two words, e.g. **account add**).

**version**
> Version and build identity.

**schema** [_verb_…]
> JSON Schema of a verb's **--json** document, or of every verb.

**claude** [**--account** _reference_ | **--auto** | **--direct**] [**--picker** keyboard|numbered] [_claude-arguments_…]
> Launch Claude Code through the pool. After a successful launch the exit code is Claude Code's. **--picker** wins over **JAYNSHARE_PICKER**.

**env** [**--account** _reference_ | **--auto** | **--direct**] [**--shell** sh|fish|powershell|cmd] [**--show**]
> Print the launch environment, quoted for the shell to evaluate (**eval "$(jaynshare env)"**).

**alias** [**--shell** sh|fish|powershell|cmd]
> Print the one shell line that makes **claude** run **jaynshare claude**.

**join** _invite_
> Join a pool with the operator's invite (`jsi1_…`), install that server's client, and optionally add a Claude account.

**update** [**--from** _zip_] [**--version** _semver_] [**--release-origin** _https-origin_]
> Apply a client kit to this installation.

**uninstall**
> Remove this client installation.

**trust-ca add** | **trust-ca remove**
> Add or remove the pool's MITM CA from the OS trust store (always confirmed).

**secret set** [**--stdin** | **--file** _path_]
> Install a rotated client secret.

**status** [**--verbose**] [**--check**] [**--operator** | **--client**] [**--accounts**] [**--routes**] [**--clients**] [**--config-section**] [**--line**] [**--session** _id_]
> Operator: the pool table with utilisation bars. Engineer: this client's view of the pool. **--check** prints nothing and answers with the exit code.

**account list** | **show** | **add** | **login** | **replace** | **remove** | **rename** | **enable** | **disable** | **operation** …
> Pool accounts (operator) or the accounts this client added (engineer **list** / **login**). **add** takes **--api-key**, **--portable**, **--server-file**, or **--claude-managed**.

**switch** [_reference_] [**--route** _name_] [**--clear**]
> Move the default account, steer one route, or list accounts with the default marked.

**route list** | **add** | **rm**
> Model-glob routes. **add** requires **--pattern** _glob_ (repeatable) and optional **--account**, **--bucket**, **--before**, **--after**.

**priority list** | **set** | **clear**
> Per-account priority; lower wins. Negative values are allowed.

**block list** | **add** | **rm**
> Blocked model patterns.

**probe** [**--wait**]
> Start a usage probe sweep.

**client list** | **show** | **invite** | **reissue** | **rotate** | **revoke** | **rename**
> Client registry. **invite** prints a single-use token that expires after a day by default (**--expires** accepts seconds, or a number with **s**, **m**, **h**, or **d**).

**operator secret set** | **remove**
> Create or delete the remote-operator secret (the pool's master key; disclosed once, never stored by the CLI).

**ca show** | **export** | **rotate**
> MITM CA fingerprint, PEM export, and rotation (**--now** replaces at once).

**config paths** | **new** | **show** | **validate** | **reload** | **set** | **unset** | **edit**
> Configuration file. **new --out** writes a scaffold and never overwrites. **edit** uses **$VISUAL** or **$EDITOR**. **SIGHUP** on **serve** also reloads.

**log tail** | **audit tail**
> Operational NDJSON log, or the audit log (never a body or a credential). **-n** / **--lines**, **--follow**, **--since**.

**api** _METHOD_ _/path_ [**--body-file** _path_ | **--body-stdin**] [**--header** _name:value_] [**--account** _reference_ | **--prefer** _reference_] [**--client** | **--operator**]
> Send one request through the proxy. Status and headers on standard error, body on standard output.

**release latest** | **verify** | **fetch**
> Discover, verify, or download a signed release from the release host.

**server preflight** | **install** | **update** | **uninstall** | **prune** | **auto-update**
> Native systemd install. **install** writes a configuration when none exists and ends with an invite. **auto-update** **on**|**off** updates every night; clients follow on their next launch.

**service install** | **remove** | **start** | **stop** | **restart** | **status**
> Register or control the platform service.

**serve**
> Run the server in the foreground until stopped; **SIGHUP** reloads.

**statusline** | **title-hook**
> Hooks Claude Code runs, not meant to be invoked by hand.

# CAVEATS

Pooling Claude subscriptions conflicts with Anthropic's published terms and can lead to suspension or termination of every account involved, without a refund. The project does not claim that a deployment is legal or authorized.

The server is a trusted intermediary, not an end-to-end encrypted relay. It receives request and response bodies in plaintext so it can route and retry them. Anyone who operates or compromises the server can read or alter that traffic.

Self-hosting expects a Linux host with systemd and a private network between engineers and the server. The published one-line join installer targets macOS and Windows; a Linux client installer is listed as future work. The same binary still builds with **cargo build --release**.

Invites work once and expire (default one day). Send them through a private channel. The audit log never stores a body or a credential.

Exit **0** is success, **1** unexpected failure, **2** usage error. **jaynshare help** _verb_ lists that verb's other rows (for example **claude** can exit 4, 6, 7, 11, 13, 14, 15, or 16 before it replaces itself).

# CONFIGURATION

The server configuration is a TOML file selected by **--config** or **JAYNSHARE_CONFIG**. **jaynshare config paths** prints every owned path in force, how it was selected, whether it exists, and its mode. **jaynshare config new --out** _path_ writes a minimal valid scaffold.

An enrolled client stores **client.toml** under the platform client directory. Without that file, engineer verbs exit **11** (`cli_not_enrolled`) and name the missing file.

**JAYNSHARE_PICKER** selects the account picker (`keyboard` or `numbered`) unless **claude --picker** is set. **NO_COLOR** disables colour.

# HISTORY

Jayn Labs started jaynshare so a small group could share leftover Claude Code quota. Version 1 drew on Team Claude's approach. Version 2 is a from-scratch Rust rewrite (crate **2.1.0**, rustc **1.95**) with a less invasive Claude Code config change. MIT license.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [systemctl](/man/systemctl)(1), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/jaynlabs/jaynshare)```

```[Homepage](https://jayn.app/jaynshare)```

<!-- verified: 2026-10-05 -->
