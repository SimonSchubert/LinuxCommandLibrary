# TAGLINE

manage GitHub CLI authentication and credentials

# TLDR

**Login to GitHub**

```gh auth login```

**Login with specific host**

```gh auth login --hostname [github.example.com]```

**Check authentication status**

```gh auth status```

**Logout from GitHub**

```gh auth logout```

**Refresh authentication**

```gh auth refresh```

# SYNOPSIS

**gh auth** _command_ [_options_]

# PARAMETERS

**login**
> Authenticate with a GitHub host.

**logout**
> Log out of a GitHub host.

**status**
> View authentication status.

**refresh**
> Refresh stored credentials.

**token**
> Print authentication token.

**--hostname** _HOST_
> GitHub hostname (for Enterprise).

**--web**
> Open browser for authentication.

**--with-token**
> Read token from stdin.

**--help**
> Display help information.

# DESCRIPTION

**gh auth** manages authentication for the GitHub CLI. It handles OAuth device flow, personal access tokens, and SSH key authentication across multiple GitHub hosts.

The command stores credentials securely in the system keychain when available, falling back to encrypted file storage. It supports github.com and GitHub Enterprise Server instances simultaneously.

gh auth provides the foundation for all authenticated gh operations.

# CONFIGURATION

**~/.config/gh/hosts.yml**
> Stores authentication tokens and host-specific settings for each GitHub instance.

# CAVEATS

Token scopes affect available commands. Enterprise instances may require SSO authentication. Credentials stored in keychain or config file.

# HISTORY

gh auth is part of the **GitHub CLI**, providing secure authentication workflows designed for both interactive and scripted use cases.

# SEE ALSO

[gh](/man/gh)(1), [gh-config](/man/gh-config)(1)
