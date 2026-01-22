# TLDR

Register nmcli as a **secret agent** and listen for secret requests

```nmcli agent secret```

Register nmcli as a **polkit agent** and listen for authorization requests

```nmcli agent polkit```

Register nmcli as **both secret and polkit agent**

```nmcli agent all```

# SYNOPSIS

**nmcli agent** _command_

# PARAMETERS

**secret, s**
> Run as a NetworkManager secret agent to provide passwords/credentials

**polkit, p**
> Run as a polkit agent to handle authorization requests

**all, a**
> Run as both secret and polkit agent

# DESCRIPTION

**nmcli agent** runs nmcli as an agent daemon that responds to NetworkManager's requests for secrets (passwords, keys) or polkit authorization requests. This is useful in environments without a desktop secret agent or polkit agent.

As a **secret agent**, nmcli can provide Wi-Fi passwords, VPN credentials, and other secrets when NetworkManager needs them to establish connections. It prompts the user in the terminal for required credentials.

As a **polkit agent**, nmcli handles authorization prompts for privileged NetworkManager operations, allowing command-line authentication without a graphical polkit agent.

# CAVEATS

The agent runs in the foreground and must remain running to handle requests. Only one secret agent or polkit agent of each type can be registered at a time. Primarily useful for headless systems or terminal-only environments.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmcli-general](/man/nmcli-general)(1), [NetworkManager](/man/NetworkManager)(8), [polkit](/man/polkit)(8)
