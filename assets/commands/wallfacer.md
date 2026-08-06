# TAGLINE

Terminal session manager for AI coding agent CLIs

# TLDR

**Open** the full-screen session browser (TUI)

```wallfacer```

**Start** a new session in a directory

```wallfacer new [~/work/api] --title "[Fix flaky auth tests]"```

**Resume** a session by title or ID prefix

```wallfacer resume "[fix flaky auth tests]"```

**Search** titles, prompts, dirs, projects, and tags

```wallfacer search [auth]```

**List** sessions for a project as JSON

```wallfacer list --project [api] --json```

**Trash** a session (use **--purge** for permanent delete)

```wallfacer rm [5f2]```

# SYNOPSIS

**wallfacer**

**wallfacer** **new** [_dir_] [**--agent** _A_] [**--title** _T_] [**--project** _P_] [**--tag** _t_]

**wallfacer** **resume**|**show**|**rm** _ref_ [_options_]

**wallfacer** **list** [**--project** _P_] [**--tag** _T_] [**--agent** _A_] [**--json**]

**wallfacer** **search** _query_

**wallfacer** **rename** _ref_ _title_

**wallfacer** **tag** **add**|**rm** _ref_ _tag_...

**wallfacer** **project** **set**|**clear** _ref_ [_name_]

**wallfacer** **sync**

# DESCRIPTION

**wallfacer** indexes AI coding sessions from **Claude Code**, **Cursor CLI**, **Kiro CLI**, and **Codex** so you can name, tag, group, search, resume, or delete them. It is **read-only** toward the agents' own files: metadata lives in a local SQLite database under `~/.local/share/wallfacer/`.

Bare **wallfacer** (when stdout is a TTY) opens a full-screen browser: session list, detail pane, fuzzy filter, and keys to resume, rename, tag, or trash. Subcommands are one-shot CLI for scripts; both fronts share the same index. Sync rescans disk automatically before commands (and via **wallfacer sync**).

`<ref>` is an ID prefix or exact title; ambiguous refs list candidates instead of guessing. Sessions started outside wallfacer are picked up with no import step. **rm** moves to trash; only **--purge** deletes permanently (including multi-file agent layouts).

# PARAMETERS

**(no subcommand)**
> Open the interactive TUI browser (prints help if stdout is not a terminal).

**new** [_dir_]
> Start a session in _dir_ (defaults interactively). **--agent**, **--title**, **--project**, **--tag**.

**resume** _ref_
> Reopen a session in its original working directory.

**list**
> List sessions newest first. Filters: **--project**, **--tag**, **--agent** (case-insensitive substring). **--json** for scripts.

**search** _query_
> Search titles, first prompts, directories, projects, and tags.

**show** _ref_
> Full details for one session.

**rename** _ref_ _title_
> Set the display title.

**tag add**|**rm** _ref_ _tag_...
> Add or remove tags.

**project set**|**clear** _ref_
> Assign or clear a project group.

**rm** _ref_ [**--purge**] [**-f**]
> Move to trash, or permanently delete with **--purge**.

**sync**
> Force a rescan of agent session directories on disk.

# CONFIGURATION

**~/.local/share/wallfacer/**
> SQLite index and trash. Deleting this removes only wallfacer overlay metadata, not agent transcripts.

**WALLFACER_NO_UPDATE_CHECK=1**
> Disable the daily GitHub release notice (TUI footer / subcommand stderr).

Agent scan roots include `~/.claude/projects/`, `~/.cursor/chats/`, `~/.kiro/sessions/cli/`, and `~/.codex/sessions/`.

# CAVEATS

Does not modify agent session files for titles/tags — those live only in wallfacer's database. Full-text search of conversation content is on the roadmap (title/prompt search only today). OpenCode adapter is planned but not shipping yet.

# HISTORY

**wallfacer** is an MIT-licensed Go tool by **pradipta**. The name references the Wallfacers of Liu Cixin's *The Dark Forest* — keepers of plans too sprawling for others to follow.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [tmux](/man/tmux)(1)

# RESOURCES

```[Source code](https://github.com/pradipta/wallfacer)```

```[Documentation](https://github.com/pradipta/wallfacer/blob/main/docs/development.md)```

<!-- verified: 2026-08-06 -->
