# TAGLINE

displays user and group identity information

# TLDR

**Show current user info**

```id```

**Show info for user**

```id [username]```

**Show only user ID**

```id -u```

**Show only group ID**

```id -g```

**Show all group IDs**

```id -G```

**Show names instead of numbers**

```id -n -u```

# SYNOPSIS

**id** [_options_] [_user_]

# PARAMETERS

_USER_
> Username to query.

**-u**, **--user**
> Print user ID only.

**-g**, **--group**
> Print primary group ID.

**-G**, **--groups**
> Print all group IDs.

**-n**, **--name**
> Print names instead of IDs.

**-r**, **--real**
> Print real ID.

**--help**
> Display help information.

# DESCRIPTION

**id** displays user and group identity information. It shows UID, GID, and supplementary groups for users.

The command is useful for verifying permissions and group memberships. It can query any user or the current user by default.

# CAVEATS

Part of coreutils. Shows cached info at login. Real vs effective ID support.

# HISTORY

id is a standard **Unix** command, part of **GNU coreutils** on Linux.

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

[whoami](/man/whoami)(1), [groups](/man/groups)(1), [users](/man/users)(1)
