# TAGLINE

Google Compute Engine resource management

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

# SUBCOMMANDS

**instances** _CMD_
> VM instance lifecycle (create, list, start, stop, delete, describe).

**disks** _CMD_
> Persistent disk operations.

**images** _CMD_
> Manage custom and public VM images.

**snapshots** _CMD_
> Create and manage disk snapshots.

**networks** _CMD_
> VPC networks, subnets and peering.

**firewall-rules** _CMD_
> Manage VPC firewall rules.

**ssh** _INSTANCE_
> SSH into an instance (automatically manages keys).

**scp** _SRC_ _DEST_
> Copy files to or from an instance over SSH.

# PARAMETERS

**--zone** _ZONE_
> Compute zone for the resource (e.g. us-central1-a).

**--region** _REGION_
> Compute region for regional resources.

**--project** _PROJECT_
> Google Cloud project ID to target.

**--format** _FORMAT_
> Output format (json, yaml, table, value).

**--filter** _EXPR_
> Filter results by expression.

**--help**
> Display help information.

# DESCRIPTION

**gcloud compute** is the command-line interface for Google Compute Engine, Google's Infrastructure-as-a-Service offering. It provides complete control over virtual machines, persistent disks, networks, load balancers, and other infrastructure primitives.

The instances subcommand handles VM lifecycle operations including creation with customizable machine types, starting and stopping instances, and deletion. Network resources like VPCs, subnets, firewall rules, and routes are managed through their respective subcommands.

Special convenience features include built-in SSH access via gcloud compute ssh, which automatically manages SSH keys and connection details, and gcloud compute scp for secure file transfers. The command group supports advanced features like custom images, snapshots, instance groups, and managed instance groups for autoscaling. All operations respect zones and regions, which must be specified either per-command or via configuration defaults.

# CAVEATS

Resources incur costs. Zone selection affects availability. Some operations take time.

# HISTORY

gcloud compute is part of the **Google Cloud SDK** for managing Compute Engine, Google's Infrastructure-as-a-Service offering for running virtual machines.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-container](/man/gcloud-container)(1)
