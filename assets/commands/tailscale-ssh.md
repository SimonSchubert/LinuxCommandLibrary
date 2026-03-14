# TAGLINE

SSH over the Tailscale network with identity-based authentication

# TLDR

**SSH to a Tailscale device**

```tailscale ssh [user]@[device]```

**SSH to a device using its Tailscale hostname**

```tailscale ssh [user]@[hostname]```

**SSH and run a remote command**

```tailscale ssh [user]@[device] [command]```

**SSH with verbose output**

```tailscale ssh -v [user]@[device]```

# SYNOPSIS

**tailscale** **ssh** [_ssh_options_] [_user_@]_target_ [_command_]

# PARAMETERS

_target_
> Tailscale device name, hostname, or IP address to connect to.

_user_
> Remote username. If omitted, the current local username is used.

_command_
> Optional command to execute on the remote host.

Standard SSH flags (e.g., **-v**, **-p**, **-L**) are passed through to the underlying SSH connection.

# DESCRIPTION

**tailscale ssh** connects to another machine on your Tailscale network using SSH, with authentication handled by Tailscale's identity system instead of traditional SSH keys or passwords.

When Tailscale SSH is enabled on the target machine, connections are authenticated using the Tailscale identity of the connecting user. Access is controlled through Tailscale SSH ACLs in the admin console, allowing fine-grained rules about which users can access which machines and as which system users.

The connection is encrypted end-to-end over the WireGuard tunnel that Tailscale establishes between nodes. This means SSH access works without exposing port 22 to the public internet and without managing SSH key distribution.

# CAVEATS

Tailscale SSH must be enabled on the target device (via **tailscale up --ssh** or the admin console). Both machines must be on the same Tailnet or share access via Tailscale sharing. SSH ACLs must be configured in the Tailscale admin console to permit the connection. The target machine must have a Tailscale SSH server running (built into the Tailscale client).

# SEE ALSO

[tailscale](/man/tailscale)(1), [tailscale-up](/man/tailscale-up)(1), [ssh](/man/ssh)(1)

