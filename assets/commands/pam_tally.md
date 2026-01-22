# TLDR

**Enable login counting (deprecated)**

```auth required pam_tally.so```

**Lock after failures**

```auth required pam_tally.so deny=5```

**Reset tally**

```pam_tally --user=[username] --reset```

**View tally**

```pam_tally --user=[username]```

# SYNOPSIS

**pam_tally.so** [_options_]

# PARAMETERS

**deny=**_N_
> Lock after N failures.

**unlock_time=**_SECONDS_
> Auto unlock time.

**per_user**
> Per-user settings.

**--user** _NAME_
> Specify user.

**--reset**
> Reset counter.

# DESCRIPTION

**pam_tally** counts login attempts. Locks accounts on failures.

The module tracks failed logins. Deprecated, use pam_tally2.

pam_tally counts login failures.

# CAVEATS

Deprecated. Use pam_tally2 instead. Legacy systems.

# HISTORY

pam_tally provided **login attempt counting** before pam_tally2.

# SEE ALSO

[pam](/man/pam)(8), [pam_tally2](/man/pam_tally2)(8), [pam_faillock](/man/pam_faillock)(8)

