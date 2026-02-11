# TAGLINE

Handle RPM configuration file conflicts

# TLDR

List leftover files and **interactively choose** actions

```sudo rpmconf -a```

**Delete orphaned** .rpmnew and .rpmsave files

```sudo rpmconf -a -c```

# SYNOPSIS

**rpmconf** [_options_]

# PARAMETERS

**-a**, **--all**
> Process all configuration files

**-c**, **--clean**
> Delete orphaned configuration backup files

# DESCRIPTION

**rpmconf** handles .rpmnew, .rpmsave, and .rpmorig files left over by RPM package upgrades. These files are created when package updates contain configuration changes that might conflict with local modifications.

The tool provides an interactive interface to merge, replace, or keep configuration files.

# CAVEATS

Review changes carefully before applying. Incorrect choices may overwrite important customizations or leave outdated configurations.

# HISTORY

Part of **rpmconf** package for Fedora/RHEL systems. Simplifies post-upgrade configuration management.

# SEE ALSO

[rpm](/man/rpm)(8), [dnf](/man/dnf)(8), [yum](/man/yum)(8)
