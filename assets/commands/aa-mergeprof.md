# TAGLINE

Merge AppArmor profile files into the profile directory

# TLDR

**Merge** one or more profile files into the default profile directory

```sudo aa-mergeprof [file1] [file2]```

Merge profile files into a **specific directory**

```sudo aa-mergeprof -d /path/to/profiles [file1] [file2]```

# SYNOPSIS

**aa-mergeprof** _file_ [_file_ ...] [_-d /path/to/profiles_]

# DESCRIPTION

**aa-mergeprof** merges one or more AppArmor security profile files into the system profile directory. It is an interactive tool that presents differences between existing and incoming profiles, allowing administrators to resolve conflicts manually. This is useful for importing profiles from other systems, combining profiles from different sources, or consolidating profiles after a system migration.

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
