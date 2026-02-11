# TAGLINE

SSH over Tailscale network

# TLDR

**SSH to Tailscale device**

```tailscale ssh [user]@[device]```

**SSH with specific identity**

```tailscale ssh -i [identity] [device]```

# SYNOPSIS

**tailscale** **ssh** [_ssh_options_] _target_

# DESCRIPTION

**tailscale ssh** connects via SSH over Tailscale. Uses Tailscale for authentication instead of SSH keys. Requires Tailscale SSH enabled on target. Simplifies access management.

# SEE ALSO

[tailscale](/man/tailscale)(1), [ssh](/man/ssh)(1)

