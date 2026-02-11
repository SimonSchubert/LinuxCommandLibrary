# TAGLINE

Manage PlatformIO organization teams and members

# TLDR

**Create team**

```pio team create [orgname:teamname]```

**List teams**

```pio team list [orgname]```

**Add member to team**

```pio team add [orgname:teamname] [username]```

**Remove member**

```pio team remove [orgname:teamname] [username]```

# SYNOPSIS

**pio team** _command_ [_options_]

# PARAMETERS

**create** _name_
> Create team.

**destroy** _name_
> Delete team.

**list** _org_
> List teams in organization.

**add** _team_ _user_
> Add team member.

**remove** _team_ _user_
> Remove team member.

# DESCRIPTION

**pio team** manages teams within PlatformIO organizations. Teams allow granular permission management for package access. Uses org:team naming convention.

# SEE ALSO

[pio-org](/man/pio-org)(1), [pio-access](/man/pio-access)(1)

