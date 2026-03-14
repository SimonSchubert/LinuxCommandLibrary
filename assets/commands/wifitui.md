# TAGLINE

Terminal UI for managing WiFi connections

# TLDR

**Launch the interactive WiFi manager**

```wifitui```

**Scan and list available WiFi networks**

```wifitui scan```

**Connect to a specific network**

```wifitui connect "[SSID]"```

**Disconnect from current network**

```wifitui disconnect```

**Show known (saved) networks**

```wifitui known```

# SYNOPSIS

**wifitui** [_command_] [_options_]

# PARAMETERS

**scan**
> Scan and display available WiFi networks.

**connect** _SSID_
> Connect to the specified WiFi network.

**disconnect**
> Disconnect from the current WiFi network.

**known**
> List saved/known WiFi networks.

# DESCRIPTION

**wifitui** is a terminal-based WiFi manager for Linux that provides an interactive TUI for scanning, connecting, and managing wireless networks. It uses **NetworkManager** or **iwd** as the backend and provides fuzzy filtering for network selection.

Features include QR code generation for sharing network credentials and both interactive and non-interactive (command-line) modes of operation.

# CAVEATS

Requires either **NetworkManager** or **iwd** to be running as the wireless backend. Root or appropriate group membership may be needed for scanning and connecting operations.

# HISTORY

**wifitui** was created by **shazow** and is written in **Rust**.

# SEE ALSO

[nmtui](/man/nmtui)(1), [nmcli](/man/nmcli)(1), [iwctl](/man/iwctl)(1)
