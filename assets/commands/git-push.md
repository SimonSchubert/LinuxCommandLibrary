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

**Force push**

```git push --force-with-lease```

# SYNOPSIS

**git push** [_options_] [_remote_] [_refspec_]

# PARAMETERS

_REMOTE_
> Remote repository name.

_REFSPEC_
> Refs to push.

**-u**, **--set-upstream**
> Set upstream tracking.

**--all**
> Push all branches.

**--tags**
> Push tags.

**--force**
> Force update remote refs.

**--force-with-lease**
> Safe force push.

**--delete**
> Delete remote ref.

**--dry-run**
> Show what would be pushed.

**--help**
> Display help information.

# DESCRIPTION

**git push** uploads local commits to a remote repository, updating remote refs with local refs and transferring the objects needed to complete them. This is how local work becomes shared with collaborators.

The `--force-with-lease` option provides a safer alternative to `--force` by checking that the remote hasn't been updated since your last fetch before overwriting. The `-u` flag sets upstream tracking, simplifying future push and pull commands.

# CAVEATS

Force push overwrites remote history. Use --force-with-lease for safety. Branch protection may restrict pushes.

# HISTORY

git push is a core **Git** command from initial release, implementing the distributed workflow by enabling commit sharing.

# SEE ALSO

[git-pull](/man/git-pull)(1), [git-fetch](/man/git-fetch)(1), [git-remote](/man/git-remote)(1)
