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

**init** [**-k** _keyname_]
> Generate a key and prepare the repository to use git-crypt.

**add-gpg-user** [**-n**] [**--trusted**] _gpg-user-id_...
> Add GPG user(s) who can unlock the repository. **-n**, **--no-commit** skips auto-committing the change; **--trusted** skips the GPG web-of-trust check.

**unlock** [_keyfile_]
> Decrypt the repository. Uses GPG-encrypted keys by default, or a symmetric key file if given.

**lock** [**-a**] [**-k** _keyname_] [**-f**]
> Re-encrypt files and remove the cached key. **-a**, **--all** locks every key instead of just the default; **-f**, **--force** locks even if the working directory is unclean.

**export-key** [**-k** _keyname_] _file_
> Export the symmetric key to _file_.

**status** [**-e**] [**-u**] [**-f**]
> Show encryption status of files. **-e** shows only encrypted files, **-u** only unencrypted files, **-f**, **--fix** encrypts files that should be encrypted but weren't.

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

# RESOURCES

```[Source code](https://github.com/AGWA/git-crypt)```

<!-- verified: 2026-07-17 -->
