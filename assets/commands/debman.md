# TLDR

Read man page from a **package**

```debman -p [package] [command]```

Specify a **package version**

```debman -p [package]=[version] [command]```

Read man page from a **.deb file**

```debman -f [path/to/file.deb] [command]```

# SYNOPSIS

**debman** [_options_] _command_

# DESCRIPTION

**debman** reads man pages from Debian packages without installing them. It downloads the package, extracts the man page, and displays it using the system's man viewer.

Useful for reading documentation of packages before installation or for packages not available on the current system.

# PARAMETERS

**-p** _package_
> Download and read from specified package

**-f** _file_
> Read from local .deb file

_command_
> The man page to display

# CAVEATS

Requires network access to download packages (unless using -f). Part of the debian-goodies package.

# SEE ALSO

[man](/man/man)(1), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1)
