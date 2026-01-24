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

**vcsh** manages dotfiles. It uses Git for configs.

Multiple repos in $HOME. Overlapping paths.

Git-based. Full version control.

Bare repository. No working directory copy.

Modular configs. Separate concerns.

# CAVEATS

Learning curve. Git knowledge needed. Bare repos can confuse.

# HISTORY

**vcsh** (version control system for $HOME) was created for managing multiple Git repositories in $HOME.

# SEE ALSO

[git](/man/git)(1), [stow](/man/stow)(1), [yadm](/man/yadm)(1), [chezmoi](/man/chezmoi)(1)
