# TAGLINE

manages organization teams

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

**ls** _@org_ | _@org:team_
> List teams in an organization, or members of a specific team.

**create** _@org:team_
> Create a new team under the given organization scope.

**destroy** _@org:team_
> Delete an existing team (the developers team cannot be removed).

**add** _@org:team_ _user_
> Add a user to the given team.

**rm** _@org:team_ _user_
> Remove a user from the given team.

**--otp** _code_
> Provide a two-factor authentication one-time password.

**--registry** _url_
> Target registry URL (defaults to https://registry.npmjs.org).

**--parseable**
> Output in tab-separated parseable format.

**--json**
> Output results as JSON.

**--help**
> Display help information.

# DESCRIPTION

**npm team** manages organization teams. Controls package access groups.

The command handles team membership. Part of npm organizations feature.

# CAVEATS

Requires organization. Admin access needed. Paid feature.

# HISTORY

npm team provides **team-based access control** for npm organization packages.

# SEE ALSO

[npm](/man/npm)(1), [npm-org](/man/npm-org)(1), [npm-access](/man/npm-access)(1)

