# TAGLINE

Per-service PAM configuration directory

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

This directory-based configuration replaced the monolithic /etc/pam.conf on modern systems: if **/etc/pam.d/** exists, **/etc/pam.conf** is ignored. The file name is the service name, so the type field from pam.conf is dropped. Linux-PAM built with a vendor directory (for example openSUSE and recent Fedora) also reads defaults from **/usr/lib/pam.d/**, which files in **/etc/pam.d/** override.

Each line has a **control** field: **required** (failure is reported after the stack finishes), **requisite** (fail immediately), **sufficient** (success ends the stack if nothing required failed), **optional**, **include** and **substack** (pull in another file), or the bracketed **[value=action ...]** syntax for full control.

# FILE FORMAT

```
# /etc/pam.d/login
type  control  module  [arguments]

auth      requisite  pam_nologin.so
auth      required   pam_unix.so
account   required   pam_unix.so
password  include    common-password
session   required   pam_limits.so
```

# COMMON FILES

```
common-auth     - Shared auth rules (Debian/Ubuntu)
common-account  - Shared account rules (Debian/Ubuntu)
common-password - Password rules (Debian/Ubuntu)
common-session  - Session rules (Debian/Ubuntu)
system-auth     - Shared rules (Fedora/RHEL/Arch)
password-auth   - Shared rules for remote logins (Fedora/RHEL)
other           - Fallback for services without a file
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

Errors can lock users out, including root. Keep a spare root session open while testing. Debian-based systems use the **@include** directive for common files; Fedora/RHEL manage **system-auth** via **authselect**, so edit its profiles rather than the generated files. Lines may be prefixed with **-** to silently skip modules that are not installed.

# SEE ALSO

[pam](/man/pam)(8), [pam.conf](/man/pam.conf)(5), [pam_unix](/man/pam_unix)(8), [pam_debug](/man/pam_debug)(8), [authselect](/man/authselect)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man5/pam.d.5.html)```

<!-- verified: 2026-11-23 -->
