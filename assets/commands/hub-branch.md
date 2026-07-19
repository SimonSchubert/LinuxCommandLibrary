# TAGLINE

runs git's own branch command unmodified through hub

# TLDR

**List local and remote branches**

```hub branch -a```

**Create a new branch**

```hub branch [branch-name]```

**Delete a branch**

```hub branch -d [branch-name]```

**Force delete branch**

```hub branch -D [branch-name]```

**Rename current branch**

```hub branch -m [new-name]```

# SYNOPSIS

**hub** **branch** [_options_] [_branch_]

# PARAMETERS

**-a**, **--all**
> List both local and remote branches.

**-r**, **--remotes**
> List remote branches only.

**-d**
> Delete branch (only if merged).

**-D**
> Force delete branch.

**-m**
> Rename branch.

**-v**, **--verbose**
> Show more info.

# DESCRIPTION

**hub** is a command-line wrapper for git that adds GitHub-specific behavior to certain git subcommands (**clone**, **fetch**, **remote**, **checkout**, **merge**, and a few others) while transparently passing every other subcommand straight through to the real git binary. **branch** is not one of the commands hub extends, so `hub branch` behaves exactly like `git branch`: it lists, creates, renames, and deletes branches with no added GitHub integration.

It is included here because, when hub is aliased as `git` (see `hub alias`), any git subcommand - including **branch** - can be invoked through it.

# CAVEATS

Hub is no longer actively maintained and has been superseded by the official GitHub CLI (**gh**). For actual GitHub-aware branch operations (e.g. checking out a pull request as a branch), see **hub checkout** or **gh pr checkout** instead.

# SEE ALSO

[hub](/man/hub)(1), [git-branch](/man/git-branch)(1), [gh](/man/gh)(1)

# RESOURCES

```[Source code](https://github.com/mislav/hub)```

<!-- verified: 2026-07-19 -->

