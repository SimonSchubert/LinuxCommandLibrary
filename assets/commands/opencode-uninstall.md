# TAGLINE

Uninstall opencode

# TLDR

**Uninstall opencode and remove all related files**

```opencode uninstall```

**Preview what would be removed without changing anything**

```opencode uninstall --dry-run```

**Uninstall but keep configuration files**

```opencode uninstall --keep-config```

**Uninstall but keep session data and snapshots**

```opencode uninstall --keep-data```

**Skip confirmation prompts**

```opencode uninstall --force```

# SYNOPSIS

**opencode uninstall** [_options_]

# PARAMETERS

**-c**, **--keep-config**
> Keep configuration files. Default: false.

**-d**, **--keep-data**
> Keep session data and snapshots. Default: false.

**--dry-run**
> Show what would be removed without removing anything. Default: false.

**-f**, **--force**
> Skip confirmation prompts. Default: false.

**--print-logs**
> Print logs to stderr.

**--log-level** _LEVEL_
> Log level: `DEBUG`, `INFO`, `WARN`, or `ERROR`.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show version number.

# DESCRIPTION

**opencode uninstall** removes the opencode binary and, by default, its supporting files from the current system: configuration, cached data, and session history. The `--keep-config` and `--keep-data` flags preserve specific categories of files, which is useful when reinstalling or switching channels.

Use `--dry-run` first to audit exactly which paths will be deleted before running the real uninstall.

# CAVEATS

Without `--keep-config` or `--keep-data`, this operation is **irreversible**: local session data, configuration, and cached credentials are permanently deleted. If opencode was installed via a package manager (e.g. Homebrew), uninstall it through that manager instead.

# SEE ALSO

[opencode](/man/opencode)(1), [opencode-upgrade](/man/opencode-upgrade)(1), [opencode-models](/man/opencode-models)(1)
