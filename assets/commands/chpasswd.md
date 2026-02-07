# TAGLINE

batch update user passwords

# TLDR

Change the password for a **specific user**

```printf "[username]:[new_password]" | sudo chpasswd```

Change passwords for **multiple users**

```printf "[username_1]:[password_1]\n[username_2]:[password_2]" | sudo chpasswd```

Change password using an **encrypted form**

```printf "[username]:[encrypted_password]" | sudo chpasswd -e```

Change password with **specific encryption method**

```printf "[username]:[new_password]" | sudo chpasswd -c [SHA512]```

# SYNOPSIS

**chpasswd** [_options_]

# DESCRIPTION

**chpasswd** reads username:password pairs from standard input and updates user passwords in batch. This is useful for system administration tasks requiring password changes for multiple users at once, such as during initial account provisioning or automated password rotation.

Input format is one user per line as **username:password** with no spaces around the colon. Passwords are encrypted using the system default method (typically SHA-512) unless a different method is specified. Pre-encrypted passwords can also be supplied with the **-e** flag.

# PARAMETERS

**-e, --encrypted**
> Passwords are supplied in encrypted form

**-c, --crypt-method** _method_
> Specify encryption method (NONE, DES, MD5, SHA256, SHA512)

**-m, --md5**
> Use MD5 encryption

**-s, --sha-rounds** _rounds_
> Number of rounds for SHA encryption

# CONFIGURATION

**/etc/login.defs**
> Controls default encryption method (ENCRYPT_METHOD), SHA rounds (SHA_CRYPT_MIN_ROUNDS, SHA_CRYPT_MAX_ROUNDS), and other password policy settings used by chpasswd.

# CAVEATS

Requires root privileges. Passwords passed via command line may be visible in process listings. Consider using encrypted passwords or secure input methods in scripts. DES encryption is considered weak.

# SEE ALSO

[passwd](/man/passwd)(1), [usermod](/man/usermod)(8), [useradd](/man/useradd)(8)
