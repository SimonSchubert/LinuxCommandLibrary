# TAGLINE

Manage Linux capabilities for Apptainer container users and groups

# TLDR

**List capabilities** granted to a specific user

```sudo apptainer capability list --user [username]```

**Grant a capability** to a user

```sudo apptainer capability add --user [username] [CAP_NET_RAW]```

**Drop a capability** from a user

```sudo apptainer capability drop --user [username] [CAP_NET_RAW]```

**Grant all capabilities** to a group

```sudo apptainer capability add --group [groupname] all```

**List all available** Linux capabilities with descriptions

```apptainer capability avail```

**Drop all capabilities** from a user

```sudo apptainer capability drop --user [username] all```

# SYNOPSIS

**apptainer capability** _subcommand_ [_options_]

# DESCRIPTION

**apptainer capability** manages Linux capabilities granted to users and groups for use inside Apptainer containers. Administrators use this command to authorize specific users or groups to request particular capabilities at container runtime.

Capabilities are stored in a **capability.json** file maintained by Apptainer. Granting a capability does not automatically enable it inside containers — users must explicitly request granted capabilities at runtime using the **--add-caps** flag with commands like **apptainer exec** or **apptainer run**.

# SUBCOMMANDS

**add**
> Grant one or more Linux capabilities to a user or group. Requires root.

**drop**
> Revoke one or more Linux capabilities from a user or group. Requires root.

**list**
> Display capabilities currently assigned to a user or group.

**avail**
> Show all recognized Linux capabilities with brief descriptions.

# PARAMETERS

**--user** _name_
> Target a specific user for add, drop, or list operations.

**--group** _name_
> Target a specific group for add, drop, or list operations.

# CAVEATS

Granting Linux capabilities to users is usually equivalent to granting root-level access on the host system. Most capabilities allow users to break out of containers and escalate privileges. This feature is intended for trusted environments, not multi-tenant HPC clusters. Both **add** and **drop** accept the case-insensitive keyword **all** to operate on every available capability at once.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-exec](/man/apptainer-exec)(1), [apptainer-run](/man/apptainer-run)(1), [capabilities](/man/capabilities)(7)
