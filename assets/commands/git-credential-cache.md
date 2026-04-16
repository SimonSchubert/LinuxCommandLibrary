# TAGLINE

Cache credentials in memory temporarily

# TLDR

**Cache credentials for 15 minutes**

```git config credential.helper cache```

**Cache for specific duration**

```git config credential.helper 'cache --timeout=[3600]'```

**Cache with custom socket path**

```git config credential.helper 'cache --socket=[~/.git-credential-cache/socket]'```

**Exit** the cache daemon (clear all cached credentials)

```git credential-cache exit```

# SYNOPSIS

**git** **credential-cache** [_options_]

# PARAMETERS

**--timeout** _seconds_
> Number of seconds to cache credentials (default: 900, i.e. 15 minutes).

**--socket** _path_
> Path to the Unix socket used to communicate with the cache daemon (default: ~/.cache/git/credential/socket).

**exit**
> Cause the cache daemon to exit, discarding all cached credentials.

**get**, **store**, **erase**
> Standard credential helper actions (normally invoked by git itself, not manually).

# DESCRIPTION

**git credential-cache** is a credential helper that temporarily stores authentication credentials in memory via a daemon process. It provides a balance between security and convenience by avoiding repeated password prompts without permanently storing credentials on disk.

When configured as a credential helper, it automatically captures credentials during the first authentication and reuses them for subsequent operations within the timeout period. The default timeout is 15 minutes (900 seconds), configurable with the --timeout option.

The daemon stores credentials in a Unix domain socket, accessible only to the current user. Credentials automatically expire after the timeout and are never written to disk, making this more secure than git-credential-store. The cache can be manually cleared with git credential-cache exit.

# SEE ALSO

[git-credential-store](/man/git-credential-store)(1), [git-credential](/man/git-credential)(1)
