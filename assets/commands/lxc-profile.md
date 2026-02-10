# TAGLINE

manages configuration profiles for LXD containers and virtual machines

# TLDR

**List** all available profiles

```lxc profile list```

**Show** the configuration of a specific profile

```lxc profile show [profile_name]```

**Edit** a specific profile in the default editor

```lxc profile edit [profile_name]```

Edit a specific profile **importing configuration** from a file

```lxc < [config.yaml] profile edit [profile_name]```

**Launch** a new container with specific profiles

```lxc launch [container_image] [container_name] -p [profile1] -p [profile2]```

**Change the profiles** of a running container

```lxc profile assign [container_name] [profile1,profile2]```

# SYNOPSIS

**lxc profile** _command_ [_options_]

# PARAMETERS

**list**
> List all available profiles

**show _profile_**
> Display the full configuration of a profile

**edit _profile_**
> Open a profile for editing in the default editor

**create _profile_**
> Create a new empty profile

**delete _profile_**
> Remove a profile

**copy _source_ _dest_**
> Copy a profile to a new name

**assign _container_ _profiles_**
> Set the profiles for a container (comma-separated list)

**add _container_ _profile_**
> Add a profile to a container's existing profiles

**remove _container_ _profile_**
> Remove a profile from a container

# DESCRIPTION

**lxc profile** manages configuration profiles for LXD containers and virtual machines. Profiles define reusable sets of configuration options including resource limits, device mappings, network settings, and security policies.

Containers can use multiple profiles, which are applied in order (later profiles override earlier ones). The **default** profile is automatically applied to new containers and typically includes basic network and storage configuration.

Profile configuration uses YAML format, specifying options like CPU/memory limits, disk quotas, network interfaces, and GPU passthrough.

# CAVEATS

Profile changes don't automatically apply to running containers; restart the container or reassign profiles to apply changes. Deleting a profile that's in use by containers will fail. The default profile cannot be deleted.

# SEE ALSO

[lxc](/man/lxc)(1), [lxc-create](/man/lxc-create)(1), [lxc-start](/man/lxc-start)(1), [lxc-config](/man/lxc-config)(1)
