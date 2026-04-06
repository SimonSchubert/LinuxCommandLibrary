# TAGLINE

Merge AppArmor security profiles

# TLDR

**Merge** one or more profile files into the default profile directory

```sudo aa-mergeprof [file1] [file2]```

**Merge** profile files into a **specific directory**

```sudo aa-mergeprof -d /path/to/profiles [file1] [file2]```

# SYNOPSIS

**aa-mergeprof** _file_ [_file_ ...] [**-d** _/path/to/profiles_]

# DESCRIPTION

**aa-mergeprof** is an interactive tool that merges one or more AppArmor security profile files into the system profile directory. When conflicts exist between incoming and existing profiles, it presents the differences and allows the administrator to choose how to resolve them. This is useful for importing profiles from other systems, combining profiles from different sources, or consolidating profiles after a system migration.

# PARAMETERS

**-d**, **--dir** _/path/to/profiles_
> Specifies the target directory for merged profiles. Defaults to **/etc/apparmor.d**.

**-h**, **--help**
> Display help information and exit.

# CAVEATS

Merging profiles may overwrite existing profiles in the destination directory. The tool is interactive and requires manual conflict resolution -- it cannot be run unattended. Requires root privileges.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-genprof](/man/aa-genprof)(8), [aa-logprof](/man/aa-logprof)(8), [aa-cleanprof](/man/aa-cleanprof)(8), [aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [apparmor](/man/apparmor)(7)
