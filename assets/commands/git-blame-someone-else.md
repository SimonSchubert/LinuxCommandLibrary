# TLDR

**Blame someone else**

```git blame-someone-else "[Author Name] <email@example.com>" [commit]```

**Change author of last commit**

```git blame-someone-else "[Name] <email>" HEAD```

**Change author of specific commit**

```git blame-someone-else "[Name] <email>" [abc123]```

# SYNOPSIS

**git blame-someone-else** _author_ _commit_

# PARAMETERS

_AUTHOR_
> New author in "Name <email>" format.

_COMMIT_
> Commit hash to modify.

**--help**
> Display help information.

# DESCRIPTION

**git blame-someone-else** is a humorous git-extras command that rewrites a commit's author. Despite the playful name, it serves legitimate purposes like fixing incorrect author attribution.

The command uses git's commit amendment capabilities to change the author while preserving other commit metadata. It rewrites history, creating a new commit with the same changes but different authorship.

git blame-someone-else is a joke tool with occasional practical use.

# CAVEATS

**Rewrites history.** Don't use on shared branches. The name is a joke; use responsibly for fixing attribution errors.

# HISTORY

git blame-someone-else is part of **git-extras**, created as a humorous addition to the toolkit while serving legitimate commit repair needs.

# SEE ALSO

[git-blame](/man/git-blame)(1), [git-commit](/man/git-commit)(1)
