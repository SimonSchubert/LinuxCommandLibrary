# TAGLINE

Rebase with patch application

# TLDR

**Rebase and apply patch**

```git rebase-patch [patch_file]```

# SYNOPSIS

**git** **rebase-patch** _patch_file_

# DESCRIPTION

**git rebase-patch** rebases a branch while applying a patch file. This git-extras command combines rebasing with patch application, useful for maintaining patch sets on top of upstream changes.

The command is particularly valuable when maintaining a fork or a set of downstream patches that need to stay in sync with upstream development. It automates the workflow of rebasing to the latest upstream and reapplying separately stored patches.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git-am](/man/git-am)(1), [git-extras](/man/git-extras)(1)
