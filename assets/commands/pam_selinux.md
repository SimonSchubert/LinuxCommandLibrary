# TAGLINE

PAM module to set the default SELinux security context

# TLDR

**Set SELinux context** for a session

```session required pam_selinux.so```

**Close session** context before other session modules

```session required pam_selinux.so close```

**Open session** context after other session modules

```session required pam_selinux.so open```

**Prompt user to select** a security context role

```session required pam_selinux.so select_context```

**Obtain context from PAM environment** variables

```session required pam_selinux.so env_params```

**Enable verbose output** to inform the user when context is set

```session required pam_selinux.so open verbose```

# SYNOPSIS

**pam_selinux.so** [**open**] [**close**] [**restore**] [**nottys**] [**debug**] [**verbose**] [**select_context**] [**env_params**] [**use_current_range**]

# PARAMETERS

**open**
> Execute only the open_session portion of the module, which sets the execution and terminal security contexts.

**close**
> Execute only the close_session portion of the module, which restores previous security contexts.

**restore**
> In open_session, temporarily restore security contexts as they were before the previous call of the module. Useful when open and close cannot be placed around other session modules.

**nottys**
> Do not set the security context of the controlling terminal.

**debug**
> Turn on debug messages via syslog(3).

**verbose**
> Attempt to inform the user when the security context is set.

**select_context**
> Prompt the user to select a custom role for the security context. Mutually exclusive with **env_params**.

**env_params**
> Obtain a custom security context role from PAM environment variables (SELINUX_ROLE_REQUESTED, SELINUX_LEVEL_REQUESTED, SELINUX_USE_CURRENT_RANGE). Mutually exclusive with **select_context**.

**use_current_range**
> Use the current process MLS sensitivity level rather than the default.

# DESCRIPTION

**pam_selinux** is a PAM module that sets the default SELinux security context for authenticated user sessions. It operates in two phases: **open_session** sets up the execution and controlling terminal security contexts, and **close_session** restores the previously saved contexts when the session ends.

In a typical PAM configuration, this module is called twice -- once with **close** before other session modules, and once with **open** after them. This ensures that other modules run with the caller's context, while the user session receives the appropriate SELinux context.

# RETURN VALUES

**PAM_SUCCESS**
> Security context was set successfully.

**PAM_SESSION_ERR**
> Unable to get or set a valid context.

**PAM_USER_UNKNOWN**
> The user is not known to the system.

**PAM_BUF_ERR**
> Memory allocation failure.

# CAVEATS

Only applicable on systems with SELinux enabled. This module provides only the **session** module type. The **select_context** and **env_params** options are mutually exclusive.

# SEE ALSO

[pam](/man/pam)(8), [pam.d](/man/pam.d)(5), [chcon](/man/chcon)(1), [semanage](/man/semanage)(8), [sestatus](/man/sestatus)(8), [getenforce](/man/getenforce)(8)
