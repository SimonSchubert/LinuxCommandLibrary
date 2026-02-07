# TAGLINE

Encrypt and store secrets in a Git repository

# TLDR

**Initialize git-secret**

```git secret init```

**Add user by email**

```git secret tell [user@email.com]```

**Add file to encrypt**

```git secret add [secret.txt]```

**Encrypt secrets**

```git secret hide```

**Decrypt secrets**

```git secret reveal```

# SYNOPSIS

**git secret** _command_ [_options_]

# PARAMETERS

**init**
> Initialize git-secret in repo.

**tell** _EMAIL_
> Add GPG user.

**add** _FILE_
> Add file to secrets.

**hide**
> Encrypt secret files.

**reveal**
> Decrypt secret files.

**remove** _FILE_
> Remove file from secrets.

**list**
> List secret files.

**--help**
> Display help information.

# DESCRIPTION

**git secret** encrypts sensitive files for safe storage in Git repositories. Files are encrypted with GPG for specified recipients, allowing secrets to be version-controlled safely.

The tool manages encryption, decryption, and recipient lists. Encrypted files (`.secret`) are tracked by Git while the original plaintext files are automatically added to `.gitignore`.

# CONFIGURATION

**.gitsecret/**
> Directory storing git-secret configuration, key rings, and file mappings.

# CAVEATS

Requires GPG. Recipients need GPG keys. Separate tool from gh secret.

# HISTORY

git secret was created to solve the problem of storing secrets in git repositories, using GPG encryption to protect sensitive configuration.

# SEE ALSO

[gpg](/man/gpg)(1), [gh-secret](/man/gh-secret)(1)
