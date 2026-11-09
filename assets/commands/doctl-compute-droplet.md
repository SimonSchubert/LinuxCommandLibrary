# TAGLINE

manage DigitalOcean Droplet virtual machines

# TLDR

**List all droplets**

```doctl compute droplet list```

**Create a droplet**

```doctl compute droplet create [name] --size [s-1vcpu-1gb] --image [ubuntu-22-04-x64] --region [nyc1]```

**Create a droplet with an SSH key** and wait until it is ready

```doctl compute droplet create [name] --size [s-1vcpu-1gb] --image [ubuntu-22-04-x64] --region [nyc1] --ssh-keys [key_id] --wait```

**Get droplet details**

```doctl compute droplet get [droplet_id|name]```

**Delete a droplet** without confirmation

```doctl compute droplet delete [droplet_id|name] --force```

**SSH into droplet**

```doctl compute ssh [droplet_name]```

**List snapshots** of a droplet

```doctl compute droplet snapshots [droplet_id]```

**Create a droplet with tags** and monitoring

```doctl compute droplet create [name] --size [s-1vcpu-1gb] --image [ubuntu-22-04-x64] --region [nyc1] --tag-names [web,prod] --enable-monitoring```

# SYNOPSIS

**doctl compute droplet** _command_ [_options_]

# PARAMETERS

**list** [_GLOB_]
> List Droplets on your account, optionally filtered by **--region** or **--tag-name**.

**create** _NAME_...
> Create one or more Droplets.

**get** _ID|NAME_
> Show information about a Droplet.

**delete** _ID|NAME_...
> Permanently delete Droplets. Also accepts **--tag-name** and **-f**, **--force**.

**actions** _ID_
> List previous actions taken on a Droplet.

**backups** _ID_
> List backup images for a Droplet.

**snapshots** _ID_
> List snapshots of a Droplet.

**kernels** _ID_
> List kernels available to a Droplet.

**neighbors** _ID_
> List your Droplets on the same physical hardware.

**tag** _ID|NAME_ **--tag-name** _TAG_
> Add a tag to a Droplet.

**untag** _ID|NAME_ **--tag-name** _TAG_
> Remove a tag from a Droplet.

**--size** _SLUG_
> Droplet size slug.

**--image** _IMAGE_
> OS image slug or ID.

**--region** _REGION_
> Data center region.

**--ssh-keys** _IDS_
> SSH key IDs or fingerprints to embed in the root account.

**--vpc-uuid** _UUID_
> UUID of a non-default VPC to create the Droplet in.

**--project-id** _UUID_
> Project to assign the Droplet to.

**--volumes** _IDS_
> Block storage volume IDs to attach.

**--enable-backups**
> Enable automatic backups.

**--enable-monitoring**
> Install the DigitalOcean monitoring agent.

**--enable-ipv6**
> Enable IPv6 and assign an IPv6 address.

**--enable-private-networking**
> Provision the Droplet inside the account's default VPC for the region.

**--tag-name** _TAG_
> Apply a tag to the Droplet.

**--tag-names** _TAGS_
> Apply a list of tags to the Droplet.

**--user-data** _DATA_
> Shell script to run on first boot.

**--user-data-file** _PATH_
> File containing a shell script or cloud-init YAML to run on first boot.

**--wait**
> Wait for Droplet creation to complete before returning.

**--format** _COLUMNS_
> Columns to display in the output.

**--no-header**
> Omit the header row from the output.

**--help**
> Display help information.

# DESCRIPTION

**doctl compute droplet** manages DigitalOcean Droplets (virtual machines). It handles creating, inspecting, tagging and deleting cloud servers.

Reboots, power cycles, resizes and snapshot creation are done with **doctl compute droplet-action**, and direct SSH connections with **doctl compute ssh**.

# CAVEATS

Droplet creation incurs charges immediately. Deletion is irreversible. Region availability varies for sizes and images.

# SEE ALSO

[doctl](/man/doctl)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/digitalocean/doctl)```

```[Documentation](https://docs.digitalocean.com/reference/doctl/reference/compute/droplet/)```

<!-- verified: 2026-11-09 -->
