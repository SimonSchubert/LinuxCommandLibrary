# TAGLINE

Retrieve and store authentication credentials

# TLDR

**Get credentials**

```echo "url=https://github.com" | git credential fill```

**Store credentials**

```git credential approve << EOF
url=https://github.com
username=user
password=token
EOF```

**Reject credentials**

```git credential reject << EOF
url=https://github.com
EOF```

# SYNOPSIS

**git credential** _action_

# PARAMETERS

**fill**
> Retrieve credentials for URL.

**approve**
> Store credentials.

**reject**
> Remove stored credentials.

**--help**
> Display help information.

# DESCRIPTION

**git credential** manages stored authentication credentials. It interfaces with credential helpers to retrieve, store, and erase credentials for remote repositories.

The command is typically invoked automatically by Git during push/pull operations. Direct use is for debugging or scripting authentication. Credentials flow through configured helpers (cache, store, osxkeychain, etc.).

# CAVEATS

Usually called internally. Helpers must be configured. Sensitive data handling required.

# HISTORY

git credential was added to **Git** to standardize credential management across helpers, replacing ad-hoc authentication handling.

# SEE ALSO

[git-config](/man/git-config)(1)
