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

```sudo audit2allow -a -w```

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
> Read input from audit and message logs.

**-b, --boot**
> Read input from audit messages since the last boot.

**-d, --dmesg**
> Read input from dmesg output.

**-i, --input** _file_
> Read input from the specified file.

**-l, --lastreload**
> Read only AVC denials since the last policy reload.

**-m, --module** _name_
> Generate module output (source, not packaged).

**-M** _name_
> Generate a loadable policy module package (.pp).

**-o, --output** _file_
> Append output to the given file.

**-D, --dontaudit**
> Generate dontaudit rules instead of allow rules.

**-R, --reference**
> Generate reference policy using installed interface macros.

**-N, --noreference**
> Do not generate reference policy; use traditional allow rules.

**-w, --why**
> Translate audit messages into a description of why access was denied.

**-e, --explain**
> Fully explain the generated output.

**-x, --xperms**
> Generate extended permission (ioctl) rules.

**-t, --type** _regex_
> Filter output by type regular expression.

**-C**
> Generate CIL (Common Intermediate Language) output.

**-r, --requires**
> Generate require statements for loadable modules.

**-v, --verbose**
> Enable verbose output.

# CAVEATS

Generated policies should be reviewed before installation. Blindly allowing all denials can create security vulnerabilities. Use audit2why first to understand why denials occurred.

# HISTORY

**audit2allow** is part of **policycoreutils-python-utils**, providing SELinux policy development tools.

# SEE ALSO

[audit2why](/man/audit2why)(1), [ausearch](/man/ausearch)(8), [semodule](/man/semodule)(8)
