# TAGLINE

TUI for deploying NixOS systems based on flakes

# TLDR

**Launch the deployment TUI**

```labcoat```

**Deploy from a specific flake**

```labcoat [path/to/flake]```

# SYNOPSIS

**labcoat** [_options_] [_flake_path_]

# DESCRIPTION

**labcoat** is a terminal user interface for deploying NixOS systems based on flakes. It automatically discovers hosts from your flake configuration and provides a one-step command to deploy or inspect those machines.

Features include direct SSH access to target machines, running shell commands remotely, machine reboots with ping-based status monitoring, per-node deployment logging, and flagging outdated systems.

The tool is designed for hobbyists and NixOS users managing small infrastructure setups — clusters or homelabs with up to a few dozen machines — especially during development and testing phases when rapid iteration on configurations is needed.

# CAVEATS

Requires a NixOS flake configuration. Designed for small-scale deployments; for larger infrastructure, consider dedicated deployment solutions.

# HISTORY

**labcoat** was created by **jhillyerd** and is written in **Go**.

# SEE ALSO

[nixos-rebuild](/man/nixos-rebuild)(8), [ssh](/man/ssh)(1)
