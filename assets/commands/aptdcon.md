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

**Upgrade the whole system** safely (no removals)

```aptdcon --safe-upgrade```

**Full upgrade**, allowing packages to be installed or removed

```aptdcon --full-upgrade```

**Install a local .deb file**

```aptdcon --install [path/to/package.deb]```

**Refresh the package cache**

```aptdcon --refresh```

**Fix broken dependencies**

```aptdcon --fix-depends```

**Add a repository**

```aptdcon --add-repository "[deb http://example.com/debian stable main]"```

**Install without attaching to the dpkg terminal**

```aptdcon --install "[package]" --hide-terminal```

# SYNOPSIS

**aptdcon** _action_ [_options_]

# DESCRIPTION

**aptdcon** is a command-line client for **aptdaemon**, a system-wide D-Bus service that serializes APT operations and performs PolicyKit-based authentication. It exposes the same backend used by GNOME Software, Software-Properties-GTK, and update-manager, so actions dispatched via `aptdcon` cooperate cleanly with running GUI package managers.

Operations are queued on the daemon; multiple `aptdcon` invocations simply hand off to `aptd`, which runs them in sequence. PolicyKit prompts for authentication as needed (via a graphical or tty agent). Only one action is performed per invocation; to operate on several packages, put the names in one quoted, space-separated argument. By default aptdcon attaches to the dpkg terminal so configuration prompts can be answered.

# PARAMETERS

**-i** _PKGS_, **--install** _PKGS_
> Install the listed packages, or a single local `.deb` file.

**--reinstall** _PKGS_
> Reinstall the listed packages.

**-r** _PKGS_, **--remove** _PKGS_
> Remove the listed packages (keep config files).

**-p** _PKGS_, **--purge** _PKGS_
> Remove and purge the listed packages (delete config files too).

**-u** _PKGS_, **--upgrade** _PKGS_
> Upgrade the listed packages.

**--downgrade** _PKGS_
> Downgrade the listed packages (use _name=version_).

**--safe-upgrade**
> Upgrade the system without installing or removing packages. **--upgrade-system** is a deprecated alias.

**--full-upgrade**
> Upgrade the system, possibly installing and removing packages.

**-c**, **--refresh**
> Update the package lists.

**--fix-install**
> Complete a previously interrupted installation (like `dpkg --configure -a`).

**--fix-depends**
> Try to resolve broken dependencies. Potentially dangerous, since it may remove many packages.

**--clean**
> Remove downloaded package files from the cache.

**--reconfigure** _PKGS_
> Reconfigure installed packages via debconf.

**--priority** _PRIORITY_
> Minimum debconf priority of questions shown with **--reconfigure**.

**--add-repository** _'DEB_LINE'_
> Add the given `deb` line to the APT sources.

**--sources-file** _FILE_
> Alternative file in sources.list.d to which repositories are added.

**--hide-terminal**
> Do not attach to the dpkg terminal.

**--allow-unauthenticated**
> Allow installing packages from unauthenticated sources.

**-d**, **--show-details**
> Show additional information about the packages (currently the version numbers).

**--add-vendor-key** _FILE_, **--add-vendor-key-from-keyserver** _KEY_ID_, **--keyserver** _SERVER_, **--remove-vendor-key** _FINGERPRINT_, **--list-trusted-vendors**
> Manage trusted APT signing keys (aptdaemon 1.x only, removed in 2.0).

**-h**, **--help**
> Show help.

**--version**
> Show aptdcon version.

# CAVEATS

Requires the **aptdaemon** service. Debian dropped aptdaemon after Debian 8 (jessie); Ubuntu still packages it (2.0.x), though most frontends now use **PackageKit** instead. Elsewhere, `apt`, `apt-get`, or `pkcon` are the direct replacements. PolicyKit authorization is required for all mutating actions, so expect a password prompt in a GUI agent or tty.

# HISTORY

**aptdaemon** (and its client **aptdcon**) was written by **Sebastian Heinlein** around 2008 for Ubuntu to provide a single D-Bus-coordinated place for Software Center, Update Manager, and other frontends to call APT, including a PackageKit compatibility layer. Version 2.0 (December 2024) dropped the vendor key management actions.

# SEE ALSO

[aptd](/man/aptd)(1), [apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [pkcon](/man/pkcon)(1), [pkexec](/man/pkexec)(1)

# RESOURCES

```[Source code](https://git.launchpad.net/aptdaemon)```

```[Homepage](https://launchpad.net/aptdaemon)```

<!-- verified: 2026-11-23 -->
