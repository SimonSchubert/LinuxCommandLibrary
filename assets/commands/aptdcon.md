# TAGLINE

command-line client for the **aptdaemon** package management service

# TLDR

**Install** packages via aptd

```aptdcon --install "[package1 package2]"```

**Remove** packages

```aptdcon --remove "[package]"```

**Purge** packages (remove config too)

```aptdcon --purge "[package]"```

**Upgrade named packages**

```aptdcon --upgrade "[package]"```

**Upgrade the whole system**

```aptdcon --upgrade-system```

**Refresh the package cache**

```aptdcon --refresh```

**Fix broken dependencies**

```aptdcon --fix-depends```

**Install packages while showing dpkg's terminal output**

```aptdcon --install "[package]" --show-terminal```

# SYNOPSIS

**aptdcon** [_action_] [_options_]

# DESCRIPTION

**aptdcon** is a command-line client for **aptdaemon**, a system-wide D-Bus service that serializes APT operations and performs PolicyKit-based authentication. It exposes the same backend used by GNOME Software, Software-Properties-GTK, and update-manager, so actions dispatched via `aptdcon` cooperate cleanly with running GUI package managers.

Operations are queued on the daemon; multiple `aptdcon` invocations simply hand off to `aptd`, which runs them in sequence. PolicyKit prompts for authentication as needed (via a graphical or tty agent).

# PARAMETERS

**-i** _PKGS_, **--install** _PKGS_
> Install the listed packages.

**--reinstall** _PKGS_
> Reinstall the listed packages.

**-r** _PKGS_, **--remove** _PKGS_
> Remove the listed packages (keep config files).

**-p** _PKGS_, **--purge** _PKGS_
> Remove and purge the listed packages (delete config files too).

**-u** _PKGS_, **--upgrade** _PKGS_
> Upgrade the listed packages.

**--upgrade-system**
> Upgrade all packages on the system (equivalent to `apt upgrade`).

**--refresh**
> Update the package lists.

**--fix-install**
> Complete a previously cancelled installation via dpkg.

**--fix-depends**
> Attempt to resolve unsatisfied dependencies.

**--add-vendor-key** _PUBLIC_KEY_FILE_
> Install a vendor signing key from a file.

**--add-vendor-key-from-keyserver** _KEY_ID_
> Fetch and install a vendor key from a keyserver.

**--key-server** _KEYSERVER_
> Use _KEYSERVER_ for key downloads.

**--remove-vendor-key** _FINGERPRINT_
> Remove the vendor key with the given fingerprint.

**--list-trusted-vendors**
> List trusted software vendors and their keys.

**--add-repository** _'DEB_LINE'_
> Add the given `deb` line to sources.

**--sources-file** _FILE_
> Alternative sources.list location for repository management.

**--show-terminal**
> Attach to dpkg's interactive terminal (prompts, progress).

**--hide-terminal**
> Suppress dpkg terminal output.

**--allow-unauthenticated**
> Allow install of packages that are not from a trusted vendor.

**-d**, **--debug**
> Print extra diagnostic information.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show aptdcon version.

# CAVEATS

Requires the **aptdaemon** service. On systems without aptd (modern Ubuntu/Debian are migrating to `packagekit`), `apt` or `apt-get` is the direct replacement. PolicyKit authorization is required for all mutating actions, so expect a password prompt in a GUI agent or tty.

# HISTORY

**aptdaemon** (and its clients `aptdcon` and `aptd-cli`) was written by **Sebastian Heinlein** for Ubuntu to provide a single D-Bus-coordinated place for PackageKit/Software Center/Update Manager to call APT.

# SEE ALSO

[aptd](/man/aptd)(1), [apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [pkcon](/man/pkcon)(1), [pkexec](/man/pkexec)(1)
