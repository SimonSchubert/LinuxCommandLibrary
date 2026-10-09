# TAGLINE

Cache a command's stdout in memory and reuse it until it expires

# TLDR

Give this **shell session** its own tenant key

```export ONCE_TENANT="${ONCE_TENANT:-$(uuidgen)}"```

Cache a **1Password secret** for 8 hours, shared across directories

```once --ttl 8h --no-dir -- op read op://[vault]/[item]/[field]```

Cache **directory-dependent** output (working directory is part of the key)

```once --ttl 30m -- git rev-parse HEAD```

**Force a fresh run** and replace the cached value

```once --ttl 1h --refresh --no-dir -- op read op://[vault]/[item]/[field]```

Expire at whichever comes first, the **TTL or an absolute time**

```once --ttl 24h --until "$(date +%F)T22:00" --no-dir -- op read op://[vault]/[item]/[field]```

Wrap a **pipeline** so the shell, not `once`, parses pipes and globs

```once --ttl 1h -- sh -c 'op item get "[item]" --format json | jq -r .fields[0].value'```

Show the **daemon**, entry count, and when it will stop

```once status```

**Drop every cached value** and stop the daemon

```once clear```

# SYNOPSIS

**once** **--ttl** _DURATION_ [**--until** _TIME_] [**--tenant** _KEY_] [**--refresh**] [**--no-dir**] **--** _COMMAND_ [_ARGS_...]

**once** **status**

**once** **clear**

**once** **help** | **-h** | **--help**

# DESCRIPTION

**once** runs a command in the current directory, prints its stdout, and keeps that stdout in a small per-user background daemon. Later calls with the same command, directory, and tenant key are answered from memory until the entry expires. The daemon exits on its own once its last entry has expired.

The usual case is reading secrets (for example from the 1Password CLI **op**) without repeating an interactive approval on every call. The first invocation runs the command; later invocations with the same cache key return the stored stdout.

The command after **--** is executed directly, with no shell. Environment variables, the working directory, stdin, stderr, and the terminal are inherited. Only stdout is cached. A non-zero exit is never cached; that exit code is passed through. Outputs larger than **64 MiB** are printed but not stored.

The cache key is **HMAC-SHA256**(tenant, working directory ‖ command ‖ args), with each field length-prefixed so `["a b"]` and `["a", "b"]` cannot collide. With **--no-dir** the directory is omitted from the key; on a miss the command still runs in the current directory. Entries created with and without **--no-dir** are separate.

The daemon is started on demand by re-executing this binary as **once __daemon**. It listens on a Unix socket in a per-user directory of mode **0700** (socket **0600**): `$ONCE_RUNTIME_DIR` if set, otherwise `$XDG_RUNTIME_DIR/once-<uid>/`, otherwise a subdirectory of the temp dir. Values live in the daemon's memory only. The tenant key is used on the client and is never sent to the daemon.

Linux and macOS. Install from source with `go install github.com/alex0ptr/once@latest` (Go 1.27+, standard library only).

# COMMANDS

**status**
> Print whether the daemon is running, its pid and start time, the number of entries and their size, the next expiry, when it will shut down, and the socket path. Exits **1** if the daemon is not running.

**clear**
> Drop every cached value and stop the daemon. If nothing is running, prints that and exits **0**.

**help**, **-h**, **-help**, **--help**
> Print usage and exit **0**.

# PARAMETERS

**--ttl** _DURATION_
> How long to cache a successful result. Required, and must be positive. Go duration syntax: **30m**, **1h**, **24h**, **1h30m**. Units are **ns**, **us**, **ms**, **s**, **m**, **h** (no **d**).

**--until** _TIME_
> Absolute upper bound for expiry. The entry expires at whichever comes first, **--ttl** or **--until**. Accepted forms: RFC 3339 (with or without seconds; zone **+02:00** or **+0200**), and local date/time without a zone: `2026-10-09T06:00:00`, `2026-10-09T06:00`, `2026-10-09 15:04`, `2026-10-09`. If **--until** already lies in the past, the command runs and the result is not cached.

**--tenant** _KEY_
> Namespace for the cache key. Defaults to **$ONCE_TENANT**. One of **--tenant** or **$ONCE_TENANT** is required. A tenant is a namespace, not a secret: it separates shells, projects, and scripts, and makes keys hard to guess. It does not keep other processes of the same user out of the cache. A key passed on the command line appears in the process list.

**--refresh**
> Ignore any cached value, run the command, and overwrite the cache on success.

**--no-dir**
> Leave the working directory out of the cache key so one value serves every directory. Use this for commands whose output does not depend on cwd (for example **op read**). Leave it off when the same command can differ by directory (`git rev-parse HEAD`, `cat .version`).

# ENVIRONMENT

**ONCE_TENANT**
> Default tenant key when **--tenant** is omitted. A typical interactive setup is `export ONCE_TENANT="${ONCE_TENANT:-$(uuidgen)}"` in the shell rc so each new terminal gets its own tenant while child processes share it. Use a fixed value to share the cache across terminals.

**ONCE_RUNTIME_DIR**
> Directory for the Unix socket, lock file, and `daemon.log`. Must be owned by the current user and is forced to mode **0700**.

**XDG_RUNTIME_DIR**
> Used when **ONCE_RUNTIME_DIR** is unset: the runtime directory is `$XDG_RUNTIME_DIR/once-<uid>/`. If this is also unset, the temp directory is used instead.

# CAVEATS

Processes of the same user can talk to the socket and can read the tenant key from the environment or a config file, so they can use the cache. Other users cannot: the runtime directory is **0700** and the socket is **0600**.

Cached values are unencrypted in the daemon's memory. They are overwritten before they are dropped (best effort). Memory is not locked against swapping. The daemon disables core dumps (`RLIMIT_CORE` 0, and `PR_SET_DUMPABLE` 0 on Linux).

Expiry is compared against the wall clock on every read, so a laptop sleep does not extend the TTL. Go timers are capped at 30 seconds so a wake-up is noticed quickly.

`once` is not a shell: pipes, globs, and redirections after **--** are not expanded. Wrap them in **sh -c**. Commands whose names look like flags need the **--** separator.

# SEE ALSO

[chronic](/man/chronic)(1), [timeout](/man/timeout)(1), [op](/man/op)(1), [direnv](/man/direnv)(1), [mise](/man/mise)(1), [uuidgen](/man/uuidgen)(1), [go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/alex0ptr/once)```

<!-- verified: 2026-10-09 -->
