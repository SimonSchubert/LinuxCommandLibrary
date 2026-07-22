# TAGLINE

Print current effective username

# TLDR

**Print the current username**

```whoami```

# SYNOPSIS

**whoami** [**--help**] [**--version**]

# PARAMETERS

**--help**
> Display help and exit

**--version**
> Display version and exit

# DESCRIPTION

**whoami** prints the username associated with the current effective user ID. It's equivalent to **id -un**.

This is useful in scripts to determine which user is running the script, especially when the script might be run via sudo or after using su to switch users.

Unlike **who am i** which shows the login name from utmp, **whoami** shows the effective user ID name, which may differ after sudo or su.

# CAVEATS

After **sudo**, whoami shows the target user (usually root), not the original user. Use **logname** or **who am i** to get the original login name.

The command shows the **effective** user ID. In setuid programs, this may differ from the real user ID.

# INSTALL

```apt: sudo apt install coreutils```

```dnf: sudo dnf install coreutils```

```pacman: sudo pacman -S coreutils```

```apk: sudo apk add coreutils```

```zypper: sudo zypper install coreutils```

```brew: brew install coreutils```

```nix: nix profile install nixpkgs#coreutils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[who](/man/who)(1), [id](/man/id)(1), [logname](/man/logname)(1), [users](/man/users)(1)
