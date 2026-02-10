# TAGLINE

starts a new shell with a different SELinux security context

# TLDR

Start a new shell with a specific **SELinux role**

```newrole -r [role_name]```

Start a new shell with a specific **SELinux type**

```newrole -t [type_name]```

Start a new shell with a specific **SELinux level**

```newrole -l [s0-s0:c0.c1023]```

Start a new shell with **both role and type**

```newrole -r [role_name] -t [type_name]```

# SYNOPSIS

**newrole** [_options_]

# PARAMETERS

**-r, --role _role_**
> Specify the new SELinux role

**-t, --type _type_**
> Specify the new SELinux type (domain)

**-l, --level _level_**
> Specify the new SELinux sensitivity level

**-p, --preserve-environment**
> Preserve environment variables when transitioning

**-V, --version**
> Display version information

# DESCRIPTION

**newrole** starts a new shell with a different SELinux security context. It allows users to transition between roles they're authorized to use, enabling role-based access control (RBAC) within SELinux.

SELinux contexts have the format **user:role:type:level**. The newrole command changes the role and/or type components, which affects what actions the user can perform. Common transitions include switching from a restricted user role to an administrative role.

The user must be mapped to the target role in SELinux policy (see **semanage user**). Authentication may be required depending on policy configuration.

# CAVEATS

Only works on SELinux-enabled systems. The user must be authorized for the target role in SELinux policy. Failed transitions may result in access denials. Use **id -Z** to verify the current context before and after transition.

# SEE ALSO

[runcon](/man/runcon)(1), [semanage-user](/man/semanage-user)(8), [id](/man/id)(1), [seinfo](/man/seinfo)(1)
