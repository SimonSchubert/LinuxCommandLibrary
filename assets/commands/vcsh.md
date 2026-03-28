# TAGLINE

Manage dotfiles with multiple Git repos

# TLDR

**Initialize repo**

```vcsh init [reponame]```

**Clone repo**

```vcsh clone [url] [reponame]```

**Run git command**

```vcsh [reponame] [git-command]```

**List repos**

```vcsh list```

**Enter repo**

```vcsh enter [reponame]```

**Status all**

```vcsh status```

**List tracked files**

```vcsh list-tracked [reponame]```

**Pull all repos**

```vcsh pull```

**Add and commit** a file in a repo

```vcsh [reponame] add [~/.bashrc] && vcsh [reponame] commit -m "[message]"```

**Push all repos**

```vcsh push```

**Rename a repo**

```vcsh rename [oldname] [newname]```

# SYNOPSIS

**vcsh** [_init|clone|list|enter|run|pull|push_] [_reponame_] [_args_]

# PARAMETERS

**init** _reponame_
> Initialize an empty repo.

**clone** _url_ [_reponame_]
> Clone from URL.

**list**
> List all repos.

**list-tracked** [_reponame_]
> List tracked files.

**list-untracked** [**-a**] [**-r**]
> List untracked files. -a shows all, -r is recursive.

**enter** _reponame_
> Spawn subshell with $GIT_DIR set.

**run** _reponame_ _command_
> Run command with $GIT_DIR and $GIT_WORK_TREE set.

**pull**
> Pull from all repos.

**push**
> Push all repos.

**rename** _old_ _new_
> Rename a repository.

**status** [_reponame_]
> Show status of all or one repo.

**write-gitignore** _reponame_
> Write .gitignore.d/reponame via git ls-files.

**delete** _reponame_
> Delete a repository.

# DESCRIPTION

**vcsh** manages configuration files (dotfiles) using multiple Git repositories that all share the same working directory ($HOME). Each repository tracks a separate set of files, allowing modular organization of shell configs, editor settings, and other dotfiles.

The tool uses bare Git repositories to avoid conflicts between repos that coexist in the same directory. The **enter** command opens a subshell scoped to a specific repository, while running git commands directly against a named repo is also supported.

# ENVIRONMENT

**VCSH_REPO_D**
> Directory where bare repositories are stored (default: $XDG_CONFIG_HOME/vcsh/repo.d).

# CAVEATS

Requires basic Git knowledge. Bare repositories can be confusing -- use `vcsh enter` to inspect repo state. Files tracked by multiple repos will cause conflicts.

# HISTORY

**vcsh** (version control system for $HOME) was created by **Richard Hartmann** for managing multiple Git repositories overlaid on $HOME.

# SEE ALSO

[git](/man/git)(1), [mr](/man/mr)(1), [stow](/man/stow)(1), [yadm](/man/yadm)(1), [chezmoi](/man/chezmoi)(1)
