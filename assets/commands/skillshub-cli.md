# TAGLINE

Command-line client for the Skills Hub agent-skill library

# TLDR

Print the **version** as JSON

```skillshub-cli --json version```

List **installed skills**

```skillshub-cli --json skills list```

**Search** the library

```skillshub-cli --json skills search "[testing]"```

**Install** a skill from Git or a local path

```skillshub-cli --json skills install [https://github.com/owner/repo]```

Install from a **subdirectory** of that source

```skillshub-cli --json skills install [https://github.com/owner/repo] --subpath [path/to/skill]```

**Deploy** a skill to Codex (preview first)

```skillshub-cli --json skills deploy [SKILL_ID] --agent codex --dry-run```

Apply that **deployment**

```skillshub-cli --json skills deploy [SKILL_ID] --agent codex```

Check the **install and library**

```skillshub-cli --json doctor```

List **supported agents**

```skillshub-cli --json agents list```

# SYNOPSIS

**skillshub-cli** [**--json**] [**--lang** _en_|_zh-CN_|_ko_] _command_ [_options_]

# DESCRIPTION

**skillshub-cli** is the standalone CLI for **Skills Hub**, a library that installs Agent Skills once and deploys them into the global (or project) skills directories of AI coding tools. Write commands talk to the real desktop library; they are not a simulation. The desktop app is a separate Tauri GUI; this binary is `src-tauri/src/bin/skillshub-cli.rs`.

The clap program name is **skillshub-cli**. Top-level commands are **skills**, **agents**, **doctor**, **version**, and **setup**. A hidden **__bridge** command is for the desktop app. Color is always off. There is no `help` subcommand; use **-h** / **--help**. Linux standalone builds need **glibc 2.39** or later. The installer writes `~/.local/bin/skillshub-cli` and verifies a SHA-256 checksum. Node.js is not required.

# COMMANDS

**skills list** [**--tag** _tag_] [**--source** _source_] [**--agent** _agent_] [**--untagged**] [**--status** _status_]
> List library entries. **--tag**, **--source**, and **--agent** are repeatable. **--untagged** conflicts with **--tag**

**skills show** _skill_
> Show one skill

**skills search** _query_ [**--limit** _n_]
> Search. **--limit** is a positive integer

**skills status** _skill_
> Deployment status for one skill

**skills check** _skill_ | **--all**
> Validate one skill, or every skill with **--all**

**skills install** _source_ [**--subpath** _path_]
> Add a skill from a Git URL or local path. **--subpath** selects a directory inside that source. There is no `collections install` command

**skills deploy** _skill_ **--agent** _name_ [**--project** _path_] [**--dry-run**]
> Copy the skill into a tool's skills directory. **--agent** is required and repeatable. **--project** is an absolute project path on macOS/Linux. **undeploy** takes the same flags and removes the copy while keeping the library entry

**skills update** _skill_ | **--all**
> Update from the recorded source. **--all** applies the batch after **skills check --all**. Update does not accept **--dry-run** or **--yes**

**skills adopt** _path_ [**--dry-run** | **--yes**]
> Import an existing skills directory. Preview with **--dry-run**; apply with **--yes**

**skills remove** _skill_ [**--dry-run** | **--yes**]
> Move a skill to the local recycle bin. Restore from the desktop app

**skills tag add** | **remove** | **set** _skill_ _tag_ [_tag_ ...]
> Change tags on one skill. **list** [_skill_] lists tags. **rename** _old_ _new_ renames a tag. **delete** _tag_ [**--dry-run** | **--yes**] deletes a tag

**agents list**
> List supported coding tools

**doctor**
> Check the CLI, library, and environment

**version**
> Print the CLI version. **--json** emits JSON

**setup** **--agent** _name_ [**--remove**] [**--dry-run**] [**--yes**]
> Install or remove the official AI-management skill for a tool. **--agent** is required and repeatable. **--yes** is only valid with **--remove**

# PARAMETERS

**--json**
> Machine-readable output. Global; may sit before the subcommand

**--lang** _en_|_zh-CN_|_ko_
> Message language. Global

**-h**, **--help**
> Print usage

**-V**, **--version**
> Print the clap version and exit (same crate version as **version**)

# CAVEATS

The CLI shares the desktop library. Device sync, authorization, schedules, settings, app updates, and recycle-bin restore stay in the GUI. **OPERATION_BUSY** means another write is in progress. **TARGET_CONFLICT** needs a review of tool-target clashes. **CONFIRMATION_REQUIRED** and **PLAN_STALE** mean preview again before **--yes**. Do not pass tokens on the command line. Standalone installs from `install-cli.sh` are separate from the desktop-managed CLI; rerun the script to upgrade. CLI release assets exist from **v0.11.0**.

# HISTORY

**Skills Hub** is an MIT-licensed Tauri app by GitHub user **qufei1993**. Desktop **v1.0.0** is the current major release. Collections live in the sibling **awesome-skills** repository.

# SEE ALSO

[git](/man/git)(1), [claude](/man/claude)(1), [cursor](/man/cursor)(1)

# RESOURCES

```[Source code](https://github.com/qufei1993/skills-hub)```

```[Homepage](https://aiskillshub.link)```

```[Documentation](https://aiskillshub.link/docs/cli)```

<!-- verified: 2026-10-12 -->
