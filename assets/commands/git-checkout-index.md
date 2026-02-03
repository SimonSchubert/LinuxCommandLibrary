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

**git checkout-index** copies files from the index to the working tree. A low-level command underlying git checkout.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-read-tree](/man/git-read-tree)(1)

