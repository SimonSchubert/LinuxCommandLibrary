# TLDR

**Install Doom Emacs**

```doom install```

**Sync packages** after config change

```doom sync```

**Update packages**

```doom upgrade```

**Check for issues**

```doom doctor```

**Rebuild packages**

```doom build```

**Purge unused** packages

```doom purge```

# SYNOPSIS

**doom** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: install, sync, upgrade, doctor, build, purge.

**install**
> Initial Doom Emacs setup.

**sync**
> Synchronize packages with config.

**upgrade**
> Update packages to latest.

**doctor**
> Diagnose common issues.

**build**
> Rebuild installed packages.

**purge**
> Remove orphaned packages.

**--help**
> Display help information.

# DESCRIPTION

**doom** is the command-line interface for Doom Emacs, a configuration framework for Emacs. It manages the installation, updates, and maintenance of the Doom Emacs distribution.

The sync command is central to Doom workflows, ensuring installed packages match the configuration after changes to init.el or packages.el. It handles package installation, removal, and byte-compilation.

doom doctor helps troubleshoot issues by checking for common problems like missing dependencies, outdated packages, or configuration errors.

# CAVEATS

Requires Emacs 27.1+. Sync may take time with many packages. Some operations require internet access. Breaking changes may occur between major versions.

# HISTORY

Doom Emacs was created by **Henrik Lissner** starting around **2016**. The doom CLI provides management capabilities for this popular Emacs configuration that emphasizes speed and a curated set of packages.

# SEE ALSO

[emacs](/man/emacs)(1), [spacemacs](/man/spacemacs)(1)
