# TAGLINE

Search and analyze SELinux policy rules

# TLDR

Search for all **allow rules** in the policy

```sesearch --allow```

Search for rules related to a **specific target type**

```sesearch --allow -t [type_name]```

Search for rules related to a **specific source type**

```sesearch --allow -s [source_type]```

Search for rules with a specific **class and permission**

```sesearch --allow -c [class_name] -p [permission]```

Search for **type transition** rules

```sesearch --type_transition -s [source_type]```

Display **verbose** information about matched rules

```sesearch --allow -t [type_name] -v```

# SYNOPSIS

**sesearch** [_OPTIONS_] [_EXPRESSION_] [_POLICY_]

# PARAMETERS

**-A, --allow**
> Search for allow and allowxperm rules

**-T, --type_transition**
> Search for type_transition rules

**--auditallow**
> Search for auditallow rules

**--dontaudit**
> Search for dontaudit rules

**-s, --source** _NAME_
> Find rules with matching source type/attribute

**-t, --target** _NAME_
> Find rules with matching target type/attribute

**-c, --class** _NAME_
> Find rules with matching object class

**-p, --perm** _P1[,P2,...]_
> Find rules with matching permissions (comma-separated)

**-b, --bool** _NAME_
> Find rules with matching conditional Boolean

**-ds**
> Match source type directly, not by attribute

**-dt**
> Match target type directly, not by attribute

**-v, --verbose**
> Display additional rule information

**--version**
> Print version and exit

# DESCRIPTION

**sesearch** is a SELinux policy query tool from the **setools** package that allows users to search and analyze rules within a SELinux policy. It can query both binary policy files (typically named policy.XX) and modular policies, making it essential for SELinux policy debugging and development.

The tool supports searching various rule types including allow rules, type transitions, role-based access control rules, and MLS (Multi-Level Security) range transitions. Results can be filtered by source type, target type, object class, permissions, and Boolean conditions.

# CAVEATS

Policy files must be accessible; default location is **/sys/fs/selinux/policy** on running systems. Results may differ between policy versions. Searching large policies without filters can produce extensive output. Extended permission rules (xperm) require separate flags from standard permission searches.

# HISTORY

**sesearch** is part of the **SETools** (SELinux Policy Tools) project, originally developed at **Tresys Technology** starting in **2001** to provide analysis capabilities for SELinux policies. The setools package has evolved alongside SELinux, which was integrated into the Linux kernel mainline in **2003**. Current maintenance continues under the setools project on GitHub.

# SEE ALSO

[seinfo](/man/seinfo)(1), [semodule](/man/semodule)(8), [sestatus](/man/sestatus)(8), [getsebool](/man/getsebool)(8)
