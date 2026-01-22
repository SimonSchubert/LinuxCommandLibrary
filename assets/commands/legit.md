# TLDR

**Switch** branch with auto-stash

```git sw [branch]```

**Sync** current branch with remote

```git sync```

**Publish** branch to remote

```git publish [branch]```

**Unpublish** branch from remote

```git unpublish [branch]```

List **all branches** with status

```git branches [pattern]```

**Undo** last commit

```git undo --hard```

# SYNOPSIS

**git** _legit-command_ [_options_]

# DESCRIPTION

**legit** is a complementary command-line interface for Git that simplifies common workflows. It adds commands for branch switching with automatic stashing, synchronization, and branch publishing.

After installation, legit commands are available as Git subcommands (e.g., `git sw`, `git sync`).

# PARAMETERS

**sw BRANCH**
> Switch to branch, stashing and restoring unstaged changes

**sync**
> Synchronize current branch with remote (merge or rebase)

**publish BRANCH**
> Push branch to remote server

**unpublish BRANCH**
> Remove branch from remote server

**branches [PATTERN]**
> List branches with publication status

**undo [--hard]**
> Remove last commit from history

# CAVEATS

Legit commands wrap standard Git operations. The `undo` command with `--hard` permanently discards changes.

# SEE ALSO

[git](/man/git)(1), [git-flow](/man/git-flow)(1)
