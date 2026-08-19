# TAGLINE

Compute password hashes

# TLDR

**Hash a password** with SHA-512 crypt (recommended)

```openssl passwd -6```

Hash a given password with **SHA-256** crypt

```openssl passwd -5 [password]```

Hash with the **Apache apr1** algorithm and a fixed salt

```openssl passwd -apr1 -salt [xxxxxxxx] [password]```

Read the password from **stdin** (safer than a command-line argument)

```echo -n [password] | openssl passwd -6 -stdin```

Print **cleartext and hash** as a tab-separated table

```openssl passwd -6 -table [password]```

Use a **chosen salt** so the hash is reproducible

```openssl passwd -6 -salt [saltsalt] [password]```

# SYNOPSIS

**openssl** **passwd** [**-help**] [**-1**] [**-apr1**] [**-aixmd5**] [**-5**] [**-6**] [**-salt** _string_] [**-in** _file_] [**-stdin**] [**-noverify**] [**-quiet**] [**-table**] [**-reverse**] [_password_]

# PARAMETERS

**-help**
> Print a usage message and exit.

**-1**
> Use the MD5-based BSD password algorithm (`$1$`). This is the default.

**-apr1**
> Use Apache's apr1 variant of the BSD MD5 algorithm (`$apr1$`).

**-aixmd5**
> Use the AIX MD5 variant of the BSD algorithm.

**-5**
> Use SHA-256 crypt as specified by Ulrich Drepper (`$5$`).

**-6**
> Use SHA-512 crypt as specified by Ulrich Drepper (`$6$`).

**-salt** _string_
> Use this salt instead of a random one. When the password is read from the terminal, this also implies **-noverify**.

**-in** _file_
> Read passwords from _file_, one per line.

**-stdin**
> Read passwords from standard input.

**-noverify**
> Do not prompt a second time when reading a password from the terminal.

**-quiet**
> Suppress warnings that a command-line password was truncated.

**-table**
> Prepend the cleartext password and a tab character to each hash.

**-reverse**
> With **-table**, print hash then cleartext instead of cleartext then hash.

**_password_**
> Password to hash. If omitted, and neither **-in** nor **-stdin** is given, the password is read from the terminal.

# DESCRIPTION

**openssl passwd** computes a one-way hash of a password using a Unix crypt-style algorithm. Passwords come from a command-line argument, a file (**-in**), standard input (**-stdin**), or an interactive terminal prompt.

The default algorithm is MD5 crypt (**-1**). **-5** and **-6** select SHA-256 and SHA-512 crypt. **-apr1** produces hashes compatible with Apache **htpasswd** MD5 files. Unless **-salt** is given, a new random salt is used, so the same password hashes to a different string each run.

Typical uses include generating `/etc/shadow`-style hashes for provisioning, Apache apr1 hashes, and checking how a given password encodes under a chosen algorithm. This command only prints hashes; it does not change system accounts.

# CAVEATS

A password on the command line is visible in the process list. Prefer a terminal prompt or **-stdin**. The default **-1** (MD5 crypt) is weak by modern standards; use **-6** (SHA-512 crypt) unless you need a specific legacy format.

Without **-salt**, output changes on every invocation. Traditional DES **crypt** (`-crypt`), which truncated passwords to 8 characters, was **removed in OpenSSL 3.0**. Hashes from this command are not bcrypt, scrypt, or Argon2.

# HISTORY

**openssl passwd** has been part of the OpenSSL command-line tools since around **2000**. In **OpenSSL 1.1.x** the default algorithm was traditional Unix **crypt**, selected with **-crypt**. **OpenSSL 3.0** (2021) removed **-crypt**; the default became **-1** (MD5 crypt). **-5** and **-6** implement Drepper's SHA-crypt.

# INSTALL

```apt: sudo apt install openssl```

```dnf: sudo dnf install openssl```

```pacman: sudo pacman -S openssl```

```apk: sudo apk add openssl```

```zypper: sudo zypper install openssl```

```brew: brew install openssl```

```nix: nix profile install nixpkgs#openssl```

<!-- packages: 2026-08-19 -->

# SEE ALSO

[openssl](/man/openssl)(1), [htpasswd](/man/htpasswd)(1), [mkpasswd](/man/mkpasswd)(1), [passwd](/man/passwd)(1)

# RESOURCES

```[Source code](https://github.com/openssl/openssl)```

```[Homepage](https://www.openssl.org/)```

```[Documentation](https://docs.openssl.org/master/man1/openssl-passwd/)```

<!-- verified: 2026-08-19 -->
