# TAGLINE

Upload local commits to remote

# TLDR

**Push to remote**

```git push [origin] [branch]```

**Push and set upstream**

```git push -u [origin] [branch]```

**Push all branches**

```git push --all```

**Push tags**

```git push --tags```

**Force push safely**

```git push --force-with-lease```

**Delete a remote branch**

```git push [origin] --delete [branch]```

# SYNOPSIS

**git push** [_options_] [_remote_] [_refspec_]

# PARAMETERS

_REMOTE_
> Remote repository name (e.g. origin).

_REFSPEC_
> Refs to push (e.g. branch name or src:dst).

**-u**, **--set-upstream**
> Set upstream tracking reference for the branch.

**--all**
> Push all branches.

**--tags**
> Push all refs under refs/tags.

**--force**
> Force update remote refs, even if not a fast-forward.

**--force-with-lease**
> Force push only if the remote ref matches what was last fetched.

**--force-if-includes**
> Refuse to force-update if remote-tracking ref has updates not integrated locally.

**--delete**
> Delete the specified remote refs.

**--dry-run**
> Do everything except actually send the updates.

**--no-verify**
> Skip pre-push hooks.

**-q**, **--quiet**
> Suppress all output, including the listing of updated refs.

**-v**, **--verbose**
> Run verbosely.

**--progress**
> Force progress status output even if stderr is not a terminal.

**--prune**
> Remove remote branches that do not have a local counterpart.

**-o** _option_, **--push-option** _option_
> Transmit string to server-side receive hooks.

**--porcelain**
> Produce machine-readable output.

# DESCRIPTION

**git push** uploads local commits to a remote repository, updating remote refs with local refs and transferring the objects needed to complete them. This is how local work becomes shared with collaborators.

The `--force-with-lease` option provides a safer alternative to `--force` by checking that the remote hasn't been updated since your last fetch before overwriting. The `-u` flag sets upstream tracking, simplifying future push and pull commands.

# CAVEATS

Force push overwrites remote history. Use --force-with-lease for safety. Branch protection may restrict pushes.

# HISTORY

git push is a core **Git** command from initial release, implementing the distributed workflow by enabling commit sharing.

# SEE ALSO

[git-pull](/man/git-pull)(1), [git-fetch](/man/git-fetch)(1), [git-remote](/man/git-remote)(1)
