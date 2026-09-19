# TAGLINE

CLI for Cua sandboxes, images, and computer-use automation

# TLDR

Log in with **OAuth device authorization**

```cua auth login```

Log in from a **headless terminal** (print the URL, do not open a browser)

```cua auth login --no-browser```

Check whether a **session** is stored

```cua auth status```

Launch a **local Linux sandbox** (Docker / QEMU, no cloud account)

```cua sb launch ubuntu:24.04 --local```

Claim a sandbox from a **Fleet pool** (needs Fleet credentials, not just login)

```cua sb launch --pool [pool] --name [sandbox]```

**List local sandboxes**

```cua sb ls --local```

Run a **non-interactive command** in a sandbox

```cua sb exec [sandbox] -- pwd```

Open an **interactive shell** in a sandbox

```cua sb shell [sandbox]```

**Delete** a sandbox without a prompt

```cua sb delete [sandbox] --force```

See which **local platforms** this host can build

```cua platform list```

Capture a **screenshot** of the current `cua do` target

```cua do screenshot --save [screenshot.png]```

Start an **MCP server** for an AI assistant

```cua serve-mcp```

Print the **CLI version**

```cua --version```

# SYNOPSIS

**cua** [_command_] [_options_]

# PARAMETERS

**auth**
> Manage the Cua cloud session (`login`, `logout`, `status`). Tokens are stored in the OS credential vault, not in a file the CLI writes itself.

**sandbox**, **sb**
> Create and control sandboxes, cloud or local (`launch`, `ls`, `info`, `exec`, `shell`, `suspend`, `resume`, `restart`, `vnc`, `delete`).

**image**, **img**
> Manage sandbox images. Cloud images live in the Cua workspace; local images live under `~/.local/share/cua/images/`.

**platform**
> Inspect platform definitions `cua image create` can build from (`linux-docker`, `linux-qemu`, `windows-qemu`, `android-qemu`, `macos-lume`) and whether this host meets their requirements.

**do**
> Send one automation command (click, type, screenshot, shell) to a selected target machine and exit. The current target is kept in `~/.cua/do_target.json`.

**skills**
> Record demonstrations on a sandbox and store them as skills for agents (`record`, `list`, `read`, `replay`, `delete`, `clean`). Requires the `skills` extra for recording.

**trajectory**, **traj**
> List, view, or delete sessions recorded from `cua do` under `~/.cua/trajectories/`.

**serve-mcp**
> Start a Model Context Protocol server on stdio so an AI assistant can drive Cua.

**wif-token**
> Exchange a CI provider identity for a Fleets workload token. `cua wif-token github` runs only inside GitHub Actions.

**do-host-consent**
> Grant consent for `cua do switch host` (drive this machine's desktop). Writes `~/.cua/host_consented`.

**-h**, **--help**
> Show help for the CLI or any subcommand.

**-v**, **--version**
> Print the installed `cua-cli` version and exit.

**--local**
> Target a sandbox or image on this machine instead of Cua cloud. Used by `sandbox` and `image` commands.

**--json**
> Print structured JSON instead of a table or status line (most commands that produce data).

**--force**
> Skip the confirmation prompt on delete.

# DESCRIPTION

**cua** is the command-line interface for Cua, an open-source computer-use platform. It authenticates against Cua cloud, launches and drives sandboxes (Linux, Windows, macOS, or Android), manages images, records skills and trajectories, and serves an MCP endpoint for AI assistants.

Local launches (`--local`) use Docker, QEMU/KVM, or Lume on the current host and do not need a cloud account. Cloud work uses two different backends: `--pool` claims a sandbox from a Cua Fleet pool at `https://run.cua.ai` (the supported path), while launching a cloud image without `--pool` still talks to the older VM API whose host has been retired.

The CLI is the `cua-cli` Python package. Command groups have short aliases (`sb` for `sandbox`, `img` for `image`, `traj` for `trajectory`). Bare `cua` prints help and exits 0.

# CONFIGURATION

**OS credential vault** (service `run.cua.ai`, account `cua-cli`)
> Refresh and access tokens from `cua auth login`. On Linux this is Secret Service (`gnome-keyring`, KWallet). Headless hosts have no vault by default.

**FLEETS_TOKEN**
> Fleet workload token. When set, it takes precedence over the interactive session for Fleet operations.

**PYTHON_KEYRING_BACKEND**
> Selects a `keyring` backend. Needed on headless Linux, for example `keyrings.cryptfile.cryptfile.CryptFileKeyring` or `keyrings.alt.file.PlaintextKeyring`.

**CUA_MCP_PERMISSIONS** / **CUA_SANDBOX**
> Default permission list and sandbox for `cua serve-mcp`. Overridden by `--permissions` and `--sandbox`.

**~/.cua/do_target.json**
> Last `cua do switch` target and zoom state.

**~/.cua/host_consented**
> Marker written by `cua do-host-consent`. Remove the file to revoke host-desktop consent.

**~/.local/share/cua/images/** and **~/.cua/cua-sandbox/**
> Local images (`cua image create` / `pull`) and local sandbox disks (`cua sb launch --local`). The XDG paths follow `XDG_DATA_HOME` / `XDG_STATE_HOME`; `~/.cua/` does not.

# CAVEATS

`cua auth login` does not authorize Fleet pool claims. `cua sb launch --pool` needs `FLEETS_TOKEN` or a `CUA_CLIENT_ID` / `CUA_CLIENT_SECRET` pair; a valid `cua auth status` is not enough.

Cloud image launches without `--pool` go through the retired `api.cua.ai` VM API and fail. Use `--pool` for cloud sandboxes or `--local` for this machine. Fleet has no list operation: `cua sb ls` cannot list cloud sandboxes; address them by name with `cua sb info`.

On Linux without a keyring, `cua auth login` fails after the browser approval because there is nowhere to store the refresh token. Install an encrypted or (on throwaway hosts only) plaintext file backend first.

`CUA_API_KEY` is not a CLI login path. Setting it routes SDK calls away from Fleet onto the retired VM API.

`cua do switch host` plus `cua do-host-consent` grants keyboard, mouse, and screen access to this desktop until `~/.cua/host_consented` is removed.

# HISTORY

Cua is developed by **Cua AI, Inc.** The **cua** CLI (`cua-cli`) was introduced in **April 2026** to manage cloud and local sandboxes from the terminal. It is a Python package published on Cua's own wheel index (`https://wheels.cua.ai/simple`), not on the default PyPI simple index.

# SEE ALSO

[docker](/man/docker)(1), [qemu](/man/qemu)(1), [lima](/man/lima)(1), [ssh](/man/ssh)(1), [uv](/man/uv)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/trycua/cua)```

```[Homepage](https://cua.ai)```

```[Documentation](https://cua.ai/docs/reference/cua-cli/cli-reference)```

<!-- verified: 2026-09-19 -->
