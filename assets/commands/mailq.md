# TAGLINE

displays the mail queue

# TLDR

**Show mail queue**

```mailq```

**Show queue summary**

```mailq -p```

**Show verbose output**

```mailq -v```

# SYNOPSIS

**mailq** [_options_]

# PARAMETERS

**-p**
> Print queue summary.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**mailq** displays the mail queue. It shows messages waiting to be delivered.

The tool is usually a symlink to sendmail or postfix. It lists queued, deferred, and held mail.

# CAVEATS

MTA dependent output. May need root for full details. Part of MTA package.

# HISTORY

mailq provides a standard interface to view mail queues across different **Mail Transfer Agents** (MTAs).

# INSTALL

```apt: sudo apt install dma```

```dnf: sudo dnf install postfix```

```pacman: sudo pacman -S postfix```

```apk: sudo apk add postfix```

```zypper: sudo zypper install postfix```

```nix: nix profile install nixpkgs#dma```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[sendmail](/man/sendmail)(8), [postqueue](/man/postqueue)(1), [postfix](/man/postfix)(1)

