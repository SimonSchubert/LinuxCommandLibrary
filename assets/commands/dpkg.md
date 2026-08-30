# TAGLINE

low-level Debian package manager

# TLDR

**Install** a package file

```sudo dpkg --install [path/to/package.deb]```

**Unpack** without configuring it yet

```sudo dpkg --unpack [path/to/package.deb]```

**Configure** a package that is unpacked but not set up

```sudo dpkg --configure [package]```

Configure **everything** left half-installed

```sudo dpkg --configure -a```

**Remove** a package, keeping its configuration

```sudo dpkg --remove [package]```

Remove a package **and its configuration**

```sudo dpkg --purge [package]```

**List** installed packages matching a pattern

```dpkg --list '[*ssh*]'```

Show one package's **status**

```dpkg --status [package]```

List the **files a package installed**

```dpkg --listfiles [package]```

Find **which package owns a file**

```dpkg --search [/usr/bin/ssh]```

List what is **inside a .deb** without installing it

```dpkg --contents [path/to/package.deb]```

**Extract** a .deb into a directory

```dpkg --extract [path/to/package.deb] [path/to/dir]```

**Verify** installed files against their recorded checksums

```dpkg --verify [package]```

Report packages that are **broken or half-installed**

```dpkg --audit```

# SYNOPSIS

**dpkg** [_options_] _action_ [_package_|_file_]

# DESCRIPTION

**dpkg** is the low-level package manager for Debian-based systems. It handles the installation, removal, and management of .deb packages. Higher-level tools like **apt** and **apt-get** use dpkg internally.

# PARAMETERS

**-i, --install file.deb**
> Install a package from a .deb file

**-r, --remove package**
> Remove a package (keep configuration files)

**-P, --purge package**
> Remove a package and its configuration files

**-l, --list pattern**
> List packages matching pattern

**-L, --listfiles package**
> List files installed by a package

**-c, --contents file.deb**
> List contents of a .deb file

**-S, --search path**
> Search for a package owning a file

**-s, --status package**
> Display package status details

**--configure package**
> Configure an unpacked package

**--unpack file.deb**
> Unpack but don't configure a package

**--get-selections** [_pattern_]
> Get list of package selections

**--set-selections**
> Set package selections from stdin

**--audit**, **-C**
> Search for partially installed packages and suggest how to fix them.

**--force-**_things_
> Override safety checks (e.g. **--force-all**, **--force-overwrite**). Use with care.

**--no-act**, **--dry-run**, **--simulate**
> Show what would be done without making changes.

# CAVEATS

dpkg does not handle dependencies automatically. Use **apt** or **apt-get** for dependency resolution. Configuration files are kept by default when removing packages.

# HISTORY

**dpkg** was originally created for the **Debian** project in **1994** by **Ian Murdock**, then rewritten in C by **Ian Jackson** who became its primary developer. It remains the foundation of package management on Debian-based systems.

# INSTALL

```apt: sudo apt install dpkg```

```dnf: sudo dnf install dpkg```

```pacman: sudo pacman -S dpkg```

```apk: sudo apk add dpkg```

```zypper: sudo zypper install dpkg```

```brew: brew install dpkg```

```nix: nix profile install nixpkgs#dpkg```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg-deb](/man/dpkg-deb)(1), [dpkg-query](/man/dpkg-query)(1)
