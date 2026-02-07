# TAGLINE

Copy files from index to working directory

# TLDR

**Copy all files to working tree**

```git checkout-index -a```

**Copy specific file**

```git checkout-index [file]```

**Copy with force**

```git checkout-index -f [file]```

**Copy to different directory**

```git checkout-index --prefix=[dir/] -a```

**Copy all including unmerged**

```git checkout-index -a -f```

# SYNOPSIS

**git** **checkout-index** [_options_] [_files_...]

# PARAMETERS

**-a**, **--all**
> Check out all files.

**-f**, **--force**
> Force overwrite.

**--prefix** _string_
> Output prefix.

**-u**, **--index**
> Update stat info.

**-n**, **--no-create**
> Don't create files.

# DESCRIPTION

**git checkout-index** is a low-level plumbing command that copies files from Git's staging area (index) to the working directory. It provides fine-grained control over which index entries are materialized as working tree files.

Unlike the higher-level git checkout, this command operates purely on the index without switching branches or updating HEAD. It's primarily used in Git's internal operations and specialized scripts that need precise control over working tree population.

The --prefix option enables extracting the index to an alternate location, useful for creating clean checkouts or exporting specific versions. This command is essential for understanding Git's three-tree architecture (working directory, index, and HEAD) and how file state moves between them.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-read-tree](/man/git-read-tree)(1)

