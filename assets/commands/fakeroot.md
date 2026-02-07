# TAGLINE

simulated root environment for package building

# TLDR

Start default shell as **fakeroot**

```fakeroot```

Run a **command** as fakeroot

```fakeroot -- [command] [command_arguments]```

Run command and **save** environment on exit

```fakeroot -s [path/to/file] -- [command] [command_arguments]```

**Load** environment and run command

```fakeroot -i [path/to/file] -- [command] [command_arguments]```

**Keep** real ownership instead of pretending root

```fakeroot [-u|--unknown-is-real] -- [command] [command_arguments]```

Display **help**

```fakeroot [-h|--help]```

# SYNOPSIS

**fakeroot** [_options_] [_command_]

# DESCRIPTION

**fakeroot** runs commands in an environment that fakes root privileges for file manipulation. It intercepts system calls to make files appear owned by root without actual root access.

Commonly used for building packages that need to create root-owned files.

# PARAMETERS

**-s** _file_
> Save fakeroot environment on exit

**-i** _file_
> Load fakeroot environment

**-u, --unknown-is-real**
> Keep real ownership of unknown files

**-h, --help**
> Display help

# DESCRIPTION

**fakeroot** runs commands in an environment that fakes root privileges for file manipulation. It intercepts system calls to make files appear owned by root without actual root access.

The tool uses LD_PRELOAD to intercept library calls and maintain a database of fake ownership and permission information. When a program creates a file, fakeroot records it as owned by root (uid 0, gid 0) while the actual file on disk retains the user's ownership.

This is commonly used for building packages (particularly Debian .deb packages) that need to create root-owned files. The saved environment (-s/-i) allows preserving fake ownership across multiple commands and sessions.

# CAVEATS

Does not provide real root privileges. Only fakes ownership information. Used extensively in package building systems like dpkg-buildpackage.

# SEE ALSO

[sudo](/man/sudo)(8), [dpkg-buildpackage](/man/dpkg-buildpackage)(1)
