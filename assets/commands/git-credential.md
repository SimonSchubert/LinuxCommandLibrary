# TAGLINE

Retrieve and store authentication credentials for Git

# TLDR

**Get credentials for a URL**

```echo "url=https://github.com" | git credential fill```

**Store credentials in configured helpers**

```git credential approve << EOF
url=https://github.com
username=user
password=token
EOF```

**Reject (erase) stored credentials**

```git credential reject << EOF
url=https://github.com
username=user
password=token
EOF```

# SYNOPSIS

**git credential** _action_

# PARAMETERS

**fill**
> Read credential attributes from stdin, look up matching credentials via configured helpers, and output the result including username and password.

**approve**
> Send credential attributes to all configured helpers for storage. No output is emitted.

**reject**
> Notify all configured helpers to erase matching credentials. No output is emitted.

**--help**
> Display help information.

# DESCRIPTION

**git credential** is a low-level interface for storing and retrieving credentials using Git's credential helper system. It interfaces with configured helpers (cache, store, osxkeychain, manager, etc.) to retrieve, store, and erase credentials.

The command is typically invoked automatically by Git during push/pull operations when authentication is needed. Direct use is primarily for debugging credential issues or scripting authentication workflows. Input and output use a key=value format on stdin/stdout with attributes like protocol, host, username, and password.

Credential helpers are configured via **git config credential.helper**.

# INPUT ATTRIBUTES

**protocol**
> The protocol over which the credential will be used (e.g., https, ssh).

**host**
> The remote hostname for which the credential is used.

**username**
> The credential's username, if already known.

**password**
> The credential's password, if being provided or returned.

**path**
> The path with which the credential will be used (e.g., for accessing remote https repositories).

# CAVEATS

Usually called internally by Git, not directly by users. Credential helpers must be configured via **git config** for this command to be useful. The **reject** action requires the same credential attributes that were originally stored. Sensitive credentials may be exposed on stdin/stdout.

# HISTORY

The git credential subsystem was introduced in **Git 1.7.9** (2012) to standardize credential management across helpers, replacing the earlier ad-hoc authentication handling.

# SEE ALSO

[git-config](/man/git-config)(1), [git-credential-store](/man/git-credential-store)(1), [git-credential-cache](/man/git-credential-cache)(1)
