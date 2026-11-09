# TAGLINE

manages compute instances in OpenStack clouds

# TLDR

**List servers**

```openstack server list```

**List servers in a given state**

```openstack server list --status [ACTIVE]```

**Create server** and wait until it is ready

```openstack server create --flavor [m1.small] --image [ubuntu] --network [private] --key-name [mykey] --wait [server_name]```

**Show server details**

```openstack server show [server_name]```

**Delete server**

```openstack server delete [server_name]```

**Start a stopped server**

```openstack server start [server_name]```

**Stop a running server**

```openstack server stop [server_name]```

**Hard reboot a server**

```openstack server reboot --hard [server_name]```

**Resize a server, then confirm**

```openstack server resize --flavor [m1.large] --wait [server_name] && openstack server resize confirm [server_name]```

**SSH into a server**

```openstack server ssh [server_name] -- -l [username]```

# SYNOPSIS

**openstack server** _command_ [_options_]

# PARAMETERS

**list**
> List servers.

**create** _name_
> Create new server.

**delete** _name_
> Delete server.

**show** _name_
> Show server details.

**start** _name_
> Start server.

**stop** _name_
> Stop server.

**reboot** _name_
> Reboot server (**--soft** or **--hard**).

**rebuild** _name_
> Rebuild server from an image.

**resize** _name_ **--flavor** _flavor_
> Resize server to a different flavor.

**resize confirm** _name_
> Confirm a resize and release the old server.

**resize revert** _name_
> Roll back a resize.

**add volume** _server_ _volume_
> Attach a volume to the server.

**add floating ip** _server_ _ip_
> Associate a floating IP with the server.

**image create** _name_
> Create a new image from the server.

**ssh** _name_
> SSH into the server. Arguments after **--** are passed to ssh.

**migrate** _name_
> Migrate server to another host (**--live-migration** for live migration).

**--flavor** _flavor_
> Instance flavor/size (required for create).

**--image** _image_
> Boot image.

**--volume** _volume_
> Boot from this volume instead of an image.

**--network** _network_
> Network to attach (repeatable).

**--key-name** _key_
> SSH key pair.

**--security-group** _group_
> Security group to assign (repeatable).

**--availability-zone** _zone_
> Availability zone for the server.

**--user-data** _file_
> File to inject as user data, such as a cloud-init script.

**--wait**
> Wait for the operation to complete.

**--all-projects**
> Include servers from all projects (admin only).

# DESCRIPTION

**openstack server** manages compute instances (virtual machines) in OpenStack clouds. It is part of the unified OpenStack command-line client (python-openstackclient). Commands follow the pattern `openstack server <action>` and support output formatting via `-f` (json, table, csv, yaml) and column selection via `-c`.

# CAVEATS

Requires valid OpenStack credentials (typically sourced from an openrc file or OS_* environment variables). A resize stays in the VERIFY_RESIZE state until confirmed or reverted. Server names may not be unique; use IDs for scripted operations.

# SEE ALSO

[openstack](/man/openstack)(1), [openstack-flavor](/man/openstack-flavor)(1), [openstack-image](/man/openstack-image)(1), [openstack-network](/man/openstack-network)(1), [openstack-volume](/man/openstack-volume)(1)

# RESOURCES

```[Source code](https://opendev.org/openstack/python-openstackclient)```

```[Homepage](https://www.openstack.org)```

```[Documentation](https://docs.openstack.org/python-openstackclient/latest/cli/command-objects/compute/v2/index.html)```

<!-- verified: 2026-11-09 -->
