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

**Run a command in each submodule**

```git submodule foreach '[command]'```

**Sync submodule URLs** from .gitmodules to local config

```git submodule sync --recursive```

# SYNOPSIS

**git** **submodule** _command_ [_options_]

# SUBCOMMANDS

**add** _URL_ [_path_]
> Add a repository as a submodule at a given path.

**init** [_path_...]
> Initialize submodules recorded in the index.

**update** [_path_...]
> Update registered submodules to match the superproject.

**status** [_path_...]
> Show status of submodules.

**deinit** [_path_...]
> Unregister submodules and remove their work trees.

**sync** [_path_...]
> Sync submodule remote URLs from .gitmodules to local config.

**foreach** _command_
> Run a shell command in each checked-out submodule.

**summary** [_commit_] [_path_...]
> Show commit summary between commit and working tree/index.

**set-branch** _path_
> Set the default remote tracking branch for a submodule.

**set-url** _path_ _newurl_
> Set the URL of a submodule.

**absorbgitdirs**
> Move submodule .git directories into the superproject's .git/modules/.

# PARAMETERS

**--init**
> Initialize uninitialized submodules before updating.

**--recursive**
> Recurse into nested submodules.

**--remote**
> Use the submodule's remote tracking branch instead of the superproject's recorded SHA-1.

**-f**, **--force**
> Force checkout even if the submodule already matches.

**-b** _branch_, **--branch** _branch_
> Branch of repository to track (add, set-branch).

**-j** _n_, **--jobs** _n_
> Clone new submodules in parallel with n jobs.

**-q**, **--quiet**
> Only print error messages.

**--depth** _depth_
> Create a shallow clone with truncated history.

**-N**, **--no-fetch**
> Do not fetch new objects from the remote (update).

# DESCRIPTION

**git submodule** manages submodules, which are external Git repositories embedded within a parent repository at specific paths. Each submodule tracks a particular commit of the external repository.

Submodules allow projects to include and track dependencies or shared components while keeping their histories separate. Use `update --init --recursive` after cloning to populate all submodule contents.

# CONFIGURATION

**.gitmodules**
> Configuration file mapping submodule names to their repository URLs and local paths.

# SEE ALSO

[git-clone](/man/git-clone)(1), [git-remote](/man/git-remote)(1), [git-fetch](/man/git-fetch)(1)
