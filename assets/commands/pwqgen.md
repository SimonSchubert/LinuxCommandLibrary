# TAGLINE

Create secure dictionary-based passphrases

# TLDR

**Generate passphrase**

```pwqgen```

**Generate with specific word count**

```pwqgen random=5```

**Generate multiple**

```pwqgen count=5```

# SYNOPSIS

**pwqgen** [_options_]

# PARAMETERS

**random=N**
> Number of random words.

**count=N**
> Number of passphrases.

# DESCRIPTION

**pwqgen** generates random passphrases by combining dictionary words with separators, producing passwords that are both strong and easy to remember. The **random** parameter controls the number of words used, with more words providing higher entropy.

The tool is part of the **passwdqc** (password quality checking) suite and serves as a companion to **pwqcheck**. Generated passphrases follow the quality rules enforced by passwdqc's password policy, making them suitable for environments with strict password requirements.

# CAVEATS

Part of passwdqc. May not be installed by default.

# HISTORY

pwqgen is part of **passwdqc** password quality checking suite.

# SEE ALSO

[pwgen](/man/pwgen)(1), [apg](/man/apg)(1), [pwqcheck](/man/pwqcheck)(1)

