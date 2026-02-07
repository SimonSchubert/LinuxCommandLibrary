# TAGLINE

Store credentials in plain-text file

# TLDR

**Store credentials in file**

```git config credential.helper store```

**Store in specific file**

```git config credential.helper 'store --file ~/.git-credentials'```

# SYNOPSIS

**git** **credential-store** [_options_]

# PARAMETERS

**--file** _path_
> Credential file path.

# DESCRIPTION

**git credential-store** is a credential helper that permanently stores authentication credentials in a plain-text file on disk. By default, credentials are stored in ~/.git-credentials, but a custom path can be specified with the --file option.

When configured, it saves credentials after the first successful authentication and automatically provides them for subsequent operations. The file format is simple: each line contains a URL with embedded credentials in the form https://username:password@hostname/path.

While convenient for eliminating password prompts permanently, this approach has significant security implications. Credentials are stored unencrypted and readable by anyone with filesystem access. For better security, consider platform-specific alternatives like macOS Keychain, Windows Credential Manager, or git-credential-cache for temporary memory-only storage.

# CONFIGURATION

**~/.git-credentials**
> Default plain-text file where credentials are stored, one URL per line.

# CAVEATS

Credentials are stored in plain text. Consider using a credential manager or git-credential-cache for better security.

# SEE ALSO

[git-credential-cache](/man/git-credential-cache)(1), [git-credential](/man/git-credential)(1)
