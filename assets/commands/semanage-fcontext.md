# TAGLINE

Manage SELinux file context labeling rules

# TLDR

**List** all file labeling rules

```sudo semanage fcontext -l```

**List** all user-defined file labeling rules without headings

```sudo semanage fcontext -l -C -n```

**Add** a user-defined rule that labels paths matching a regex

```sudo semanage fcontext -a -t [samba_share_t] '/mnt/share(/.*)?'```

**Add** a user-defined rule creating a labeling equivalence between paths

```sudo semanage fcontext -a -e /[path/to/ref] /[path/to/target]```

**Delete** a user-defined rule using its regex

```sudo semanage fcontext -d '/mnt/share(/.*)?'```

# SYNOPSIS

**semanage fcontext** [**-l**|**-a**|**-d**|**-m**] [_options_] _file_spec_

# PARAMETERS

**-l, --list**
> List all file context rules

**-a, --add**
> Add a new file context rule

**-d, --delete**
> Delete a file context rule

**-m, --modify**
> Modify an existing rule

**-t, --type _type_**
> SELinux type to assign to matching files

**-e, --equal _path_**
> Create equivalency rule from reference path

**-C, --locallist**
> Show only locally customized rules

**-n, --noheading**
> Omit column headings from output

# DESCRIPTION

**semanage fcontext** manages persistent file context labeling rules in SELinux. File contexts determine what SELinux type label files receive, which controls what confined domains can access them.

Rules use PCRE regular expressions to match file paths. After adding or modifying rules, run **restorecon** on the affected directories to apply the new labels.

# CAVEATS

Requires root privileges. Rules are persistent but not applied automatically; use **restorecon -Rv** to apply. Equivalency rules (**-e**) are useful when a directory should have the same contexts as a reference path.

# SEE ALSO

[semanage](/man/semanage)(8), [restorecon](/man/restorecon)(8), [matchpathcon](/man/matchpathcon)(8), [chcon](/man/chcon)(1)
