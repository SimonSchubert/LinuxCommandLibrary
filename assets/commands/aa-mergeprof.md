# TLDR

**Merge** one or more profile files into the default profile directory

```sudo aa-mergeprof [file1] [file2]```

Merge profile files into a **specific directory**

```sudo aa-mergeprof -d /path/to/profiles [file1] [file2]```

# SYNOPSIS

**aa-mergeprof** _file_ [_file_ ...] [_-d /path/to/profiles_]

# DESCRIPTION

**aa-mergeprof** merges AppArmor security profile files into the profile directory. This utility is useful for combining profiles from different sources or importing profiles from other systems into the local AppArmor configuration.

# PARAMETERS

**-d, --dir /path/to/profiles**
> Specifies the destination directory for merged profiles; defaults to /etc/apparmor.d

**-h, --help**
> Display help information

# CAVEATS

Merging profiles may overwrite existing profiles in the destination directory. Review changes before committing merged profiles.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-genprof](/man/aa-genprof)(8), [aa-logprof](/man/aa-logprof)(8), [aa-cleanprof](/man/aa-cleanprof)(8), [apparmor](/man/apparmor)(7)
