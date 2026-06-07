# TAGLINE

Worktree-scoped development stack orchestrator

# TLDR

**Bring up the stack** described by lich.yaml in the current worktree

```lich up```

**Stop the stack** in the current worktree

```lich down```

**Tail logs** from the running stack

```lich logs```

**List all running stacks** across worktrees

```lich stacks```

**Tear down every stack** on the machine

```lich nuke```

# SYNOPSIS

**lich** _command_ [_options_]

# DESCRIPTION

**lich** reads a **lich.yaml** file that describes a development stack (Docker containers, host processes, environment variables and lifecycle) and brings it up with **per-worktree isolation**. Several copies of the same stack can run at once on a single machine without port collisions or resource conflicts, which makes it useful when working on multiple Git branches or worktrees in parallel.

Services are containers that lich manages through Docker, while **owned** entries are host processes (for example a dev server) that lich starts and supervises. Ports can be published into environment variables so processes discover each other, and values support template interpolation such as **${services.postgres.host_port}**.

# COMMANDS

**up**
> Bring the development stack up in the current worktree.

**down**
> Stop the development stack in the current worktree.

**logs**
> Tail logs from the running stack.

**stacks**
> List all running stacks across worktrees with status, uptime, service count and URLs.

**nuke**
> Tear down all stacks on the machine.

# CONFIGURATION

A **lich.yaml** file in the project root describes the stack. Top-level keys:

**version**
> Configuration schema version (currently 1). Required.

**services**
> Docker containers to manage. Each entry sets an image, port mappings (optionally exposed through published_env) and environment variables.

**owned**
> Host processes to manage. Each entry sets a working directory (cwd), a command (cmd), a port and environment variables, with template interpolation of service values.

The **LICH_TELEMETRY** environment variable can be set to 0 to disable anonymous usage telemetry.

# HISTORY

**lich** is an open-source CLI written in **TypeScript** and built on the **Bun** runtime, created by **RPate97**. It is distributed under the **MIT** license, with documentation at lich.sh.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [foreman](/man/foreman)(1), [git](/man/git)(1)
