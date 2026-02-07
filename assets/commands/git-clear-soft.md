# TAGLINE

Soft reset keeping staged changes

# TLDR

**Soft clear working directory**

```git clear-soft```

# SYNOPSIS

**git** **clear-soft**

# DESCRIPTION

**git clear-soft** is a git-extras command that performs a soft reset to HEAD, effectively uncommitting the most recent commit while preserving all changes in the staging area. This allows you to reorganize, split, or amend commits without losing any work.

The command is particularly useful when you realize a commit should have been split into multiple smaller commits, or when commit messages need to be restructured. Unlike git reset --hard, this operation is safe as it preserves all file modifications.

After running git clear-soft, your working directory and index remain unchanged, but HEAD moves back one commit. You can then selectively stage and commit changes with better organization or improved commit messages. This workflow supports iterative refinement of commit history before pushing to shared branches.

# SEE ALSO

[git-clear](/man/git-clear)(1), [git-reset](/man/git-reset)(1), [git-extras](/man/git-extras)(1)

