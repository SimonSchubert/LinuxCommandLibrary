# TLDR

**Add submodule**

```git submodule add [url] [path]```

**Initialize submodules**

```git submodule init```

**Update submodules**

```git submodule update```

**Clone with submodules**

```git submodule update --init --recursive```

**Show submodule status**

```git submodule status```

**Pull submodule changes**

```git submodule update --remote```

**Remove submodule**

```git submodule deinit [path] && git rm [path]```

**Foreach command**

```git submodule foreach "[command]"```

# SYNOPSIS

**git** **submodule** _command_ [_options_]

# SUBCOMMANDS

**add**
> Add submodule.

**init**
> Initialize submodules.

**update**
> Update submodules.

**status**
> Show status.

**deinit**
> Unregister submodule.

**sync**
> Sync URLs.

**foreach**
> Run command in each.

**summary**
> Show commit summary.

# PARAMETERS

**--init**
> Initialize during update.

**--recursive**
> Recursive operation.

**--remote**
> Use remote tracking branch.

**-f**, **--force**
> Force operation.

# DESCRIPTION

**git submodule** initializes, updates, and inspects submodules. Submodules allow embedding external Git repositories within a parent repository.

# SEE ALSO

[git-clone](/man/git-clone)(1), [gitmodules](/man/gitmodules)(5)

