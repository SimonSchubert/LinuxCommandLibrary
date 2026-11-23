# TAGLINE

PAM module to validate user login shells

# TLDR

**Require valid shell for authentication**

```auth required pam_shells.so```

**Require valid shell for account access**

```account required pam_shells.so```

# SYNOPSIS

**pam_shells.so**

# PARAMETERS

This module does not accept any parameters.

# DESCRIPTION

**pam_shells** is a PAM module that only allows access to the system if the user's shell is listed in **/etc/shells**. When Linux-PAM is built with libeconf and a vendor directory (e.g. openSUSE) and /etc/shells does not exist, entries are read from the vendor **shells** file, **shells.d/*** in the vendor directory and **/etc/shells.d/*** instead. It also checks that these files are plain files and not world-writable.

A common use is to deny services such as FTP to accounts whose shell is **/sbin/nologin** or **/bin/false**, as those are normally not listed in /etc/shells.

The module provides both **auth** and **account** module types. It returns PAM_SUCCESS if the shell is valid, PAM_AUTH_ERR if it is not listed, PAM_USER_UNKNOWN if the user or their shell cannot be determined, and PAM_SERVICE_ERR if the username cannot be obtained.

# CAVEATS

Requires **/etc/shells** (or the vendor fallback files) to exist and contain valid shell paths, one absolute path per line. Users with shells not listed will be denied access. The module only compares the shell path; it does not check that the shell is actually executable.

# HISTORY

**pam_shells** is part of the Linux-PAM (Pluggable Authentication Modules) framework, providing a simple mechanism to restrict access based on whether a user has a legitimate login shell.

# SEE ALSO

[pam](/man/pam)(8), [pam_unix](/man/pam_unix)(8), [pam_deny](/man/pam_deny)(8), [chsh](/man/chsh)(1), [getent](/man/getent)(1), [login](/man/login)(1)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man8/pam_shells.8.html)```

<!-- verified: 2026-11-23 -->
