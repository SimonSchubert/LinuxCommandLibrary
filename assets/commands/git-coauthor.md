# TLDR

**Add coauthor to last commit**

```git coauthor "[Name]" "[email@example.com]"```

**Add multiple coauthors**

```git coauthor "[Name1]" "[email1]" "[Name2]" "[email2]"```

# SYNOPSIS

**git coauthor** _name_ _email_ [_name_ _email_]...

# PARAMETERS

_NAME_
> Coauthor name.

_EMAIL_
> Coauthor email.

**--help**
> Display help information.

# DESCRIPTION

**git coauthor** adds Co-authored-by trailers to the last commit message. GitHub and GitLab recognize these trailers to attribute commits to multiple contributors.

The command amends the last commit, appending Co-authored-by lines. Multiple coauthors can be added in a single command. This supports pair programming and collaborative coding attribution.

git coauthor simplifies adding co-author attribution to commits.

# CAVEATS

Part of git-extras package. Amends last commit (rewrites history). Coauthors must match platform accounts for attribution.

# HISTORY

git coauthor is part of **git-extras**, created to support GitHub's co-author trailer convention for attributing collaborative work.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-authors](/man/git-authors)(1)
