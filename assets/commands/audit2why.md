# TAGLINE

Translate SELinux denial messages into human-readable explanations.

# TLDR

Explain the **most recent** SELinux denial

```sudo audit2why```

Explain SELinux denials from a **specific audit log** file

```sudo audit2why -i [path/to/audit.log]```

Explain **all SELinux denials** from the audit log

```sudo ausearch -m avc | audit2why```

Explain denials for a **specific service**

```sudo ausearch -m avc -c [service_name] | audit2why```

# SYNOPSIS

**audit2why** [_options_] < _input_

# DESCRIPTION

**audit2why** translates SELinux denial messages from audit logs into human-readable explanations. It identifies the cause of each denial and often suggests solutions such as boolean toggles, policy modules, or file context corrections.

The tool reads audit events from standard input or a specified file. It is typically used in conjunction with **ausearch** to filter and analyze specific types of denials.

# PARAMETERS

**-a**, **--all**
> Read input from both the audit log and the message log.

**-b**, **--boot**
> Read input from audit messages since the last boot.

**-d**, **--dmesg**
> Read input from the output of _dmesg_(1).

**-i** _file_, **--input** _file_
> Read audit events from the specified file instead of stdin.

**-l**, **--lastreload**
> Read only audit events generated after the last policy reload.

**-p** _file_, **--policy** _file_
> Use the given policy file for analysis instead of the active one.

**-w**, **--why**
> Show the reason for each denial (default behavior for audit2why).

**-v**, **--verbose**
> Enable verbose output.

# CAVEATS

Requires root privileges to read audit logs. The tool only explains denials; it does not automatically fix them. Suggested booleans should be reviewed before enabling as they may have security implications. Part of the **policycoreutils-python-utils** package.

# SEE ALSO

[audit2allow](/man/audit2allow)(1), [ausearch](/man/ausearch)(8), [sealert](/man/sealert)(8), [semanage](/man/semanage)(8)
