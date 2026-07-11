# TAGLINE

Git versions files. moo versions the machine (isolated Linux microVMs per branch/commit)

# TLDR

**Create** a machine for the current branch or worktree

```moo new feat/billing```

**Run** a command inside the machine

```moo run feat/billing -- npm run migrate```

**Snapshot** the machine state tied to the current commit

```moo save feat/billing```

**Open** a host URL for a forwarded guest port

```moo open feat/billing 3000```

**Destroy** a machine

```moo drop feat/billing --force```

**Check** status of machines

```moo ls```

# SYNOPSIS

**moo** <verb> <name> [options]

# DESCRIPTION

moo gives every git branch, worktree or agent attempt its own hardware-isolated Linux microVM containing databases, ports, packages and services. Machine state is saved per commit and restored on `git checkout`, enabling true time-travel for the full runtime.

It uses copy-on-write, boots quickly, and keeps storage small even with many machines. Primarily for macOS Apple Silicon hosts today (Linux host support planned). Working tree files are synced into the guest on demand (`new`/`run` from inside the repo).

The four core verbs are new, run, save, drop. Admin helpers include `ls`, `open`, and `doctor`.

# VERBS

**new** <name> [from <src>] [--detached]
> Create or boot a machine. Prefers a snapshot for the current commit when present. `<src>` may be a git ref/SHA, snapshot ID, or another machine name.

**run** <name> -- <cmd>...
> Execute a command inside the machine (services persist between runs).

**save** [<name>]
> Snapshot current machine state, associated with the current git commit.

**drop** <name> [--force] [--snapshots]
> Destroy the live machine (snapshots remain unless `--snapshots`).

**ls**
> List machines, ports, and snapshots.

**open** <name> [guest-port] [/path]
> Print (and open) the host URL for a forwarded guest port.

**doctor**
> Run host readiness checks.

# CAVEATS

- Currently Apple Silicon macOS host + Linux (arm64) guests; alpha pre-1.0 (snapshot format may change).
- `moo save` before `git checkout` to preserve unsaved runtime work — `new` prefers the snapshot for HEAD over the live overlay.
- Network is fully isolated per machine; use `moo open` / `[network] ports` in `moo.toml` for host reachability.
- Base images come from OCI registries without a Docker daemon; Docker is not required.

# SEE ALSO

[git](/man/git)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/heyito/moo)```

```[Documentation](https://github.com/heyito/moo#readme)```

<!-- verified: 2026-07-11 -->
