# TAGLINE

manage DigitalOcean VPC networks

# TLDR

**List VPC networks**

```doctl vpcs list```

**Create a VPC** in a region

```doctl vpcs create --name [example-vpc] --region [nyc1]```

**Create a VPC** with an explicit CIDR range

```doctl vpcs create --name [example-vpc] --region [nyc1] --ip-range [10.116.0.0/20]```

**Show a VPC**

```doctl vpcs get [vpc-id]```

**Rename a VPC** and make it the regional default

```doctl vpcs update [vpc-id] --name [new-name] --default=true```

**Delete a VPC**

```doctl vpcs delete [vpc-id]```

# SYNOPSIS

**doctl vpcs** _command_ [_arguments_] [_options_]

# PARAMETERS

**list**, **ls**
> List VPC networks on the account.

**create**, **c**
> Create a VPC. Requires **--name** and **--region**.

**get**, **g** _vpc-id_
> Retrieve a VPC network.

**update**, **u** _vpc-id_
> Update name, description, or default state.

**delete**, **d**, **rm** _vpc-id_
> Permanently delete a VPC.

**peerings**
> Manage VPC peerings between networks.

**--name** _NAME_
> VPC name (required for **create**).

**--region** _SLUG_
> Datacenter region slug such as `nyc1` (required for **create**).

**--ip-range** _CIDR_
> IPv4 range in CIDR notation (for example `10.116.0.0/20`). Generated if omitted.

**--description** _TEXT_
> Human-readable description.

**--default**
> When updating, mark this VPC as the default network for its region.

**-f**, **--force**
> Skip the confirmation prompt on **delete**.

**--output** _FORMAT_
> Output format: `text` or `json`.

**--help**, **-h**
> Display help for this command.

# DESCRIPTION

**doctl vpcs** manages Virtual Private Cloud networks on DigitalOcean. A VPC is a private IPv4 network in a single region. Droplets, load balancers, databases, and Kubernetes nodes in the same VPC can communicate over private addresses without traversing the public internet.

**create** needs a name and region. If **--ip-range** is omitted, DigitalOcean assigns a range. **update --default=true** makes the VPC the default for new resources in that region. **delete** is irreversible and refuses to remove a region's default VPC until another network is marked default.

**peerings** is a nested command group for connecting two VPCs so their private ranges can route to each other.

# CAVEATS

Requires a DigitalOcean API token. You cannot delete a region's default VPC until another VPC is set as default. Resources still attached to a VPC block deletion. IP ranges cannot be changed after create. VPC traffic stays inside one region unless you add a peering or a gateway.

# INSTALL

```dnf: sudo dnf install doctl```

```pacman: sudo pacman -S doctl```

```apk: sudo apk add doctl```

```brew: brew install doctl```

```nix: nix profile install nixpkgs#doctl```

<!-- packages: 2026-09-07 -->

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-compute-droplet](/man/doctl-compute-droplet)(1), [ip](/man/ip)(8), [doctl-auth](/man/doctl-auth)(1)

# RESOURCES

```[Source code](https://github.com/digitalocean/doctl)```

```[Documentation](https://docs.digitalocean.com/reference/doctl/reference/vpcs/)```

<!-- verified: 2026-09-07 -->
