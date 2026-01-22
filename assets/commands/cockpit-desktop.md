# TLDR

**Open** a Cockpit page

```cockpit-desktop [url] [SSH_host]```

Open the **storage** page

```cockpit-desktop /cockpit/@localhost/storage/index.html```

# SYNOPSIS

**cockpit-desktop** [_url_] [_ssh_host_]

# DESCRIPTION

**cockpit-desktop** provides secure access to Cockpit pages within a running desktop session. It starts cockpit-ws and a web browser in an isolated network namespace, along with cockpit-bridge in the user's session.

This allows accessing Cockpit functionality without exposing a network port.

# PARAMETERS

_url_
> The Cockpit page URL to open

_ssh_host_
> Optional SSH host for remote connection

# CAVEATS

Part of the Cockpit suite. Requires a graphical desktop environment. Uses network namespaces for isolation, which requires appropriate kernel support.

# SEE ALSO

[cockpit-ws](/man/cockpit-ws)(8), [cockpit-bridge](/man/cockpit-bridge)(1)
