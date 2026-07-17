# TAGLINE

Manage GitLab CLI authentication

# TLDR

**Login to GitLab**

```glab auth login```

**Login by piping a token** from a file

```glab auth login --stdin < [token.txt]```

**Login to a self-hosted instance**

```glab auth login --hostname [gitlab.example.com]```

**Show auth status**

```glab auth status```

**Set up git credential helper**

```glab auth git-credential```

**Logout**

```glab auth logout```

# SYNOPSIS

**glab** **auth** _command_ [_options_]

# SUBCOMMANDS

**login**
> Authenticate with a GitLab instance, interactively or non-interactively.

**logout**
> Log out of a GitLab instance.

**status**
> Show authentication status for known hosts.

**git-credential**
> Implement a git-credential-helper for GitLab, usually invoked by git itself.

**configure-docker**
> Configure glab as a credential helper for Docker.

# PARAMETERS

**-h**, **--hostname** _host_
> GitLab host to authenticate with (default: gitlab.com).

**-t**, **--token** _token_
> An authentication token, provided via prompt, `--stdin`, or `$GITLAB_TOKEN`.

**--stdin**
> Read the token from standard input rather than prompting.

**--api-host** _host_
> API host, if different from the web host.

**--api-protocol** _http|https_
> Protocol to use for API requests.

**--git-protocol** _http|ssh_
> Protocol to use for git operations.

**--use-keyring**
> Store credentials in the system keyring instead of the plain-text config file.

# DESCRIPTION

**glab auth** manages GitLab CLI authentication. It handles logging in to GitLab instances with personal access tokens or OAuth, and stores credentials for use by other glab commands.

For self-hosted GitLab instances, use the `--hostname` flag to specify the server address. Credentials are stored in the glab configuration file (`~/.config/glab-cli/config.yml` by default), or in the OS keyring with `--use-keyring`.

# SEE ALSO

[glab](/man/glab)(1)

# RESOURCES

```[Documentation](https://docs.gitlab.com/cli/auth/)```

```[Source code](https://gitlab.com/gitlab-org/cli)```

<!-- verified: 2026-07-17 -->
