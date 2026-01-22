# TLDR

Start **monitoring** NetworkManager changes

```nmcli monitor```

# SYNOPSIS

**nmcli monitor**

# DESCRIPTION

**nmcli monitor** watches for and displays NetworkManager events in real-time. It shows changes to network connections, device states, and connectivity status as they occur.

Events displayed include connection activations and deactivations, device state changes (connecting, connected, disconnected), IP address assignments, and overall connectivity state changes.

The command runs continuously until interrupted with **Ctrl+C**, making it useful for debugging network issues or scripting responses to network events.

# CAVEATS

Runs in the foreground and blocks the terminal. Only shows events occurring after the monitor starts; historical events are not displayed. For parsing in scripts, consider using nmcli's **-t** (terse) option for machine-readable output.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmcli-general](/man/nmcli-general)(1), [nmcli-connection](/man/nmcli-connection)(1), [nmcli-device](/man/nmcli-device)(1)
