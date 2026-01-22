# TLDR

**Show current user**

```npm whoami```

**Check specific registry**

```npm whoami --registry=[https://registry.example.com]```

# SYNOPSIS

**npm** **whoami** [_options_]

# PARAMETERS

**--registry** _URL_
> Registry to check.

**--help**
> Display help information.

# DESCRIPTION

**npm whoami** displays the logged-in username. Verifies authentication.

The command shows current user. Useful for debugging auth issues.

npm whoami shows username.

# CAVEATS

Requires authentication. Per-registry check. Empty if not logged in.

# HISTORY

npm whoami provides **authentication verification** for npm registry access.

# SEE ALSO

[npm](/man/npm)(1), [npm-login](/man/npm-login)(1), [npm-logout](/man/npm-logout)(1)

