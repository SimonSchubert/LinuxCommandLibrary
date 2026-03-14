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

**pam_shells** is a PAM module that only allows access to the system if the user's shell is listed in **/etc/shells**. It also checks that /etc/shells is a plain file and not world-writable.

The module provides both **auth** and **account** module types. It returns PAM_AUTH_ERR if the shell is not listed, PAM_SUCCESS if the shell is valid, and PAM_SERVICE_ERR if the username cannot be determined.

# CAVEATS

Requires **/etc/shells** to exist and contain valid shell paths (one absolute path per line). Users with shells not listed in /etc/shells will be denied access. Blank lines and lines starting with # in /etc/shells are ignored.

# HISTORY

**pam_shells** is part of the Linux-PAM (Pluggable Authentication Modules) framework, providing a simple mechanism to restrict access based on whether a user has a legitimate login shell.

# SEE ALSO

[pam](/man/pam)(8), [chsh](/man/chsh)(1)

