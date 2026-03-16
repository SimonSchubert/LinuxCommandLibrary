# TAGLINE

Generate AppArmor profiles by monitoring program behavior

# TLDR

Start generating a **profile** for a program

```sudo aa-genprof [/path/to/program]```

Specify a **custom directory** for profiles

```sudo aa-genprof -d [/path/to/profiles] [/path/to/program]```

Specify a **custom logfile** for profiling

```sudo aa-genprof -f [/path/to/logfile] [/path/to/program]```

# SYNOPSIS

**aa-genprof** _executable_ [**-d** _/path/to/profiles_] [**-f** _/path/to/logfile_]

# DESCRIPTION

**aa-genprof** is a profile generation utility for AppArmor that automates the creation of security profiles by monitoring program behavior. If no profile exists, it creates one using **aa-autodep**. It then sets the profile to complain mode, writes a mark to the system log, and instructs the user to exercise the application in another window.

When the user selects **(S)can**, aa-genprof parses complain mode logs and iterates through violations using **aa-logprof**. When **(F)inish** is selected, all generated profiles are set to enforce mode.

# PARAMETERS

**-d, --dir** _/path/to/profiles_
> Specifies where to look for the AppArmor security profile set; defaults to /etc/apparmor.d

**-f, --file** _/path/to/logfile_
> Specifies the location of the logfile; default locations are read from /etc/apparmor/logprof.conf

**-h, --help**
> Display help information

# CONFIGURATION

**/etc/apparmor/logprof.conf**
> Controls default logfile location, repository settings, and other options used during profile generation.

# CAVEATS

Profile generation requires running the target application through all its normal operations to capture the necessary access patterns. Incomplete testing may result in profiles that block legitimate functionality. Requires root privileges.

# HISTORY

Part of the **apparmor-utils** package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-logprof](/man/aa-logprof)(8), [aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [aa-disable](/man/aa-disable)(8), [aa-mergeprof](/man/aa-mergeprof)(8), [aa-status](/man/aa-status)(8), [aa-unconfined](/man/aa-unconfined)(8), [apparmor](/man/apparmor)(7)
