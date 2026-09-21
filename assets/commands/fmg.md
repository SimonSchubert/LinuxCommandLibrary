# TAGLINE

Short name for the foremerge coding-agent coordination CLI

# TLDR

Show what **every agent** is doing

```fmg status```

**Initialize** coordination state in the current Git repository

```fmg init```

Wire Codex, Claude Code, and **Cursor**

```fmg setup all```

**Publish intent** before editing

```fmg intent publish --agent [agent_id] --task [task] --summary "[what you will change]" --scope symbol:[Name]=replace```

**Preflight** a plan against intents already published

```fmg conflicts check --intent "[plan]" --scope symbol:[Name]=extend```

Ask **who holds** a scope

```fmg work query --scope symbol:[Name]```

Print **JSON** for scripts

```fmg --json status```

# SYNOPSIS

**fmg** [**--json**] [**--database** _path_] [**--cwd** _path_] _command_ [_arguments_]

# PARAMETERS

**--json**

> Print a stable JSON success or error envelope on stdout.

**--database** _path_

> Use this SQLite file. **FOREMERGE_DB** sets the same path.

**--cwd** _path_

> Resolve Git and runtime state from _path_. The default is the current directory.

# DESCRIPTION

**fmg** is the short name of **foremerge**, installed as a second binary next to it. Both are thin wrappers over the same Rust program, so every subcommand, flag, and exit behavior matches. Help and error text use the name you typed: **fmg --help** says **fmg**, and **foremerge --help** says **foremerge**.

The installer leaves an existing **fmg** on **PATH** alone rather than shadowing it. If **fmg** is some other program, call **foremerge** directly.

The tool publishes semantic intents, advisory claims, and ChangeSets for coding agents in separate Git worktrees, and compares those plans before the edits land. The shared store is SQLite under the repository's Git common directory.

# CAVEATS

**fmg** and **foremerge** are the same program when they come from one install. If another **fmg** was already on **PATH**, the installer leaves that binary in place and the short name is not Foremerge.

Claims warn. They do not lock files or agents. The store is local to one machine. See **foremerge** for the full command list, scope vocabulary, and trust limits.

# HISTORY

The short name shipped with Foremerge starting in the **0.4.0** release line. Foremerge itself was first published in **August 2026** and is written in **Rust** under the **Apache License 2.0**.

# SEE ALSO

[foremerge](/man/foremerge)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/naw103/foremerge)```

```[Homepage](https://foremerge.com)```

```[Documentation](https://github.com/naw103/foremerge/tree/main/docs)```

<!-- verified: 2026-09-21 -->
