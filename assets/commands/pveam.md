# TAGLINE

Manage Proxmox LXC container templates

# TLDR

**Refresh** the template catalogue

```pveam update```

List the templates **available to download**

```pveam available```

Narrow that list to **one section**

```pveam available --section [system]```

**Download** a template into a storage

```pveam download [local] [template_name]```

List what has **already been downloaded**

```pveam list [local]```

**Delete** a downloaded template

```pveam remove [local]:vztmpl/[template_name]```

# SYNOPSIS

**pveam** _command_ [_options_]

# PARAMETERS

**update**, **u**
> Update the template database from Proxmox servers

**available**, **a**
> List available templates for download

**download**, **d** _storage_ _template_
> Download template to specified storage

**list**, **l** _storage_
> List templates in specified storage

**remove**, **r** _volume_
> Remove a template

**--section** _section_
> Filter available templates by section (system, turnkeylinux, mail)

# DESCRIPTION

**pveam** (Proxmox VE Appliance Manager) manages LXC container templates. It downloads and manages pre-built container images from Proxmox template repositories, including standard Linux distributions and TurnKey Linux appliances.

Templates are stored in configured storage locations and can be used to quickly deploy new containers with pct create.

# CAVEATS

Requires internet connection to update database and download templates. Storage must be configured to allow vztmpl content type. Templates are downloaded from Proxmox infrastructure.

# HISTORY

Part of **Proxmox VE**, providing convenient access to curated container templates. Integrates with TurnKey Linux for ready-to-use application containers.

# SEE ALSO

[pct](/man/pct)(1), [pvesm](/man/pvesm)(1), [pvesh](/man/pvesh)(1)
