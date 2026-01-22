# TLDR

**List VM instances**

```gcloud compute instances list```

**Create instance**

```gcloud compute instances create [name] --zone=[zone]```

**SSH to instance**

```gcloud compute ssh [instance] --zone=[zone]```

**Stop instance**

```gcloud compute instances stop [name] --zone=[zone]```

**List disks**

```gcloud compute disks list```

# SYNOPSIS

**gcloud compute** _resource_ _command_ [_options_]

# PARAMETERS

_RESOURCE_
> Resource type: instances, disks, networks, etc.

**instances** _CMD_
> VM instance management.

**disks** _CMD_
> Persistent disk operations.

**ssh** _INSTANCE_
> SSH into instance.

**scp** _SRC_ _DEST_
> Copy files to/from instance.

**--zone** _ZONE_
> Compute zone.

**--help**
> Display help information.

# DESCRIPTION

**gcloud compute** manages Google Compute Engine resources. It handles virtual machines, disks, networks, firewalls, and other infrastructure components.

The command group provides full lifecycle management for VMs and related resources. It includes convenience commands for SSH and file transfer to instances.

gcloud compute is the primary CLI interface for Compute Engine operations.

# CAVEATS

Resources incur costs. Zone selection affects availability. Some operations take time.

# HISTORY

gcloud compute is part of the **Google Cloud SDK** for managing Compute Engine, Google's Infrastructure-as-a-Service offering for running virtual machines.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-container](/man/gcloud-container)(1)
