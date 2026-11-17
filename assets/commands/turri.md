# TAGLINE

Coding agent that regenerates a project from plain source files

# TLDR

Start an **interactive** session in a project

```turri```

**Check** that this machine can run it

```turri doctor```

Write a starting **model config**

```turri init-config```

**Parse** a plain file, with no model call

```turri parse [app.plain]```

Show what is **left to regenerate**

```turri drift [app.plain]```

**Regenerate** code from a plain file

```turri regenerate [app.plain]```

Regenerate **one** functional spec

```turri regenerate [app.plain] [app:add-task]```

Pick models for **this session**

```turri --harness-model [provider/model-id] --coding-model [provider/model-id]```

# SYNOPSIS

**turri** [_OPTIONS_] [_COMMAND_] [_ARGS_]

# DESCRIPTION

**turri** is a terminal coding agent. The npm package is `@turri-dev/cli`. The command is `turri`. It needs Node.js 22.19 or newer, Git, and Bash, on macOS, Linux, or WSL. A desktop app lives in a different repository and is not this command.

With no arguments inside a project it opens a conversation. In an empty directory it picks a stack (the one you name, otherwise a standard-library stack this machine can build), writes a module, and regenerates it. Further changes are asked for in the chat.

Without a conversation, three commands work on a plain source file (a path such as `app.plain`):

- `parse` checks syntax and structure and does not call a model
- `drift` reports what is not regenerated yet and starts nothing
- `regenerate` turns the plain source into jobs and runs them. A second argument names one functional spec.

`doctor` checks the environment. `init-config` writes a starting model configuration.

Flags:

- `--harness-model` — model you talk to
- `--coding-model` — model that writes code
- `--stack NAME` — stack for this session
- `--debug` — keep agent logs

Inside the chat, these are typed as slash commands, not as subprocesses: `/login`, `/model`, `/turri-config`, `/halt`, `/lineage`, `/btw`, `/sentinel`, `/stack`, `/pulses`.

Three model roles exist: harness (the conversation), coding, and judge. A model is `provider/model-id`, with an optional `:high` or `:low` suffix for effort. One left unset falls back to the role before it: judge from coding, coding from harness.

# CONFIGURATION

Project settings are `config.turri.yaml`. A stack can have its own file, `config.turri.` plus the stack name plus `.yaml`. `/turri-config` edits the project file from the chat.

# CAVEATS

Asking to try a build runs `release`, which copies what was built into `dist/` under the module name, and `activate`, which starts it and installs what it needs. That path does not ask for a separate approval. The project also documents a sandbox that wraps agent commands. Read that before pointing turri at a repository you cannot rebuild.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/turri-oss/turri)```

```[Documentation](https://github.com/turri-oss/turri/blob/main/docs/installation.md)```

<!-- verified: 2026-11-17 -->
