# TLDR

**List** pending password requests

```systemd-tty-ask-password-agent --list```

**Watch** and process requests continuously

```systemd-tty-ask-password-agent --watch```

**Query** user for pending passwords

```systemd-tty-ask-password-agent --query```

Forward to **wall** message

```systemd-tty-ask-password-agent --wall```

# SYNOPSIS

**systemd-tty-ask-password-agent** [_OPTIONS_]

# PARAMETERS

**--list**
> List pending password requests

**--watch**
> Continuously process password requests

**--query**
> Process pending requests by querying user on current TTY

**--wall**
> Forward requests as wall messages

**--console**
> Ask on console instead of current TTY

# DESCRIPTION

**systemd-tty-ask-password-agent** handles password requests from systemd services. During boot, services like disk encryption may need passwords; this agent collects and forwards them.

The agent monitors password request files and presents prompts to users on appropriate terminals.

# CAVEATS

Used primarily during boot for disk encryption passwords. Multiple agents can run simultaneously. The --wall option broadcasts to all terminals.

# HISTORY

**systemd-tty-ask-password-agent** provides the user-facing component of systemd's password query infrastructure, enabling early-boot password prompts without a full login environment.

# SEE ALSO

[systemd-ask-password](/man/systemd-ask-password)(1), [cryptsetup](/man/cryptsetup)(8)
