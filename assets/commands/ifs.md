# TLDR

**Set field separator**

```IFS=':' read -ra arr <<< "a:b:c"```

**Split on newline**

```IFS=$'\n'```

**Save and restore IFS**

```OLD_IFS="$IFS"; IFS=','; ...; IFS="$OLD_IFS"```

**Default IFS**

```IFS=$' \t\n'```

# SYNOPSIS

**IFS** is a shell variable

# PARAMETERS

**IFS**
> Internal Field Separator variable.

# DESCRIPTION

**IFS** (Internal Field Separator) is a shell variable controlling word splitting. It defines characters used to split strings into fields.

The default IFS is space, tab, and newline. Changing IFS affects read, for loops, and word splitting behavior.

IFS controls shell word splitting.

# CAVEATS

Shell variable, not command. Affects word splitting globally. Restore after use.

# HISTORY

IFS is a standard **POSIX shell** variable, present in all Bourne-compatible shells.

# SEE ALSO

[read](/man/read)(1), [bash](/man/bash)(1), [sh](/man/sh)(1)
