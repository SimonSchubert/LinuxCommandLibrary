# TLDR

Show **status**

```sudo auditctl -s```

**List** all rules

```sudo auditctl -l```

**Delete** all rules

```sudo auditctl -D```

**Enable/disable** auditing

```sudo auditctl -e 1```

**Watch** file for changes

```sudo auditctl -a always,exit -F arch=b64 -F path=/path/to/file -F perm=wa```

Watch **directory** recursively

```sudo auditctl -a always,exit -F arch=b64 -F dir=/path/to/dir/ -F perm=wa```

# SYNOPSIS

**auditctl** [_OPTIONS_]

# DESCRIPTION

**auditctl** controls the behavior and manages rules of the Linux Auditing System. It can enable/disable auditing, add or remove rules, and display current audit status and configuration.

# PARAMETERS

**-s**
> Display the audit system status

**-l**
> List all currently loaded audit rules

**-D**
> Delete all audit rules

**-e** _0|1_
> Disable (0) or enable (1) auditing

**-a** _list,action_
> Add a rule to the end of a list (e.g., always,exit)

**-w** _path_
> Watch a file or directory for changes

**-F** _field=value_
> Add a field comparison (path, perm, arch, etc.)

**-p** _permissions_
> Permissions filter (r=read, w=write, x=execute, a=attribute change)

# CAVEATS

Requires root privileges. Rules added with auditctl are not persistent across reboots; use /etc/audit/audit.rules for persistence. Excessive auditing can impact system performance.

# HISTORY

**auditctl** is part of the **audit** package, providing the Linux Audit Framework for security monitoring and compliance.

# SEE ALSO

[ausearch](/man/ausearch)(8), [aureport](/man/aureport)(8), [auditd](/man/auditd)(8)
