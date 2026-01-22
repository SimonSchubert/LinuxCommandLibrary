# TLDR

Start generating a **profile** for a program

```sudo aa-genprof [program_path]```

Specify a **custom directory** for profiles

```sudo aa-genprof -d /path/to/profiles [program_path]```

Specify a **custom logfile** for profiling

```sudo aa-genprof -f /path/to/logfile [program_path]```

# SYNOPSIS

**aa-genprof** _executable_ [_-d /path/to/profiles_] [_-f /path/to/logfile_]

# DESCRIPTION

**aa-genprof** is a profile generation utility for AppArmor that automates the creation of security profiles by monitoring program behavior. When invoked with a program name, the tool searches the system PATH if needed, then creates a new profile or works with an existing one.

The workflow involves setting the profile to complain mode, logging access violations during program execution, and iteratively refining the profile through user-guided scanning of system logs until all functionality has been exercised without violations.

# PARAMETERS

**-d, --dir /path/to/profiles**
> Specifies where to look for the AppArmor security profile set; defaults to /etc/apparmor.d

**-f, --file /path/to/logfile**
> Specifies the location of the logfile; default locations are read from /etc/apparmor/logprof.conf

**-h, --help**
> Display help information

# CAVEATS

Profile generation requires running the target application through all its normal operations to capture the necessary access patterns. Incomplete testing may result in profiles that block legitimate functionality.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-logprof](/man/aa-logprof)(8), [aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [aa-disable](/man/aa-disable)(8), [apparmor](/man/apparmor)(7)
