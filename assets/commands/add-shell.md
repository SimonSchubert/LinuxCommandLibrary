# TLDR

**Add** a shell to /etc/shells

```sudo add-shell [/usr/local/bin/zsh]```

Add **multiple** shells

```sudo add-shell [/bin/fish] [/bin/zsh]```

# SYNOPSIS

**add-shell** _shell_ [_shell_...]

# DESCRIPTION

**add-shell** is a Debian utility that safely adds new shell paths to /etc/shells. The /etc/shells file lists valid login shells that users can select with **chsh**.

The tool checks for duplicates and validates the path before adding it, making it safer than manually editing /etc/shells.

# PARAMETERS

**shell**
> Absolute path to the shell executable to add

# CAVEATS

Requires root privileges. The shell executable must exist and be valid. Not available on all distributions; on systems without this command, manually edit /etc/shells.

# HISTORY

**add-shell** is part of the Debian packaging utilities, created to provide safe manipulation of /etc/shells during package installation scripts.

# SEE ALSO

[remove-shell](/man/remove-shell)(8), [chsh](/man/chsh)(1), [shells](/man/shells)(5)
