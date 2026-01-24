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

**transcrypt** encrypts Git files. It uses Git filters.

Transparent encryption. Files encrypted on push.

Automatic decryption. Seamless on pull.

OpenSSL ciphers. Strong encryption.

Credential management. Store safely.

# CAVEATS

Requires setup per clone. Password management. Git-specific.

# HISTORY

**transcrypt** was created for transparently encrypting files in a Git repository using OpenSSL.

# SEE ALSO

[git-crypt](/man/git-crypt)(1), [age](/man/age)(1), [gpg](/man/gpg)(1)
