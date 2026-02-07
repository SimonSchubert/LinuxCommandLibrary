# TAGLINE

display DigitalOcean account information

# TLDR

**Show account information**

```doctl account get```

**Show rate limit status**

```doctl account ratelimit```

# SYNOPSIS

**doctl** **account** _command_

# SUBCOMMANDS

**get**
> Display account information.

**ratelimit**
> Show API rate limit status.

# DESCRIPTION

**doctl account** displays information about your DigitalOcean account including email, UUID, status, and API rate limits.

The command provides quick access to account details without navigating the web console. This is useful for verifying which account you're currently authenticated with, especially when managing multiple contexts. The ratelimit subcommand helps monitor API usage to avoid exceeding rate limits during automated operations or intensive scripting.

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-auth](/man/doctl-auth)(1)

