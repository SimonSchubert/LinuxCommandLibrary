# TAGLINE

display and adjust OOM-killer score

# TLDR

Display the **OOM-killer score** of a process

```choom -p [pid]```

**Change** the adjust OOM-killer score of a process

```choom -p [pid] -n [-1000..+1000]```

**Run** a command with a specific OOM-killer score

```choom -n [-1000..+1000] [command] [arguments]```

# SYNOPSIS

**choom** [_options_]

# DESCRIPTION

**choom** displays and changes the Out-Of-Memory (OOM) killer score adjustment for processes. The OOM killer terminates processes when the system runs critically low on memory.

The score adjustment ranges from -1000 (never kill) to +1000 (kill first). A value of -1000 effectively disables OOM killing for that process.

# PARAMETERS

**-p, --pid** _pid_
> Specify the process ID

**-n, --adjust** _value_
> Set the OOM score adjustment (-1000 to +1000)

# CAVEATS

Requires appropriate privileges to modify OOM scores of other users' processes. Setting -1000 on too many processes can leave the system with no candidate to kill during memory exhaustion, potentially causing a system hang.

# INSTALL

```apt: sudo apt install util-linux```

```dnf: sudo dnf install util-linux```

```pacman: sudo pacman -S util-linux```

```apk: sudo apk add util-linux-misc```

```zypper: sudo zypper install util-linux```

```brew: brew install util-linux```

```nix: nix profile install nixpkgs#util-linux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[proc](/man/proc)(5), [kill](/man/kill)(1), [ps](/man/ps)(1)

# RESOURCES

```[Source code](https://github.com/util-linux/util-linux)```

```[Documentation](https://man7.org/linux/man-pages/man1/choom.1.html)```

<!-- verified: 2026-06-22 -->
