# TLDR

**Enable login attempt tracking**

```auth required pam_tally2.so deny=5 unlock_time=900```

**View user's tally**

```pam_tally2 --user=[username]```

**Reset user's tally**

```pam_tally2 --user=[username] --reset```

**Reset all tallies**

```pam_tally2 --reset```

# SYNOPSIS

**pam_tally2** [_options_]

# PARAMETERS

**deny=**_N_
> Lock after N failures.

**unlock_time=**_SECONDS_
> Auto unlock time.

**--user** _NAME_
> Specify user.

**--reset**
> Reset counter.

**even_deny_root**
> Apply to root too.

**root_unlock_time=**_SECONDS_
> Root unlock time.

# DESCRIPTION

**pam_tally2** tracks login attempts. Locks accounts after failed attempts.

The module prevents brute force attacks. Successor to pam_tally.

pam_tally2 counts login failures.

# CAVEATS

Being replaced by pam_faillock. Per-user tallies. Account lockout.

# HISTORY

pam_tally2 replaced pam_tally for **improved login tracking** and lockout.

# SEE ALSO

[pam](/man/pam)(8), [pam_faillock](/man/pam_faillock)(8)

