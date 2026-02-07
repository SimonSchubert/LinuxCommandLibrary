# TAGLINE

Manage command aliases for GitLab CLI

# TLDR

**List aliases**

```glab alias list```

**Set alias**

```glab alias set [name] "[command]"```

**Delete alias**

```glab alias delete [name]```

# SYNOPSIS

**glab** **alias** _command_ [_options_]

# SUBCOMMANDS

**list**
> List aliases.

**set**
> Create alias.

**delete**
> Remove alias.

# DESCRIPTION

**glab alias** manages command aliases for the GitLab CLI. It allows creating shortcuts for frequently used glab commands, making common workflows faster to execute.

Aliases are stored in the glab configuration and can reference any valid glab command with arguments.

# SEE ALSO

[glab](/man/glab)(1)
