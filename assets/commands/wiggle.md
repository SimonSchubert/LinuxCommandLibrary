# TAGLINE

Apply rejected patches with conflict resolution

# TLDR

**Apply a rejected patch** in-place

```wiggle --replace [original] [original.rej]```

**Show a word-wise diff** between two files

```wiggle --diff [file1] [file2]```

**Perform a three-way merge**

```wiggle --merge [original] [changed] [modified]```

**Interactively browse** a merge or patch

```wiggle --browse [original] [original.rej]```

**Extract one branch** of a patch or merge

```wiggle --extract --patch [file.patch] > [patched]```

# SYNOPSIS

**wiggle** [_mode_] [_options_] _files_

# PARAMETERS

**-m**, **--merge**
> Three-way merge mode (default).

**-d**, **--diff**
> Word-wise diff mode.

**-x**, **--extract**
> Extract one file/branch from patch or merge.

**-B**, **--browse**
> Interactive ncurses browser for merges, diffs, or patches.

**-r**, **--replace**
> Overwrite the original file with the merge result (keeps `.porig` backup).

**-o** _file_, **--output** _file_
> Write output to given file instead of stdout.

**-p**, **--patch**
> Treat one of the arguments as a patch file.

**-w**, **--words**
> Work at word granularity (default for text).

**-l**, **--lines**
> Work at line granularity.

**-b**, **--ignore-blanks**
> Ignore whitespace-only changes when merging.

**-i**, **--no-ignore**
> Do not ignore already-applied patches (include them in output).

**-W**, **--show-wiggles**
> Mark hunks that were wiggled into place.

**-q**, **--quiet**
> Suppress informational messages.

**-v**, **--verbose**
> Increase verbosity.

**-h**, **--help**
> Display help and exit.

**-V**, **--version**
> Display version and exit.

# DESCRIPTION

**wiggle** applies patches that have been rejected by the standard patch utility due to minor conflicts between the patch context and the current file. Where patch requires exact context matching, wiggle performs word-level analysis to find where changes should be applied even when surrounding lines have shifted or been modified.

The tool supports three-way merging of files and can work with both unified diff files and .rej reject files produced by failed patch operations. When conflicts cannot be resolved automatically, an interactive browse mode lets users review and resolve remaining conflicts manually.

This makes wiggle particularly valuable for maintaining long-lived patch series against evolving codebases, where patches frequently fail to apply cleanly due to unrelated changes in nearby code.

# CAVEATS

For patch failures. May not always work. Line changes needed.

# HISTORY

**wiggle** was created by **Neil Brown** to help apply patches that were rejected due to minor conflicts.

# SEE ALSO

[patch](/man/patch)(1), [diff](/man/diff)(1), [merge](/man/merge)(1)
