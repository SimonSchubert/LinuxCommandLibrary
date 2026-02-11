# TAGLINE

Initialize version control for network device configs

# TLDR

**Initialize CVS repositories** for all defined RANCID groups

```rancid-cvs```

**Add a new group** to the CVS repository (after adding to rancid.conf)

```rancid-cvs```

# SYNOPSIS

**rancid-cvs**

# DESCRIPTION

**rancid-cvs** initializes and maintains the version control repository structure for RANCID (Really Awesome New Cisco Config Differ). It creates the necessary directories and CVS/Subversion repositories for each device group defined in the RANCID configuration.

RANCID is a network device configuration management tool that automatically backs up configurations from routers, switches, and firewalls (Cisco, Juniper, HP, etc.), tracks changes in version control, and sends email notifications when configurations change.

The command reads the LIST_OF_GROUPS variable from **/etc/rancid/rancid.conf** and creates the corresponding directory structure under the RANCID home directory (typically /var/lib/rancid). Each group gets its own subdirectory with CVS working directories.

Run this command after initial RANCID installation and whenever new device groups are added to the configuration. Existing groups are not overwritten when the command is rerun.

# CONFIGURATION

**/etc/rancid/rancid.conf**
> Main RANCID configuration defining LIST_OF_GROUPS, RCSSYS (cvs or svn), mail aliases, and working directory paths.

**router.db**
> Per-group device inventory file listing device hostnames, types, and status (up/down) for configuration collection.

**RCSSYS**
> Variable in rancid.conf selecting the version control backend (cvs or svn).

# CAVEATS

Must be run as the **rancid** user, not root. The command expects proper permissions on the RANCID directories and CVS repository.

Requires CVS or Subversion to be installed and configured. The repository type is determined by the RCSSYS variable in rancid.conf.

The command does not configure devices or credentials. Device definitions must be added separately to the **router.db** file in each group directory.

# HISTORY

RANCID was originally developed at **Shrubbery Networks** by Henry Kilmer and John Heasley. The name "Really Awesome New Cisco Config Differ" reflects its origins as a Cisco-focused tool, though it now supports many network device vendors. Development began in the late 1990s as organizations needed automated configuration backup and change tracking.

# SEE ALSO

[rancid-run](/man/rancid-run)(1), [cvs](/man/cvs)(1), [svn](/man/svn)(1), [clogin](/man/clogin)(1)
