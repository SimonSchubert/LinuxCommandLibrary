# TAGLINE

Multi-environment context switcher for DevOps workflows

# TLDR

**Generate the initial configuration** directory and example contexts

```ctx init```

**List all available contexts**

```ctx list```

**Activate a context** (switch AWS profile, kube context, VPN, env vars, ...)

```ctx use [context-name]```

**Show the currently active context**

```ctx```

**Install shell integration** for Zsh

```eval "$(ctx shell-hook zsh)"```

**Install shell integration** for Bash

```eval "$(ctx shell-hook bash)"```

# SYNOPSIS

**ctx** [_command_] [_options_]

# DESCRIPTION

**ctx** is a single-binary context switcher aimed at engineers who move between multiple clouds, clusters, and VPN networks during the day. Instead of juggling **AWS_PROFILE**, **kubectl config use-context**, VPN toggles, and SSH tunnels by hand, each environment is described once as a YAML file under **~/.config/ctx/contexts/** and then activated with **ctx use <name>**.

Switching updates the current shell session: AWS/GCP/Azure credentials, Kubernetes/Nomad contexts and namespaces, VPN connections (WireGuard, OpenVPN, Tailscale, NetBird), SSH tunnels, Docker and npm registries, Git user identity, and arbitrary environment variables are all applied together. A prompt indicator of the form **[ctx: name]** is added by the shell hook so the active environment is always visible.

Secrets for credentials can be fetched at activation time from Bitwarden, 1Password, HashiCorp Vault, AWS Secrets Manager, or GCP Secret Manager, so plain passwords never need to live in the YAML files themselves.

# COMMANDS

**init**
> Create **~/.config/ctx/** with sample context files and a default config.

**list**
> Print the available contexts along with their environment, cloud, and orchestration fields.

**use** _name_
> Activate the named context in the current shell (requires the shell hook).

**shell-hook** _bash|zsh|fish_
> Print shell integration code; evaluate it from your rc file.

**version**
> Print the ctx version.

**help** [_command_]
> Display help for a command.

# CONFIGURATION

Per-context files live at **~/.config/ctx/contexts/_name_.yaml**. A minimal example:

```
name: myproject-dev
description: "My project - development"
environment: development
aws:
  profile: myproject-dev
  region: eu-west-1
kubernetes:
  context: dev-cluster
  namespace: myapp
env:
  APP_ENV: development
```

Supported sections cover clouds (aws, gcp, azure), orchestration (kubernetes, nomad, consul), networking (vpn, ssh_tunnels), secrets, git, docker, npm, browser profiles, and IDE workspaces. Global defaults go in **~/.config/ctx/config.yaml**.

# CAVEATS

**ctx use** only affects the shell in which it runs, because it relies on the shell hook to export variables and call external tools; opening a new shell starts with no active context until **use** is called again. Full feature support is Linux- and macOS-only; on Windows the tool must be run inside **WSL**. Activation time depends on which providers are configured — VPN or SSH tunnel steps can take several seconds.

# HISTORY

Created by **Valentin Lebourgeois** (**vlebo**) and first released in **2024** as an open-source multi-cloud alternative to **kubectx**/**aws-vault**-style single-purpose switchers. Written in **Go** and distributed as a single static binary via GitHub releases and a shell installer.

# SEE ALSO

[kubectx](/man/kubectx)(1), [kubens](/man/kubens)(1), [aws](/man/aws)(1), [direnv](/man/direnv)(1), [tailscale](/man/tailscale)(1)
