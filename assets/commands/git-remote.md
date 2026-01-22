# TLDR

**List remotes**

```git remote -v```

**Add remote**

```git remote add [name] [url]```

**Remove remote**

```git remote remove [name]```

**Rename remote**

```git remote rename [old] [new]```

**Show remote details**

```git remote show [origin]```

# SYNOPSIS

**git remote** [_command_] [_options_]

# PARAMETERS

**add** _NAME_ _URL_
> Add new remote.

**remove** _NAME_
> Remove remote.

**rename** _OLD_ _NEW_
> Rename remote.

**show** _NAME_
> Show remote info.

**set-url** _NAME_ _URL_
> Change remote URL.

**-v**, **--verbose**
> Show URLs.

**--help**
> Display help information.

# DESCRIPTION

**git remote** manages tracked remote repositories. It configures URLs and refspecs for fetch and push operations, enabling interaction with multiple remote repositories.

The command handles the remote setup that enables distributed workflows. Common operations include adding upstreams, changing URLs after repository moves, and inspecting remote configuration.

git remote configures repository remote connections.

# CAVEATS

Remote names are local aliases. URLs can differ for fetch and push. Removing remote keeps fetched objects.

# HISTORY

git remote is a core **Git** command for managing the remote repository connections essential to distributed version control.

# SEE ALSO

[git-fetch](/man/git-fetch)(1), [git-push](/man/git-push)(1), [git-clone](/man/git-clone)(1)
