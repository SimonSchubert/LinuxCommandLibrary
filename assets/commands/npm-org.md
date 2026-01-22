# TLDR

**List org members**

```npm org ls [org-name]```

**Add member to org**

```npm org set [org-name] [username] [developer]```

**Remove member**

```npm org rm [org-name] [username]```

# SYNOPSIS

**npm** **org** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Organization subcommand.

**ls** _ORG_
> List members.

**set** _ORG_ _USER_ _ROLE_
> Add/update member.

**rm** _ORG_ _USER_
> Remove member.

**--help**
> Display help information.

# DESCRIPTION

**npm org** manages npm organization membership. Controls access to scoped packages.

The command handles org teams. Requires org admin privileges.

npm org manages organizations.

# CAVEATS

Requires npm organization. Admin access needed. Paid feature.

# HISTORY

npm org provides **organization management** for teams sharing scoped packages.

# SEE ALSO

[npm](/man/npm)(1), [npm-team](/man/npm-team)(1), [npm-access](/man/npm-access)(1)

