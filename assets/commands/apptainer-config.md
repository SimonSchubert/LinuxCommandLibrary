# TAGLINE

Manage Apptainer container platform configuration

# TLDR

**Add fakeroot mapping** for a user

```sudo apptainer config fakeroot --add [username]```

**Remove fakeroot mapping** for a user

```sudo apptainer config fakeroot --remove [username]```

**Set a global configuration** directive

```sudo apptainer config global --set "[directive]" [value]```

**Get the current value** of a global directive

```sudo apptainer config global --get "[directive]"```

**Reset a global directive** to its default value

```sudo apptainer config global --reset "[directive]"```

**Preview changes** without writing to the config file

```sudo apptainer config global --dry-run --set "[directive]" [value]```

# SYNOPSIS

**apptainer config** _subcommand_ [_options_]

# DESCRIPTION

**apptainer config** manages configuration for the Apptainer container platform. It provides administrative commands for managing fakeroot user mappings and editing the global **apptainer.conf** configuration file from the command line. Most operations require root privileges or an unprivileged installation.

The command operates through two subcommands: **fakeroot** for managing user namespace mappings that allow unprivileged users to build and run containers with apparent root access, and **global** for modifying system-wide configuration directives that control container behavior, bind paths, security settings, and resource limits.

# SUBCOMMANDS

**fakeroot**
> Manage fakeroot user mapping entries (root user only). Controls which users can use the fakeroot feature for building and running containers with simulated root privileges.

**global**
> Edit apptainer.conf configuration directives from the command line (root user only or unprivileged installation). Supports set, unset, get, and reset operations on configuration values.

# PARAMETERS

**-a**, **--add**
> Add a fakeroot mapping entry for a user (fakeroot subcommand)

**-r**, **--remove**
> Remove a fakeroot mapping entry for a user (fakeroot subcommand)

**-e**, **--enable**
> Enable an existing fakeroot mapping entry (fakeroot subcommand)

**-d**, **--disable**
> Disable an existing fakeroot mapping entry (fakeroot subcommand)

**--set**
> Set a configuration directive value (global subcommand)

**--unset**
> Remove a value from a configuration directive (global subcommand)

**--get**
> Retrieve the current value of a configuration directive (global subcommand)

**--reset**
> Reset a configuration directive to its default value (global subcommand)

**--dry-run**
> Display the resulting configuration without writing to file (global subcommand)

# CONFIGURATION

The global subcommand modifies **/etc/apptainer/apptainer.conf** (or the equivalent path for unprivileged installations). Common directives include:

**bind path**
> Paths automatically bound into containers

**max loop devices**
> Maximum number of loop devices for SIF images

**allow setuid**
> Whether to allow setuid-root mode for container execution

**allow net users / allow net groups / allow net networks**
> Control which users and networks are allowed for container networking

# CAVEATS

Most config operations require root privileges. The fakeroot subcommand manages **/etc/subuid** and **/etc/subgid** entries, which affect system-wide user namespace mappings. Modifying global configuration can impact all users on the system. On systems with unprivileged installations, the global subcommand can be run without root but only affects that installation's configuration.

# HISTORY

Apptainer originated as **Singularity**, created by **Gregory Kurtzer** at **Lawrence Berkeley National Laboratory** in **2015** to bring container technology to high-performance computing (HPC). In **November 2021**, the project joined the **Linux Foundation** and was renamed to **Apptainer**. The config subcommand provides administrative tooling that evolved alongside the platform's growing adoption in scientific computing and HPC environments worldwide.

# SEE ALSO

[apptainer](/man/apptainer)(1), [docker](/man/docker)(1), [podman](/man/podman)(1)
