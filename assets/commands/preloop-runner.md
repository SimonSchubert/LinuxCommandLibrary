# TAGLINE

Rust GitHub Actions runner that speaks the official protocol

# TLDR

**Register** this host against a GitHub repository

```preloop-runner configure --url [https://github.com/owner/repo] --token [registration-token]```

Register **without prompts**

```preloop-runner configure --url [https://github.com/owner/repo] --token [registration-token] --unattended```

Register as **ephemeral** (one job, then deregister)

```preloop-runner configure --url [https://github.com/owner/repo] --token [registration-token] --ephemeral --unattended```

Start **listening** for jobs

```preloop-runner run```

Take **one job** and exit

```preloop-runner run --once```

**Deregister** this runner

```preloop-runner remove --token [registration-token]```

**Lint** a workflow without running it

```preloop-runner lint -W [.github/workflows/ci.yml]```

Print **version** (includes protocol compatibility)

```preloop-runner --version```

# SYNOPSIS

**preloop-runner** [_--runner-root_ _dir_] [_--ca-bundle_ _file_] _command_ [_options_]

# DESCRIPTION

**preloop-runner** is a native Rust reimplementation of the GitHub Actions runner listener and worker (`Runner.Listener` plus `Runner.Worker`). It registers, polls, executes, and reports using the same protocol as the official .NET runner, against GitHub or a **preloop** engine. The binary is a few files and about **12 MB**, versus hundreds of megabytes for the official tarball that bundles Node runtimes.

The clap version string includes **protocol-compat 2.335.1**. Workspace version is **0.34.0**. Jobs can use the GitHub-current **broker** path (default) or the legacy Azure DevOps message-queue path (`--via azdo`). A hidden **worker** subcommand is spawned per job and reads NDJSON on stdin; it is not part of the operator surface.

Install the standalone binary from GitHub Releases, or `install.sh --runner`, which places it on `PATH` (commonly `~/.local/bin`). Container image: `ghcr.io/preloopdev/preloop-runner`. The **preloop** CLI's own `install.sh` also drops a Linux guest copy at `<prefix>/lib/preloop/runner/<triple>/preloop-runner` for microVM jobs.

# COMMANDS

**configure** **--url** _url_ **--token** _token_
> Register with a GitHub repository or organization. **--token** also reads **PRELOOP_RUNNER_TOKEN**. **--name** defaults to the hostname. **--labels** is a comma-separated list. **--work** is the work directory name relative to the runner root (default `_work`). **--runner-group** defaults to `default`. **--unattended** skips prompts. **--replace** overwrites an existing runner with the same name. **--ephemeral** deregisters after one job. **--no-externals** skips downloading Node.js externals

**run** [**--once**] [**--via** _broker_|_azdo_]
> Start the listener: poll for jobs and spawn workers. **--once** exits after one job. **--via** defaults to **broker**

**remove** **--token** _token_
> Deregister this runner

**lint** **-W** _file_ [**--workspace-root** _dir_]
> Parse and expand a workflow YAML file without executing it. **--workspace-root** is the repository root used to collect local reusable workflows

# PARAMETERS

**--runner-root** _dir_
> Runner root directory (default: current directory). Global

**--ca-bundle** _file_
> PEM CA bundle for custom certificate trust. Also honors **SSL_CERT_FILE**. Global

**-h**, **--help**
> Print usage. Every subcommand accepts it too

**-V**, **--version**
> Print the crate version and protocol compatibility tag

# ENVIRONMENT

**PRELOOP_RUNNER_TOKEN**
> Registration token for **configure** when **--token** is omitted

**SSL_CERT_FILE**
> Default path for **--ca-bundle**

# CAVEATS

This binary is the runner, not the Preloop control plane. To run `.github/workflows` locally in microVMs, use **preloop**. **configure** needs a registration token from GitHub (or from a preloop server). The official runner still works against a preloop engine unchanged; this binary is the smaller replacement. Protocol compatibility is pinned in the version string and can lag GitHub's newest runner release.

# HISTORY

**preloop-runner** ships in the **preloopdev/preloop** workspace as crate **preloop-runner**, MIT-licensed, alongside the **preloop** CLI.

# SEE ALSO

[preloop](/man/preloop)(1), [runner-watch](/man/runner-watch)(1), [act](/man/act)(1), [gh](/man/gh)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/preloopdev/preloop)```

```[Documentation](https://github.com/preloopdev/preloop/blob/main/crates/preloop-runner/README.md)```

<!-- verified: 2026-10-12 -->
