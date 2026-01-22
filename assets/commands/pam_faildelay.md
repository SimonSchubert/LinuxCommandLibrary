# TLDR

**Set authentication delay**

```auth optional pam_faildelay.so delay=3000000```

**Short delay**

```auth optional pam_faildelay.so delay=1000000```

# SYNOPSIS

**pam_faildelay.so** [_options_]

# PARAMETERS

**delay=**_MICROSECONDS_
> Delay in microseconds (1000000 = 1 second).

# DESCRIPTION

**pam_faildelay** sets authentication failure delay. Adds delay after failed login.

The module slows brute force attacks. Configurable delay time.

pam_faildelay adds login delay.

# CAVEATS

Delay in microseconds. Affects all failures. May impact user experience.

# HISTORY

pam_faildelay was created to **slow brute force attacks** with configurable delays.

# SEE ALSO

[pam](/man/pam)(8), [pam_tally2](/man/pam_tally2)(8)

