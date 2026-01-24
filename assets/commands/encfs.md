# TLDR

**Create/mount encrypted directory**

```encfs [~/.encrypted] [~/private]```

**Create with standard mode**

```encfs -s [~/.encrypted] [~/private]```

**Unmount encrypted directory**

```fusermount -u [~/private]```

**Change password**

```encfsctl passwd [~/.encrypted]```

**Show volume info**

```encfsctl info [~/.encrypted]```

**Idle timeout** unmount

```encfs -i [10] [~/.encrypted] [~/private]```

# SYNOPSIS

**encfs** [_options_] _encdir_ _mountpoint_

# DESCRIPTION

**encfs** provides encrypted filesystem in user-space using FUSE. It encrypts files individually, storing them in a directory with encrypted names and contents.

The tool is useful for encrypting cloud-synced folders or sensitive directories. Each file is encrypted separately, allowing efficient sync of changed files.

# PARAMETERS

**-s**
> Single-threaded mode.

**-f**
> Run in foreground.

**-v**
> Verbose mode.

**-i** _minutes_
> Idle timeout before unmount.

**-o** _options_
> FUSE mount options.

**--standard**
> Use standard (safer) settings.

**--paranoid**
> Use paranoid settings.

**--reverse**
> Reverse mode for backups.

**--extpass** _cmd_
> External password program.

# CAVEATS

Leaks file sizes and directory structure. Not resistant to watermarking attacks. Consider newer alternatives like gocryptfs. FUSE adds overhead. Passphrase recovery not possible.

# HISTORY

**encfs** was created by **Valient Gough** in **2003**. It pioneered user-space encrypted filesystems on Linux. While popular for years, security audits revealed weaknesses, leading to recommendations for alternatives like gocryptfs for new deployments.

# SEE ALSO

[gocryptfs](/man/gocryptfs)(1), [cryptsetup](/man/cryptsetup)(1), [fusermount](/man/fusermount)(1), [ecryptfs](/man/ecryptfs)(1)
