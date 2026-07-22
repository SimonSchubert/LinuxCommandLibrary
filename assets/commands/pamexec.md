# TAGLINE

runs a specified shell command on each image in a multi-image PAM stream

# TLDR

**Apply command to each image in stream**

```pamexec "[pnmflip -lr]" [input.pam] > [output.pam]```

# SYNOPSIS

**pamexec** _command_ [_file_]

# PARAMETERS

_command_
> Shell command to execute on each image.

# DESCRIPTION

**pamexec** runs a specified shell command on each image in a multi-image PAM stream. The command receives each image on stdin and outputs to stdout. Part of Netpbm toolkit.

# INSTALL

```apt: sudo apt install netpbm```

```dnf: sudo dnf install netpbm```

```pacman: sudo pacman -S netpbm```

```apk: sudo apk add netpbm```

```zypper: sudo zypper install netpbm```

```brew: brew install netpbm```

```nix: nix profile install nixpkgs#netpbm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pamsplit](/man/pamsplit)(1)

