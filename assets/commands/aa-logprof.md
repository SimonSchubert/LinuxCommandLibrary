# TLDR

Interactively **review and update** profiles based on system logs

```sudo aa-logprof```

Use a **specific directory** for AppArmor profiles

```sudo aa-logprof -d /path/to/profiles```

Use a **specific log file** instead of the default

```sudo aa-logprof -f /path/to/logfile```

Ignore all log entries **before a mark**

```sudo aa-logprof -m "log_marker_text"```

# SYNOPSIS

**aa-logprof** [_-d /path/to/profiles_] [_-f /path/to/logfile_] [_-m mark_]

# DESCRIPTION

**aa-logprof** is an interactive utility that scans AppArmor security logs and prompts users to review and update existing security profiles. When launched, it identifies new AppArmor events not covered by current profiles and suggests modifications.

Upon exit, updated profiles are saved and reloaded if AppArmor is active. Interactive responses include: **(A)llow**, **(D)eny**, **(I)gnore**, **(N)ew**, **(G)lob last piece**, **(Q)uit**.

# PARAMETERS

**-d, --dir /path/to/profiles**
> Specifies where to look for the AppArmor security profile set; defaults to /etc/apparmor.d

**-f, --file /path/to/logfile**
> Specifies the location of the logfile; defaults are read from /etc/apparmor/logprof.conf

**-m, --logmark "mark"**
> Filters out log entries preceding a specified mark; use quotes if mark contains spaces

**-h, --help**
> Display help information

# CAVEATS

Log analysis depends on audit daemon configuration. Ensure **auditd** or **klogd** is properly configured to capture AppArmor events.

# HISTORY

Part of the **AppArmor** utilities package for managing application security profiles on Linux systems.

# SEE ALSO

[aa-genprof](/man/aa-genprof)(8), [aa-enforce](/man/aa-enforce)(8), [aa-complain](/man/aa-complain)(8), [auditd](/man/auditd)(8), [apparmor](/man/apparmor)(7)
