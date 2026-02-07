# TAGLINE

manage DigitalOcean Droplet virtual machines

# TLDR

**List all droplets**

```doctl compute droplet list```

**Create a droplet**

```doctl compute droplet create [name] --size [s-1vcpu-1gb] --image [ubuntu-22-04-x64] --region [nyc1]```

**Get droplet details**

```doctl compute droplet get [droplet_id]```

**Delete a droplet**

```doctl compute droplet delete [droplet_id]```

**SSH into droplet**

```doctl compute ssh [droplet_name]```

**List available sizes**

```doctl compute size list```

**Perform action** on droplet

```doctl compute droplet-action reboot [droplet_id]```

# SYNOPSIS

**doctl compute droplet** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: list, create, get, delete, ssh, etc.

**list**
> List all droplets.

**create** _NAME_
> Create new droplet.

**--size** _SLUG_
> Droplet size slug.

**--image** _IMAGE_
> OS image slug or ID.

**--region** _REGION_
> Data center region.

**--ssh-keys** _IDS_
> SSH key IDs or fingerprints.

**delete** _ID_
> Delete droplet.

**ssh** _NAME_
> SSH into droplet.

**--help**
> Display help information.

# DESCRIPTION

**doctl compute droplet** manages DigitalOcean Droplets (virtual machines). It provides full lifecycle control including creation, configuration, monitoring, and deletion of cloud servers.

Droplets can be created with various configurations specifying size, region, image, and networking options. The command supports actions like reboot, power cycle, resize, and snapshot creation.

Integration with SSH keys enables secure access, and the ssh subcommand provides convenient direct connection to droplets by name.

# CAVEATS

Droplet creation incurs charges immediately. Deletion is irreversible. Some actions require droplet power-off. Region availability varies for sizes and images.

# HISTORY

doctl compute droplet is a core component of the **doctl** CLI, providing command-line management of DigitalOcean's primary compute service since the tool's initial release.

# SEE ALSO

[doctl](/man/doctl)(1), [ssh](/man/ssh)(1), [doctl-compute-size](/man/doctl-compute-size)(1)
