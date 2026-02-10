# TAGLINE

generates random passwords suitable for user accounts

# TLDR

**Generate random password**

```makepasswd```

**Generate multiple passwords**

```makepasswd --count [5]```

**Generate password of specific length**

```makepasswd --chars [16]```

**Generate with specific character set**

```makepasswd --string '[A-Za-z0-9!@#]'```

**Generate crypted password** (for /etc/shadow)

```makepasswd --crypt-md5```

**Generate from word list**

```makepasswd --randomseed --count [3]```

**Specify minimum and maximum length**

```makepasswd --minchars [8] --maxchars [12]```

# SYNOPSIS

**makepasswd** [_--count n_] [_--chars n_] [_--string chars_] [_--crypt_] [_options_]

# PARAMETERS

**--count** _N_
> Generate N passwords.

**--chars** _N_
> Password length.

**--minchars** _N_
> Minimum length.

**--maxchars** _N_
> Maximum length.

**--string** _CHARS_
> Characters to use.

**--crypt**
> Output DES-crypted password.

**--crypt-md5**
> Output MD5-crypted password.

**--clearfrom** _FILE_
> Read cleartext from file.

**--cryptsalt** _N_
> Salt for crypt.

**--randomseed**
> Use random seed.

**--rerandom** _N_
> Re-seed every N passwords.

# DESCRIPTION

**makepasswd** generates random passwords suitable for user accounts. It uses /dev/urandom for randomness, producing cryptographically suitable output.

By default, it generates a single password of reasonable length using letters and digits. The string option customizes the character set for specific password policies.

The crypt options produce password hashes suitable for /etc/shadow. MD5 crypt produces hashes starting with $1$, compatible with modern systems. DES crypt is legacy and limited to 8 characters.

Batch generation with count is useful for provisioning multiple accounts. Combined with proper length and character requirements, it meets most password policies.

For scripting, passwords output one per line. When combined with crypt, both cleartext and hash appear for reference.

# CAVEATS

DES crypt limited to 8 characters - use MD5. Random passwords hard to remember. Generated passwords should be changed by users. Some special characters may cause shell issues.

# HISTORY

**makepasswd** was written by **Rob Browning** for **Debian** in the **1990s**. It provided a simple tool for system administrators to generate passwords during account creation. The package remains in Debian and derived distributions.

# SEE ALSO

[pwgen](/man/pwgen)(1), [apg](/man/apg)(1), [openssl](/man/openssl)(1), [passwd](/man/passwd)(1)
