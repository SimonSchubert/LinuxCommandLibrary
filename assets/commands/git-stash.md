# TAGLINE

Temporarily save uncommitted changes for later

# TLDR

**Stash changes**

```git stash```

**Stash with message**

```git stash push -m "[message]"```

**List stashes**

```git stash list```

**Apply latest stash**

```git stash apply```

**Pop latest stash**

```git stash pop```

**Apply specific stash**

```git stash apply stash@{[n]}```

**Show stash contents**

```git stash show -p```

**Drop a stash**

```git stash drop stash@{[n]}```

**Clear all stashes**

```git stash clear```

# SYNOPSIS

**git** **stash** _command_ [_options_]

# SUBCOMMANDS

**push**
> Stash changes.

**list**
> List stashes.

**show**
> Show stash contents.

**apply**
> Apply without removing.

**pop**
> Apply and remove.

**drop**
> Remove a stash.

**clear**
> Remove all stashes.

**branch**
> Create branch from stash.

# PARAMETERS

**-m**, **--message** _msg_
> Stash message.

**-u**, **--include-untracked**
> Include untracked files.

**-a**, **--all**
> Include ignored files.

**-p**, **--patch**
> Interactive stashing.

# DESCRIPTION

**git stash** temporarily shelves uncommitted changes so you can work on something else. It saves both staged and unstaged modifications, then reverts the working directory to match HEAD.

Use `pop` to restore and remove a stash, or `apply` to restore while keeping it. Stashes are stored as a stack, with the most recent at `stash@{0}`.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-reset](/man/git-reset)(1)
