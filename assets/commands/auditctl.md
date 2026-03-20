# TAGLINE

Control and manage Linux audit system rules.

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

Watch file with a filter **key** for easy searching

```sudo auditctl -w /etc/passwd -p wa -k passwd_changes```

**Delete** a specific rule

```sudo auditctl -W /etc/passwd```

# SYNOPSIS

**auditctl** [_OPTIONS_]

# DESCRIPTION

**auditctl** controls the behavior and manages rules of the Linux Auditing System. It can enable or disable auditing, add or remove audit rules, and display the current audit status and configuration.

Rules can monitor specific files and directories for access, track system calls by process attributes, and filter events by user, group, or architecture. The tool communicates directly with the kernel audit subsystem to apply rules immediately, though these runtime rules are lost on reboot unless persisted to the audit rules file.

# PARAMETERS

**-s**
> Display the audit system status

**-l**
> List all currently loaded audit rules

**-D**
> Delete all audit rules

**-b** _backlog_
> Set max number of outstanding audit buffers (kernel default: 64)

**-e** _0|1|2_
> Disable (0), enable (1), or lock (2) audit configuration. Locked config cannot be changed without reboot.

**-f** _0|1|2_
> Set failure mode: 0=silent, 1=printk, 2=panic

**-r** _rate_
> Set message rate limit in messages/sec (0=none)

**-a** _list,action_
> Append a rule to the end of a list (e.g., always,exit)

**-d** _list,action_
> Delete a matching rule from the specified list

**-w** _path_
> Place a watch on a file or directory for changes

**-W** _path_
> Remove a watch from a file or directory

**-F** _field=value_
> Add a field comparison (path, perm, arch, uid, pid, etc.)

**-S** _syscall_
> Specify a syscall name or number to audit (use with -a)

**-k** _key_
> Set a filter key on an audit rule for easier log searching

**-p** _permissions_
> Permissions filter (r=read, w=write, x=execute, a=attribute change)

**-R** _file_
> Read and execute auditctl commands from a file

# CONFIGURATION

**/etc/audit/audit.rules**
> Persistent audit rules loaded at boot by auditd. Rules added with auditctl are lost on reboot unless saved here.

# CAVEATS

Requires root privileges. Rules added with auditctl are not persistent across reboots; use /etc/audit/audit.rules for persistence. Excessive auditing can impact system performance.

# HISTORY

**auditctl** is part of the **audit** package, providing the Linux Audit Framework for security monitoring and compliance.

# SEE ALSO

[ausearch](/man/ausearch)(8), [aureport](/man/aureport)(8), [auditd](/man/auditd)(8)
