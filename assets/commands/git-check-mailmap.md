# TAGLINE

Resolve canonical author and committer identities

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

**--mailmap-file** _FILE_
> Also read the specified mailmap file, taking precedence over the repository's configured mailmap.

**--mailmap-blob** _BLOB_
> Like **--mailmap-file**, but read the mailmap from a blob in the repository.

**--help**
> Display help information.

# DESCRIPTION

**git check-mailmap** looks up canonical names and email addresses using the mailmap file. It translates author/committer identities to their canonical forms as configured in .mailmap.

The mailmap feature consolidates identity variations (typos, name changes, multiple emails) to canonical forms. This command shows how identities will be mapped in git log and shortlog output.

This is primarily a debugging tool for verifying that .mailmap entries are correctly resolving contributor identities before relying on them in reports or statistics.

# CONFIGURATION

**.mailmap**
> Maps author and committer names/emails to canonical forms, consolidating identity variations in logs and statistics.

# CAVEATS

Requires .mailmap file in repository. Input must be proper "Name <email>" format. Used mainly for debugging.

# HISTORY

git check-mailmap was added to **Git** to support debugging mailmap configurations, complementing git shortlog -e functionality.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-shortlog](/man/git-shortlog)(1), [git-log](/man/git-log)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-check-mailmap)```

<!-- verified: 2026-07-17 -->
