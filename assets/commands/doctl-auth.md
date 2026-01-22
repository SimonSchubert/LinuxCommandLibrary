# TLDR

**Initialize authentication**

```doctl auth init```

**Initialize with token** directly

```doctl auth init --access-token [token]```

**List auth contexts**

```doctl auth list```

**Switch to context**

```doctl auth switch --context [context_name]```

**Remove auth context**

```doctl auth remove --context [context_name]```

# SYNOPSIS

**doctl auth** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: init, list, switch, remove.

**init**
> Initialize authentication with token.

**list**
> List authentication contexts.

**switch** **--context** _NAME_
> Switch active context.

**remove** **--context** _NAME_
> Remove context.

**--access-token** _TOKEN_
> API access token.

**--context** _NAME_
> Context name.

**--help**
> Display help information.

# DESCRIPTION

**doctl auth** manages authentication contexts for the DigitalOcean CLI. Contexts allow storing multiple API tokens for different accounts, teams, or environments.

The init command prompts for or accepts an API token, storing it securely. Multiple contexts can be configured and switched between, enabling management of different DigitalOcean accounts from a single CLI installation.

Authentication tokens are obtained from the DigitalOcean control panel and provide API access according to their scope.

# CAVEATS

Tokens are stored locally. Token scopes determine available actions. Expired or revoked tokens require re-authentication. Contexts are machine-specific.

# HISTORY

doctl auth is part of the **doctl** CLI developed by **DigitalOcean**. Multi-context support enables users and organizations to manage multiple accounts efficiently.

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-compute-droplet](/man/doctl-compute-droplet)(1)
