# TAGLINE

**/etc/pam

# TLDR

**View login PAM config**

```cat /etc/pam.d/login```

**View SSH PAM config**

```cat /etc/pam.d/sshd```

**View sudo PAM config**

```cat /etc/pam.d/sudo```

**View common authentication**

```cat /etc/pam.d/common-auth```

# SYNOPSIS

**/etc/pam.d/** - PAM configuration directory

# DESCRIPTION

**/etc/pam.d/** contains per-service PAM configuration files. Each file defines authentication rules for a specific service (login, sshd, sudo, etc.).

This directory-based configuration replaced the monolithic /etc/pam.conf on modern systems.

# FILE FORMAT

```
# /etc/pam.d/login
type  control  module  [arguments]

auth      required   pam_securetty.so
auth      required   pam_unix.so
account   required   pam_unix.so
session   required   pam_limits.so
```

# COMMON FILES

```
common-auth     - Shared auth rules
common-account  - Shared account rules
common-password - Password rules
common-session  - Session rules
login           - Console login
sshd            - SSH daemon
sudo            - Sudo command
```

# TYPES

```
auth     - Authentication
account  - Account management
password - Password updates
session  - Session setup/teardown
```

# CAVEATS

Errors can lock users out. Test with spare root session. Use @include for common configs.

# SEE ALSO

[pam](/man/pam)(8), [pam.conf](/man/pam.conf)(5), [pam_unix](/man/pam_unix)(8)
