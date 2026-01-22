# TLDR

**Crack password file**

```john [hashes.txt]```

**Show cracked passwords**

```john --show [hashes.txt]```

**Use specific wordlist**

```john --wordlist=[wordlist.txt] [hashes.txt]```

**Specify hash format**

```john --format=[md5crypt] [hashes.txt]```

**Incremental mode**

```john --incremental [hashes.txt]```

**Resume cracking session**

```john --restore```

# SYNOPSIS

**john** [_options_] [_password_files_]

# PARAMETERS

_PASSWORD_FILES_
> Files containing hashes.

**--show**
> Show cracked passwords.

**--wordlist** _FILE_
> Use wordlist attack.

**--format** _FORMAT_
> Hash format (md5crypt, sha256, etc.).

**--incremental**
> Brute force mode.

**--restore**
> Resume previous session.

**--help**
> Display help information.

# DESCRIPTION

**john** is John the Ripper, a password security auditing tool. It detects weak passwords through various cracking methods.

The tool supports many hash formats and attack modes. It's used for security testing and password audits.

john audits password security.

# CAVEATS

Authorized use only. CPU/GPU intensive. Jumbo version has more formats.

# HISTORY

John the Ripper was created by **Solar Designer** in 1996 and is maintained by **Openwall** as an open-source password auditing tool.

# SEE ALSO

[hashcat](/man/hashcat)(1), [unshadow](/man/unshadow)(1), [zip2john](/man/zip2john)(1)
