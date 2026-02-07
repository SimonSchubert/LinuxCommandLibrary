# TAGLINE

Manage embedded external repositories within a project

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

**git submodule** manages submodules, which are external Git repositories embedded within a parent repository at specific paths. Each submodule tracks a particular commit of the external repository.

Submodules allow projects to include and track dependencies or shared components while keeping their histories separate. Use `update --init --recursive` after cloning to populate all submodule contents.

# CONFIGURATION

**.gitmodules**
> Configuration file mapping submodule names to their repository URLs and local paths.

# SEE ALSO

[git-clone](/man/git-clone)(1), [gitmodules](/man/gitmodules)(5)
