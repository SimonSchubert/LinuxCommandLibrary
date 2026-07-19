# TAGLINE

Official command-line client for the Vultr API

# TLDR

**List regions**

```vultr-cli regions```

**List plans**

```vultr-cli plans```

**List instances**

```vultr-cli instance list```

**Account info**

```vultr-cli account```

**JSON output**

```vultr-cli -o json instance list```

**Show version**

```vultr-cli version```

**Help for a resource**

```vultr-cli instance --help```

# SYNOPSIS

**vultr-cli** [*flags*] *command*

# DESCRIPTION

**vultr-cli** is the official command-line interface for [Vultr](https://www.vultr.com/) cloud services. It covers account and billing, instances, bare metal, block and object storage, DNS, firewalls, Kubernetes, load balancers, snapshots, SSH keys, VPCs, CDNs, databases, and more.

Install via GitHub releases, **go install github.com/vultr/vultr-cli/v3@latest**, distro packages (for example Arch **pacman -S vultr-cli**), Homebrew, or Docker. Authenticate with a Vultr API key (see project docs for config env/file).

# PARAMETERS

Global flags:

**-o**, **--output** text|json|yaml

> Output format (default **text**).

**--config** *path*

> Path to config file.

Resource commands (each has subcommands like **list**, **create**, **delete**): **account**, **apps**, **backups**, **bare-metal**, **billing**, **block-storage**, **cdn**, **container-registry**, **database**, **dns**, **firewall**, **inference**, **instance**, **iso**, **kubernetes**, **load-balancer**, **logs**, **marketplace**, **object-storage**, **os**, **plans**, **regions**, **reserved-ip**, **script**, **snapshot**, **ssh-key**, **user**, **vpc**, **version**, **completion**.

Use **vultr-cli** *command* **--help** for flags and examples.

# CONFIGURATION

Requires a Vultr API token with appropriate permissions. Prefer environment or config-file storage over shell history. Exact variable and file names are documented upstream for your installed version.

# CAVEATS

Destructive instance and storage commands are irreversible. API rate limits apply. Keep the CLI updated when Vultr adds API resources.

# SEE ALSO

[doctl](/man/doctl)(1), [linode-cli](/man/linode-cli)(1), [hcloud](/man/hcloud)(1), [aws](/man/aws)(1)

# RESOURCES

```[Source code](https://github.com/vultr/vultr-cli)```

<!-- verified: 2026-07-19 -->
