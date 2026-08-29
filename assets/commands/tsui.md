# TAGLINE

terminal UI for configuring Tailscale

# TLDR

**Open** the Tailscale TUI

```tsui```

# SYNOPSIS

**tsui**

# DESCRIPTION

**tsui** is an experimental TUI from Neuralink for managing Tailscale on Linux and macOS. Linux has no first-party Tailscale desktop app; **tsui** fills that gap with a settings UI, exit-node picker (with latency), peer IP copy, bandwidth, debug info, and login/logout/reauth.

It talks to the local Tailscale daemon. The official **tailscale** CLI remains the supported interface; **tsui** is a convenience layer. Omarchy's Tailscale installer can also install **tsui**.

# PARAMETERS

**tsui** is an interactive TUI. Run **tsui**; quit from the UI (typically **q**). See **--help** on the binary you have installed.

# CAVEATS

Marked experimental by upstream. Needs a running **tailscaled** and sufficient permissions. Feature set lags the official apps (multiple accounts and custom login URLs are still listed as future work).

# INSTALL

```aur: yay -S tsui```

```brew: brew install tsui```

<!-- packages: 2026-08-29 -->

# SEE ALSO

[tailscale](/man/tailscale)(1)

# RESOURCES

```[Source code](https://github.com/neuralinkcorp/tsui)```

```[Homepage](https://neuralink.com/tsui)```

<!-- verified: 2026-08-29 -->
