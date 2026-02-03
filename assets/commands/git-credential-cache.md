# TLDR

**Cache credentials for 15 minutes**

```git config credential.helper cache```

**Cache for specific duration**

```git config credential.helper 'cache --timeout=[3600]'```

**Clear cached credentials**

```git credential-cache exit```

# SYNOPSIS

**git** **credential-cache** [_options_]

# PARAMETERS

**--timeout** _seconds_
> Cache timeout (default 900).

**--socket** _path_
> Socket path.

# DESCRIPTION

**git credential-cache** caches credentials in memory for a configurable time period. Avoids repeated password prompts during multiple Git operations.

# SEE ALSO

[git-credential-store](/man/git-credential-store)(1), [git-credential](/man/git-credential)(1)

