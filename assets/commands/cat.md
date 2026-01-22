# TLDR

Print the contents of a file to **stdout**

```cat [path/to/file]```

**Concatenate** several files into an output file

```cat [file1] [file2] > [output_file]```

**Append** several files to an output file

```cat [file1] [file2] >> [output_file]```

**Number** all output lines

```cat -n [path/to/file]```

Display **all characters** including tabs and line endings

```cat -A [path/to/file]```

Pass file contents to another program through **stdin**

```cat [path/to/file] | [program]```

# SYNOPSIS

**cat** [_-n_] [_-A_] [_-b_] [_-s_] [_file_...]

# DESCRIPTION

**cat** (concatenate) reads files sequentially and writes their contents to standard output. It is commonly used to display file contents, combine files, and pipe content to other commands.

# PARAMETERS

**-n, --number**
> Number all output lines

**-b, --number-nonblank**
> Number non-blank output lines only

**-s, --squeeze-blank**
> Suppress repeated empty output lines

**-A, --show-all**
> Equivalent to -vET; show all characters

**-E, --show-ends**
> Display $ at end of each line

**-T, --show-tabs**
> Display TAB characters as ^I

**-v, --show-nonprinting**
> Use ^ and M- notation for non-printing characters

**-e**
> Equivalent to -vE

**-t**
> Equivalent to -vT

# CAVEATS

For large files, consider using **less** or **head/tail** instead. Using cat to pipe a single file to another command (UUOC - Useless Use of Cat) is often unnecessary.

# HISTORY

Part of **GNU Coreutils**. Originated in **1971** for first Edition Unix by Ken Thompson at Bell Labs. One of the oldest and most fundamental Unix utilities.

# SEE ALSO

[less](/man/less)(1), [more](/man/more)(1), [head](/man/head)(1), [tail](/man/tail)(1), [tac](/man/tac)(1)
