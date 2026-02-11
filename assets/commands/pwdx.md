# TAGLINE

Show working directory of a process

# TLDR

Print **current working directory** of a process

```pwdx 1234```

Print working directory of **multiple processes**

```pwdx 1234 5678```

# SYNOPSIS

**pwdx** [_option_...] _pid_...

# DESCRIPTION

**pwdx** reports the current working directory of a process. It reads this information from /proc/[pid]/cwd and displays the directory path for each specified process ID.

# PARAMETERS

**-V, --version**
> Output version information and exit

**-h, --help**
> Output help screen and exit

# CAVEATS

The process must be accessible to the user running pwdx. For processes owned by other users, root privileges may be required to access the working directory information.

# HISTORY

**pwdx** was created by Nicholas Miell in 2004 and is part of the **procps-ng** package. It resembles a SunOS command of the same name.

# SEE ALSO

[ps](/man/ps)(1), [pgrep](/man/pgrep)(1), [lsof](/man/lsof)(8)
