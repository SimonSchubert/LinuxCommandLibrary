# TAGLINE

manages configuration profiles for LXD containers and virtual machines

# TLDR

List the profiles that exist

```lxc profile list```

Show **one profile's configuration**

```lxc profile show [profile_name]```

**Create** an empty profile

```lxc profile create [profile_name]```

Open a profile in the **editor**

```lxc profile edit [profile_name]```

Load a profile **from a YAML file**

```lxc profile edit [profile_name] < [path/to/config.yaml]```

Set a **single key** without opening an editor

```lxc profile set [profile_name] [limits.memory] [2GiB]```

Attach a **device** to a profile

```lxc profile device add [profile_name] [eth0] nic network=[lxdbr0]```

**Launch a container** with a chosen set of profiles

```lxc launch [images:ubuntu/22.04] [container_name] --profile [default] --profile [gpu]```

**Replace the profiles** on an existing container

```lxc profile assign [container_name] [default,gpu]```

**Copy** a profile under a new name

```lxc profile copy [source_profile] [target_profile]```

**Delete** a profile

```lxc profile delete [profile_name]```

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

**rename _old_ _new_**
> Rename a profile

**assign _instance_ _profiles_**
> Set the profiles for an instance (comma-separated list)

**add _instance_ _profile_**
> Add a profile to an instance's existing profiles

**remove _instance_ _profile_**
> Remove a profile from an instance

**set _profile_ _key_ _value_**
> Set a profile configuration key

**get _profile_ _key_**
> Get a profile configuration value

**device add _profile_ _device_ _type_ [_options_]**
> Add a device to a profile

**device remove _profile_ _device_**
> Remove a device from a profile

# DESCRIPTION

**lxc profile** manages configuration profiles for LXD containers and virtual machines. Profiles define reusable sets of configuration options including resource limits, device mappings, network settings, and security policies.

Containers can use multiple profiles, which are applied in order (later profiles override earlier ones). The **default** profile is automatically applied to new containers and typically includes basic network and storage configuration.

Profile configuration uses YAML format, specifying options like CPU/memory limits, disk quotas, network interfaces, and GPU passthrough.

# CAVEATS

Profile changes don't automatically apply to running containers; restart the container or reassign profiles to apply changes. Deleting a profile that's in use by containers will fail. The default profile cannot be deleted.

# INSTALL

```apt: sudo apt install lxd-client```

```dnf: sudo dnf install lxc```

```pacman: sudo pacman -S lxc```

```zypper: sudo zypper install lxc```

```brew: brew install lxc```

```nix: nix profile install nixpkgs#lxc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lxc](/man/lxc)(1), [lxc-create](/man/lxc-create)(1), [lxc-start](/man/lxc-start)(1), [lxc-ls](/man/lxc-ls)(1)
