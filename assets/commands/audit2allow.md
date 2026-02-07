# TAGLINE

Generate SELinux policy allow rules from audit logs.

# TLDR

Generate **allow** rules

```sudo audit2allow -a```

From **log file**

```sudo audit2allow -i /var/log/audit/audit.log```

Create **policy module**

```sudo audit2allow -a -M my_module```

**Explain** denials

```sudo audit2allow -a --why```

Generate **reference** policy

```sudo audit2allow -a -R```

For specific **service**

```sudo ausearch -m avc -c httpd | audit2allow -M httpd_policy```

# SYNOPSIS

**audit2allow** [_OPTIONS_]

# DESCRIPTION

**audit2allow** generates SELinux policy allow rules from audit logs. It reads denial messages from the audit subsystem and creates type enforcement rules that would permit the denied operations.

The tool can produce simple allow rules for quick troubleshooting or generate complete loadable policy modules with the **-M** option. When used with **-R**, it generates reference policy using standard macros, producing cleaner and more maintainable rules. It is typically used after **audit2why** has identified the root cause of denials.

# PARAMETERS

**-a, --all**
> Read input from audit log

**-i, --input** _file_
> Read input from specified file

**-M, --module** _name_
> Generate loadable policy module

**--why**
> Explain why denials occurred

**-e, --explain**
> Show detailed information about denials

**-R, --reference**
> Generate reference policy using macros

**-v, --verbose**
> Enable verbose output

# CAVEATS

Generated policies should be reviewed before installation. Blindly allowing all denials can create security vulnerabilities. Use audit2why first to understand why denials occurred.

# HISTORY

**audit2allow** is part of **policycoreutils-python-utils**, providing SELinux policy development tools.

# SEE ALSO

[audit2why](/man/audit2why)(1), [ausearch](/man/ausearch)(8), [semodule](/man/semodule)(8)
