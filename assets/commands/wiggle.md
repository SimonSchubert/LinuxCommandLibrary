# TLDR

**Apply rejected patch**

```wiggle --replace [original] [original.rej]```

**Show difference**

```wiggle -d [file1] [file2]```

**Merge three files**

```wiggle -m [original] [changed] [modified]```

**Browse conflicts**

```wiggle --browse [file.rej]```

# SYNOPSIS

**wiggle** [_--replace_] [_-d_] [_-m_] [_options_] _files_

# PARAMETERS

**--replace**
> Apply and replace.

**-d**
> Show diff.

**-m**
> Three-way merge.

**--browse**
> Interactive browser.

**-w**
> Word-based diff.

# DESCRIPTION

**wiggle** applies failed patches. It handles conflicts.

Rejected patch recovery. When patch fails.

Word-level analysis. Finer granularity.

Three-way merge. Combine changes.

Interactive mode. Browse conflicts.

# CAVEATS

For patch failures. May not always work. Line changes needed.

# HISTORY

**wiggle** was created by **Neil Brown** to help apply patches that were rejected due to minor conflicts.

# SEE ALSO

[patch](/man/patch)(1), [diff](/man/diff)(1), [merge](/man/merge)(1)
