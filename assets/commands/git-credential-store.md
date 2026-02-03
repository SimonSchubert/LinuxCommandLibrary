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

**git credential-store** stores credentials unencrypted in a plain-text file. Simple but less secure than encrypted alternatives.

# CAVEATS

Credentials are stored in plain text. Consider using a credential manager or git-credential-cache for better security.

# SEE ALSO

[git-credential-cache](/man/git-credential-cache)(1), [git-credential](/man/git-credential)(1)

