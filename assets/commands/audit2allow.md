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

**audit2allow** generates SELinux policy allow rules from audit logs. It reads denial messages and creates policy rules that would permit the denied operations, helping to troubleshoot and fix SELinux policy issues.

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
