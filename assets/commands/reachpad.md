# TAGLINE

CLI for durable cloud Linux workspaces that coding agents can attach to and share

# TLDR

**Sign in** (opens hosted login, then lists workspaces)

```reachpad```

**Create** a workspace and print its id

```reachpad create [scratch]```

**List** workspaces

```reachpad list```

**Attach** an interactive terminal (Ctrl-] detaches; the workspace keeps running)

```reachpad attach [workspace-id]```

**Run one command**, waking the workspace if it is paused

```reachpad run [workspace-id] -- [ls] [-la]```

**Pause** (seal the disk, stop compute)

```reachpad pause [workspace-id]```

Install shell **completions**

```source <(reachpad completions bash)```

# SYNOPSIS

**reachpad** [_global-options_] [_command_] [_args_ ...]

# PARAMETERS

**-w** _id_, **REACHPAD_WORKSPACE**
> Supply the workspace id for verbs that take one. Must appear **before** the verb (`reachpad -w id run -- ls`).

**--json**, **REACHPAD_JSON**
> One JSON object per command instead of prose.

**-q**
> Print ids only, one per line. Overrides **--json**.

**--api-key** _src_, **REACHPAD_API_KEY**
> Use an API key instead of the saved login credential. _src_ is **-** (stdin), **@**_path_, or **env:**_VAR_. A key on the argv is refused.

**--timeout** _duration_, **REACHPAD_TIMEOUT**
> Client-side deadline (default **10m**). A single **run** still cannot exceed ten minutes on the server.

**--profile** _name_, **REACHPAD_PROFILE**
> Separate endpoint, credential, and cache under this name.

**--endpoint** _host_, **REACHPAD_ENDPOINT**
> Override the saved API endpoint (rarely needed).

# COMMANDS

**create** [_name_]
> Create a workspace and print its id. The name is a label; the id is the handle.

**list** [**--state** running|paused|archived|all]
> List workspaces. Archived entries are hidden unless requested.

**status** _id_ [**--wait** running|paused|archived]
> Report one workspace. **--wait** blocks until that state or **--timeout**.

**run** _id_ **--** _command_ ...
> Run argv in the guest (not a shell). **-s** _line_ runs a shell string instead. **--cwd**, **--env**, **--stdin**, **--timeout** are accepted. Wakes a paused workspace. Exits with the guest command's status.

**attach** _id_ [**--new** | **--list**]
> Interactive terminal. **Ctrl-C** goes to the guest; **Ctrl-]** detaches. **--new** opens another terminal in the same workspace.

**pause** _id_ [**--wait**]
> Seal the disk and stop compute. Returns when the save has started; **--wait** until it is durable.

**fork** _id_
> Branch a new workspace from the last save.

**archive** _id_
> Free the live slot. Must be paused first (else exit 5). Snapshots are kept but the workspace can no longer be used.

**events** _id_ [**--since** _seq_]
> Stream the workspace event log; **--since** replays committed history first.

**auth login** [**--no-browser**] [**--operator-token -**]
> Sign in. Default opens hosted WorkOS login. **--no-browser** prints a URL. **--operator-token -** pastes a one-shot credential from stdin (recovery/automation).

**auth whoami** / **auth logout** [**--all**]
> Show the saved identity and limits, or revoke and delete credentials (this machine, or **--all** machines).

**keys mint** [**-w** _id_] [**--label** _text_] [**--ttl** _duration_] [**--role** collaborator|owner]
> Print an **rpak1.** API key once (last line is the secret). Default role **collaborator**; default lifetime 90 days (max 365). Without **-w** the key covers the account.

**keys list** / **keys revoke** _key-id_
> List or revoke minted keys.

**doctor** / **update** / **completions** _shell_
> Health check (prints no secrets); update an installer-managed binary (Homebrew/npm installs are directed to those tools); emit bash, zsh, or fish completions.

**connect github** / **ports** / **budget** / **kill-switch**
> Link GitHub so clones work inside the workspace; publish a guest port; cap brokered model spend; account-wide stop.

**ws lineage** / **ws rewind**
> v0.1 spellings kept until they get first-class verbs. Fork/rewind history of a workspace.

# DESCRIPTION

**reachpad** is the command-line client for Reachpad cloud workspaces: Linux VMs whose **disk** is sealed to durable storage when you pause, so a later **run** or **attach** resumes from that disk. The VM comes and goes; the disk is the workspace. Workspaces have three states — **running** (compute billed, holds a concurrency slot), **paused** (disk kept, no VM), and **archived** (no slot, unusable until forked).

First **reachpad** with no arguments signs in through hosted WorkOS (MFA/SSO happen there; the CLI never sees the password), then lists workspaces. The production endpoint (**m1.reachpad.dev**) and a user credential are saved mode **0600**. Per-workspace credentials are cached under **~/.local/state/reachpad/**.

The binary is the Rust **reach** crate, shipped as **reachpad**. Install via Homebrew tap **reachpad/tap/reachpad**, **npm install -g @reachpad/cli** (a launcher around the same binary), or `curl -fsSL https://reachpad.dev/install | sh` (checksum-verified into **~/.local/bin/reachpad**). Do not mix installers on the same path.

# CAVEATS

Requires a Reachpad account and network access to the fleet. One **run** is capped at **ten minutes** and **four** concurrent commands per workspace (a fifth exits **6**). Workspace-scoped API keys cannot call account-wide verbs (**list**, **budget**, **keys**, **auth**). Archiving a running workspace is refused. Source is published for inspection but is **not** an open-source license (copyright Tako Research). The public GitHub tree is a release snapshot; file issues rather than PRs.

# HISTORY

The CLI is developed by **Tako Research** as part of Reachpad. Workspace crate version around **0.4.5** in the published source snapshot.

# SEE ALSO

[ssh](/man/ssh)(1), [claude](/man/claude)(1), [opencode](/man/opencode)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/Reachpad/reachpad-cli)```

```[Homepage](https://reachpad.dev)```

```[Documentation](https://reachpad.dev/docs/cli)```

<!-- verified: 2026-08-27 -->
