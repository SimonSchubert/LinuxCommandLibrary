# TLDR

**Login to GitLab**

```glab auth login```

**Login with token**

```glab auth login --token [token]```

**Login to specific host**

```glab auth login --hostname [gitlab.example.com]```

**Show auth status**

```glab auth status```

**Logout**

```glab auth logout```

# SYNOPSIS

**glab** **auth** _command_ [_options_]

# SUBCOMMANDS

**login**
> Authenticate with GitLab.

**logout**
> Log out.

**status**
> Show authentication status.

# PARAMETERS

**--token** _token_
> Authentication token.

**--hostname** _host_
> GitLab host.

# DESCRIPTION

**glab auth** manages GitLab CLI authentication. Login to GitLab instances with personal access tokens or OAuth.

# SEE ALSO

[glab](/man/glab)(1)

