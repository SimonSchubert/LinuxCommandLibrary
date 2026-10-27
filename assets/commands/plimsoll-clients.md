# TAGLINE

Offline registry tool for Plimsoll caller tokens

# TLDR

**Create** a caller and print the token once

```TOKEN="$(plimsoll-clients create -file [clients.json] -id [tutorial] -token-stdout)"```

**List** callers (no tokens)

```plimsoll-clients list -file [clients.json]```

Same list as **JSON**

```plimsoll-clients list -file [clients.json] -json```

**Rotate** a caller's token

```plimsoll-clients rotate -file [clients.json] -id [tutorial] -token-stdout```

**Revoke** a caller

```plimsoll-clients revoke -file [clients.json] -id [tutorial]```

**Import** an existing token from stdin

```plimsoll-clients import -file [clients.json] -id [tutorial] < [token.txt]```

Set a **daily microVM allowance** (seconds)

```plimsoll-clients limit -file [clients.json] -id [tutorial] -paid-seconds-per-day [3600]```

# SYNOPSIS

**plimsoll-clients** _command_ **-file** _clients.json_ [_options_]

# DESCRIPTION

**plimsoll-clients** manages the JSON caller registry that **plimsolld** loads through **PLIMSOLL_CLIENTS_FILE**. It writes SHA-256 fingerprints, never plaintext tokens, and never contacts a daemon. Generated tokens go only to stdout when **-token-stdout** is set. Imported tokens arrive on stdin, never as arguments.

Commands: **create**, **import**, **limit**, **list**, **rotate**, **revoke**. Default scope for a new caller is `code:run`. Changes are offline: deploy the file and restart every daemon that uses it. Running daemons keep old credentials until they stop. Admitted work is not cancelled by editing the file. Revoking the last caller leaves an empty registry, which the daemon refuses to load.

Install with `go install github.com/plimsollmark/plimsoll/cmd/plimsoll-clients@latest`.

# COMMANDS

**create** **-file** _path_ **-id** _name_ **-token-stdout** [**-scope** _scope_] [**-paid-seconds-per-day** _n_]
> Generate a 256-bit hex token, store its fingerprint, and print the token to stdout. **-token-stdout** is required. **-scope** is repeatable

**import** **-file** _path_ **-id** _name_ [**-scope** _scope_] [**-paid-seconds-per-day** _n_]
> Read one token from stdin (optional single trailing newline; at most 4096 visible ASCII bytes) and add a caller

**limit** **-file** _path_ **-id** _name_ **-paid-seconds-per-day** _n_
> Set that caller's daily allowance on a metered provider (E2B, Docker Cloud), in seconds of microVM wall time per UTC day. **0** removes it. Restarting the daemon that applies the change starts a fresh day in memory

**list** **-file** _path_ [**-json**]
> Print caller IDs, scopes, and allowances. Never tokens or fingerprints

**rotate** **-file** _path_ **-id** _name_ (**-token-stdout** | **-token-stdin**)
> Replace a caller's token, keeping id and permissions. Exactly one of **-token-stdout** or **-token-stdin**. The new token must differ

**revoke** **-file** _path_ **-id** _name_
> Remove a caller

# PARAMETERS

**-file** _path_
> Registry path. Required on every command

**-id** _name_
> Caller ID. Required except on **list**

**-h**, **--help**, **help**
> Print usage

# CAVEATS

Route stdout of **create** / **rotate -token-stdout** to a secret manager; do not log or commit tokens. SIGPIPE on that pipe is ignored so a failed secret destination does not look like a clean success after the fingerprint is already stored. A daemon does not watch the file. Do not pass tokens as arguments. An allowance under **60** seconds is warned: each run reserves its timeout plus a **33 s** teardown bound on E2B and Docker Cloud.

# HISTORY

Part of **Plimsoll** (`plimsollmark/plimsoll`), Apache-2.0. The binary lives at `cmd/plimsoll-clients`.

# SEE ALSO

[plimsolld](/man/plimsolld)(1), [plimsoll-attest](/man/plimsoll-attest)(1), [plimsoll-specgen](/man/plimsoll-specgen)(1), [prospector-report](/man/prospector-report)(1), [go](/man/go)(1)

# RESOURCES

```[Source code](https://github.com/plimsollmark/plimsoll)```

```[Documentation](https://github.com/plimsollmark/plimsoll/blob/main/docs/getting-started.md)```

<!-- verified: 2026-10-12 -->
