# TAGLINE

File Ubuntu bug reports via Apport

# TLDR

Report a bug, choosing from a list of **symptoms**

```ubuntu-bug```

Report a bug about a **package** or program

```ubuntu-bug [package|path/to/executable]```

Report a bug about a running **process**

```ubuntu-bug [PID]```

Report a bug about the running **kernel**

```ubuntu-bug linux```

Report a stored **crash** file

```ubuntu-bug [/var/crash/_bin_bash.1000.crash]```

# SYNOPSIS

**ubuntu-bug** [_symptom_ | _pid_ | _package_ | _program_path_ | _.apport/.crash_file_]

# DESCRIPTION

**ubuntu-bug** is a symbolic link to **apport-bug** on Ubuntu and behaves identically. See [apport-bug](/man/apport-bug) for details.

# SEE ALSO

[apport-bug](/man/apport-bug)(1), [apport-cli](/man/apport-cli)(1)

# RESOURCES

```[Source code](https://git.launchpad.net/apport)```

<!-- verified: 2026-11-09 -->
