# TLDR

**Restore** SELinux contexts for entire system

```fixfiles restore```

Relabel filesystem on **next boot**

```fixfiles onboot```

**Force reset** of customizable files

```fixfiles -F restore```

Restore contexts for **specific RPM** packages

```fixfiles -R package1,package2 restore```

Only process files created **after date**

```fixfiles -N "2024-01-01" restore```

**Verbose** output

```fixfiles -v restore```

**Bind mount** filesystems before relabeling

```fixfiles -M restore```

# SYNOPSIS

**fixfiles** [_options_] {**restore**|**check**|**onboot**|**relabel**|**verify**}

# DESCRIPTION

**fixfiles** fixes file SELinux security contexts on the system. It is a wrapper script around restorecon and setfiles that provides convenient system-wide relabeling options.

# PARAMETERS

**-B**
> Record current date for later use with restore to speed up labeling

**-F**
> Force reset of context for customizable files

**-f**
> Clear /tmp directory without confirmation

**-R PACKAGES**
> Discover files within specific RPM packages and restore their contexts

**-C FILECONTEXT**
> Compare with previous filecontext and restore affected files

**-N DATE**
> Only process files created after specified date (YYYY-MM-DD HH:MM)

**-M**
> Bind mount filesystems before relabeling

**-v**
> Verbose mode; run restorecon with -v instead of -p

**restore**
> Restore file contexts to defaults

**check**
> Check file contexts without changing them

**onboot**
> Schedule relabeling on next boot

**relabel**
> Relabel entire filesystem

**verify**
> Verify file contexts match policy

# CAVEATS

A full filesystem relabel can take significant time. Using -B with onboot then restore can speed up subsequent relabeling. Requires SELinux to be enabled.

# HISTORY

**fixfiles** is part of the **policycoreutils** package, providing SELinux file context management utilities for Red Hat-based systems.

# SEE ALSO

[restorecon](/man/restorecon)(8), [setfiles](/man/setfiles)(8), [chcon](/man/chcon)(1)
