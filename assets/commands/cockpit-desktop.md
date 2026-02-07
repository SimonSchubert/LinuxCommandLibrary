# TAGLINE

secure desktop access to Cockpit pages

# TLDR

**Open** a Cockpit page

```cockpit-desktop [url] [SSH_host]```

Open the **storage** page

```cockpit-desktop /cockpit/@localhost/storage/index.html```

# SYNOPSIS

**cockpit-desktop** [_url_] [_ssh_host_]

# DESCRIPTION

**cockpit-desktop** provides secure access to Cockpit server management pages from within a local desktop session without exposing any network ports. It launches cockpit-ws and a web browser inside an isolated network namespace, along with cockpit-bridge in the user's session.

The network namespace isolation ensures that the Cockpit web service is only accessible to the locally spawned browser, eliminating the security surface of a listening network socket. This is ideal for single-user workstations where full Cockpit network service is unnecessary.

An optional SSH host argument allows managing remote machines through the local desktop interface, with the SSH connection providing the transport layer instead of a direct network service.

# PARAMETERS

_url_
> The Cockpit page URL to open

_ssh_host_
> Optional SSH host for remote connection

# CAVEATS

Part of the Cockpit suite. Requires a graphical desktop environment. Uses network namespaces for isolation, which requires appropriate kernel support.

# SEE ALSO

[cockpit-ws](/man/cockpit-ws)(8), [cockpit-bridge](/man/cockpit-bridge)(1)
