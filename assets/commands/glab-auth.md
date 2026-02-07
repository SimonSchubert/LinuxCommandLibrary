# TAGLINE

Manage GitLab CLI authentication

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

**glab auth** manages GitLab CLI authentication. It handles logging in to GitLab instances with personal access tokens or OAuth, and stores credentials for use by other glab commands.

For self-hosted GitLab instances, use the `--hostname` flag to specify the server address.

# SEE ALSO

[glab](/man/glab)(1)
