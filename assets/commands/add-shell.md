# TAGLINE

Register valid login shells

# TLDR

**Add** a shell to /etc/shells

```sudo add-shell [/usr/local/bin/zsh]```

Add **multiple** shells

```sudo add-shell [/bin/fish] [/bin/zsh]```

# SYNOPSIS

**add-shell** _shell_ [_shell_...]

# DESCRIPTION

**add-shell** is a Debian utility that safely adds new shell paths to /etc/shells. The /etc/shells file lists valid login shells that users can select with **chsh**.

It copies /etc/shells to /etc/shells.tmp, appends any given shells that are not already present, then copies the temporary file back over /etc/shells. Skipping already-present entries makes it safe to call repeatedly from package maintainer scripts. Its counterpart **remove-shell** deletes entries.

# PARAMETERS

**shell**
> Absolute path to the shell executable to add

# CAVEATS

Requires root privileges. The shell executable must exist and be valid. Not available on all distributions; on systems without this command, manually edit /etc/shells.

# HISTORY

**add-shell** is part of the Debian packaging utilities, created to provide safe manipulation of /etc/shells during package installation scripts.

# INSTALL

```apt: sudo apt install debianutils```

```aur: yay -S debianutils```

```zypper: sudo zypper install debianutils```

```brew: brew install debianutils```

```nix: nix profile install nixpkgs#debianutils```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[chsh](/man/chsh)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/debianutils)```

```[Documentation](https://manpages.ubuntu.com/manpages/noble/man8/add-shell.8.html)```

<!-- verified: 2026-06-11 -->
