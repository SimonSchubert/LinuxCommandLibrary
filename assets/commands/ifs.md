# TAGLINE

shell variable that controls word splitting

# TLDR

**Split** a string into an array on a single character

```IFS=',' read -ra arr <<< "[a,b,c]"```

**Split** a line into named fields

```IFS=':' read -r user pass uid gid gecos home shell <<< "$line"```

**Read** a line without stripping leading or trailing whitespace

```IFS= read -r line```

**Split** only on newlines for the duration of one loop

```while IFS= read -r line; do echo "$line"; done < [file]```

**Set** the default value explicitly

```IFS=$' \t\n'```

**Change** IFS for a single command only

```IFS=':' command```

**Save** and restore IFS around a block

```old_ifs=$IFS; IFS=','; ...; IFS=$old_ifs```

**Join** array elements with the first character of IFS

```IFS=','; echo "${arr[*]}"```

# SYNOPSIS

**IFS**=_characters_

# DESCRIPTION

**IFS**, the Internal Field Separator, is a shell variable that holds the set of characters the shell uses to split expanded words into fields. It is not a command: it is read by the shell itself during field splitting, by the **read** builtin when it assigns words to variables, and when `"$*"` or `"${array[*]}"` is expanded.

The default value is space, tab, and newline. Bash resets IFS to that value at startup, so scripts can rely on it unless something changed it.

Field splitting distinguishes two kinds of characters in IFS. Space, tab, and newline are *IFS whitespace*: runs of them count as a single delimiter, and leading or trailing runs are discarded, which is why the default value never produces empty fields. Any other character in IFS delimits exactly one field, so two of them in a row yield an empty field.

Splitting happens only on the results of unquoted parameter expansion, command substitution, and arithmetic expansion. Quoted expansions and literal text in the script are never split, and pathname expansion runs afterwards on the resulting fields.

When `"$*"` is expanded inside double quotes, the positional parameters are joined with the first character of IFS. The same rule applies to `"${array[*]}"`, which makes IFS a convenient way to join array elements.

# PARAMETERS

_unset_
> Field splitting behaves as if IFS held the default space, tab, and newline.

_null_ (**IFS=**)
> No field splitting is performed, and **read** stops stripping leading and trailing whitespace.

_IFS whitespace_
> Space, tab, and newline. Consecutive occurrences collapse into one delimiter and leading or trailing ones are ignored.

_other characters_
> Each occurrence delimits one field, so adjacent delimiters produce empty fields.

# CAVEATS

Assigning IFS as a prefix to a builtin such as `IFS=, read -r a b` is a temporary assignment that applies to that command only, which is safer than a global change. This does not hold for special builtins in a POSIX-conforming shell, where the assignment can persist.

Restoring with `IFS=$old_ifs` sets IFS to the empty string if it had been unset, which is not the same as unset. Inside a function, declaring `local IFS` is a cleaner way to scope the change.

`IFS=$'\n'` uses `$'...'` quoting, which is a bash, zsh, and ksh extension and is not available in strict POSIX `sh`. Use a literal newline inside quotes for portability.

A trailing delimiter does not create an extra field: splitting `a,b,` on a comma yields two fields, not three. Empty fields between two delimiters are kept, so `a,,b` yields three.

Changing IFS globally affects every later expansion in the script, including ones inside functions and sourced files. Restore it as soon as possible.

# HISTORY

**IFS** dates back to the **Bourne shell** written by **Stephen Bourne** at Bell Labs in the late **1970s** and is standardized by POSIX. It is present in every Bourne-compatible shell, including bash, dash, ksh, and zsh, though zsh does not perform field splitting on unquoted expansions by default.

# SEE ALSO

[read](/man/read)(1), [bash](/man/bash)(1), [sh](/man/sh)(1), [dash](/man/dash)(1), [ksh](/man/ksh)(1), [zsh](/man/zsh)(1), [set](/man/set)(1), [mapfile](/man/mapfile)(1), [cut](/man/cut)(1)

# RESOURCES

```[Documentation](https://www.gnu.org/software/bash/manual/bash.html#Word-Splitting)```

<!-- verified: 2026-08-30 -->
