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

# SYNOPSIS

**vcsh** [_init|clone|list|enter_] [_reponame_] [_args_]

# PARAMETERS

**init**
> Initialize repo.

**clone**
> Clone repo.

**list**
> List repos.

**enter**
> Shell in repo.

**run**
> Run command.

**status**
> Show status.

# DESCRIPTION

**vcsh** manages configuration files (dotfiles) using multiple Git repositories that all share the same working directory ($HOME). Each repository tracks a separate set of files, allowing modular organization of shell configs, editor settings, and other dotfiles.

The tool uses bare Git repositories to avoid conflicts between repos that coexist in the same directory. The **enter** command opens a subshell scoped to a specific repository, while running git commands directly against a named repo is also supported.

# CAVEATS

Learning curve. Git knowledge needed. Bare repos can confuse.

# HISTORY

**vcsh** (version control system for $HOME) was created for managing multiple Git repositories in $HOME.

# SEE ALSO

[git](/man/git)(1), [stow](/man/stow)(1), [yadm](/man/yadm)(1), [chezmoi](/man/chezmoi)(1)
