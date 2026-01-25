# TLDR

**Enable process accounting** to a specific file

```sudo accton [/var/log/account/pacct]```

**Disable process accounting**

```sudo accton off```

**Check the current accounting status**

```sudo accton```

# SYNOPSIS

**accton** [**off**] [_file_]

# PARAMETERS

**off**
> Disable process accounting.

_file_
> Path to the accounting file where records will be written. Typically **/var/log/account/pacct** or **/var/account/acct**.

# DESCRIPTION

**accton** enables or disables system process accounting, a kernel feature that records information about every process that terminates on the system. When enabled, the kernel writes a compact record for each completed process, including the command name, CPU time used, memory consumption, and exit status.

With no arguments, accton displays the current accounting status. Specifying a file path enables accounting to that file. The **off** argument disables accounting.

The accounting data can be analyzed using companion tools like **sa** (summarize accounting) and **lastcomm** (show last commands executed). This information is valuable for system auditing, resource usage analysis, and troubleshooting.

# CAVEATS

Process accounting files grow continuously and must be rotated or truncated periodically to prevent disk exhaustion. The feature adds slight overhead to process termination. Requires root privileges to enable or disable. The accounting file format is architecture-dependent and may not be portable between systems.

# HISTORY

Process accounting originated in early Unix systems at Bell Labs in the **1970s**, designed for tracking resource usage in multi-user timesharing environments. The feature was used for billing purposes in commercial Unix installations. The **accton** command and associated tools have been standard components of Unix and Linux systems ever since, now primarily used for security auditing rather than billing.

# SEE ALSO

[sa](/man/sa)(8), [lastcomm](/man/lastcomm)(1), [acct](/man/acct)(5), [dump-acct](/man/dump-acct)(8)
