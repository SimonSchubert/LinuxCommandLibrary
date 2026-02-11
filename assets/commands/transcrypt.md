# TAGLINE

Transparent Git file encryption

# TLDR

**Initialize encryption**

```transcrypt```

**With specific cipher**

```transcrypt -c [aes-256-cbc]```

**Show credentials**

```transcrypt -d```

**Flush credentials**

```transcrypt -f```

**Rekey repository**

```transcrypt -r```

**Uninstall**

```transcrypt -u```

# SYNOPSIS

**transcrypt** [_-c cipher_] [_-d_] [_-f_] [_-r_] [_options_]

# PARAMETERS

**-c** _CIPHER_
> Encryption cipher.

**-d**
> Display credentials.

**-f**
> Flush credentials.

**-r**
> Rekey repository.

**-u**
> Uninstall.

**-p** _PASSWORD_
> Set password.

# DESCRIPTION

**transcrypt** provides transparent encryption for files within a Git repository using OpenSSL symmetric ciphers. It leverages Git's built-in clean and smudge filter mechanisms to automatically encrypt files when they are staged and decrypt them when checked out, making the process seamless for daily development workflows.

The tool encrypts sensitive files on push so they are stored encrypted in the remote repository, while automatically decrypting them on pull for local use. It supports any cipher available through OpenSSL, with AES-256-CBC as the default. Credentials are managed through Git's credential helper system, and the repository can be rekeyed if a password needs to be changed.

Each clone of the repository requires initialization with the correct password to access encrypted files. The encryption configuration is stored in `.gitattributes`, which specifies which files should be encrypted.

# CAVEATS

Requires setup per clone. Password management. Git-specific.

# HISTORY

**transcrypt** was created for transparently encrypting files in a Git repository using OpenSSL.

# SEE ALSO

[git-crypt](/man/git-crypt)(1), [age](/man/age)(1), [gpg](/man/gpg)(1)
