# TLDR

Start the **Slurm GUI**

```sview```

# SYNOPSIS

**sview**

# DESCRIPTION

**sview** is a graphical user interface for viewing and modifying Slurm cluster state. It provides visual access to job, node, partition, and configuration information through an interactive GTK-based interface.

The interface uses tabs to switch between Jobs and Partitions views, with an optional node map showing associated resources. Users can customize column display, sort order, and expand job steps by clicking on interface elements.

# FEATURES

- View jobs, partitions, and nodes graphically
- Sort and filter cluster data
- Expand job details to see individual steps
- Customize visible fields via right-click menus
- Node map visualization
- Admin Mode for authorized modifications (root)

# ADMIN MODE

Root users can enable Admin Mode to modify fields such as node state and job time limits, and trigger Slurm reconfiguration. The documentation recommends disabling Admin Mode immediately after making changes.

# CAVEATS

Requires GTK+-2.0 libraries. Some GTK themes have difficulty displaying large numbers of entries. Requires X11 forwarding for remote access. Modifications in Admin Mode take effect immediately.

# ENVIRONMENT

**SLURM_CONF**
> Path to Slurm configuration file

# HISTORY

**sview** is part of **Slurm**, developed at **Lawrence Livermore National Laboratory** starting in **2002**. The GUI tool provides a user-friendly alternative to command-line utilities for monitoring cluster state. Slurm is now maintained by **SchedMD**.

# SEE ALSO

[squeue](/man/squeue)(1), [sinfo](/man/sinfo)(1), [scontrol](/man/scontrol)(1), [sacct](/man/sacct)(1)
