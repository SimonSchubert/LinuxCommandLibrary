# TAGLINE

show working tree and staging status

# TLDR

**Show working tree status**

```dolt status```

# SYNOPSIS

**dolt** **status**

# DESCRIPTION

**dolt status** displays the current state of the working tree and staging area in a Dolt repository. It categorizes tables into three groups: staged changes ready for commit, unstaged modifications in the working set, and untracked new tables.

The output helps understand what will be included in the next commit and what changes remain in the working set. This is essential before committing to verify the intended tables are staged and to avoid committing unintended changes.

Similar to git status, it provides a clear overview of repository state, indicating which tables need attention and what actions (add, commit, or reset) might be appropriate next.

# SEE ALSO

[dolt-add](/man/dolt-add)(1), [dolt-diff](/man/dolt-diff)(1)

