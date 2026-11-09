# TAGLINE

Fix sensitive file permissions

# TLDR

**Update permissions** on sensitive files

```yadm perms```

**Disable automatic permission updates**

```yadm config yadm.auto-perms false```

# SYNOPSIS

**yadm** **perms**

# DESCRIPTION

**yadm perms** removes the group and others permissions from sensitive paths, since permissions after a Git checkout depend on the umask. It applies to **~/.local/share/yadm/archive**, all files matching patterns in **~/.config/yadm/encrypt**, **.ssh/\*** and **.gnupg/\***.

It is usually unnecessary to run this manually, as yadm processes permissions automatically by default.

# CONFIGURATION

**yadm.auto-perms**
> Set to **false** to disable automatic permission updates.

**yadm.ssh-perms**
> Set to **false** to skip the **.ssh** directory.

**yadm.gpg-perms**
> Set to **false** to skip the **.gnupg** directory.

# INSTALL

```pacman: sudo pacman -S yadm```

```apk: sudo apk add yadm```

```zypper: sudo zypper install yadm```

```brew: brew install yadm```

```nix: nix profile install nixpkgs#yadm```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[yadm](/man/yadm)(1), [yadm-clone](/man/yadm-clone)(1), [yadm-encrypt](/man/yadm-encrypt)(1), [yadm-config](/man/yadm-config)(1)

# RESOURCES

```[Source code](https://github.com/yadm-dev/yadm)```

```[Homepage](https://yadm.io)```

<!-- verified: 2026-11-09 -->
