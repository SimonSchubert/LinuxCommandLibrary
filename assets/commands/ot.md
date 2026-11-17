# TAGLINE

Command-line client for an OpenTodo server

# TLDR

**Sign in** to a server

```ot login [https://todo.example.com]```

Show the account and token scope

```ot auth status```

Tasks **due today**

```ot today```

The **inbox** (no project and no date)

```ot inbox```

**Every** open task

```ot list```

**Add** a task

```ot add "[Call the plumber]" --project [Home] --due tomorrow```

**Complete** and **reopen**

```ot done [8c2a]```

```ot reopen [8c2a]```

**Delete** without a prompt

```ot rm [8c2a] --yes```

Start a **timer**

```ot time start [8c2a]```

Print **shell completion**

```ot completion [bash|zsh|fish]```

# SYNOPSIS

**ot** [_OPTIONS_] _COMMAND_ [_ARGS_]

# DESCRIPTION

**ot** is the OpenTodo client. It talks to an [opentodo](/man/opentodo)(1) server over HTTP. The server image does not include this binary. Install it with `go install github.com/OpenTodoApp/OpenTodo/cmd/ot@latest`, or `make cli` in a checkout, which writes `bin/ot`.

Global flags include `--profile`, `--server`, `--workspace`, `--json`, `--dry-run`, and `--yes`. `--json` prints machine-readable output. `--dry-run` prints the requests it would send. A read-only token, or `--read-only`, cannot change data.

Sign-in and account:

- `login URL` stores a session. `--profile NAME` selects which profile to write
- `auth set-token`, `auth status`, `auth logout --yes`
- `token list|create|revoke` manages API tokens. `create` prints the secret once
- `workspaces` lists workspaces. An unknown workspace exits 2
- `completion bash|zsh|fish` prints a completion script

Tasks:

- `today`, `inbox`, `upcoming`, `list` — views. `list` filters include `--project`, `--label`, `--completed`, `--all`, `--someday`, `--anytime`, `--blocked`, `--available`, and `--sector`
- `add`, `edit`, `done`, `reopen`, `rm`
- `task show`, `task note`, `task occurrences`, `task occurrence`, `task split`

Other groups in the CLI guide: `project`, `notes`, `time`, `routine` (alias `routines`), `frames`, `slots`, `objectives`, `habits`, `issues`, `audit`, `export`, `import`, `encryption`, `vault`, `mcp`, and `schema`. `ot schema` prints the command list as JSON. `ot COMMAND --help` is the flag list for one command. The 1.x surface stays compatible within 1.x.

A read token that cannot switch rules exits 5.

# CONFIGURATION

The config file is `~/.config/opentodo/config.json`, or `opentodo/config.json` under XDG config home, mode 0600. Override the path with:

```OPENTODO_CONFIG```

These variables override the file, which is useful for cron. None of them are printed back by the client:

```OPENTODO_PROFILE```

```OPENTODO_URL```

```OPENTODO_TOKEN```

```OPENTODO_WORKSPACE```

```OPENTODO_READ_ONLY```

Set the last one to `1` to refuse every change.

# CAVEATS

`rm`, `token create`, and `export` handle private data. `token create` writes the secret to standard output once. Pass `--yes` when there is no terminal, including under `--json`.

This `ot` is OpenTodo's client. Other projects ship unrelated tools with the same name.

# SEE ALSO

[opentodo](/man/opentodo)(1), [jq](/man/jq)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/OpenTodoApp/OpenTodo)```

```[Homepage](https://open-todo.app)```

```[Documentation](https://github.com/OpenTodoApp/OpenTodo/blob/main/docs/cli.md)```

<!-- verified: 2026-11-17 -->
