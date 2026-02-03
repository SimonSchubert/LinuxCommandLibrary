# TLDR

**Pull from origin**

```git pull```

**Pull from specific remote**

```git pull [remote]```

**Pull specific branch**

```git pull [remote] [branch]```

**Pull with rebase**

```git pull --rebase```

**Pull all remotes**

```git pull --all```

**Pull without committing merge**

```git pull --no-commit```

**Pull with fast-forward only**

```git pull --ff-only```

# SYNOPSIS

**git** **pull** [_options_] [_remote_] [_branch_]

# PARAMETERS

**--rebase**
> Rebase instead of merge.

**--no-rebase**
> Force merge.

**--ff-only**
> Fast-forward only.

**--no-commit**
> Don't auto-commit merge.

**--all**
> Pull from all remotes.

**--autostash**
> Stash changes automatically.

**--depth** _n_
> Shallow fetch depth.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**git pull** fetches from remote and integrates with the current branch. Equivalent to git fetch followed by git merge (or git rebase with --rebase).

# SEE ALSO

[git-fetch](/man/git-fetch)(1), [git-merge](/man/git-merge)(1)

