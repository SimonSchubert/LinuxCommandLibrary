# TLDR

**Check mailmap entry**

```git check-mailmap "[Name] <email@example.com>"```

**Map multiple entries**

```git check-mailmap "[Name1] <email1>" "[Name2] <email2>"```

**Read from stdin**

```echo "[Name] <email>" | git check-mailmap --stdin```

# SYNOPSIS

**git check-mailmap** [_options_] _contact_

# PARAMETERS

_CONTACT_
> Contact in "Name <email>" format.

**--stdin**
> Read contacts from stdin.

**--help**
> Display help information.

# DESCRIPTION

**git check-mailmap** looks up canonical names and email addresses using the mailmap file. It translates author/committer identities to their canonical forms as configured in .mailmap.

The mailmap feature consolidates identity variations (typos, name changes, multiple emails) to canonical forms. This command shows how identities will be mapped in git log and shortlog output.

git check-mailmap helps verify mailmap configuration.

# CAVEATS

Requires .mailmap file in repository. Input must be proper "Name <email>" format. Used mainly for debugging.

# HISTORY

git check-mailmap was added to **Git** to support debugging mailmap configurations, complementing git shortlog -e functionality.

# SEE ALSO

[git-shortlog](/man/git-shortlog)(1), [git-log](/man/git-log)(1)
