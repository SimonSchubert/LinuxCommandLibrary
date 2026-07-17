# TAGLINE

Manage command aliases for GitLab CLI

# TLDR

**List aliases**

```glab alias list```

**Set alias**

```glab alias set [name] "[command]"```

**Delete alias**

```glab alias delete [name]```

**Set an alias that expands through a shell**

```glab alias set [name] --shell "[command]"```

# SYNOPSIS

**glab** **alias** _command_ [_options_]

# SUBCOMMANDS

**list**
> List aliases.

**set** _name_ _expansion_
> Create an alias for a glab command, or for an external command with **--shell**.

**delete** _name_
> Remove an alias.

# PARAMETERS

**-s**, **--shell**
> Interpret the alias expansion as a shell command instead of a glab command, allowing pipes (`|`) and redirects (`>`). Use `$1`, `$2`, ... to reference passed arguments and `$@` for all of them.

# DESCRIPTION

**glab alias** manages command aliases for the GitLab CLI. It allows creating shortcuts for frequently used glab commands, making common workflows faster to execute.

Aliases are stored in the glab configuration file and can reference any valid glab command with arguments, or, with **--shell**, an arbitrary shell command.

# SEE ALSO

[glab](/man/glab)(1)

# RESOURCES

```[Documentation](https://docs.gitlab.com/cli/alias/)```

```[Source code](https://gitlab.com/gitlab-org/cli)```

<!-- verified: 2026-07-17 -->
