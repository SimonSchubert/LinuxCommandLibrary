# TAGLINE

Rename a Git branch locally and on the remote

# TLDR

**Rename current branch**

```git rename-branch [new_name]```

**Rename specific branch**

```git rename-branch [old_name] [new_name]```

# SYNOPSIS

**git** **rename-branch** [_old_name_] _new_name_

# DESCRIPTION

**git rename-branch** renames a branch both locally and on the remote. Part of git-extras, it handles the local rename, pushes the new branch name to the remote, deletes the old remote branch, and updates the upstream tracking reference in a single command.

Without this tool, renaming a remote branch requires multiple steps: `git branch -m`, `git push origin new_name`, `git push origin --delete old_name`, and `git branch -u origin/new_name`.

# PARAMETERS

**old_name**
> The current name of the branch to rename. If omitted, the current branch is used.

**new_name**
> The new name for the branch.

# CAVEATS

Requires git-extras to be installed. Other collaborators must update their local references after the rename. Pull requests or merge requests targeting the old branch name may need manual updates.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-extras](/man/git-extras)(1)
