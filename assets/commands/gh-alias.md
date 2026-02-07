# TAGLINE

GitHub CLI command alias management

# TLDR

**List aliases**

```gh alias list```

**Set an alias**

```gh alias set [name] "[command]"```

**Delete an alias**

```gh alias delete [name]```

**Set with shell expansion**

```gh alias set --shell [name] "[shell command]"```

# SYNOPSIS

**gh** **alias** _command_ [_options_]

# SUBCOMMANDS

**list**
> List defined aliases.

**set**
> Create an alias.

**delete**
> Remove an alias.

# PARAMETERS

**--shell**
> Expand as shell command.

# DESCRIPTION

**gh alias** manages command aliases for the GitHub CLI. Create shortcuts for frequently used or complex commands to streamline your GitHub workflow.

Aliases can simplify multi-step operations, provide shorthand for common tasks, and customize the CLI to match your development patterns. Shell aliases support piping and advanced command composition, while regular aliases work with gh subcommands and flags.

# SEE ALSO

[gh](/man/gh)(1), [gh-config](/man/gh-config)(1)

