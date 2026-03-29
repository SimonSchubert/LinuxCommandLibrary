# TAGLINE

Manage SELinux file context labeling rules

# TLDR

**List all file labeling rules**

```sudo semanage fcontext -l```

**List all user-defined file labeling rules without headings**

```sudo semanage fcontext -l -C -n```

**Add a rule that labels paths matching a regex**

```sudo semanage fcontext -a -t [samba_share_t] '/mnt/share(/.*)?'```

**Add a rule for a specific file type (f=file, d=directory)**

```sudo semanage fcontext -a -f [d] -t [httpd_sys_content_t] '/srv/www(/.*)?'```

**Create a labeling equivalence between paths**

```sudo semanage fcontext -a -e /[path/to/ref] /[path/to/target]```

**Modify an existing rule to change the type**

```sudo semanage fcontext -m -t [httpd_sys_rw_content_t] '/srv/www(/.*)?'```

**Delete a user-defined rule using its regex**

```sudo semanage fcontext -d '/mnt/share(/.*)?'```

**Delete all local customizations**

```sudo semanage fcontext -D```

# SYNOPSIS

**semanage fcontext** [**-l**|**-a**|**-d**|**-m**|**-D**] [_options_] _file_spec_

# PARAMETERS

**-l**, **--list**
> List all file context rules.

**-a**, **--add**
> Add a new file context rule.

**-d**, **--delete**
> Delete a file context rule.

**-m**, **--modify**
> Modify an existing rule.

**-D**, **--deleteall**
> Remove all local customizations.

**-t** _TYPE_, **--type** _TYPE_
> SELinux type to assign to matching files.

**-f** _TYPE_, **--ftype** _TYPE_
> File type to match: f (regular file), d (directory), c (character device), b (block device), s (socket), l (symbolic link), p (named pipe). Default is all file types.

**-s** _SEUSER_, **--seuser** _SEUSER_
> SELinux user name for the context.

**-r** _RANGE_, **--range** _RANGE_
> MLS/MCS security range (for MLS/MCS systems only).

**-e** _PATH_, **--equal** _PATH_
> Create equivalency rule: substitute target path with the given reference path when generating default labels.

**-C**, **--locallist**
> Show only locally customized rules.

**-n**, **--noheading**
> Omit column headings from output.

**-N**, **--noreload**
> Do not reload policy after commit.

**-E**, **--extract**
> Extract customizable commands for use within a transaction.

**-S** _STORE_, **--store** _STORE_
> Select an alternate SELinux policy store.

# DESCRIPTION

**semanage fcontext** manages persistent file context labeling rules in SELinux. File contexts determine what SELinux type label files receive, which controls what confined domains can access them.

Rules use PCRE regular expressions to match file paths. After adding or modifying rules, run **restorecon** on the affected directories to apply the new labels.

# CAVEATS

Requires root privileges. Rules are persistent but not applied automatically; use **restorecon -Rv** to apply. Equivalency rules (**-e**) are useful when a directory should have the same contexts as a reference path. The **-f** file type option defaults to all files if not specified.

# SEE ALSO

[semanage](/man/semanage)(8), [restorecon](/man/restorecon)(8), [matchpathcon](/man/matchpathcon)(8), [chcon](/man/chcon)(1), [semanage-boolean](/man/semanage-boolean)(8), [semanage-port](/man/semanage-port)(8)
