# TAGLINE

Query and examine SELinux policy components

# TLDR

**Display policy statistics** for the current system policy

```seinfo```

**List all types** in the policy

```seinfo -t```

**Show details** for a specific type with expanded information

```seinfo -t [httpd_t] -x```

**List all attributes** assigned to a type attribute

```seinfo -a [exec_type] -x```

**List all roles** in the policy

```seinfo -r```

**List all booleans** in the policy

```seinfo -b```

**Display constraints** for an object class

```seinfo --constrain [file]```

**Query a specific policy file** instead of system default

```seinfo [options] [path/to/policy]```

# SYNOPSIS

**seinfo** [_options_] [_expression_] [_policy_]

# PARAMETERS

**-a** [_ATTR_]
> Display type attributes or details for a named attribute.

**-b** [_BOOL_]
> Show booleans or specific boolean configuration.

**-c** [_CLASS_]
> List object classes or permissions for a specific class.

**-r** [_ROLE_]
> Query roles or role-specific information.

**-t** [_TYPE_]
> Examine types or their assigned attributes.

**-u** [_USER_]
> Display users or user statements.

**--category** [_CAT_]
> Show categories or associated sensitivities.

**--common** [_COMMON_]
> List common permission sets.

**--constrain** [_CLASS_]
> Display constraints and mlsconstraints for an object class.

**--all**
> Query all policy components.

**-x**, **--expand**
> Print additional details for each component matching the expression.

**--flat**
> Exclude formatting headers and indentation.

**-v**, **--verbose**
> Display extra informational content.

**--debug**
> Activate debugging output.

**-h**, **--help**
> Display help documentation.

**--version**
> Show version information.

# DESCRIPTION

**seinfo** is a SELinux policy query tool that allows users to examine the components of a SELinux policy. It can analyze both binary and source policies, providing detailed information about types, attributes, roles, users, booleans, object classes, and constraints.

If no policy file is provided, seinfo searches for the system default policy: first checking for a source policy, then for a binary policy matching the running kernel's preferred version, and finally for the highest version available. The tool supports loading policies in source format (policy.conf), binary format (e.g., policy.20), or modular format with loadable policy modules.

seinfo is part of the SETools suite and is commonly used for policy analysis, debugging, and security auditing on SELinux-enabled systems.

# CAVEATS

Policy files must be readable by the user running seinfo. When analyzing modular policies, the first module listed must be a base module. Some query options may produce large outputs on complex policies; use **--flat** or pipe to pagers for better readability.

# HISTORY

**seinfo** is part of the SETools project, a collection of SELinux policy analysis tools originally developed by Tresys Technology. SETools was created to help administrators and security professionals understand and manage SELinux policies. The project has been maintained and updated alongside SELinux development, with versions evolving to support new policy features and formats.

# SEE ALSO

[sesearch](/man/sesearch)(1), [sediff](/man/sediff)(1), [semanage](/man/semanage)(8), [getenforce](/man/getenforce)(1), [selinux](/man/selinux)(8)
