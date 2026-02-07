# TAGLINE

Transparent encryption of files in Git repositories

# TLDR

**Initialize git-crypt in repo**

```git-crypt init```

**Add GPG user**

```git-crypt add-gpg-user [user@example.com]```

**Unlock repository**

```git-crypt unlock```

**Lock repository**

```git-crypt lock```

**Export symmetric key**

```git-crypt export-key [/path/to/key]```

**Unlock with key file**

```git-crypt unlock [/path/to/key]```

# SYNOPSIS

**git-crypt** _command_ [_options_]

# PARAMETERS

**init**
> Initialize git-crypt in repository.

**add-gpg-user** _user_
> Add GPG user who can unlock.

**unlock** [_keyfile_]
> Decrypt encrypted files.

**lock**
> Re-encrypt files.

**export-key** _file_
> Export symmetric key.

**status** [_-e_|_-u_]
> Show encryption status of files.

# DESCRIPTION

**git-crypt** enables transparent encryption of files in a Git repository. Configured files are encrypted when committed and decrypted when checked out, allowing sensitive data to be stored securely alongside regular code.

Encryption is configured via .gitattributes patterns. Users with the symmetric key or authorized GPG keys can unlock the repository to view and edit protected files.

# CONFIGURATION

**.gitattributes**
> Defines which files are encrypted using filter and diff attributes.

```
secrets/** filter=git-crypt diff=git-crypt
*.key filter=git-crypt diff=git-crypt
.env filter=git-crypt diff=git-crypt
```

# CAVEATS

Encrypted files appear as binary. File names are not encrypted. Requires GPG for multi-user access. History contains encrypted versions. Not for large files (use git-lfs).

# HISTORY

git-crypt was created by **Andrew Ayer** to solve the problem of storing secrets in git repositories. It provides simpler setup than alternative approaches like git-secret.

# SEE ALSO

[git](/man/git)(1), [gpg](/man/gpg)(1), [git-secret](/man/git-secret)(1)
