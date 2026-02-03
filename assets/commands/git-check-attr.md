# TLDR

**Check attribute for file**

```git check-attr [attribute] [file]```

**Check all attributes**

```git check-attr -a [file]```

**Check for multiple files**

```git check-attr [attribute] [file1] [file2]```

**Check from stdin**

```echo "[file]" | git check-attr --stdin [attribute]```

# SYNOPSIS

**git** **check-attr** [_options_] _attribute_... _pathname_...

# PARAMETERS

**-a**, **--all**
> Check all attributes.

**--stdin**
> Read pathnames from stdin.

**-z**
> NUL-terminated output.

# DESCRIPTION

**git check-attr** displays gitattributes information for paths. Shows how Git will treat files based on .gitattributes configuration.

# SEE ALSO

[gitattributes](/man/gitattributes)(5), [git-check-ignore](/man/git-check-ignore)(1)

