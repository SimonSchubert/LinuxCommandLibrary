# TAGLINE

Pin a set of agent skills and install that set into projects

# TLDR

**Add** skills from a repository into a named set

```skillset add --set [my-set]```

Add one skill and **install** it in this project

```skillset add [owner/repo] -s [skill-name] --install```

**Show** what a set contains

```skillset ls --set [my-set]```

**Install** a set into the current project

```skillset install [my-set]```

Move pins to the **latest commits**

```skillset update --set [my-set]```

**Remove** skills from a set

```skillset rm --set [my-set]```

List sets stored **outside** any project

```skillset ls --user```

Print a **completion** script

```skillset --completions [zsh]```

# SYNOPSIS

**skillset** [_OPTIONS_] _COMMAND_ [_ARGS_]

# PARAMETERS

**--set** _NAME_
> Skillset to edit. A bare name is a user set. A path that ends in `.json` is a file. The default file is `./skillset.json`.

**-s**, **--skill** _NAME_
> Skill to add, or entry to install. Repeat the flag for several names.

**--all**
> On `add`, take every skill from the source. On `remove`, drop every entry.

**-l**, **--list**
> On `add`, list skills and write nothing.

**--install**
> After `add`, install the whole set.

**-a**, **--agent** _ID_
> Which agents receive an install. On `add`, requires `--install`.

**-g**, **--global**
> Install for the user instead of one project. On `add`, requires `--install`.

**--copy**
> Copy files instead of symlinking. On `add`, requires `--install`.

**-y**, **--yes**
> Skip prompts.

**--user**
> On `list`, print user-set names. Cannot be combined with `--set`.

**--completions** _SHELL_
> Print a completion script for `bash`, `zsh`, `fish`, `sh`, `powershell`, or `pwsh`.

# DESCRIPTION

**skillset** keeps a JSON list of agent skills (a name, a git source, and a pinned commit) and installs that list. The npm package is `@itsmeyaw/skillset`. The command is `skillset`. It needs Node.js 22.20 or newer and Git.

Commands and short aliases:

- `add` (`a`) — pin skills from a source. `--install` also installs them.
- `remove` (`rm`) — drop skills from the set
- `update` (`up`) — move pins to the latest commits. A source pinned to a version stays
- `list` (`ls`) — show entries, or user-set names with `--user`
- `install` (`i`) — install the set at its pins

`add`, `remove`, and `update` only edit the set. `install` only installs. An install adds skills. It does not delete skills that are absent from the set.

A source is `owner/repo`, `owner/repo#branch`, `owner/repo@v1.2.3`, a full commit, a GitHub tree URL, or another git URL. Quote a source that contains `#`. Private repositories use the git credentials already on the machine.

Without `-a`, installs go to universal agents (the `.agents/skills` directory), Claude Code, and any agent the tool detects. The tool wraps the Vercel skills CLI. It is a real command, not a skill file by itself.

# CONFIGURATION

A project set is `./skillset.json`, which can be committed. A bare name such as `my-set` is stored in the first directory that is set:

```SKILLSET_HOME```

```$XDG_CONFIG_HOME/skillset```

or `~/.skillset`.

The skills library it calls sends anonymous telemetry unless one of these is set to `1`. skillset itself does not add a collector.

```DISABLE_TELEMETRY```

```DO_NOT_TRACK```

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/itsmeyaw/skillset)```

```[Documentation](https://github.com/itsmeyaw/skillset#skillset)```

<!-- verified: 2026-11-17 -->
