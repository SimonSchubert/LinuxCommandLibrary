# TAGLINE

sets authentication failure delay

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

**pam_faildelay** is a PAM module that sets the delay applied after a failed authentication attempt. It overrides the **FAIL_DELAY** setting in `/etc/login.defs`. The delay is specified in microseconds (1,000,000 = 1 second).

The module is configured in PAM service files (e.g., `/etc/pam.d/login`) and helps mitigate brute-force attacks by slowing down repeated authentication attempts.

# CAVEATS

The delay is specified in microseconds, not seconds. Setting very long delays may frustrate legitimate users who mistype passwords. The module only affects failures handled by the PAM stack, not application-level authentication.

# HISTORY

pam_faildelay was created to **slow brute force attacks** with configurable delays.

# SEE ALSO

[pam](/man/pam)(8), [pam_tally2](/man/pam_tally2)(8)

