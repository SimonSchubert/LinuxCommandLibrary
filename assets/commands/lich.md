# TAGLINE

Worktree-scoped development stack orchestrator

# TLDR

**Bring up the stack** described by lich.yaml in the current worktree

```lich up```

**Stop the stack** in the current worktree

```lich down```

**Bring up a specific profile**

```lich up [profile]```

**Tail logs** from the running stack

```lich logs```

**Show the last lines of one service** without following

```lich logs [service] --tail=[100] --no-follow```

**Restart selected services**

```lich restart [service]```

**Run a command** with the stack's resolved environment

```lich exec [npm test]```

**List all running stacks** across worktrees

```lich stacks```

**Show live CPU and memory** per service

```lich top```

**Tear down every stack** on the machine

```lich nuke```

# SYNOPSIS

**lich** _command_ [_options_]

# DESCRIPTION

**lich** reads a **lich.yaml** file that describes a development stack (Docker containers, host processes, environment variables and lifecycle) and brings it up with **per-worktree isolation**. Several copies of the same stack can run at once on a single machine without port collisions or resource conflicts, which makes it useful when working on multiple Git branches or worktrees in parallel.

Services are containers that lich manages through Docker, while **owned** entries are host processes (for example a dev server) that lich starts and supervises. Ports are allocated dynamically and can be published into environment variables so processes discover each other, and values support template interpolation such as **${services.postgres.host_port}**. A background daemon runs a reverse proxy so each stack's services are also reachable at friendly URLs like **http://web.**_worktree_**.lich.localhost:3300/**.

# COMMANDS

**up** [_profile_] [**--json**] [**--quiet**] [**--browser**] [**--raw**]
> Bring the stack up in the current worktree, running lifecycle hooks and printing the resolved URLs. Uses the default profile unless one is named.

**down** [**--worktree** _id-or-name_]
> Stop the stack and release its allocated host ports. The state directory is kept.

**restart** [_service_ ...]
> Restart the whole stack or the named services, respecting depends_on ordering.

**logs** [_service_] [**--tail=**_N_] [**--no-follow**]
> Stream logs from all services, or one service. Follows by default.

**urls** [**--raw**]
> Print reachable URLs, either friendly _service_._worktree_.lich.localhost URLs or raw localhost ports.

**stacks** [**--json**]
> List all running stacks on the machine with status, uptime, service count and URLs.

**top** [**--all**] [**--sort** cpu|mem|name] [**--no-follow**]
> Live per-service CPU and memory view.

**dashboard** [**--no-browser**]
> Open the lich web dashboard, starting the daemon if needed.

**exec** [**--env-group=**_group_] _cmd_ [_args_...]
> Run an ad-hoc command with the stack's resolved environment loaded.

**env** _group_
> Print a named env_group in dotenv format.

**init** [**--force**]
> Write a starter lich.yaml.

**validate** [_path_]
> Statically check a lich.yaml file.

**nuke** [**--yes**]
> Stop every stack on the machine and clean up state.

**update** [_version_] [**--check**]
> Upgrade the lich binary to the latest (or given) release.

Most stack commands accept **--worktree** _id-or-name_ to target another worktree's stack instead of the current directory.

# CONFIGURATION

A **lich.yaml** file in the project root describes the stack. Top-level keys:

**version**
> Configuration schema version (currently 1). Required.

**services**
> Docker containers to manage. Each entry sets an image, port mappings (optionally exposed through published_env) and environment variables.

**owned**
> Host processes to manage. Each entry sets a working directory (cwd), a command (cmd), a port and environment variables, with template interpolation of service values.

Anonymous usage telemetry is enabled by default. Disable it with **LICH_TELEMETRY=0**, with **{"telemetry":false}** in ~/.lich/config.json, or with **runtime: telemetry: false** in lich.yaml.

# HISTORY

**lich** is an open-source CLI written in **TypeScript** and built on the **Bun** runtime, created by **RPate97**. It is distributed under the **MIT** license and aimed in particular at running several coding agents in parallel worktrees.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [foreman](/man/foreman)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/RPate97/lich)```

```[Homepage](https://lich.sh/)```

```[Documentation](https://lich.sh/reference/cli)```

<!-- verified: 2026-11-23 -->
