# TAGLINE

Git versions files. moo versions the machine (isolated Linux microVMs per branch/commit)

# TLDR

**Create** a machine for the current branch or worktree

```moo new feat/billing```

**Run** a command inside the machine

```moo run feat/billing -- npm run migrate```

**Snapshot** the machine state tied to the current commit

```moo save feat/billing```

**Destroy** a machine

```moo drop feat/billing --force```

**Check** status of machines

```moo ls```

# SYNOPSIS

**moo** <verb> <name> [options]

# DESCRIPTION

moo gives every git branch, worktree or agent attempt its own hardware-isolated Linux microVM containing databases, ports, packages and services. Machine state is saved per commit and restored on `git checkout`, enabling true time-travel for the full runtime.

It uses copy-on-write, boots quickly, and keeps storage small even with many machines. Primarily for macOS Apple Silicon hosts today (Linux host support planned).

The four core verbs are new, run, save, drop. Working tree files are synced into the guest on demand.

# VERBS

**new** <name> [from <src>]
> Create or boot a machine. Prefers a snapshot for the current commit when present.

**run** <name> -- <cmd>...
> Execute a command inside the machine (services persist between runs).

**save** [<name>]
> Snapshot current machine state, associated with the current git commit.

**drop** <name>
> Destroy the live machine (snapshots remain unless --snapshots).

# CAVEATS

- Currently Apple Silicon macOS host + Linux (arm64) guests.
- `moo save` before `git checkout` to preserve unsaved runtime work.
- Network is fully isolated per machine; use `moo open` for port forwarding to host.

# RESOURCES

```[Source code](https://github.com/heyito/moo)```
```[Documentation](https://github.com/heyito/moo#readme)```

<!-- verified: 2026-07-10 -->

# SEE ALSO

git(1), docker(1)