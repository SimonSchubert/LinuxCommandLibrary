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

# CAVEATS

Does not provide real root privileges. Only fakes ownership information. Used extensively in package building systems like dpkg-buildpackage.

# SEE ALSO

[sudo](/man/sudo)(8), [dpkg-buildpackage](/man/dpkg-buildpackage)(1)
