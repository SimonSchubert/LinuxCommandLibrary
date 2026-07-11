# TAGLINE

three-way file comparison and merge

# TLDR

**Compare** three files

```diff3 [path/to/file1] [path/to/file2] [path/to/file3]```

Show all changes **outlining conflicts**

```diff3 -A [path/to/file1] [path/to/file2] [path/to/file3]```

# SYNOPSIS

**diff3** [_options_] _myfile_ _oldfile_ _yourfile_

# DESCRIPTION

**diff3** compares three files line by line, showing differences and conflicts. It's typically used for three-way merges where one file is the common ancestor and two files are modified versions.

The output format is suitable for merge conflict resolution.

# PARAMETERS

**-A, --show-all**
> Show all changes, bracketing conflicts

**-e, --ed**
> Output ed script

**-E, --show-overlap**
> Like -e but bracket conflicts

**-m, --merge**
> Output the merged file directly (implies -A unless -e, -E, or -x is given)

**-x, --overlap-only**
> Output overlapping (conflicting) changes only

**-3, --easy-only**
> Output non-overlapping changes from the third file only

**-T, --initial-tab**
> Make tabs line up by prefixing a tab

# CAVEATS

File order matters: mine, older, yours. Commonly used internally by version control systems. Part of GNU diffutils.

# SEE ALSO

[diff](/man/diff)(1), [merge](/man/merge)(1), [patch](/man/patch)(1)

# RESOURCES

```[Homepage](https://www.gnu.org/software/diffutils/)```

```[Documentation](https://www.gnu.org/software/diffutils/manual/html_node/Invoking-diff3.html)```

<!-- verified: 2026-07-11 -->
