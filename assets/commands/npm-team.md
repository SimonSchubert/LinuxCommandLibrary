# TLDR

**List teams**

```npm team ls [@org]```

**Create team**

```npm team create [@org:team]```

**Destroy team**

```npm team destroy [@org:team]```

**Add user to team**

```npm team add [@org:team] [user]```

**Remove user from team**

```npm team rm [@org:team] [user]```

# SYNOPSIS

**npm** **team** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Team subcommand.

**ls** _ORG_
> List teams/members.

**create** _TEAM_
> Create team.

**destroy** _TEAM_
> Delete team.

**add** _TEAM_ _USER_
> Add member.

**--help**
> Display help information.

# DESCRIPTION

**npm team** manages organization teams. Controls package access groups.

The command handles team membership. Part of npm organizations feature.

npm team manages org teams.

# CAVEATS

Requires organization. Admin access needed. Paid feature.

# HISTORY

npm team provides **team-based access control** for npm organization packages.

# SEE ALSO

[npm](/man/npm)(1), [npm-org](/man/npm-org)(1), [npm-access](/man/npm-access)(1)

