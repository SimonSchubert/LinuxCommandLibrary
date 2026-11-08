# TAGLINE

Show pyATS framework version information

# TLDR

**Show installed pyATS and package versions**

```pyats version check```

**Check PyPI for newer packages**

```pyats version check --outdated```

**Update to the latest release without prompting**

```pyats version update --yes```

**Update to a specific version**

```pyats version update [version]```

# SYNOPSIS

**pyats version** _subcommand_ [_options_]

# PARAMETERS

**check**
> Display the installed pyATS and sub-package versions.

**check --outdated**
> Query PyPI for available upgrades (slow).

**check --include** _packages_
> Also list other installed packages in the version table.

**update** [_version_]
> Replace pyATS packages with the given version, or the latest.

**update --yes**
> Skip the confirmation prompt.

**-v**, **--verbose**
> More output, repeatable up to 3 times.

**-q**, **--quiet**
> Less output, repeatable up to 3 times.

# DESCRIPTION

**pyats version** displays version information for pyATS framework. Shows installed package versions, checks for updates and can reinstall a chosen version, which is also useful for repairing a broken environment. Part of Cisco pyATS network testing framework.

# SEE ALSO

[pyats](/man/pyats)(1), [pyats-shell](/man/pyats-shell)(1)

# RESOURCES

```[Source code](https://github.com/CiscoTestAutomation/pyats)```

```[Homepage](https://developer.cisco.com/pyats/)```

```[Documentation](https://pubhub.devnetcloud.com/media/pyats/docs/)```

<!-- verified: 2026-11-08 -->
