# TAGLINE

Internal session and application launcher for Cinnamon

# TLDR

**Start or restart a Cinnamon session**

```cinnamon-launcher```

# SYNOPSIS

**cinnamon-launcher**

# DESCRIPTION

**cinnamon-launcher** is an internal utility for the Cinnamon desktop environment that facilitates starting or restarting Cinnamon sessions and launching applications.

The command processes **.desktop** files and handles application launching for the Cinnamon Shell, managing environment variables, working directories, and ensuring applications start correctly within the graphical session.

It is deeply integrated with Cinnamon components including the application menu, panel launchers, and the Nemo file manager, providing a consistent interface for starting processes across the desktop environment.

# CAVEATS

This utility is primarily for internal use by the Cinnamon desktop environment and is not typically invoked directly by users from the command line.

# INSTALL

```apt: sudo apt install cinnamon```

```dnf: sudo dnf install cinnamon```

```pacman: sudo pacman -S cinnamon```

```zypper: sudo zypper install cinnamon```

```nix: nix profile install nixpkgs#cinnamon```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cinnamon](/man/cinnamon)(1)
