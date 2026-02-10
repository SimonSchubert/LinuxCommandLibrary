# TAGLINE

manages SELinux contexts

# TLDR

**Set SELinux context**

```session required pam_selinux.so```

**Close context**

```session required pam_selinux.so close```

**Open context**

```session required pam_selinux.so open```

**Select context**

```session required pam_selinux.so select_context```

# SYNOPSIS

**pam_selinux.so** [_options_]

# PARAMETERS

**open**
> Open session context.

**close**
> Close session context.

**select_context**
> Allow user context selection.

**use_current_range**
> Use current MLS range.

# DESCRIPTION

**pam_selinux** manages SELinux contexts. Sets security context on login.

The module handles session context. Required for SELinux systems.

# CAVEATS

SELinux systems only. Context dependent. Session management.

# HISTORY

pam_selinux provides **SELinux context** management for PAM sessions.

# SEE ALSO

[pam](/man/pam)(8), [selinux](/man/selinux)(8), [chcon](/man/chcon)(1)

