# TAGLINE

Apply rejected patches with conflict resolution

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

**wiggle** applies patches that have been rejected by the standard patch utility due to minor conflicts between the patch context and the current file. Where patch requires exact context matching, wiggle performs word-level analysis to find where changes should be applied even when surrounding lines have shifted or been modified.

The tool supports three-way merging of files and can work with both unified diff files and .rej reject files produced by failed patch operations. When conflicts cannot be resolved automatically, an interactive browse mode lets users review and resolve remaining conflicts manually.

This makes wiggle particularly valuable for maintaining long-lived patch series against evolving codebases, where patches frequently fail to apply cleanly due to unrelated changes in nearby code.

# CAVEATS

For patch failures. May not always work. Line changes needed.

# HISTORY

**wiggle** was created by **Neil Brown** to help apply patches that were rejected due to minor conflicts.

# SEE ALSO

[patch](/man/patch)(1), [diff](/man/diff)(1), [merge](/man/merge)(1)
