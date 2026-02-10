# TAGLINE

PAM module that denies access after multiple failed authentication

# TLDR

**Show failed login attempts**

```faillock --user [username]```

**Reset failed count**

```faillock --user [username] --reset```

**Show all users' status**

```faillock```

**Configure lockout (in pam file)**

```auth required pam_faillock.so deny=5 unlock_time=900```

# SYNOPSIS

**faillock** [_options_]

# PARAMETERS

**--user** _name_
> Specific user.

**--reset**
> Reset failure count.

**--dir** _path_
> Tally directory.

# DESCRIPTION

**pam_faillock** is a PAM module that denies access after multiple failed authentication attempts. It provides brute-force protection by temporarily locking accounts.

The faillock command queries and resets the failure records.

# PAM CONFIGURATION

```
# /etc/pam.d/system-auth
auth     required  pam_faillock.so preauth silent deny=5 unlock_time=900
auth     required  pam_unix.so
auth     required  pam_faillock.so authfail deny=5 unlock_time=900

account  required  pam_faillock.so
```

# PARAMETERS

```
deny=N        - Lock after N failures
unlock_time=S - Unlock after S seconds
fail_interval - Time window for failures
even_deny_root - Also lock root
```

# CAVEATS

Can lock out legitimate users. Root lockout dangerous. Test configuration carefully.

# HISTORY

pam_faillock replaced pam_tally2 in modern Linux distributions for tracking and enforcing login failure policies.

# SEE ALSO

[pam](/man/pam)(8), [faillock](/man/faillock)(8), [pam.d](/man/pam.d)(5)
