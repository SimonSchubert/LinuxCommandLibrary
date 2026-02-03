# TLDR

**List caches**

```gh cache list```

**Delete a cache**

```gh cache delete [cache_id]```

**Delete caches by key**

```gh cache delete --key [key_prefix]```

**Delete all caches**

```gh cache delete --all```

# SYNOPSIS

**gh** **cache** _command_ [_options_]

# SUBCOMMANDS

**list**
> List caches.

**delete**
> Delete caches.

# PARAMETERS

**--key** _prefix_
> Filter by key prefix.

**--all**
> Delete all caches.

**-R**, **--repo** _owner/repo_
> Repository.

# DESCRIPTION

**gh cache** manages GitHub Actions caches for a repository. Caches store dependencies to speed up workflows.

# SEE ALSO

[gh](/man/gh)(1), [gh-run](/man/gh-run)(1)

