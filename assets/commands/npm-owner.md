# TLDR

**List package owners**

```npm owner ls [package-name]```

**Add owner**

```npm owner add [username] [package-name]```

**Remove owner**

```npm owner rm [username] [package-name]```

# SYNOPSIS

**npm** **owner** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Owner subcommand.

**ls** _PKG_
> List owners.

**add** _USER_ _PKG_
> Add owner.

**rm** _USER_ _PKG_
> Remove owner.

**--help**
> Display help information.

# DESCRIPTION

**npm owner** manages package ownership. Controls who can publish updates.

The command modifies maintainers. Requires current owner privileges.

npm owner manages maintainers.

# CAVEATS

Requires authentication. Owner can add/remove others. Affects publishing rights.

# HISTORY

npm owner provides **maintainer management** for controlling package publishing access.

# SEE ALSO

[npm](/man/npm)(1), [npm-publish](/man/npm-publish)(1), [npm-access](/man/npm-access)(1)

